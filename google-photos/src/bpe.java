// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.StrictMode;

public final class bpe extends d
    implements olp
{

    private static bpe b;
    public bma a;
    private olm c;

    public bpe()
    {
    }

    public static bpe a(Context context)
    {
        if (b == null)
        {
            context = context.getApplicationContext();
            if (context instanceof bpe)
            {
                b = (bpe)context;
            } else
            {
                bpe bpe1 = new bpe();
                b = bpe1;
                bpe1.a = new bmc(context);
            }
        }
        return b;
    }

    private static void a(boolean flag)
    {
        android.os.StrictMode.ThreadPolicy.Builder builder = (new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyLog();
        if (flag)
        {
            builder.penaltyDeath();
        }
        StrictMode.setThreadPolicy(builder.build());
        StrictMode.setVmPolicy((new android.os.StrictMode.VmPolicy.Builder()).detectAll().penaltyLog().build());
    }

    public static boolean b(Context context)
    {
        return !((noj)olm.a(context, noj)).a();
    }

    public final olm ai_()
    {
        return c;
    }

    public final void onCreate()
    {
        a(false);
        Context context = getApplicationContext();
        c = new olm(context);
        c.a(new olw(context));
        c.a(mrv, new bpf(this));
        c.a(noj, new nol());
        super.onCreate();
        a = new bmc(this);
        a(true);
    }

    public final void onTerminate()
    {
        a = null;
        c = null;
        super.onTerminate();
    }
}
