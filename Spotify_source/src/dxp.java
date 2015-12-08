// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class dxp extends dxx
{

    private dkm Y;
    private boolean a;
    private dkn b;

    public dxp()
    {
        Y = new dkm() {

            private dxp a;

            public final void a()
            {
                if (a.p())
                {
                    return;
                } else
                {
                    a.F().a();
                    return;
                }
            }

            public final void a(String s, String s1)
            {
                if (a.p())
                {
                    return;
                } else
                {
                    a.F().a(s, s1);
                    return;
                }
            }

            
            {
                a = dxp.this;
                super();
            }
        };
    }

    public static dxp a()
    {
        return new dxp();
    }

    public final dxq F()
    {
        return (dxq)H().a(this);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030077, viewgroup, false);
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        b = new dkn(activity);
    }

    public final void c()
    {
        super.c();
        if (!a)
        {
            b.a(k(), Y);
            a = true;
        }
    }

    public final void t_()
    {
        super.t_();
        b.b();
    }
}
