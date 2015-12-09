// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;

final class ft extends Handler
{

    private fq a;

    public ft(fq fq1, Looper looper)
    {
        a = fq1;
        super(looper);
    }

    public final void a(int i, Object obj)
    {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void a(int i, Object obj, Bundle bundle)
    {
        obj = obtainMessage(i, obj);
        ((Message) (obj)).setData(bundle);
        ((Message) (obj)).sendToTarget();
    }

    public final void handleMessage(Message message)
    {
        if (a.h != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        message.what;
        JVM INSTR tableswitch 1 18: default 100
    //                   1 101
    //                   2 112
    //                   3 123
    //                   4 145
    //                   5 157
    //                   6 10
    //                   7 168
    //                   8 179
    //                   9 10
    //                   10 10
    //                   11 190
    //                   12 202
    //                   13 208
    //                   14 219
    //                   15 617
    //                   16 623
    //                   17 642
    //                   18 134;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L1 _L9 _L10 _L1 _L1 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L3:
        return;
_L4:
        a.h.a();
        return;
_L5:
        Object obj = message.obj;
        message.getData();
        return;
_L6:
        Object obj1 = message.obj;
        message.getData();
        return;
_L18:
        Object obj2 = message.obj;
        message.getData();
        return;
_L7:
        ((Long)message.obj).longValue();
        return;
_L8:
        a.h.b();
        return;
_L9:
        a.h.c();
        return;
_L10:
        a.h.d();
        return;
_L11:
        ((Long)message.obj).longValue();
        return;
_L12:
        message = ((Message) (message.obj));
        return;
_L13:
        Object obj3 = message.obj;
        message.getData();
        return;
_L14:
        Intent intent;
        message = (KeyEvent)message.obj;
        intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", message);
        if (a.h.a(intent) || message == null || message.getAction() != 0) goto _L1; else goto _L19
_L19:
        boolean flag;
        boolean flag1;
        long l;
        if (a.k == null)
        {
            l = 0L;
        } else
        {
            l = a.k.e;
        }
        message.getKeyCode();
        JVM INSTR lookupswitch 9: default 368
    //                   79: 369
    //                   85: 369
    //                   86: 546
    //                   87: 502
    //                   88: 524
    //                   89: 568
    //                   90: 556
    //                   126: 458
    //                   127: 480;
           goto _L20 _L21 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L25:
        continue; /* Loop/switch isn't completed */
_L20:
        return;
_L21:
        boolean flag2;
        if (a.k != null && a.k.a == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((516L & l) != 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((l & 514L) != 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag && flag2)
        {
            a.h.b();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        if ((4L & l) == 0L) goto _L1; else goto _L29
_L29:
        a.h.a();
        return;
_L28:
        if ((2L & l) == 0L) goto _L1; else goto _L30
_L30:
        a.h.b();
        return;
_L23:
        if ((32L & l) == 0L) goto _L1; else goto _L31
_L31:
        a.h.c();
        return;
_L24:
        if ((16L & l) == 0L) goto _L1; else goto _L32
_L32:
        a.h.d();
        return;
_L22:
        if ((1L & l) == 0L) goto _L1; else goto _L33
_L33:
        return;
_L26:
        if ((64L & l) == 0L) goto _L1; else goto _L34
_L34:
        return;
        if ((8L & l) == 0L) goto _L1; else goto _L35
_L35:
        return;
        if (flag || !flag1) goto _L1; else goto _L36
_L36:
        a.h.a();
        return;
_L15:
        message = ((Message) (message.obj));
        return;
_L16:
        fq.a(a, ((Integer)message.obj).intValue(), 0);
        return;
_L17:
        fq.b(a, ((Integer)message.obj).intValue(), 0);
        return;
    }
}
