// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.animation:
//            ValueAnimator

private static class <init> extends Handler
{

    public void handleMessage(Message message)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag;
        int i1;
        i1 = 1;
        flag = true;
        arraylist = (ArrayList)ValueAnimator.access$000().get();
        arraylist1 = (ArrayList)ValueAnimator.access$100().get();
        message.what;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 53
    //                   1 167;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        message = (ArrayList)ValueAnimator.access$200().get();
        if (arraylist.size() > 0 || arraylist1.size() > 0)
        {
            flag = false;
        }
_L5:
        i1 = ((flag) ? 1 : 0);
        if (message.size() <= 0) goto _L3; else goto _L4
_L4:
        ArrayList arraylist2 = (ArrayList)message.clone();
        message.clear();
        int j1 = arraylist2.size();
        i1 = 0;
        while (i1 < j1) 
        {
            ValueAnimator valueanimator1 = (ValueAnimator)arraylist2.get(i1);
            if (ValueAnimator.access$300(valueanimator1) == 0L)
            {
                ValueAnimator.access$400(valueanimator1);
            } else
            {
                arraylist1.add(valueanimator1);
            }
            i1++;
        }
          goto _L5
_L3:
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arraylist3 = (ArrayList)ValueAnimator.access$500().get();
        message = (ArrayList)ValueAnimator.access$600().get();
        int k1 = arraylist1.size();
        for (int i = 0; i < k1; i++)
        {
            ValueAnimator valueanimator2 = (ValueAnimator)arraylist1.get(i);
            if (ValueAnimator.access$700(valueanimator2, l2))
            {
                arraylist3.add(valueanimator2);
            }
        }

        k1 = arraylist3.size();
        if (k1 > 0)
        {
            for (int j = 0; j < k1; j++)
            {
                ValueAnimator valueanimator3 = (ValueAnimator)arraylist3.get(j);
                ValueAnimator.access$400(valueanimator3);
                ValueAnimator.access$802(valueanimator3, true);
                arraylist1.remove(valueanimator3);
            }

            arraylist3.clear();
        }
        int k = arraylist.size();
        for (int l1 = 0; l1 < k;)
        {
            ValueAnimator valueanimator = (ValueAnimator)arraylist.get(l1);
            if (valueanimator.animationFrame(l2))
            {
                message.add(valueanimator);
            }
            if (arraylist.size() == k)
            {
                l1++;
            } else
            {
                k--;
                message.remove(valueanimator);
            }
        }

        if (message.size() > 0)
        {
            for (int l = 0; l < message.size(); l++)
            {
                ValueAnimator.access$900((ValueAnimator)message.get(l));
            }

            message.clear();
        }
        if (i1 != 0 && (!arraylist.isEmpty() || !arraylist1.isEmpty()))
        {
            sendEmptyMessageDelayed(1, Math.max(0L, ValueAnimator.access$1000() - (AnimationUtils.currentAnimationTimeMillis() - l2)));
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
