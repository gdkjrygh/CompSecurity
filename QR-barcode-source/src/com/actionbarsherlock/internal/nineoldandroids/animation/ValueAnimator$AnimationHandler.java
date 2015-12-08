// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            ValueAnimator

private static class <init> extends Handler
{

    public void handleMessage(Message message)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag;
        int i;
        flag = true;
        i = 1;
        arraylist = (ArrayList)ValueAnimator.access$2().get();
        arraylist1 = (ArrayList)ValueAnimator.access$3().get();
        message.what;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 53
    //                   1 91;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
label0:
        {
            message = (ArrayList)ValueAnimator.access$4().get();
            if (arraylist.size() <= 0)
            {
                flag = i;
                if (arraylist1.size() <= 0)
                {
                    break label0;
                }
            }
            flag = false;
        }
_L16:
        if (message.size() > 0) goto _L4; else goto _L3
_L3:
        ArrayList arraylist2;
        int j;
        long l;
        l = AnimationUtils.currentAnimationTimeMillis();
        arraylist2 = (ArrayList)ValueAnimator.access$7().get();
        message = (ArrayList)ValueAnimator.access$8().get();
        j = arraylist1.size();
        i = 0;
_L17:
        if (i < j) goto _L6; else goto _L5
_L5:
        j = arraylist2.size();
        if (j <= 0) goto _L8; else goto _L7
_L7:
        i = 0;
_L18:
        if (i < j) goto _L10; else goto _L9
_L9:
        arraylist2.clear();
_L8:
        i = arraylist.size();
        j = 0;
_L19:
        if (j < i) goto _L12; else goto _L11
_L11:
        if (message.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L20:
        if (i < message.size()) goto _L14; else goto _L13
_L13:
        message.clear();
        if (!flag || arraylist.isEmpty() && arraylist1.isEmpty()) goto _L1; else goto _L15
_L15:
        sendEmptyMessageDelayed(1, Math.max(0L, ValueAnimator.access$12() - (AnimationUtils.currentAnimationTimeMillis() - l)));
        return;
_L4:
        arraylist2 = (ArrayList)message.clone();
        message.clear();
        j = arraylist2.size();
        i = 0;
        while (i < j) 
        {
            ValueAnimator valueanimator1 = (ValueAnimator)arraylist2.get(i);
            if (ValueAnimator.access$5(valueanimator1) == 0L)
            {
                ValueAnimator.access$6(valueanimator1);
            } else
            {
                arraylist1.add(valueanimator1);
            }
            i++;
        }
          goto _L16
_L6:
        ValueAnimator valueanimator2 = (ValueAnimator)arraylist1.get(i);
        if (ValueAnimator.access$9(valueanimator2, l))
        {
            arraylist2.add(valueanimator2);
        }
        i++;
          goto _L17
_L10:
        ValueAnimator valueanimator3 = (ValueAnimator)arraylist2.get(i);
        ValueAnimator.access$6(valueanimator3);
        ValueAnimator.access$10(valueanimator3, true);
        arraylist1.remove(valueanimator3);
        i++;
          goto _L18
_L12:
        ValueAnimator valueanimator = (ValueAnimator)arraylist.get(j);
        if (valueanimator.animationFrame(l))
        {
            message.add(valueanimator);
        }
        if (arraylist.size() == i)
        {
            j++;
        } else
        {
            i--;
            message.remove(valueanimator);
        }
          goto _L19
_L14:
        ValueAnimator.access$11((ValueAnimator)message.get(i));
        i++;
          goto _L20
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
