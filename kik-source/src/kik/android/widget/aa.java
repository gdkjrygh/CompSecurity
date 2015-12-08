// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.kik.g.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kik.android.util.bf;
import kik.android.util.ct;

// Referenced classes of package kik.android.widget:
//            GalleryWidget, ab, GalleryImageView, RobotoTextView

final class aa extends BaseAdapter
{
    final class a
        implements Comparator
    {

        final aa a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (String)obj;
            obj1 = (String)obj1;
            int i = ((b)aa.c().get(obj)).c;
            return ((b)aa.c().get(obj1)).c - i;
        }

        a()
        {
            a = aa.this;
            super();
        }
    }

    final class b
    {

        String a;
        long b;
        int c;
        boolean d;
        final aa e;

        b()
        {
            e = aa.this;
            super();
        }
    }

    private final class c
    {

        GalleryImageView a;
        TextView b;
        TextView c;
        final aa d;

        private c()
        {
            d = aa.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d extends bf
    {

        p a;
        final aa b;

        protected final Object doInBackground(Object aobj[])
        {
            aobj = new HashMap();
            String as[] = aa.e(b);
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                Cursor cursor = aa.d(b).a(s);
                if (cursor == null)
                {
                    continue;
                }
                if (cursor.getCount() > 0)
                {
                    b b1 = b. new b();
                    b1.a = s;
                    b1.b = cursor.getLong(aa.f(b));
                    b1.c = cursor.getCount();
                    b1.d = aa.a(cursor);
                    ((Map) (aobj)).put(s, b1);
                }
                cursor.close();
            }

            return ((Object) (aobj));
        }

        protected final void onPostExecute(Object obj)
        {
            obj = (Map)obj;
            a.a(obj);
        }

        d(p p1)
        {
            b = aa.this;
            super();
            a = p1;
        }
    }


    private static Map b = new HashMap();
    private static List c;
    private static List d;
    private static String e;
    private final String a;
    private GalleryWidget f;
    private LayoutInflater g;
    private int h;

    aa(GalleryWidget gallerywidget, LayoutInflater layoutinflater, int i, String s)
    {
        a = s;
        f = gallerywidget;
        g = layoutinflater;
        h = i;
        b = g();
        d();
        e();
        f();
        a(s);
    }

    static Map a(Map map)
    {
        b = map;
        return map;
    }

    static void a(aa aa1)
    {
        aa1.d();
    }

    static boolean a(Cursor cursor)
    {
        return b(cursor);
    }

    public static String b()
    {
        return e;
    }

    static void b(aa aa1)
    {
        aa1.e();
    }

    private static boolean b(Cursor cursor)
    {
        if (cursor == null)
        {
            return false;
        } else
        {
            return ct.a(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
        }
    }

    static Map c()
    {
        return b;
    }

    static void c(aa aa1)
    {
        aa1.f();
    }

    static GalleryWidget d(aa aa1)
    {
        return aa1.f;
    }

    private void d()
    {
        boolean flag = false;
        b b1 = new b();
        b1.a = a;
        Iterator iterator = b.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b2 = (b)iterator.next();
            if (!b2.a.equals(a))
            {
                i = b2.c + i;
            }
        } while (true);
        b1.c = i;
        if (b1.c > 0)
        {
            Cursor cursor = f.a(null);
            long l;
            if (cursor != null)
            {
                l = cursor.getLong(h);
                cursor.close();
            } else
            {
                l = -1L;
            }
            b1.b = l;
        }
        cursor = f.a(null);
        if (cursor != null)
        {
            flag = b(cursor);
            cursor.close();
        }
        b1.d = flag;
        b.put(a, b1);
    }

    private void e()
    {
        Cursor cursor = f.a(GalleryWidget.b);
        if (cursor != null && cursor.getCount() > 0)
        {
            cursor.moveToPosition(0);
            b b1 = new b();
            b1.a = GalleryWidget.b;
            b1.c = cursor.getCount();
            b1.b = cursor.getLong(h);
            b1.d = true;
            b.put(GalleryWidget.b, b1);
            cursor.close();
        }
    }

    static String[] e(aa aa1)
    {
        HashSet hashset = new HashSet();
        aa1 = aa1.f.a(null);
        if (aa1 != null)
        {
            int j = aa1.getColumnIndex("bucket_display_name");
            for (int i = 0; i < aa1.getCount(); i++)
            {
                aa1.moveToPosition(i);
                String s = aa1.getString(j);
                if (s != null)
                {
                    hashset.add(s);
                }
            }

        }
        return (String[])hashset.toArray(new String[0]);
    }

    static int f(aa aa1)
    {
        return aa1.h;
    }

    private void f()
    {
        ArrayList arraylist = new ArrayList(b.keySet());
        c = arraylist;
        Collections.sort(arraylist, new a());
    }

    private Map g()
    {
        HashMap hashmap = new HashMap();
        Cursor cursor = f.a(null);
        if (cursor != null)
        {
            int j = cursor.getColumnIndexOrThrow("bucket_display_name");
            for (int i = 0; i < cursor.getCount(); i++)
            {
                cursor.moveToPosition(i);
                String s = cursor.getString(j);
                if (s == null)
                {
                    continue;
                }
                b b2 = (b)hashmap.get(s);
                b b1 = b2;
                if (b2 == null)
                {
                    b1 = new b();
                    b1.a = s;
                    b1.c = 0;
                    b1.b = cursor.getLong(h);
                    b1.d = b(cursor);
                }
                b1.c = b1.c + 1;
                hashmap.put(s, b1);
            }

            cursor.close();
        }
        return hashmap;
    }

    public final void a()
    {
        p p1 = new p();
        p1.a(new ab(this));
        try
        {
            (new d(p1)).a(new Void[0]);
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            return;
        }
    }

    public final void a(String s)
    {
        e = s;
        ArrayList arraylist = new ArrayList(c);
        d = arraylist;
        arraylist.remove(s);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return d.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        long l;
        boolean flag;
        if (view == null)
        {
            view = new c((byte)0);
            View view1 = g.inflate(0x7f030049, viewgroup, false);
            view.a = (GalleryImageView)view1.findViewById(0x7f0e010c);
            view.c = (RobotoTextView)view1.findViewById(0x7f0e010e);
            view.b = (RobotoTextView)view1.findViewById(0x7f0e010d);
            view1.setTag(view);
            viewgroup = view;
            view = view1;
        } else
        {
            viewgroup = (c)view.getTag();
        }
        s = (String)d.get(i);
        ((c) (viewgroup)).c.setText((new StringBuilder()).append(((b)b.get(s)).c).toString());
        if (b.containsKey(s))
        {
            l = ((b)b.get(s)).b;
        } else
        {
            Cursor cursor = f.a(s);
            if (cursor != null)
            {
                l = cursor.getLong(h);
                cursor.close();
            } else
            {
                l = -1L;
            }
        }
        if (b.containsKey(s))
        {
            flag = ((b)b.get(s)).d;
        } else
        {
            Cursor cursor1 = f.a(s);
            if (cursor1 != null)
            {
                flag = b(cursor1);
                cursor1.close();
            } else
            {
                flag = false;
            }
        }
        ((c) (viewgroup)).a.setVisibility(0);
        f.a(l, "GalleryWidgetThumbs", ((c) (viewgroup)).a, 3, flag);
        ((c) (viewgroup)).b.setText(s);
        view.setContentDescription((new StringBuilder("AUTOMATION_GALLERY_DROPDOWN_")).append(s.toUpperCase()).toString());
        view.setBackgroundColor(-1);
        return view;
    }

    public final Object getItem(int i)
    {
        return d.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view = new c((byte)0);
            view1 = g.inflate(0x7f030049, viewgroup, false);
            view.a = (GalleryImageView)view1.findViewById(0x7f0e010c);
            view.c = (RobotoTextView)view1.findViewById(0x7f0e010e);
            view.b = (RobotoTextView)view1.findViewById(0x7f0e010d);
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (c)view.getTag();
            view1 = view;
        }
        ((c) (viewgroup)).a.setVisibility(8);
        ((c) (viewgroup)).b.setText(e);
        return view1;
    }

}
