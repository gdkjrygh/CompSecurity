// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.c;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.microsoft.onlineid.internal.e;

// Referenced classes of package com.microsoft.onlineid.internal.c:
//            a

public final class h
{

    private Context a;
    private Context b;
    private long c;
    private byte d;
    private Toast e;
    private a f;

    public h(Activity activity)
    {
        this(activity, (byte)0);
    }

    private h(Activity activity, byte byte0)
    {
        boolean flag1 = true;
        super();
        a = null;
        b = null;
        c = 0L;
        d = -1;
        b = activity;
        boolean flag;
        if (activity != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        a = activity.getApplicationContext();
        if (a != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        f = new a(a);
    }

    private void a(String s)
    {
        if (e == null)
        {
            e = Toast.makeText(a, s, 1);
        } else
        {
            e.setText(s);
        }
        e.show();
    }

    public final void a(int i)
    {
        long l;
        switch (i)
        {
        default:
            return;

        case 24: // '\030'
            d = 2;
            a(String.format("Press the 'volume down' button %d more time(s) to send logs.", new Object[] {
                Byte.valueOf(d)
            }));
            c = System.currentTimeMillis();
            return;

        case 25: // '\031'
            l = System.currentTimeMillis();
            break;
        }
        long l1 = c;
        if (d >= 0 && l - l1 < 5000L)
        {
            d = (byte)(d - 1);
            if (d > 0)
            {
                a(String.format("Press the 'volume down' button %d more time(s) to send logs.", new Object[] {
                    Byte.valueOf(d)
                }));
                return;
            }
            f.a(b);
        }
        d = -1;
    }
}
