// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.follow;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.view.LoadingView;
import dff;
import gag;

public final class NotAvailableViewManager
{

    public int a;
    private final Context b;
    private final ViewGroup c;
    private LoadingView d;
    private DataState e;
    private boolean f;
    private View g;
    private View h;

    public NotAvailableViewManager(Context context, LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        f = true;
        a = -1;
        b = context;
        c = viewgroup;
        d = LoadingView.a(layoutinflater, context, view);
        c.addView(d);
        view.setVisibility(4);
        a(DataState.a);
    }

    private void b()
    {
        if (!f) goto _L2; else goto _L1
_L1:
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[DataState.values().length];
                try
                {
                    a[DataState.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[DataState.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[DataState.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[DataState.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[e.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 49
    //                   2 54
    //                   3 161
    //                   4 173;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        return;
_L4:
        c();
        return;
_L5:
        d.b();
        if (h == null)
        {
            Context context = b;
            ViewGroup viewgroup1 = c;
            EmptyView emptyview = new EmptyView(context);
            Resources resources = context.getResources();
            emptyview.a(dff.c(context, SpotifyIcon.aI));
            emptyview.a(resources.getString(0x7f0802a1));
            emptyview.b(resources.getString(0x7f0802a0));
            viewgroup1.addView(emptyview);
            h = emptyview;
        }
        h.setVisibility(0);
        if (g != null)
        {
            g.setVisibility(8);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d();
        d.b();
        return;
_L7:
        c();
        return;
_L2:
        d.b();
        if (g == null)
        {
            Object obj = b;
            ViewGroup viewgroup = c;
            int j = a;
            int i = j;
            if (j == -1)
            {
                i = 0x7f0802ac;
            }
            obj = gag.a(((Context) (obj)), ((Context) (obj)).getString(i));
            viewgroup.addView(((View) (obj)));
            g = ((View) (obj));
        }
        g.setVisibility(0);
        if (h != null)
        {
            h.setVisibility(8);
            return;
        }
        if (true) goto _L3; else goto _L8
_L8:
    }

    private void c()
    {
        d();
        d.a();
    }

    private void d()
    {
        if (g != null)
        {
            g.setVisibility(8);
        }
        if (h != null)
        {
            h.setVisibility(8);
        }
    }

    public final Boolean a()
    {
        boolean flag;
        if (e == DataState.d || e == DataState.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final void a(DataState datastate)
    {
        if (e != datastate)
        {
            e = datastate;
            b();
        }
    }

    public final void a(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            b();
        }
    }

    private class DataState extends Enum
    {

        public static final DataState a;
        public static final DataState b;
        public static final DataState c;
        public static final DataState d;
        private static final DataState e[];

        public static DataState valueOf(String s)
        {
            return (DataState)Enum.valueOf(com/spotify/mobile/android/spotlets/follow/NotAvailableViewManager$DataState, s);
        }

        public static DataState[] values()
        {
            return (DataState[])e.clone();
        }

        static 
        {
            a = new DataState("PRE_LOAD", 0);
            b = new DataState("LOADING", 1);
            c = new DataState("FAILED_TO_LOAD", 2);
            d = new DataState("LOADED", 3);
            e = (new DataState[] {
                a, b, c, d
            });
        }

        private DataState(String s, int i)
        {
            super(s, i);
        }
    }

}
