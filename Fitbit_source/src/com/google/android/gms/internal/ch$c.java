// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.m;

// Referenced classes of package com.google.android.gms.internal:
//            ch, w

private final class e extends e
{

    final ch b;
    private final int c;
    private final String d[];
    private final PendingIntent e;
    private final int f;

    protected void a()
    {
    }

    protected void a(com.google.android.gms.location.e e1)
    {
label0:
        {
label1:
            {
                if (e1 != null)
                {
                    switch (f)
                    {
                    default:
                        Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(f).toString());
                        break;

                    case 1: // '\001'
                        break label1;

                    case 2: // '\002'
                        break label0;
                    }
                }
                return;
            }
            e1.(c, e);
            return;
        }
        e1.(c, d);
    }

    protected void a(Object obj)
    {
        a((com.google.android.gms.location.a)obj);
    }

    public (ch ch1, int i, com.google.android.gms.location. , int j, PendingIntent pendingintent)
    {
        boolean flag = true;
        b = ch1;
        super(ch1, );
        if (i != 1)
        {
            flag = false;
        }
        w.a(flag);
        f = i;
        c = m.a(j);
        e = pendingintent;
        d = null;
    }

    public d(ch ch1, int i, com.google.android.gms.location.d d1, int j, String as[])
    {
        b = ch1;
        super(ch1, d1);
        boolean flag;
        if (i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w.a(flag);
        f = i;
        c = m.a(j);
        d = as;
        e = null;
    }
}
