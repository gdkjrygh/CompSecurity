// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.ResourceCursorAdapter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class SuggestionsAdapter extends ResourceCursorAdapter
    implements android.view.View.OnClickListener
{
    private static final class ChildViewCache
    {

        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view)
        {
            mText1 = (TextView)view.findViewById(0x1020014);
            mText2 = (TextView)view.findViewById(0x1020015);
            mIcon1 = (ImageView)view.findViewById(0x1020007);
            mIcon2 = (ImageView)view.findViewById(0x1020008);
            mIconRefine = (ImageView)view.findViewById(0x7f0d00cd);
        }
    }


    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final WeakHashMap mOutsideDrawablesCache;
    private final Context mProviderContext;
    int mQueryRefinement;
    private final SearchManager mSearchManager;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;

    public SuggestionsAdapter(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
    {
        super(context, searchview.mSuggestionRowLayout);
        mClosed = false;
        mQueryRefinement = 1;
        mText1Col = -1;
        mText2Col = -1;
        mText2UrlCol = -1;
        mIconName1Col = -1;
        mIconName2Col = -1;
        mFlagsCol = -1;
        mSearchManager = (SearchManager)mContext.getSystemService("search");
        mSearchView = searchview;
        mSearchable = searchableinfo;
        mCommitIconResId = searchview.mSuggestionCommitIconResId;
        mProviderContext = context;
        mOutsideDrawablesCache = weakhashmap;
    }

    private Drawable checkIconCache(String s)
    {
        s = (android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.newDrawable();
        }
    }

    private Drawable getActivityIcon(ComponentName componentname)
    {
        Object obj = mContext.getPackageManager();
        Object obj1;
        int i;
        try
        {
            obj1 = ((PackageManager) (obj)).getActivityInfo(componentname, 128);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            Log.w("SuggestionsAdapter", componentname.toString());
            return null;
        }
        i = ((ActivityInfo) (obj1)).getIconResource();
        if (i == 0)
        {
            obj = null;
        } else
        {
            obj1 = ((PackageManager) (obj)).getDrawable(componentname.getPackageName(), i, ((ActivityInfo) (obj1)).applicationInfo);
            obj = obj1;
            if (obj1 == null)
            {
                Log.w("SuggestionsAdapter", (new StringBuilder("Invalid icon resource ")).append(i).append(" for ").append(componentname.flattenToShortString()).toString());
                return null;
            }
        }
        return ((Drawable) (obj));
    }

    public static String getColumnString(Cursor cursor, String s)
    {
        return getStringOrNull(cursor, cursor.getColumnIndex(s));
    }

    private Drawable getDrawable(Uri uri)
    {
        boolean flag = "android.resource".equals(uri.getScheme());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        Object obj = getDrawableFromResourceUri(uri);
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        try
        {
            throw new FileNotFoundException((new StringBuilder("Resource does not exist: ")).append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder("Icon not found: ")).append(uri).append(", ").append(((FileNotFoundException) (obj1)).getMessage()).toString());
        }
        return null;
        obj1 = mProviderContext.getContentResolver().openInputStream(uri);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        throw new FileNotFoundException((new StringBuilder("Failed to open ")).append(uri).toString());
        Drawable drawable = Drawable.createFromStream(((InputStream) (obj1)), null);
        ((InputStream) (obj1)).close();
        return drawable;
        obj1;
        Log.e("SuggestionsAdapter", (new StringBuilder("Error closing icon stream for ")).append(uri).toString(), ((Throwable) (obj1)));
        return drawable;
        Exception exception;
        exception;
        ((InputStream) (obj1)).close();
_L1:
        throw exception;
        obj1;
        Log.e("SuggestionsAdapter", (new StringBuilder("Error closing icon stream for ")).append(uri).toString(), ((Throwable) (obj1)));
          goto _L1
    }

    private Drawable getDrawableFromResourceUri(Uri uri)
        throws FileNotFoundException
    {
        Object obj = uri.getAuthority();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new FileNotFoundException((new StringBuilder("No authority: ")).append(uri).toString());
        }
        Resources resources;
        List list;
        try
        {
            resources = mContext.getPackageManager().getResourcesForApplication(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new FileNotFoundException((new StringBuilder("No package found for authority: ")).append(uri).toString());
        }
        list = uri.getPathSegments();
        if (list == null)
        {
            throw new FileNotFoundException((new StringBuilder("No path: ")).append(uri).toString());
        }
        int i = list.size();
        if (i == 1)
        {
            try
            {
                i = Integer.parseInt((String)list.get(0));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new FileNotFoundException((new StringBuilder("Single path segment is not a resource ID: ")).append(uri).toString());
            }
        } else
        if (i == 2)
        {
            i = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
        } else
        {
            throw new FileNotFoundException((new StringBuilder("More than two path segments: ")).append(uri).toString());
        }
        if (i == 0)
        {
            throw new FileNotFoundException((new StringBuilder("No resource found for: ")).append(uri).toString());
        } else
        {
            return resources.getDrawable(i);
        }
    }

    private Drawable getDrawableFromResourceValue(String s)
    {
        if (s != null && s.length() != 0 && !"0".equals(s)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Drawable) (obj));
_L2:
        Drawable drawable1;
        String s1;
        int i;
        i = Integer.parseInt(s);
        s1 = (new StringBuilder("android.resource://")).append(mProviderContext.getPackageName()).append("/").append(i).toString();
        drawable1 = checkIconCache(s1);
        obj = drawable1;
        if (drawable1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ContextCompat.getDrawable(mProviderContext, i);
        storeInIconCache(s1, ((Drawable) (obj)));
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        Drawable drawable2 = checkIconCache(s);
        obj1 = drawable2;
        if (drawable2 == null)
        {
            Drawable drawable = getDrawable(Uri.parse(s));
            storeInIconCache(s, drawable);
            return drawable;
        }
        continue; /* Loop/switch isn't completed */
        drawable;
        Log.w("SuggestionsAdapter", (new StringBuilder("Icon resource not found: ")).append(s).toString());
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String getStringOrNull(Cursor cursor, int i)
    {
        if (i == -1)
        {
            return null;
        }
        try
        {
            cursor = cursor.getString(i);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", cursor);
            return null;
        }
        return cursor;
    }

    private static void setViewDrawable(ImageView imageview, Drawable drawable, int i)
    {
        imageview.setImageDrawable(drawable);
        if (drawable == null)
        {
            imageview.setVisibility(i);
            return;
        } else
        {
            imageview.setVisibility(0);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
            return;
        }
    }

    private static void setViewText(TextView textview, CharSequence charsequence)
    {
        textview.setText(charsequence);
        if (TextUtils.isEmpty(charsequence))
        {
            textview.setVisibility(8);
            return;
        } else
        {
            textview.setVisibility(0);
            return;
        }
    }

    private void storeInIconCache(String s, Drawable drawable)
    {
        if (drawable != null)
        {
            mOutsideDrawablesCache.put(s, drawable.getConstantState());
        }
    }

    private static void updateSpinnerState(Cursor cursor)
    {
        if (cursor != null)
        {
            cursor = cursor.getExtras();
        } else
        {
            cursor = null;
        }
        if (cursor != null)
        {
            if (!cursor.getBoolean("in_progress"));
        }
    }

    public final void bindView$4693bf34(View view, Cursor cursor)
    {
        ChildViewCache childviewcache = (ChildViewCache)view.getTag();
        int i = 0;
        if (mFlagsCol != -1)
        {
            i = cursor.getInt(mFlagsCol);
        }
        if (childviewcache.mText1 != null)
        {
            view = getStringOrNull(cursor, mText1Col);
            setViewText(childviewcache.mText1, view);
        }
        if (childviewcache.mText2 != null)
        {
            Object obj = getStringOrNull(cursor, mText2UrlCol);
            ImageView imageview;
            if (obj != null)
            {
                if (mUrlColor == null)
                {
                    view = new TypedValue();
                    mContext.getTheme().resolveAttribute(0x7f01012d, view, true);
                    mUrlColor = mContext.getResources().getColorStateList(((TypedValue) (view)).resourceId);
                }
                view = new SpannableString(((CharSequence) (obj)));
                view.setSpan(new TextAppearanceSpan(null, 0, 0, mUrlColor, null), 0, ((CharSequence) (obj)).length(), 33);
            } else
            {
                view = getStringOrNull(cursor, mText2Col);
            }
            if (TextUtils.isEmpty(view))
            {
                if (childviewcache.mText1 != null)
                {
                    childviewcache.mText1.setSingleLine(false);
                    childviewcache.mText1.setMaxLines(2);
                }
            } else
            if (childviewcache.mText1 != null)
            {
                childviewcache.mText1.setSingleLine(true);
                childviewcache.mText1.setMaxLines(1);
            }
            setViewText(childviewcache.mText2, view);
        }
        if (childviewcache.mIcon1 != null)
        {
            imageview = childviewcache.mIcon1;
            if (mIconName1Col == -1)
            {
                view = null;
            } else
            {
                Drawable drawable = getDrawableFromResourceValue(cursor.getString(mIconName1Col));
                view = drawable;
                if (drawable == null)
                {
                    view = mSearchable.getSearchActivity();
                    String s = view.flattenToShortString();
                    Drawable drawable1;
                    if (mOutsideDrawablesCache.containsKey(s))
                    {
                        view = (android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(s);
                        if (view == null)
                        {
                            drawable1 = null;
                        } else
                        {
                            drawable1 = view.newDrawable(mProviderContext.getResources());
                        }
                    } else
                    {
                        drawable1 = getActivityIcon(view);
                        if (drawable1 == null)
                        {
                            view = null;
                        } else
                        {
                            view = drawable1.getConstantState();
                        }
                        mOutsideDrawablesCache.put(s, view);
                    }
                    view = drawable1;
                    if (drawable1 == null)
                    {
                        view = mContext.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            setViewDrawable(imageview, view, 4);
        }
        if (childviewcache.mIcon2 != null)
        {
            obj = childviewcache.mIcon2;
            if (mIconName2Col == -1)
            {
                view = null;
            } else
            {
                view = getDrawableFromResourceValue(cursor.getString(mIconName2Col));
            }
            setViewDrawable(((ImageView) (obj)), view, 8);
        }
        if (mQueryRefinement == 2 || mQueryRefinement == 1 && (i & 1) != 0)
        {
            childviewcache.mIconRefine.setVisibility(0);
            childviewcache.mIconRefine.setTag(childviewcache.mText1.getText());
            childviewcache.mIconRefine.setOnClickListener(this);
            return;
        } else
        {
            childviewcache.mIconRefine.setVisibility(8);
            return;
        }
    }

    public final void changeCursor(Cursor cursor)
    {
        try
        {
            super.changeCursor(cursor);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", cursor);
            return;
        }
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        mText1Col = cursor.getColumnIndex("suggest_text_1");
        mText2Col = cursor.getColumnIndex("suggest_text_2");
        mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
        mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
        mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
        mFlagsCol = cursor.getColumnIndex("suggest_flags");
    }

    public final CharSequence convertToString(Cursor cursor)
    {
        Object obj;
        if (cursor == null)
        {
            obj = null;
        } else
        {
            String s1 = getColumnString(cursor, "suggest_intent_query");
            obj = s1;
            if (s1 == null)
            {
                if (mSearchable.shouldRewriteQueryFromData())
                {
                    String s = getColumnString(cursor, "suggest_intent_data");
                    if (s != null)
                    {
                        return s;
                    }
                }
                if (mSearchable.shouldRewriteQueryFromText())
                {
                    cursor = getColumnString(cursor, "suggest_text_1");
                    if (cursor != null)
                    {
                        return cursor;
                    }
                }
                return null;
            }
        }
        return ((CharSequence) (obj));
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        try
        {
            view = super.getView(i, view, viewgroup);
        }
        catch (RuntimeException runtimeexception)
        {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeexception);
            viewgroup = newView(mContext, mCursor, viewgroup);
            view = viewgroup;
            if (viewgroup != null)
            {
                ((ChildViewCache)viewgroup.getTag()).mText1.setText(runtimeexception.toString());
                return viewgroup;
            }
        }
        return view;
    }

    public final boolean hasStableIds()
    {
        return false;
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = super.newView(context, cursor, viewgroup);
        context.setTag(new ChildViewCache(context));
        ((ImageView)context.findViewById(0x7f0d00cd)).setImageResource(mCommitIconResId);
        return context;
    }

    public final void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        updateSpinnerState(super.mCursor);
    }

    public final void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        updateSpinnerState(super.mCursor);
    }

    public final void onClick(View view)
    {
        view = ((View) (view.getTag()));
        if (view instanceof CharSequence)
        {
            mSearchView.setQuery((CharSequence)view);
        }
    }

    public final Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            charsequence = "";
        } else
        {
            charsequence = charsequence.toString();
        }
        if (mSearchView.getVisibility() != 0 || mSearchView.getWindowVisibility() != 0)
        {
            return null;
        }
        SearchableInfo searchableinfo = mSearchable;
        if (searchableinfo != null) goto _L2; else goto _L1
_L1:
        charsequence = null;
_L3:
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        charsequence.getCount();
        return charsequence;
        charsequence;
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", charsequence);
        return null;
_L2:
        Object obj = searchableinfo.getSuggestAuthority();
label0:
        {
            if (obj != null)
            {
                break label0;
            }
            charsequence = null;
        }
          goto _L3
        String s;
        obj = (new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("");
        s = searchableinfo.getSuggestPath();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        ((android.net.Uri.Builder) (obj)).appendEncodedPath(s);
        ((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
        s = searchableinfo.getSuggestSelection();
        if (s == null) goto _L5; else goto _L4
_L4:
        String as[] = new String[1];
        as[0] = charsequence;
        charsequence = as;
_L6:
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", "50");
        Uri uri = ((android.net.Uri.Builder) (obj)).build();
        charsequence = mContext.getContentResolver().query(uri, null, s, charsequence, null);
          goto _L3
_L5:
        ((android.net.Uri.Builder) (obj)).appendPath(charsequence);
        charsequence = null;
          goto _L6
    }
}
