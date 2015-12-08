// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.da;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.m4b.maps.g.g;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.m4b.maps.da:
//            c, e

public abstract class com.google.android.m4b.maps.da.a
{
    static interface a
    {

        public abstract int a();

        public abstract void b();
    }


    public c a;
    public Bundle b;
    LinkedList c;
    private final e d = new e() {

        private com.google.android.m4b.maps.da.a a;

        public final void a(c c1)
        {
            a.a = c1;
            for (c1 = a.c.iterator(); c1.hasNext(); ((a)c1.next()).b()) { }
            a.c.clear();
            a.b = null;
        }

            
            {
                a = com.google.android.m4b.maps.da.a.this;
                super();
            }
    };

    public com.google.android.m4b.maps.da.a()
    {
    }

    public final void a(int i)
    {
        for (; !c.isEmpty() && ((a)c.getLast()).a() >= i; c.removeLast()) { }
    }

    public final void a(Bundle bundle, a a1)
    {
        if (a != null)
        {
            a1.b();
            return;
        }
        if (c == null)
        {
            c = new LinkedList();
        }
        c.add(a1);
        if (bundle != null)
        {
            if (b == null)
            {
                b = (Bundle)bundle.clone();
            } else
            {
                b.putAll(bundle);
            }
        }
        a(d);
    }

    public abstract void a(e e);

    // Unreferenced inner class com/google/android/m4b/maps/da/a$2

/* anonymous class */
    public final class _cls2
        implements a
    {

        private Activity a;
        private Bundle b;
        private Bundle c;
        private com.google.android.m4b.maps.da.a d;

        public final int a()
        {
            return 0;
        }

        public final void b()
        {
            d.a.a(a, b);
        }

            public 
            {
                d = com.google.android.m4b.maps.da.a.this;
                a = activity;
                b = bundle;
                c = bundle1;
                super();
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/da/a$3

/* anonymous class */
    public final class _cls3
        implements a
    {

        private Bundle a;
        private com.google.android.m4b.maps.da.a b;

        public final int a()
        {
            return 1;
        }

        public final void b()
        {
            b.a.a(a);
        }

            public 
            {
                b = com.google.android.m4b.maps.da.a.this;
                a = bundle;
                super();
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/da/a$4

/* anonymous class */
    public final class _cls4
        implements a
    {

        private FrameLayout a;
        private LayoutInflater b;
        private ViewGroup c;
        private Bundle d;
        private com.google.android.m4b.maps.da.a e;

        public final int a()
        {
            return 2;
        }

        public final void b()
        {
            a.removeAllViews();
            a.addView(e.a.a(b, c, d));
        }

            public 
            {
                e = com.google.android.m4b.maps.da.a.this;
                a = framelayout;
                b = layoutinflater;
                c = viewgroup;
                d = bundle;
                super();
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/da/a$5

/* anonymous class */
    public final class _cls5
        implements android.view.View.OnClickListener
    {

        private Context a;
        private int b;

        public final void onClick(View view)
        {
            a.startActivity(g.b(b));
        }

            public 
            {
                a = context;
                b = i;
                super();
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/da/a$6

/* anonymous class */
    public final class _cls6
        implements a
    {

        private com.google.android.m4b.maps.da.a a;

        public final int a()
        {
            return 5;
        }

        public final void b()
        {
            a.a.a();
        }

            public 
            {
                a = com.google.android.m4b.maps.da.a.this;
                super();
            }
    }

}
