// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.util.Assertion;
import eea;
import eed;

public abstract class FeaturedAction
{

    private static eed d;
    public Ad a;
    public eea b;
    public android.view.View.OnClickListener c;

    public FeaturedAction()
    {
        c = new android.view.View.OnClickListener() {

            private FeaturedAction a;

            public final void onClick(View view)
            {
                a.b.a();
            }

            
            {
                a = FeaturedAction.this;
                super();
            }
        };
    }

    public static eed a()
    {
        com/spotify/mobile/android/spotlets/ads/FeaturedAction;
        JVM INSTR monitorenter ;
        eed eed1;
        if (d == null)
        {
            d = new eed((byte)0);
        }
        eed1 = d;
        com/spotify/mobile/android/spotlets/ads/FeaturedAction;
        JVM INSTR monitorexit ;
        return eed1;
        Exception exception;
        exception;
        throw exception;
    }

    public Button a(Context context, ViewGroup viewgroup)
    {
        Assertion.a(d(), "primary button not implemented");
        return null;
    }

    public String a(Context context)
    {
        return "";
    }

    public final void a(eea eea1)
    {
        b = eea1;
    }

    public boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return false;
    }

    public boolean e()
    {
        return true;
    }

    public boolean f()
    {
        return false;
    }

    public boolean g()
    {
        return false;
    }

    public String h()
    {
        return null;
    }

    public abstract Type i();

    public final boolean j()
    {
        return b != null;
    }

    public final void k()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.c(flag, "triggered an uninitialized action");
        b.a();
    }

    public void l()
    {
        b.a();
    }

    public final String m()
    {
        if (a != null)
        {
            return a.getId();
        } else
        {
            return "undefined";
        }
    }
}
