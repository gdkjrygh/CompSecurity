// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.a:
//            o

private static class <init> extends Handler
{

    public void handleMessage(Message message)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        arraylist = (ArrayList)o.q().get();
        arraylist1 = (ArrayList)o.r().get();
        message.what;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 49
    //                   1 473;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        boolean flag;
        message = (ArrayList)o.s().get();
        Object obj;
        o o1;
        int i;
        int j;
        long l;
        if (arraylist.size() > 0 || arraylist1.size() > 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
_L17:
        if (message.size() > 0) goto _L5; else goto _L4
_L4:
        l = AnimationUtils.currentAnimationTimeMillis();
        obj = (ArrayList)o.t().get();
        message = (ArrayList)o.u().get();
        j = arraylist1.size();
        i = 0;
_L18:
        if (i < j) goto _L7; else goto _L6
_L6:
        j = ((ArrayList) (obj)).size();
        if (j <= 0) goto _L9; else goto _L8
_L8:
        i = 0;
_L19:
        if (i < j) goto _L11; else goto _L10
_L10:
        ((ArrayList) (obj)).clear();
_L9:
        i = arraylist.size();
        j = 0;
_L20:
        if (j < i) goto _L13; else goto _L12
_L12:
        if (message.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L21:
        if (i < message.size()) goto _L15; else goto _L14
_L14:
        message.clear();
        if (!flag || arraylist.isEmpty() && arraylist1.isEmpty()) goto _L1; else goto _L16
_L16:
        sendEmptyMessageDelayed(1, Math.max(0L, o.v() - (AnimationUtils.currentAnimationTimeMillis() - l)));
        return;
_L5:
        obj = (ArrayList)message.clone();
        message.clear();
        j = ((ArrayList) (obj)).size();
        i = 0;
        while (i < j) 
        {
            o1 = (o)((ArrayList) (obj)).get(i);
            if (o.a(o1) == 0L)
            {
                o.b(o1);
            } else
            {
                arraylist1.add(o1);
            }
            i++;
        }
          goto _L17
_L7:
        o1 = (o)arraylist1.get(i);
        if (o.a(o1, l))
        {
            ((ArrayList) (obj)).add(o1);
        }
        i++;
          goto _L18
_L11:
        o1 = (o)((ArrayList) (obj)).get(i);
        o.b(o1);
        o.a(o1, true);
        arraylist1.remove(o1);
        i++;
          goto _L19
_L13:
        obj = (o)arraylist.get(j);
        if (((o) (obj)).f(l))
        {
            message.add(obj);
        }
        if (arraylist.size() == i)
        {
            j++;
        } else
        {
            i--;
            message.remove(obj);
        }
          goto _L20
_L15:
        o.c((o)message.get(i));
        i++;
          goto _L21
_L3:
        flag = true;
          goto _L4
    }

    private mationUtils()
    {
    }

    mationUtils(mationUtils mationutils)
    {
        this();
    }
}
