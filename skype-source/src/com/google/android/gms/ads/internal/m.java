// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.MobileAdsSettingsParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.analytics.c;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jn;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jw;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.ads.internal:
//            p

public final class m extends com.google.android.gms.ads.internal.client.y.a
    implements com.google.android.gms.internal.jg.a, com.google.android.gms.internal.jw.a
{

    private static final Object e = new Object();
    private static m f;
    jv a;
    String b;
    String c;
    private final Context d;
    private boolean g;
    private boolean h;

    private m(Context context)
    {
        d = context;
        g = false;
    }

    public static m a(Context context)
    {
        synchronized (e)
        {
            if (f == null)
            {
                f = new m(context.getApplicationContext());
            }
            context = f;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(jn jn1)
    {
    }

    public final void a(jn jn1, Activity activity)
    {
        if (jn1 != null && activity != null)
        {
            if (activity instanceof AdActivity)
            {
                p.e();
                int i = gm.d(activity);
                if (i == 1)
                {
                    jn1.a(true);
                    jn1.a("Interstitial Ad");
                    return;
                }
                if (i == 2 || i == 3)
                {
                    jn1.a("Expanded Ad");
                    return;
                } else
                {
                    jn1.a(null);
                    return;
                }
            }
            if (activity instanceof InAppPurchaseActivity)
            {
                jn1.a(null);
                return;
            }
        }
    }

    public final void a(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
    {
label0:
        {
            synchronized (e)
            {
                if (!g)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.b.c("Mobile ads is initialized already.");
            }
            return;
        }
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        com.google.android.gms.ads.internal.util.client.b.c("Fail to initialize mobile ads because context is null.");
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        com.google.android.gms.ads.internal.util.client.b.c("Fail to initialize mobile ads because ApplicationCode is empty.");
        obj;
        JVM INSTR monitorexit ;
        return;
        g = true;
        if (mobileadssettingsparcel == null) goto _L2; else goto _L1
_L1:
        if (!mobileadssettingsparcel.b) goto _L2; else goto _L3
_L3:
        p.e();
        if (gm.a(d.getPackageManager(), d.getPackageName(), "android.permission.INTERNET")) goto _L5; else goto _L4
_L4:
        com.google.android.gms.ads.internal.util.client.b.a("Missing permission android.permission.INTERNET");
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
label1:
        {
            p.e();
            if (gm.a(d.getPackageManager(), d.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
            {
                break label1;
            }
            com.google.android.gms.ads.internal.util.client.b.a("Missing permission android.permission.ACCESS_NETWORK_STATE");
        }
          goto _L2
        if (!Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", s))
        {
            throw new IllegalArgumentException("Please provide a valid application code");
        }
        h = true;
        b = s;
        c = mobileadssettingsparcel.c;
        s = jw.a(d);
        mobileadssettingsparcel = new com.google.android.gms.internal.jv.a(b);
        if (!TextUtils.isEmpty(c))
        {
            mobileadssettingsparcel.a(c);
        }
        s.a(mobileadssettingsparcel.a());
        s.a(this);
        jg.a(d).a(this);
        s.b();
          goto _L2
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (e)
        {
            flag = h;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        a = jw.a(d).a();
    }

    public final int c()
    {
label0:
        {
            synchronized (e)
            {
                if (h)
                {
                    break label0;
                }
            }
            return -1;
        }
        jn jn1 = jg.a(d).a();
        if (jn1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i = jn1.b();
        obj;
        JVM INSTR monitorexit ;
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        return -1;
    }

    public final String d()
    {
label0:
        {
            synchronized (e)
            {
                if (h)
                {
                    break label0;
                }
            }
            return null;
        }
        String s = com.google.android.gms.analytics.c.a(d).g();
        obj;
        JVM INSTR monitorexit ;
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
