// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import android.os.Handler;
import android.os.Message;
import com.google.android.m4b.maps.bd.c;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            d

final class a extends Handler
{

    private d a;

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            d.a(a, (a)message.obj);
            return;

        case 1: // '\001'
            d.a(a);
            return;

        case 2: // '\002'
            d.a(a, (c)message.obj);
            return;

        case 3: // '\003'
            d.b(a, (c)message.obj);
            break;
        }
    }

    (d d1)
    {
        a = d1;
        super();
    }
}
