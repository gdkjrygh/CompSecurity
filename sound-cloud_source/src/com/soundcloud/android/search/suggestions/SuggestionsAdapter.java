// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.widget.CursorAdapter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.android.api.legacy.model.SearchSuggestions;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.ApiSyncService;
import com.soundcloud.android.utils.DetachableResultReceiver;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.java.strings.Strings;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            ShortcutsStorage

public class SuggestionsAdapter extends CursorAdapter
    implements com.soundcloud.android.utils.DetachableResultReceiver.Receiver
{
    static class SearchTag
    {

        ImageView iv_icon;
        ImageView iv_search_type;
        TextView tv_main;

        SearchTag()
        {
        }
    }

    private static final class SuggestionsHandler extends Handler
    {

        private final WeakReference adapterRef;
        private final PublicApi api;

        public final void handleMessage(Message message)
        {
            SuggestionsAdapter suggestionsadapter;
            suggestionsadapter = (SuggestionsAdapter)adapterRef.get();
            if (suggestionsadapter == null)
            {
                return;
            }
            message = (CharSequence)message.obj;
            Object obj;
            obj = api.get(Request.to("/search/suggest", new Object[0]).with(new Object[] {
                "q", message, "highlight_mode", "offsets", "limit", Integer.valueOf(5)
            }));
            if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200)
            {
                suggestionsadapter.onRemoteSuggestions(message, (SearchSuggestions)api.getMapper().readValue(((HttpResponse) (obj)).getEntity().getContent(), com/soundcloud/android/api/legacy/model/SearchSuggestions));
                return;
            }
              goto _L1
_L3:
            suggestionsadapter.onRemoteSuggestions(message, SearchSuggestions.EMPTY);
            return;
_L1:
            try
            {
                String s = SoundCloudApplication.TAG;
                (new StringBuilder("invalid status code returned: ")).append(((HttpResponse) (obj)).getStatusLine());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = SoundCloudApplication.TAG;
            }
            if (true) goto _L3; else goto _L2
_L2:
        }

        public SuggestionsHandler(SuggestionsAdapter suggestionsadapter, PublicApi publicapi, Looper looper)
        {
            super(looper);
            adapterRef = new WeakReference(suggestionsadapter);
            api = publicapi;
        }
    }


    public static final String COLUMN_NAMES[] = {
        "_id", "id", "suggest_text_1", "suggest_intent_data", "icon_url", "_local", "_highlights", "_query_urn", "_query_position"
    };
    public static final String HIGHLIGHTS = "_highlights";
    public static final String LOCAL = "_local";
    private static final int MAX_LOCAL = 5;
    private static final int MAX_REMOTE = 5;
    public static final String QUERY_POSITION = "_query_position";
    public static final String QUERY_URN = "_query_urn";
    private static final int TYPE_SEARCH_ITEM = 0;
    private static final int TYPE_TRACK = 1;
    private static final int TYPE_USER = 2;
    private final int colorTextSuggestion;
    private final int colorTextUnhighlight;
    private final Context context;
    private String currentConstraint;
    private Pattern currentPattern;
    private final DetachableResultReceiver detachableReceiver = new DetachableResultReceiver(new Handler());
    private final ImageOperations imageOperations;
    private SearchSuggestions localSuggestions;
    private final Handler newSuggestionsHandler = new Handler();
    private SearchSuggestions remoteSuggestions;
    private final ShortcutsStorage shortcutsStorage;
    private final SuggestionsHandler suggestionsHandler;
    private final HandlerThread suggestionsHandlerThread = new HandlerThread("SuggestionsHandler", 0);

    public SuggestionsAdapter(Context context1, PublicApi publicapi, ShortcutsStorage shortcutsstorage)
    {
        super(context1, null, 0);
        localSuggestions = SearchSuggestions.EMPTY;
        remoteSuggestions = SearchSuggestions.EMPTY;
        context = context1;
        imageOperations = SoundCloudApplication.fromContext(context1).getImageOperations();
        shortcutsStorage = shortcutsstorage;
        suggestionsHandlerThread.start();
        suggestionsHandler = new SuggestionsHandler(this, publicapi, suggestionsHandlerThread.getLooper());
        colorTextSuggestion = context1.getResources().getColor(0x7f0e00cc);
        colorTextUnhighlight = context1.getResources().getColor(0x7f0e00cd);
    }

    private MatrixCursor createHeader(String s)
    {
        MatrixCursor matrixcursor = new MatrixCursor(COLUMN_NAMES, 1);
        if (!TextUtils.isEmpty(s))
        {
            matrixcursor.addRow(new Object[] {
                Integer.valueOf(-1), Integer.valueOf(-1), context.getResources().getString(0x7f0701d5, new Object[] {
                    s
                }), Content.SEARCH_ITEM.forQuery(s), "", Integer.valueOf(1), null, null, Integer.valueOf(-1)
            });
        }
        return matrixcursor;
    }

    private View createViewFromResource(Cursor cursor, View view, ViewGroup viewgroup)
    {
        boolean flag1 = true;
        Object obj;
        String s;
        int i;
        long l;
        if (view == null)
        {
            view = View.inflate(context, 0x7f0300ab, null);
            viewgroup = new SearchTag();
            viewgroup.iv_icon = (ImageView)view.findViewById(0x7f0f0072);
            viewgroup.iv_search_type = (ImageView)view.findViewById(0x7f0f022d);
            viewgroup.tv_main = (TextView)view.findViewById(0x7f0f0073);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (SearchTag)view.getTag();
        }
        l = cursor.getLong(cursor.getColumnIndex("id"));
        obj = cursor.getString(cursor.getColumnIndex("suggest_text_1"));
        if (cursor.getInt(cursor.getColumnIndex("_local")) == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        s = cursor.getString(cursor.getColumnIndex("_highlights"));
        if (l == -1L)
        {
            ((SearchTag) (viewgroup)).tv_main.setText(((CharSequence) (obj)));
            ((SearchTag) (viewgroup)).iv_icon.setVisibility(8);
        } else
        {
            TextView textview = ((SearchTag) (viewgroup)).tv_main;
            if (i != 0)
            {
                obj = highlightLocal(((String) (obj)));
            } else
            {
                obj = highlightRemote(((String) (obj)), s);
            }
            textview.setText(((CharSequence) (obj)));
            ((SearchTag) (viewgroup)).iv_icon.setVisibility(0);
        }
        i = getItemViewType(cursor.getPosition());
        if (i == 0)
        {
            ((SearchTag) (viewgroup)).iv_search_type.setVisibility(8);
            ((SearchTag) (viewgroup)).iv_icon.setImageResource(0x7f02003e);
            return view;
        }
        ((SearchTag) (viewgroup)).iv_search_type.setVisibility(0);
        boolean flag;
        if (i == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            cursor = Urn.forUser(l);
            ((SearchTag) (viewgroup)).iv_search_type.setImageResource(0x7f0201a2);
            imageOperations.displayCircularInAdapterView(cursor, ApiImageSize.getListItemImageSize(context), ((SearchTag) (viewgroup)).iv_icon);
            return view;
        } else
        {
            cursor = Urn.forTrack(l);
            ((SearchTag) (viewgroup)).iv_search_type.setImageResource(0x7f0201a1);
            imageOperations.displayInAdapterView(cursor, ApiImageSize.getListItemImageSize(context), ((SearchTag) (viewgroup)).iv_icon);
            return view;
        }
    }

    private SearchSuggestions fetchLocalSuggestions(String s, int i)
    {
        return new SearchSuggestions(shortcutsStorage.getShortcuts(s, i));
    }

    static Pattern getHighlightPattern(String s)
    {
        return Pattern.compile((new StringBuilder("(^|[\\s.\\(\\)\\[\\]_-])(")).append(Pattern.quote(s)).append(")").toString(), 2);
    }

    private Cursor getMixedCursor()
    {
        if (!remoteSuggestions.isEmpty())
        {
            if (!localSuggestions.isEmpty())
            {
                return withHeader(localSuggestions.mergeWithRemote(remoteSuggestions).asCursor());
            } else
            {
                return withHeader(remoteSuggestions.asCursor());
            }
        } else
        {
            return withHeader(localSuggestions.asCursor());
        }
    }

    private int getUriType(Uri uri)
    {
        switch (_cls3..SwitchMap.com.soundcloud.android.storage.provider.Content[Content.match(uri).ordinal()])
        {
        case 2: // '\002'
        default:
            return 1;

        case 1: // '\001'
            return 0;

        case 3: // '\003'
            return 2;
        }
    }

    private Spanned highlightLocal(String s)
    {
        SpannableString spannablestring = new SpannableString(s);
        s = currentPattern.matcher(s);
        if (s.find())
        {
            setHighlightSpans(spannablestring, s.start(2), s.end(2));
            return spannablestring;
        } else
        {
            setHighlightSpans(spannablestring, -1, -1);
            return spannablestring;
        }
    }

    private void onRemoteSuggestions(final CharSequence constraint, final SearchSuggestions suggestions)
    {
        newSuggestionsHandler.post(new _cls1());
    }

    private void prefetchResults(SearchSuggestions searchsuggestions)
    {
        if (!searchsuggestions.isEmpty() && shouldPrefetch())
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            ArrayList arraylist2 = new ArrayList();
            searchsuggestions.putRemoteIds(arraylist, arraylist1, arraylist2);
            searchsuggestions = new ArrayList();
            if (!arraylist.isEmpty())
            {
                searchsuggestions.add(Content.TRACK_LOOKUP.forQuery(TextUtils.join(",", arraylist)));
            }
            if (!arraylist1.isEmpty())
            {
                searchsuggestions.add(Content.USER_LOOKUP.forQuery(TextUtils.join(",", arraylist1)));
            }
            if (!arraylist2.isEmpty())
            {
                searchsuggestions.add(Content.PLAYLIST_LOOKUP.forQuery(TextUtils.join(",", arraylist2)));
            }
            if (!searchsuggestions.isEmpty())
            {
                searchsuggestions = (new Intent(context, com/soundcloud/android/sync/ApiSyncService)).putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", getReceiver()).putParcelableArrayListExtra("com.soundcloud.android.sync.extra.SYNC_URIS", searchsuggestions).putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true);
                context.startService(searchsuggestions);
                return;
            }
        }
    }

    private void setHighlightSpans(SpannableString spannablestring, int i, int j)
    {
        spannablestring.setSpan(new ForegroundColorSpan(colorTextUnhighlight), 0, spannablestring.length(), 18);
        if (i >= 0 && i < j && j > 0 && j <= spannablestring.length())
        {
            spannablestring.setSpan(new ForegroundColorSpan(colorTextSuggestion), i, j, 18);
        }
    }

    private boolean shouldPrefetch()
    {
        return IOUtils.isWifiConnected(context);
    }

    private Cursor withHeader(Cursor cursor)
    {
        return new _cls2(new Cursor[] {
            createHeader(currentConstraint), cursor
        });
    }

    public void bindView(View view, Context context1, Cursor cursor)
    {
        createViewFromResource(cursor, view, null);
    }

    public void clearSuggestions()
    {
        localSuggestions = SearchSuggestions.EMPTY;
        remoteSuggestions = SearchSuggestions.EMPTY;
        newSuggestionsHandler.removeMessages(0);
        suggestionsHandler.removeMessages(0);
    }

    public long getItemId(int i)
    {
        return (long)getItemIntentData(i).hashCode();
    }

    public Uri getItemIntentData(int i)
    {
        Cursor cursor = (Cursor)getItem(i);
        String s = cursor.getString(cursor.getColumnIndex("suggest_intent_data"));
        cursor.close();
        return Uri.parse(s);
    }

    public int getItemViewType(int i)
    {
        return getUriType(getItemIntentData(i));
    }

    protected SearchSuggestions getLocal()
    {
        return localSuggestions;
    }

    public long getModelId(int i)
    {
        Cursor cursor = (Cursor)getItem(i);
        long l = cursor.getLong(cursor.getColumnIndex("id"));
        cursor.close();
        return l;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public int getQueryPosition(int i)
    {
        Cursor cursor = (Cursor)getItem(i);
        i = cursor.getInt(cursor.getColumnIndex("_query_position"));
        cursor.close();
        return i;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public Urn getQueryUrn(int i)
    {
        Cursor cursor = (Cursor)getItem(i);
        Object obj = cursor.getString(cursor.getColumnIndex("_query_urn"));
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = Urn.NOT_SET;
_L4:
        cursor.close();
        return ((Urn) (obj));
_L2:
        obj = new Urn(((String) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    protected DetachableResultReceiver getReceiver()
    {
        detachableReceiver.setReceiver(this);
        return detachableReceiver;
    }

    protected SearchSuggestions getRemote()
    {
        return remoteSuggestions;
    }

    public Urn getUrn(int i)
    {
        Cursor cursor = (Cursor)getItem(i);
        long l = cursor.getLong(cursor.getColumnIndex("id"));
        cursor.close();
        switch (getItemViewType(i))
        {
        default:
            throw new IllegalStateException("View type is neither a track or a user");

        case 1: // '\001'
            return Urn.forTrack(l);

        case 2: // '\002'
            return Urn.forUser(l);
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    protected Spanned highlightRemote(String s, String s1)
    {
        s = new SpannableString(s);
        if (!TextUtils.isEmpty(s1))
        {
            s1 = s1.split(";");
            int j = s1.length;
            for (int i = 0; i < j; i++)
            {
                String as[] = s1[i].split(",");
                setHighlightSpans(s, Integer.parseInt(as[0]), Integer.parseInt(as[1]));
            }

        }
        return s;
    }

    public boolean isLocalResult(int i)
    {
        Cursor cursor = (Cursor)getItem(i);
        i = cursor.getInt(cursor.getColumnIndex("_local"));
        cursor.close();
        return i == 1;
    }

    public boolean isSearchItem(int i)
    {
        return i == 0;
    }

    public View newView(Context context1, Cursor cursor, ViewGroup viewgroup)
    {
        return createViewFromResource(cursor, null, viewgroup);
    }

    public void onDestroy()
    {
        suggestionsHandler.removeMessages(0);
        suggestionsHandlerThread.getLooper().quit();
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return;

        case 3: // '\003'
            swapCursor(getMixedCursor());
            break;
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
        suggestionsHandler.removeMessages(0);
        charsequence = Strings.safeToString(charsequence).trim();
        if (!TextUtils.isEmpty(charsequence))
        {
            currentConstraint = charsequence;
            currentPattern = getHighlightPattern(currentConstraint);
            localSuggestions = fetchLocalSuggestions(currentConstraint, 5);
            charsequence = suggestionsHandler.obtainMessage(0, currentConstraint);
            suggestionsHandler.sendMessageDelayed(charsequence, 300L);
            return getMixedCursor();
        } else
        {
            clearSuggestions();
            return super.runQueryOnBackgroundThread(charsequence);
        }
    }

    public void showSuggestionsFor(CharSequence charsequence)
    {
        getFilter().filter(charsequence);
    }





/*
    static SearchSuggestions access$102(SuggestionsAdapter suggestionsadapter, SearchSuggestions searchsuggestions)
    {
        suggestionsadapter.remoteSuggestions = searchsuggestions;
        return searchsuggestions;
    }

*/




    private class _cls3
    {

        static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

        static 
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.SEARCH_ITEM.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACK.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements Runnable
    {

        final SuggestionsAdapter this$0;
        final CharSequence val$constraint;
        final SearchSuggestions val$suggestions;

        public void run()
        {
            if (constraint.equals(currentConstraint))
            {
                remoteSuggestions = suggestions;
                swapCursor(getMixedCursor());
                prefetchResults(remoteSuggestions);
            }
        }

        _cls1()
        {
            this$0 = SuggestionsAdapter.this;
            constraint = charsequence;
            suggestions = searchsuggestions;
            super();
        }
    }


    private class _cls2 extends MergeCursor
    {

        final SuggestionsAdapter this$0;

        public String toString()
        {
            return getString(getColumnIndex("suggest_text_1"));
        }

        _cls2(Cursor acursor[])
        {
            this$0 = SuggestionsAdapter.this;
            super(acursor);
        }
    }

}
