// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package b.a:
//            bj, bk

public final class bq
    implements bj
{

    private Double a;

    public bq()
    {
        a = null;
        bk.b();
        double d1 = 1.0D;
        Intent intent = bk.b().getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = intent.getIntExtra("level", -1);
        double d2 = intent.getIntExtra("scale", -1);
        double d = d1;
        if (i >= 0)
        {
            d = d1;
            if (d2 > 0.0D)
            {
                d = (double)i / d2;
            }
        }
        a = Double.valueOf(d);
    }

    public final String a()
    {
        return "battery_level";
    }

    public final volatile Object b()
    {
        return a;
    }
}
