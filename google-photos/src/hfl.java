// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;

final class hfl
    implements hfk
{

    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private final Context b;

    public hfl(Context context)
    {
        b = context;
    }

    public final hfi a()
    {
label0:
        {
            boolean flag1 = false;
            Intent intent = b.registerReceiver(null, a);
            hfj hfj1 = new hfj();
            int i = intent.getIntExtra("level", -1);
            int j = intent.getIntExtra("scale", -1);
            boolean flag;
            if (i == -1 || j == -1)
            {
                hfj1.a = 0.0F;
            } else
            {
                hfj1.a = (float)i / (float)j;
            }
            i = intent.getIntExtra("plugged", -1);
            if (i == 4 || i == 1 || i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hfj1.b = flag;
            i = intent.getIntExtra("status", -1);
            if (i != 2)
            {
                flag = flag1;
                if (i != 5)
                {
                    break label0;
                }
            }
            flag = true;
        }
        hfj1.c = flag;
        hfj1.d = ((PowerManager)b.getSystemService("power")).isScreenOn();
        return new hfi(hfj1);
    }

}
