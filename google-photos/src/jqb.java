// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.MobileAdsSettingsParcel;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import java.util.regex.Pattern;

public final class jqb extends joo
    implements ljj, lrd
{

    private static final Object b = new Object();
    private static jqb c;
    private final Context a;
    private String d;
    private String e;
    private boolean f;
    private boolean g;

    private jqb(Context context)
    {
        a = context;
        f = false;
    }

    public static jqb a(Context context)
    {
        synchronized (b)
        {
            if (c == null)
            {
                c = new jqb(context.getApplicationContext());
            }
            context = c;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
    {
label0:
        {
            synchronized (b)
            {
                if (!f)
                {
                    break label0;
                }
                b.m("Mobile ads is initialized already.");
            }
            return;
        }
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        b.m("Fail to initialize mobile ads because context is null.");
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
        b.m("Fail to initialize mobile ads because ApplicationCode is empty.");
        obj;
        JVM INSTR monitorexit ;
        return;
        f = true;
        if (mobileadssettingsparcel == null) goto _L2; else goto _L1
_L1:
        if (!mobileadssettingsparcel.b) goto _L2; else goto _L3
_L3:
        jqc.c();
        if (kwz.a(a.getPackageManager(), a.getPackageName(), "android.permission.INTERNET")) goto _L5; else goto _L4
_L4:
        b.l("Missing permission android.permission.INTERNET");
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
label1:
        {
            jqc.c();
            if (kwz.a(a.getPackageManager(), a.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
            {
                break label1;
            }
            b.l("Missing permission android.permission.ACCESS_NETWORK_STATE");
        }
          goto _L2
        if (!Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", s))
        {
            throw new IllegalArgumentException("Please provide a valid application code");
        }
        g = true;
        d = s;
        e = mobileadssettingsparcel.c;
        s = lrb.a(a);
        mobileadssettingsparcel = new lra(d);
        if (!TextUtils.isEmpty(e))
        {
            mobileadssettingsparcel.d = e;
        }
        s.a(mobileadssettingsparcel.a());
        s.a(this);
        lji.a(a).a(this);
        s.b();
          goto _L2
    }

    public final void a(ljq ljq1)
    {
    }

    public final void a(ljq ljq1, Activity activity)
    {
        if (ljq1 != null && activity != null)
        {
            if (activity instanceof AdActivity)
            {
                jqc.c();
                int i = kwz.d(activity);
                if (i == 1)
                {
                    ljq1.a(true);
                    ljq1.a("Interstitial Ad");
                    return;
                }
                if (i == 2 || i == 3)
                {
                    ljq1.a("Expanded Ad");
                    return;
                } else
                {
                    ljq1.a(null);
                    return;
                }
            }
            if (activity instanceof InAppPurchaseActivity)
            {
                ljq1.a(null);
                return;
            }
        }
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (b)
        {
            flag = g;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        lrb.a(a).a();
    }

    public final int c()
    {
label0:
        {
            synchronized (b)
            {
                if (g)
                {
                    break label0;
                }
            }
            return -1;
        }
        ljq ljq1 = lji.a(a).b;
        if (ljq1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i = ljq1.b;
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

}
