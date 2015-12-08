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
import android.support.v4.widget.i;
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

class android.support.v7.widget.a extends i
    implements android.view.View.OnClickListener
{
    private static final class a
    {

        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view)
        {
            a = (TextView)view.findViewById(0x1020014);
            b = (TextView)view.findViewById(0x1020015);
            c = (ImageView)view.findViewById(0x1020007);
            d = (ImageView)view.findViewById(0x1020008);
            e = (ImageView)view.findViewById(android.support.v7.appcompat.R.id.edit_query);
        }
    }


    private SearchManager j;
    private SearchView k;
    private SearchableInfo l;
    private Context m;
    private WeakHashMap n;
    private boolean o;
    private int p;
    private ColorStateList q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;

    public android.support.v7.widget.a(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
    {
        super(context, android.support.v7.appcompat.R.layout.abc_search_dropdown_item_icons_2line, null, true);
        o = false;
        p = 1;
        r = -1;
        s = -1;
        t = -1;
        u = -1;
        v = -1;
        w = -1;
        j = (SearchManager)d.getSystemService("search");
        k = searchview;
        l = searchableinfo;
        m = context;
        n = weakhashmap;
    }

    private Drawable a(ComponentName componentname)
    {
        Object obj = null;
        String s1 = componentname.flattenToShortString();
        if (n.containsKey(s1))
        {
            componentname = (android.graphics.drawable.Drawable.ConstantState)n.get(s1);
            if (componentname == null)
            {
                return null;
            } else
            {
                return componentname.newDrawable(m.getResources());
            }
        }
        Drawable drawable = b(componentname);
        if (drawable == null)
        {
            componentname = obj;
        } else
        {
            componentname = drawable.getConstantState();
        }
        n.put(s1, componentname);
        return drawable;
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
        int i1;
        i1 = Integer.parseInt(s1);
        s2 = (new StringBuilder()).append("android.resource://").append(m.getPackageName()).append("/").append(i1).toString();
        drawable1 = b(s2);
        obj = drawable1;
        if (drawable1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = m.getResources().getDrawable(i1);
        a(s2, ((Drawable) (obj)));
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        Drawable drawable2 = b(s1);
        obj1 = drawable2;
        if (drawable2 == null)
        {
            Drawable drawable = b(Uri.parse(s1));
            a(s1, drawable);
            return drawable;
        }
        continue; /* Loop/switch isn't completed */
        drawable;
        Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon resource not found: ").append(s1).toString());
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

    public static String a(Cursor cursor, String s1)
    {
        return a(cursor, cursor.getColumnIndex(s1));
    }

    private void a(ImageView imageview, Drawable drawable, int i1)
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

    private void a(TextView textview, CharSequence charsequence)
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
            n.put(s1, drawable.getConstantState());
        }
    }

    private Drawable b(ComponentName componentname)
    {
        Object obj = d.getPackageManager();
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
            Log.w("SuggestionsAdapter", (new StringBuilder()).append("Invalid icon resource ").append(i1).append(" for ").append(componentname.flattenToShortString()).toString());
            return null;
        } else
        {
            return ((Drawable) (obj));
        }
    }

    private Drawable b(Uri uri)
    {
        boolean flag = "android.resource".equals(uri.getScheme());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = a(uri);
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
        obj1 = m.getContentResolver().openInputStream(uri);
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

    private Drawable b(String s1)
    {
        s1 = (android.graphics.drawable.Drawable.ConstantState)n.get(s1);
        if (s1 == null)
        {
            return null;
        } else
        {
            return s1.newDrawable();
        }
    }

    private CharSequence b(CharSequence charsequence)
    {
        if (q == null)
        {
            TypedValue typedvalue = new TypedValue();
            d.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.textColorSearchUrl, typedvalue, true);
            q = d.getResources().getColorStateList(typedvalue.resourceId);
        }
        SpannableString spannablestring = new SpannableString(charsequence);
        spannablestring.setSpan(new TextAppearanceSpan(null, 0, 0, q, null), 0, charsequence.length(), 33);
        return spannablestring;
    }

    private void d(Cursor cursor)
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

    private Drawable e(Cursor cursor)
    {
        Drawable drawable;
        if (u == -1)
        {
            drawable = null;
        } else
        {
            Drawable drawable1 = a(cursor.getString(u));
            drawable = drawable1;
            if (drawable1 == null)
            {
                return g(cursor);
            }
        }
        return drawable;
    }

    private Drawable f(Cursor cursor)
    {
        if (v == -1)
        {
            return null;
        } else
        {
            return a(cursor.getString(v));
        }
    }

    private Drawable g(Cursor cursor)
    {
        cursor = a(l.getSearchActivity());
        if (cursor != null)
        {
            return cursor;
        } else
        {
            return d.getPackageManager().getDefaultActivityIcon();
        }
    }

    Cursor a(SearchableInfo searchableinfo, String s1, int i1)
    {
        Object obj;
        if (searchableinfo != null)
        {
            if ((obj = searchableinfo.getSuggestAuthority()) != null)
            {
                obj = (new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("");
                String s2 = searchableinfo.getSuggestPath();
                if (s2 != null)
                {
                    ((android.net.Uri.Builder) (obj)).appendEncodedPath(s2);
                }
                ((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
                s2 = searchableinfo.getSuggestSelection();
                if (s2 != null)
                {
                    searchableinfo = new String[1];
                    searchableinfo[0] = s1;
                } else
                {
                    ((android.net.Uri.Builder) (obj)).appendPath(s1);
                    searchableinfo = null;
                }
                if (i1 > 0)
                {
                    ((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", String.valueOf(i1));
                }
                s1 = ((android.net.Uri.Builder) (obj)).build();
                return d.getContentResolver().query(s1, null, s2, searchableinfo, null);
            }
        }
        return null;
    }

    public Cursor a(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            charsequence = "";
        } else
        {
            charsequence = charsequence.toString();
        }
        if (k.getVisibility() != 0 || k.getWindowVisibility() != 0)
        {
            return null;
        }
        charsequence = a(l, ((String) (charsequence)), 50);
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        charsequence.getCount();
        return charsequence;
        charsequence;
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", charsequence);
        return null;
    }

    Drawable a(Uri uri)
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
            resources = d.getPackageManager().getResourcesForApplication(((String) (obj)));
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
                throw new FileNotFoundException((new StringBuilder()).append("Single path segment is not a resource ID: ").append(uri).toString());
            }
        } else
        if (i1 == 2)
        {
            i1 = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
        } else
        {
            throw new FileNotFoundException((new StringBuilder()).append("More than two path segments: ").append(uri).toString());
        }
        if (i1 == 0)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No resource found for: ").append(uri).toString());
        } else
        {
            return resources.getDrawable(i1);
        }
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = super.a(context, cursor, viewgroup);
        context.setTag(new a(context));
        return context;
    }

    public void a(int i1)
    {
        p = i1;
    }

    public void a(Cursor cursor)
    {
        if (!o) goto _L2; else goto _L1
_L1:
        Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
        if (cursor != null)
        {
            cursor.close();
        }
_L4:
        return;
_L2:
        super.a(cursor);
        if (cursor != null)
        {
            try
            {
                r = cursor.getColumnIndex("suggest_text_1");
                s = cursor.getColumnIndex("suggest_text_2");
                t = cursor.getColumnIndex("suggest_text_2_url");
                u = cursor.getColumnIndex("suggest_icon_1");
                v = cursor.getColumnIndex("suggest_icon_2");
                w = cursor.getColumnIndex("suggest_flags");
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

    public void a(View view, Context context, Cursor cursor)
    {
        context = (a)view.getTag();
        int i1;
        if (w != -1)
        {
            i1 = cursor.getInt(w);
        } else
        {
            i1 = 0;
        }
        if (((a) (context)).a != null)
        {
            view = a(cursor, r);
            a(((a) (context)).a, ((CharSequence) (view)));
        }
        if (((a) (context)).b == null) goto _L2; else goto _L1
_L1:
        view = a(cursor, t);
        if (view != null)
        {
            view = b(view);
        } else
        {
            view = a(cursor, s);
        }
        if (!TextUtils.isEmpty(view)) goto _L4; else goto _L3
_L3:
        if (((a) (context)).a != null)
        {
            ((a) (context)).a.setSingleLine(false);
            ((a) (context)).a.setMaxLines(2);
        }
_L6:
        a(((a) (context)).b, ((CharSequence) (view)));
_L2:
        if (((a) (context)).c != null)
        {
            a(((a) (context)).c, e(cursor), 4);
        }
        if (((a) (context)).d != null)
        {
            a(((a) (context)).d, f(cursor), 8);
        }
        if (p == 2 || p == 1 && (i1 & 1) != 0)
        {
            ((a) (context)).e.setVisibility(0);
            ((a) (context)).e.setTag(((a) (context)).a.getText());
            ((a) (context)).e.setOnClickListener(this);
            return;
        } else
        {
            ((a) (context)).e.setVisibility(8);
            return;
        }
_L4:
        if (((a) (context)).a != null)
        {
            ((a) (context)).a.setSingleLine(true);
            ((a) (context)).a.setMaxLines(1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public CharSequence c(Cursor cursor)
    {
        if (cursor != null)
        {
            String s1 = a(cursor, "suggest_intent_query");
            if (s1 != null)
            {
                return s1;
            }
            if (l.shouldRewriteQueryFromData())
            {
                String s2 = a(cursor, "suggest_intent_data");
                if (s2 != null)
                {
                    return s2;
                }
            }
            if (l.shouldRewriteQueryFromText())
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

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        try
        {
            view = super.getView(i1, view, viewgroup);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", view);
            viewgroup = a(d, c, viewgroup);
            if (viewgroup != null)
            {
                ((a)viewgroup.getTag()).a.setText(view.toString());
            }
            return viewgroup;
        }
        return view;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        d(a());
    }

    public void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        d(a());
    }

    public void onClick(View view)
    {
        view = ((View) (view.getTag()));
        if (view instanceof CharSequence)
        {
            k.a((CharSequence)view);
        }
    }
}
