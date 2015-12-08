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

class SuggestionsAdapter extends ResourceCursorAdapter
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
            mIconRefine = (ImageView)view.findViewById(android.support.v7.appcompat.R.id.edit_query);
        }
    }


    private static final boolean DBG = false;
    static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_ALL = 2;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_NONE = 0;
    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final WeakHashMap mOutsideDrawablesCache;
    private final Context mProviderContext;
    private int mQueryRefinement;
    private final SearchManager mSearchManager;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;

    public SuggestionsAdapter(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
    {
        super(context, searchview.getSuggestionRowLayout(), null, true);
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
        mCommitIconResId = searchview.getSuggestionCommitIconResId();
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

    private CharSequence formatUrl(CharSequence charsequence)
    {
        if (mUrlColor == null)
        {
            TypedValue typedvalue = new TypedValue();
            mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.textColorSearchUrl, typedvalue, true);
            mUrlColor = mContext.getResources().getColorStateList(typedvalue.resourceId);
        }
        SpannableString spannablestring = new SpannableString(charsequence);
        spannablestring.setSpan(new TextAppearanceSpan(null, 0, 0, mUrlColor, null), 0, charsequence.length(), 33);
        return spannablestring;
    }

    private Drawable getActivityIcon(ComponentName componentname)
    {
        Object obj = mContext.getPackageManager();
        ActivityInfo activityinfo;
        int i;
        try
        {
            activityinfo = ((PackageManager) (obj)).getActivityInfo(componentname, 128);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            Log.w("SuggestionsAdapter", componentname.toString());
            return null;
        }
        i = activityinfo.getIconResource();
        if (i == 0)
        {
            return null;
        }
        obj = ((PackageManager) (obj)).getDrawable(componentname.getPackageName(), i, activityinfo.applicationInfo);
        if (obj == null)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder()).append("Invalid icon resource ").append(i).append(" for ").append(componentname.flattenToShortString()).toString());
            return null;
        } else
        {
            return ((Drawable) (obj));
        }
    }

    private Drawable getActivityIconWithCache(ComponentName componentname)
    {
        Object obj = null;
        String s = componentname.flattenToShortString();
        if (mOutsideDrawablesCache.containsKey(s))
        {
            componentname = (android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(s);
            if (componentname == null)
            {
                return null;
            } else
            {
                return componentname.newDrawable(mProviderContext.getResources());
            }
        }
        Drawable drawable = getActivityIcon(componentname);
        if (drawable == null)
        {
            componentname = obj;
        } else
        {
            componentname = drawable.getConstantState();
        }
        mOutsideDrawablesCache.put(s, componentname);
        return drawable;
    }

    public static String getColumnString(Cursor cursor, String s)
    {
        return getStringOrNull(cursor, cursor.getColumnIndex(s));
    }

    private Drawable getDefaultIcon1(Cursor cursor)
    {
        cursor = getActivityIconWithCache(mSearchable.getSearchActivity());
        if (cursor != null)
        {
            return cursor;
        } else
        {
            return mContext.getPackageManager().getDefaultActivityIcon();
        }
    }

    private Drawable getDrawable(Uri uri)
    {
        boolean flag = "android.resource".equals(uri.getScheme());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = getDrawableFromResourceUri(uri);
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        try
        {
            throw new FileNotFoundException((new StringBuilder()).append("Resource does not exist: ").append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon not found: ").append(uri).append(", ").append(((FileNotFoundException) (obj1)).getMessage()).toString());
        }
        return null;
        obj1 = mProviderContext.getContentResolver().openInputStream(uri);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        throw new FileNotFoundException((new StringBuilder()).append("Failed to open ").append(uri).toString());
        Drawable drawable = Drawable.createFromStream(((InputStream) (obj1)), null);
        ((InputStream) (obj1)).close();
        return drawable;
        obj1;
        Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(uri).toString(), ((Throwable) (obj1)));
        return drawable;
        Exception exception;
        exception;
        ((InputStream) (obj1)).close();
_L1:
        throw exception;
        obj1;
        Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(uri).toString(), ((Throwable) (obj1)));
          goto _L1
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
        s1 = (new StringBuilder()).append("android.resource://").append(mProviderContext.getPackageName()).append("/").append(i).toString();
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
        Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon resource not found: ").append(s).toString());
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Drawable getIcon1(Cursor cursor)
    {
        Drawable drawable;
        if (mIconName1Col == -1)
        {
            drawable = null;
        } else
        {
            Drawable drawable1 = getDrawableFromResourceValue(cursor.getString(mIconName1Col));
            drawable = drawable1;
            if (drawable1 == null)
            {
                return getDefaultIcon1(cursor);
            }
        }
        return drawable;
    }

    private Drawable getIcon2(Cursor cursor)
    {
        if (mIconName2Col == -1)
        {
            return null;
        } else
        {
            return getDrawableFromResourceValue(cursor.getString(mIconName2Col));
        }
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

    private void setViewDrawable(ImageView imageview, Drawable drawable, int i)
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

    private void setViewText(TextView textview, CharSequence charsequence)
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

    private void updateSpinnerState(Cursor cursor)
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

    public void bindView(View view, Context context, Cursor cursor)
    {
        context = (ChildViewCache)view.getTag();
        int i;
        if (mFlagsCol != -1)
        {
            i = cursor.getInt(mFlagsCol);
        } else
        {
            i = 0;
        }
        if (((ChildViewCache) (context)).mText1 != null)
        {
            view = getStringOrNull(cursor, mText1Col);
            setViewText(((ChildViewCache) (context)).mText1, view);
        }
        if (((ChildViewCache) (context)).mText2 == null) goto _L2; else goto _L1
_L1:
        view = getStringOrNull(cursor, mText2UrlCol);
        if (view != null)
        {
            view = formatUrl(view);
        } else
        {
            view = getStringOrNull(cursor, mText2Col);
        }
        if (!TextUtils.isEmpty(view)) goto _L4; else goto _L3
_L3:
        if (((ChildViewCache) (context)).mText1 != null)
        {
            ((ChildViewCache) (context)).mText1.setSingleLine(false);
            ((ChildViewCache) (context)).mText1.setMaxLines(2);
        }
_L6:
        setViewText(((ChildViewCache) (context)).mText2, view);
_L2:
        if (((ChildViewCache) (context)).mIcon1 != null)
        {
            setViewDrawable(((ChildViewCache) (context)).mIcon1, getIcon1(cursor), 4);
        }
        if (((ChildViewCache) (context)).mIcon2 != null)
        {
            setViewDrawable(((ChildViewCache) (context)).mIcon2, getIcon2(cursor), 8);
        }
        if (mQueryRefinement == 2 || mQueryRefinement == 1 && (i & 1) != 0)
        {
            ((ChildViewCache) (context)).mIconRefine.setVisibility(0);
            ((ChildViewCache) (context)).mIconRefine.setTag(((ChildViewCache) (context)).mText1.getText());
            ((ChildViewCache) (context)).mIconRefine.setOnClickListener(this);
            return;
        } else
        {
            ((ChildViewCache) (context)).mIconRefine.setVisibility(8);
            return;
        }
_L4:
        if (((ChildViewCache) (context)).mText1 != null)
        {
            ((ChildViewCache) (context)).mText1.setSingleLine(true);
            ((ChildViewCache) (context)).mText1.setMaxLines(1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void changeCursor(Cursor cursor)
    {
        if (!mClosed) goto _L2; else goto _L1
_L1:
        Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
        if (cursor != null)
        {
            cursor.close();
        }
_L4:
        return;
_L2:
        super.changeCursor(cursor);
        if (cursor != null)
        {
            try
            {
                mText1Col = cursor.getColumnIndex("suggest_text_1");
                mText2Col = cursor.getColumnIndex("suggest_text_2");
                mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
                mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
                mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
                mFlagsCol = cursor.getColumnIndex("suggest_flags");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                Log.e("SuggestionsAdapter", "error changing cursor and caching columns", cursor);
            }
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void close()
    {
        changeCursor(null);
        mClosed = true;
    }

    public CharSequence convertToString(Cursor cursor)
    {
        if (cursor != null)
        {
            String s = getColumnString(cursor, "suggest_intent_query");
            if (s != null)
            {
                return s;
            }
            if (mSearchable.shouldRewriteQueryFromData())
            {
                String s1 = getColumnString(cursor, "suggest_intent_data");
                if (s1 != null)
                {
                    return s1;
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
        }
        return null;
    }

    Drawable getDrawableFromResourceUri(Uri uri)
        throws FileNotFoundException
    {
        Object obj = uri.getAuthority();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new FileNotFoundException((new StringBuilder()).append("No authority: ").append(uri).toString());
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
            throw new FileNotFoundException((new StringBuilder()).append("No package found for authority: ").append(uri).toString());
        }
        list = uri.getPathSegments();
        if (list == null)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No path: ").append(uri).toString());
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
                throw new FileNotFoundException((new StringBuilder()).append("Single path segment is not a resource ID: ").append(uri).toString());
            }
        } else
        if (i == 2)
        {
            i = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
        } else
        {
            throw new FileNotFoundException((new StringBuilder()).append("More than two path segments: ").append(uri).toString());
        }
        if (i == 0)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No resource found for: ").append(uri).toString());
        } else
        {
            return resources.getDrawable(i);
        }
    }

    public int getQueryRefinement()
    {
        return mQueryRefinement;
    }

    Cursor getSearchManagerSuggestions(SearchableInfo searchableinfo, String s, int i)
    {
        Object obj;
        if (searchableinfo != null)
        {
            if ((obj = searchableinfo.getSuggestAuthority()) != null)
            {
                obj = (new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("");
                String s1 = searchableinfo.getSuggestPath();
                if (s1 != null)
                {
                    ((android.net.Uri.Builder) (obj)).appendEncodedPath(s1);
                }
                ((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
                s1 = searchableinfo.getSuggestSelection();
                if (s1 != null)
                {
                    searchableinfo = new String[1];
                    searchableinfo[0] = s;
                } else
                {
                    ((android.net.Uri.Builder) (obj)).appendPath(s);
                    searchableinfo = null;
                }
                if (i > 0)
                {
                    ((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", String.valueOf(i));
                }
                s = ((android.net.Uri.Builder) (obj)).build();
                return mContext.getContentResolver().query(s, null, s1, searchableinfo, null);
            }
        }
        return null;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        try
        {
            view = super.getView(i, view, viewgroup);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", view);
            viewgroup = newView(mContext, mCursor, viewgroup);
            if (viewgroup != null)
            {
                ((ChildViewCache)viewgroup.getTag()).mText1.setText(view.toString());
            }
            return viewgroup;
        }
        return view;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = super.newView(context, cursor, viewgroup);
        context.setTag(new ChildViewCache(context));
        ((ImageView)context.findViewById(android.support.v7.appcompat.R.id.edit_query)).setImageResource(mCommitIconResId);
        return context;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    public void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    public void onClick(View view)
    {
        view = ((View) (view.getTag()));
        if (view instanceof CharSequence)
        {
            mSearchView.onQueryRefine((CharSequence)view);
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
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
        charsequence = getSearchManagerSuggestions(mSearchable, charsequence, 50);
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        charsequence.getCount();
        return charsequence;
        charsequence;
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", charsequence);
        return null;
    }

    public void setQueryRefinement(int i)
    {
        mQueryRefinement = i;
    }
}
