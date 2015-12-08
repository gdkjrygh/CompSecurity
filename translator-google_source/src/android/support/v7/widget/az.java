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
import android.support.v4.content.g;
import android.support.v4.widget.bb;
import android.support.v4.widget.m;
import android.support.v7.a.b;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
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
//            SearchView, ba

final class az extends bb
    implements android.view.View.OnClickListener
{

    int j;
    private final SearchManager k;
    private final SearchView l;
    private final SearchableInfo m;
    private final Context n;
    private final WeakHashMap o;
    private final int p;
    private boolean q;
    private ColorStateList r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;

    public az(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
    {
        super(context, searchview.getSuggestionRowLayout());
        q = false;
        j = 1;
        s = -1;
        t = -1;
        u = -1;
        v = -1;
        w = -1;
        x = -1;
        k = (SearchManager)d.getSystemService("search");
        l = searchview;
        m = searchableinfo;
        p = searchview.getSuggestionCommitIconResId();
        n = context;
        o = weakhashmap;
    }

    private Drawable a(ComponentName componentname)
    {
        Object obj = d.getPackageManager();
        ActivityInfo activityinfo;
        int i;
        try
        {
            activityinfo = ((PackageManager) (obj)).getActivityInfo(componentname, 128);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            componentname.toString();
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
            (new StringBuilder("Invalid icon resource ")).append(i).append(" for ").append(componentname.flattenToShortString());
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
            break MISSING_BLOCK_LABEL_78;
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
            (new StringBuilder("Icon not found: ")).append(uri).append(", ").append(((FileNotFoundException) (obj1)).getMessage());
        }
        return null;
        obj1 = n.getContentResolver().openInputStream(uri);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        throw new FileNotFoundException((new StringBuilder("Failed to open ")).append(uri).toString());
        Drawable drawable = Drawable.createFromStream(((InputStream) (obj1)), null);
        ((InputStream) (obj1)).close();
        return drawable;
        obj1;
        (new StringBuilder("Error closing icon stream for ")).append(uri);
        return drawable;
        Exception exception;
        exception;
        ((InputStream) (obj1)).close();
_L1:
        throw exception;
        obj1;
        (new StringBuilder("Error closing icon stream for ")).append(uri);
          goto _L1
    }

    private Drawable a(String s1)
    {
        if (s1 != null && s1.length() != 0 && !"0".equals(s1)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Drawable) (obj));
_L2:
        Drawable drawable1;
        String s2;
        int i;
        i = Integer.parseInt(s1);
        s2 = (new StringBuilder("android.resource://")).append(n.getPackageName()).append("/").append(i).toString();
        drawable1 = b(s2);
        obj = drawable1;
        if (drawable1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = g.a(n, i);
        a(s2, ((Drawable) (obj)));
        return ((Drawable) (obj));
        NumberFormatException numberformatexception;
        numberformatexception;
        Drawable drawable2 = b(s1);
        numberformatexception = drawable2;
        if (drawable2 == null)
        {
            Drawable drawable = a(Uri.parse(s1));
            a(s1, drawable);
            return drawable;
        }
        continue; /* Loop/switch isn't completed */
        s1;
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(Cursor cursor, int i)
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
            return null;
        }
        return cursor;
    }

    public static String a(Cursor cursor, String s1)
    {
        return a(cursor, cursor.getColumnIndex(s1));
    }

    private static void a(ImageView imageview, Drawable drawable, int i)
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

    private void a(String s1, Drawable drawable)
    {
        if (drawable != null)
        {
            o.put(s1, drawable.getConstantState());
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
            resources = d.getPackageManager().getResourcesForApplication(((String) (obj)));
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

    private Drawable b(String s1)
    {
        s1 = (android.graphics.drawable.Drawable.ConstantState)o.get(s1);
        if (s1 == null)
        {
            return null;
        } else
        {
            return s1.newDrawable();
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
        if (l.getVisibility() != 0 || l.getWindowVisibility() != 0)
        {
            return null;
        }
        SearchableInfo searchableinfo = m;
        if (searchableinfo != null) goto _L2; else goto _L1
_L1:
        charsequence = null;
_L9:
        if (charsequence == null) goto _L4; else goto _L3
_L3:
        charsequence.getCount();
        return charsequence;
_L2:
        Object obj = searchableinfo.getSuggestAuthority();
        if (obj == null)
        {
            charsequence = null;
            continue; /* Loop/switch isn't completed */
        }
        String s1;
        obj = (new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("");
        s1 = searchableinfo.getSuggestPath();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        ((android.net.Uri.Builder) (obj)).appendEncodedPath(s1);
        ((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
        s1 = searchableinfo.getSuggestSelection();
        if (s1 == null) goto _L6; else goto _L5
_L5:
        String as[] = new String[1];
        as[0] = charsequence;
        charsequence = as;
_L7:
        try
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", "50");
            Uri uri = ((android.net.Uri.Builder) (obj)).build();
            charsequence = d.getContentResolver().query(uri, null, s1, charsequence, null);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
          goto _L4
_L6:
        ((android.net.Uri.Builder) (obj)).appendPath(charsequence);
        charsequence = null;
          goto _L7
_L4:
        return null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = super.a(context, cursor, viewgroup);
        context.setTag(new ba(context));
        ((ImageView)context.findViewById(android.support.v7.a.g.edit_query)).setImageResource(p);
        return context;
    }

    public final void a(Cursor cursor)
    {
        if (!q) goto _L2; else goto _L1
_L1:
        if (cursor != null)
        {
            cursor.close();
        }
_L4:
        return;
_L2:
        try
        {
            super.a(cursor);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            return;
        }
        if (cursor == null) goto _L4; else goto _L3
_L3:
        s = cursor.getColumnIndex("suggest_text_1");
        t = cursor.getColumnIndex("suggest_text_2");
        u = cursor.getColumnIndex("suggest_text_2_url");
        v = cursor.getColumnIndex("suggest_icon_1");
        w = cursor.getColumnIndex("suggest_icon_2");
        x = cursor.getColumnIndex("suggest_flags");
        return;
    }

    public final void a(View view, Cursor cursor)
    {
        Object obj1 = null;
        ba ba1 = (ba)view.getTag();
        int i;
        if (x != -1)
        {
            i = cursor.getInt(x);
        } else
        {
            i = 0;
        }
        if (ba1.a != null)
        {
            view = a(cursor, s);
            a(ba1.a, ((CharSequence) (view)));
        }
        if (ba1.b != null)
        {
            Object obj = a(cursor, u);
            ImageView imageview;
            if (obj != null)
            {
                if (r == null)
                {
                    view = new TypedValue();
                    d.getTheme().resolveAttribute(b.textColorSearchUrl, view, true);
                    r = d.getResources().getColorStateList(((TypedValue) (view)).resourceId);
                }
                view = new SpannableString(((CharSequence) (obj)));
                view.setSpan(new TextAppearanceSpan(null, 0, 0, r, null), 0, ((CharSequence) (obj)).length(), 33);
            } else
            {
                view = a(cursor, t);
            }
            if (TextUtils.isEmpty(view))
            {
                if (ba1.a != null)
                {
                    ba1.a.setSingleLine(false);
                    ba1.a.setMaxLines(2);
                }
            } else
            if (ba1.a != null)
            {
                ba1.a.setSingleLine(true);
                ba1.a.setMaxLines(1);
            }
            a(ba1.b, ((CharSequence) (view)));
        }
        if (ba1.c != null)
        {
            imageview = ba1.c;
            if (v == -1)
            {
                view = null;
            } else
            {
                Drawable drawable = a(cursor.getString(v));
                view = drawable;
                if (drawable == null)
                {
                    view = m.getSearchActivity();
                    String s1 = view.flattenToShortString();
                    Drawable drawable1;
                    if (o.containsKey(s1))
                    {
                        view = (android.graphics.drawable.Drawable.ConstantState)o.get(s1);
                        if (view == null)
                        {
                            drawable1 = null;
                        } else
                        {
                            drawable1 = view.newDrawable(n.getResources());
                        }
                    } else
                    {
                        drawable1 = a(((ComponentName) (view)));
                        if (drawable1 == null)
                        {
                            view = null;
                        } else
                        {
                            view = drawable1.getConstantState();
                        }
                        o.put(s1, view);
                    }
                    view = drawable1;
                    if (drawable1 == null)
                    {
                        view = d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            a(imageview, ((Drawable) (view)), 4);
        }
        if (ba1.d != null)
        {
            obj = ba1.d;
            if (w == -1)
            {
                view = obj1;
            } else
            {
                view = a(cursor.getString(w));
            }
            a(((ImageView) (obj)), ((Drawable) (view)), 8);
        }
        if (j == 2 || j == 1 && (i & 1) != 0)
        {
            ba1.e.setVisibility(0);
            ba1.e.setTag(ba1.a.getText());
            ba1.e.setOnClickListener(this);
            return;
        } else
        {
            ba1.e.setVisibility(8);
            return;
        }
    }

    public final CharSequence c(Cursor cursor)
    {
        if (cursor != null)
        {
            String s1 = a(cursor, "suggest_intent_query");
            if (s1 != null)
            {
                return s1;
            }
            if (m.shouldRewriteQueryFromData())
            {
                String s2 = a(cursor, "suggest_intent_data");
                if (s2 != null)
                {
                    return s2;
                }
            }
            if (m.shouldRewriteQueryFromText())
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

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        try
        {
            view = super.getView(i, view, viewgroup);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            viewgroup = a(d, c, viewgroup);
            if (viewgroup != null)
            {
                ((ba)viewgroup.getTag()).a.setText(view.toString());
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
        d(super.c);
    }

    public final void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        d(super.c);
    }

    public final void onClick(View view)
    {
        view = ((View) (view.getTag()));
        if (view instanceof CharSequence)
        {
            l.a((CharSequence)view);
        }
    }
}
