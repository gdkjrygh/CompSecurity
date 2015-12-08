// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.arsenal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import dki;
import dkj;
import dkr;
import dkw;
import dxj;
import dxk;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import u;

public class ArsenalLinkingFragment extends dxj
{

    private ExecutorService Y;
    private dkj Z;
    private boolean a;
    private dkr b;

    public ArsenalLinkingFragment()
    {
    }

    public static dkr a(ArsenalLinkingFragment arsenallinkingfragment)
    {
        return arsenallinkingfragment.b;
    }

    public static dxj a(String s, String s1, dxk dxk1)
    {
        dxk1 = new ArsenalLinkingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_npam_token", s);
        bundle.putString("arg_spotify_username", s1);
        dxk1.f(bundle);
        return dxk1;
    }

    public static boolean b(ArsenalLinkingFragment arsenallinkingfragment)
    {
        arsenallinkingfragment.a = true;
        return true;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030075, viewgroup, false);
    }

    public final dki a()
    {
        return (dki)H().a(this);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = dkr.a(k().getApplicationContext());
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ((TextView)view.findViewById(0x7f11026e)).setText(0x7f0800c0);
        view.findViewById(0x7f1102ef).setVisibility(8);
        bundle = dkw.b(k());
        String s = dkw.c(k());
        ((TextView)view.findViewById(0x7f11034c)).setText(bundle);
        ((TextView)view.findViewById(0x7f11034d)).setText(s);
        view.findViewById(0x7f11034f).setVisibility(8);
        view.findViewById(0x7f110350).setVisibility(8);
        view.findViewById(0x7f1102c3).setVisibility(0);
    }

    public final void c()
    {
        super.c();
        Y = Executors.newSingleThreadExecutor();
        Z = new dkj(this, k(), g().getString("arg_npam_token"), g().getString("arg_spotify_username"), (byte)0);
        Z.executeOnExecutor(Y, new Void[0]);
    }

    public final void d()
    {
        super.d();
        if (Z.getStatus() == android.os.AsyncTask.Status.RUNNING)
        {
            Z.cancel(true);
        }
        if (!a)
        {
            a().b();
        }
        Y.shutdown();
    }

    // Unreferenced inner class com/spotify/mobile/android/arsenal/ArsenalLinkingFragment$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[LinkingStatus.values().length];
            try
            {
                a[LinkingStatus.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[LinkingStatus.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[LinkingStatus.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[LinkingStatus.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }

        private class LinkingStatus extends Enum
        {

            public static final LinkingStatus a;
            public static final LinkingStatus b;
            public static final LinkingStatus c;
            public static final LinkingStatus d;
            private static final LinkingStatus e[];

            public static LinkingStatus valueOf(String s)
            {
                return (LinkingStatus)Enum.valueOf(com/spotify/mobile/android/arsenal/ArsenalLinkingFragment$LinkingStatus, s);
            }

            public static LinkingStatus[] values()
            {
                return (LinkingStatus[])e.clone();
            }

            static 
            {
                a = new LinkingStatus("SUCCESS", 0);
                b = new LinkingStatus("FAILURE", 1);
                c = new LinkingStatus("ALREADY_LINKED", 2);
                d = new LinkingStatus("LINKED_TO_ANOTHER_ACCOUNT", 3);
                e = (new LinkingStatus[] {
                    a, b, c, d
                });
            }

            private LinkingStatus(String s, int i)
            {
                super(s, i);
            }
        }

    }

}
