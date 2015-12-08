// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.app.Activity;
import com.pandora.android.util.s;
import p.cc.c;
import p.cc.e;
import p.df.a;

// Referenced classes of package com.pandora.android.iap:
//            c, f

public static abstract class b
    implements p.cc..Object
{

    private Activity a;
    private String b;

    public void a(c c1, e e)
    {
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("onIapPurchaseFinished response: ").append(c1).toString());
        if (c1.d())
        {
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("onIapPurchaseFinished is failure: ").append(e).toString());
            switch (c1.a())
            {
            default:
                s.e(a);
                // fall through

            case -1005: 
                com.pandora.android.iap.f.a();
                break;
            }
            return;
        } else
        {
            (new p.cm.s()).execute(new Void[0]);
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("onIapPurchaseFinished success: ").append(e).toString());
            a(e);
            return;
        }
    }

    protected abstract void a(e e);

    public (Activity activity, String s1)
    {
        a = activity;
        b = s1;
    }
}
