// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;

final class hk extends Handler
{

    private hf a;

    public hk(hf hf1, Looper looper)
    {
        a = hf1;
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
    //                   7 10
    //                   8 10
    //                   9 10
    //                   10 10
    //                   11 168
    //                   12 180
    //                   13 186
    //                   14 197
    //                   15 577
    //                   16 583
    //                   17 602
    //                   18 134;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L1 _L1 _L1 _L1 _L1 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
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
_L16:
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
        ((Long)message.obj).longValue();
        return;
_L10:
        message = ((Message) (message.obj));
        return;
_L11:
        Object obj3 = message.obj;
        message.getData();
        return;
_L12:
        Intent intent;
        message = (KeyEvent)message.obj;
        intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", message);
        if (a.h.a(intent) || message == null || message.getAction() != 0) goto _L1; else goto _L17
_L17:
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
        JVM INSTR lookupswitch 9: default 348
    //                   79: 349
    //                   85: 349
    //                   86: 506
    //                   87: 482
    //                   88: 494
    //                   89: 528
    //                   90: 516
    //                   126: 438
    //                   127: 460;
           goto _L18 _L19 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L23:
        continue; /* Loop/switch isn't completed */
_L18:
        return;
_L19:
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
_L25:
        if ((4L & l) == 0L) goto _L1; else goto _L27
_L27:
        a.h.a();
        return;
_L26:
        if ((2L & l) == 0L) goto _L1; else goto _L28
_L28:
        a.h.b();
        return;
_L21:
        if ((32L & l) == 0L) goto _L1; else goto _L29
_L29:
        return;
_L22:
        if ((16L & l) == 0L) goto _L1; else goto _L30
_L30:
        return;
_L20:
        if ((1L & l) == 0L) goto _L1; else goto _L31
_L31:
        return;
_L24:
        if ((64L & l) == 0L) goto _L1; else goto _L32
_L32:
        return;
        if ((8L & l) == 0L) goto _L1; else goto _L33
_L33:
        return;
        if (flag || !flag1) goto _L1; else goto _L34
_L34:
        a.h.a();
        return;
_L13:
        message = ((Message) (message.obj));
        return;
_L14:
        hf.a(a, ((Integer)message.obj).intValue(), 0);
        return;
_L15:
        hf.b(a, ((Integer)message.obj).intValue(), 0);
        return;
    }
}
