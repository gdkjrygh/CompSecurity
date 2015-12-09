// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.spotify.android.paste.widget.StickyRecyclerView;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.ui.ActionBarTitle;

public final class dsv
{

    public final StickyRecyclerView a;
    public final Fragment b;
    public final PorcelainRenderDelegate c;
    final dpx d;
    public dii e;
    public dip f;
    private final dgw g = new dgw() {

        private dsv a;

        public final void a(int i, float f1)
        {
            if (a.f != null)
            {
                a.f.a(i, f1);
            }
        }

            
            {
                a = dsv.this;
                super();
            }
    };

    public dsv(PorcelainRenderDelegate porcelainrenderdelegate, dpx dpx, StickyRecyclerView stickyrecyclerview, Fragment fragment)
    {
        e = dii.a;
        d = dpx;
        c = (PorcelainRenderDelegate)ctz.a(porcelainrenderdelegate);
        b = (Fragment)ctz.a(fragment);
        a = (StickyRecyclerView)ctz.a(stickyrecyclerview);
    }

    public final Context a()
    {
        u u = b.k();
        if (u == null)
        {
            throw new IllegalStateException("Fragment not attached!");
        } else
        {
            return u;
        }
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            a.a(g);
            return;
        } else
        {
            a.b(g);
            return;
        }
    }

    // Unreferenced inner class dsv$2

/* anonymous class */
    public final class _cls2
        implements dii
    {

        private ActionBarTitle b;
        private float c;
        private fpe d;
        private Fragment e;

        public final void a(float f1)
        {
            c = f1;
            if (b != null)
            {
                b.a = f1;
                d.a(e, b);
            }
        }

        public final void a(String s)
        {
            b = new ActionBarTitle(d.e(), s);
            b.a = c;
            d.a(e, b);
        }

            public 
            {
                d = fpe1;
                e = fragment;
                super();
                c = 1.0F;
            }
    }


    // Unreferenced inner class dsv$3

/* anonymous class */
    public final class _cls3 extends dfr
    {

        private dip a;

        public final void a(int i)
        {
            a.b(i);
        }

            public 
            {
                a = dip1;
                super();
            }
    }


    // Unreferenced inner class dsv$4

/* anonymous class */
    public final class _cls4
        implements android.view.View.OnClickListener
    {

        private PorcelainNavigationLink a;
        private dsv b;

        public final void onClick(View view)
        {
            b.d.a(a, -1, -1);
        }

            public 
            {
                b = dsv.this;
                a = porcelainnavigationlink;
                super();
            }
    }


    // Unreferenced inner class dsv$5

/* anonymous class */
    public final class _cls5
    {

        public static final int a[];

        static 
        {
            a = new int[com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style.values().length];
            try
            {
                a[com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }

}
