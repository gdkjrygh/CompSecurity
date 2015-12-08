// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import android.support.v7.widget.SearchView;
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

public final class abv extends py
    implements android.view.View.OnClickListener
{

    private final SearchView c;
    private final SearchableInfo d;
    private final Context e;
    private final WeakHashMap f;
    private final int g;
    private ColorStateList h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    private Drawable a(ComponentName componentname)
    {
        Object obj = b.getPackageManager();
        ActivityInfo activityinfo;
        int i1;
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
        i1 = activityinfo.getIconResource();
        if (i1 == 0)
        {
            return null;
        }
        obj = ((PackageManager) (obj)).getDrawable(componentname.getPackageName(), i1, activityinfo.applicationInfo);
        if (obj == null)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder("Invalid icon resource ")).append(i1).append(" for ").append(componentname.flattenToShortString()).toString());
            return null;
        } else
        {
            return ((Drawable) (obj));
        }
    }

    private Drawable a(Uri uri)
    {
        boolean flag = "android.resource".equals(uri.getScheme());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        Object obj = b(uri);
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
        obj1 = e.getContentResolver().openInputStream(uri);
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

    private Drawable a(String s)
    {
        if (s != null && s.length() != 0 && !"0".equals(s)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Drawable) (obj));
_L2:
        Drawable drawable1;
        String s1;
        int i1;
        i1 = Integer.parseInt(s);
        s1 = (new StringBuilder("android.resource://")).append(e.getPackageName()).append("/").append(i1).toString();
        drawable1 = b(s1);
        obj = drawable1;
        if (drawable1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ct.a(e, i1);
        a(s1, ((Drawable) (obj)));
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        Drawable drawable2 = b(s);
        obj1 = drawable2;
        if (drawable2 == null)
        {
            Drawable drawable = a(Uri.parse(s));
            a(s, drawable);
            return drawable;
        }
        continue; /* Loop/switch isn't completed */
        drawable;
        Log.w("SuggestionsAdapter", (new StringBuilder("Icon resource not found: ")).append(s).toString());
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(Cursor cursor, int i1)
    {
        if (i1 == -1)
        {
            return null;
        }
        try
        {
            cursor = cursor.getString(i1);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", cursor);
            return null;
        }
        return cursor;
    }

    public static String a(Cursor cursor, String s)
    {
        return a(cursor, cursor.getColumnIndex(s));
    }

    private static void a(ImageView imageview, Drawable drawable, int i1)
    {
        imageview.setImageDrawable(drawable);
        if (drawable == null)
        {
            imageview.setVisibility(i1);
            return;
        } else
        {
            imageview.setVisibility(0);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
            return;
        }
    }

    private static void a(TextView textview, CharSequence charsequence)
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

    private void a(String s, Drawable drawable)
    {
        if (drawable != null)
        {
            f.put(s, drawable.getConstantState());
        }
    }

    private Drawable b(Uri uri)
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
            resources = b.getPackageManager().getResourcesForApplication(((String) (obj)));
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
        int i1 = list.size();
        if (i1 == 1)
        {
            try
            {
                i1 = Integer.parseInt((String)list.get(0));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new FileNotFoundException((new StringBuilder("Single path segment is not a resource ID: ")).append(uri).toString());
            }
        } else
        if (i1 == 2)
        {
            i1 = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
        } else
        {
            throw new FileNotFoundException((new StringBuilder("More than two path segments: ")).append(uri).toString());
        }
        if (i1 == 0)
        {
            throw new FileNotFoundException((new StringBuilder("No resource found for: ")).append(uri).toString());
        } else
        {
            return resources.getDrawable(i1);
        }
    }

    private Drawable b(String s)
    {
        s = (android.graphics.drawable.Drawable.ConstantState)f.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.newDrawable();
        }
    }

    private static void d(Cursor cursor)
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

    public final Cursor a(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            charsequence = "";
        } else
        {
            charsequence = charsequence.toString();
        }
        if (c.getVisibility() != 0 || c.getWindowVisibility() != 0)
        {
            return null;
        }
        SearchableInfo searchableinfo = d;
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
        charsequence = b.getContentResolver().query(uri, null, s, charsequence, null);
          goto _L3
_L5:
        ((android.net.Uri.Builder) (obj)).appendPath(charsequence);
        charsequence = null;
          goto _L6
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = super.a(context, cursor, viewgroup);
        context.setTag(new abw(context));
        ((ImageView)context.findViewById(0x7f110287)).setImageResource(g);
        return context;
    }

    public final void a(Cursor cursor)
    {
        try
        {
            super.a(cursor);
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
        i = cursor.getColumnIndex("suggest_text_1");
        j = cursor.getColumnIndex("suggest_text_2");
        k = cursor.getColumnIndex("suggest_text_2_url");
        l = cursor.getColumnIndex("suggest_icon_1");
        m = cursor.getColumnIndex("suggest_icon_2");
        n = cursor.getColumnIndex("suggest_flags");
    }

    public final void a(View view, Context context, Cursor cursor)
    {
        Object obj = null;
        abw abw1 = (abw)view.getTag();
        if (n != -1)
        {
            cursor.getInt(n);
        }
        if (abw1.a != null)
        {
            view = a(cursor, i);
            a(abw1.a, ((CharSequence) (view)));
        }
        if (abw1.b != null)
        {
            context = a(cursor, k);
            ImageView imageview;
            if (context != null)
            {
                if (h == null)
                {
                    view = new TypedValue();
                    b.getTheme().resolveAttribute(0x7f010117, view, true);
                    h = b.getResources().getColorStateList(((TypedValue) (view)).resourceId);
                }
                view = new SpannableString(context);
                view.setSpan(new TextAppearanceSpan(null, 0, 0, h, null), 0, context.length(), 33);
            } else
            {
                view = a(cursor, j);
            }
            if (TextUtils.isEmpty(view))
            {
                if (abw1.a != null)
                {
                    abw1.a.setSingleLine(false);
                    abw1.a.setMaxLines(2);
                }
            } else
            if (abw1.a != null)
            {
                abw1.a.setSingleLine(true);
                abw1.a.setMaxLines(1);
            }
            a(abw1.b, ((CharSequence) (view)));
        }
        if (abw1.c != null)
        {
            imageview = abw1.c;
            if (l == -1)
            {
                view = null;
            } else
            {
                context = a(cursor.getString(l));
                view = context;
                if (context == null)
                {
                    view = d.getSearchActivity();
                    String s = view.flattenToShortString();
                    if (f.containsKey(s))
                    {
                        view = (android.graphics.drawable.Drawable.ConstantState)f.get(s);
                        if (view == null)
                        {
                            context = null;
                        } else
                        {
                            context = view.newDrawable(e.getResources());
                        }
                    } else
                    {
                        context = a(((ComponentName) (view)));
                        if (context == null)
                        {
                            view = null;
                        } else
                        {
                            view = context.getConstantState();
                        }
                        f.put(s, view);
                    }
                    view = context;
                    if (context == null)
                    {
                        view = b.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            a(imageview, ((Drawable) (view)), 4);
        }
        if (abw1.d != null)
        {
            context = abw1.d;
            if (m == -1)
            {
                view = obj;
            } else
            {
                view = a(cursor.getString(m));
            }
            a(((ImageView) (context)), ((Drawable) (view)), 8);
        }
        abw1.e.setVisibility(8);
    }

    public final CharSequence c(Cursor cursor)
    {
        if (cursor != null)
        {
            String s = a(cursor, "suggest_intent_query");
            if (s != null)
            {
                return s;
            }
            if (d.shouldRewriteQueryFromData())
            {
                String s1 = a(cursor, "suggest_intent_data");
                if (s1 != null)
                {
                    return s1;
                }
            }
            if (d.shouldRewriteQueryFromText())
            {
                cursor = a(cursor, "suggest_text_1");
                if (cursor != null)
                {
                    return cursor;
                }
            }
        }
        return null;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        try
        {
            view = super.getView(i1, view, viewgroup);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", view);
            viewgroup = a(b, a, viewgroup);
            if (viewgroup != null)
            {
                ((abw)viewgroup.getTag()).a.setText(view.toString());
            }
            return viewgroup;
        }
        return view;
    }

    public final boolean hasStableIds()
    {
        return false;
    }

    public final void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        d(super.a);
    }

    public final void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        d(super.a);
    }

    public final void onClick(View view)
    {
        view = ((View) (view.getTag()));
        if (view instanceof CharSequence)
        {
            c.a((CharSequence)view);
        }
    }
}
