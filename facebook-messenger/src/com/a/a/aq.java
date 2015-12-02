// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package com.a.a:
//            ak, al

class aq extends Handler
{

    private aq()
    {
    }

    aq(al al)
    {
        this();
    }

    public void handleMessage(Message message)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        arraylist = (ArrayList)ak.m().get();
        arraylist1 = (ArrayList)ak.n().get();
        message.what;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 49
    //                   1 163;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        message = (ArrayList)ak.o().get();
        Object obj;
        ak ak2;
        int i;
        int k;
        int l;
        int i1;
        long l1;
        if (arraylist.size() > 0 || arraylist1.size() > 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        do
        {
            l = i;
            if (message.size() <= 0)
            {
                break;
            }
            ArrayList arraylist2 = (ArrayList)message.clone();
            message.clear();
            l = arraylist2.size();
            int j = 0;
            while (j < l) 
            {
                ak ak1 = (ak)arraylist2.get(j);
                if (ak.a(ak1) == 0L)
                {
                    ak.b(ak1);
                } else
                {
                    arraylist1.add(ak1);
                }
                j++;
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L3:
        l = 1;
        l1 = AnimationUtils.currentAnimationTimeMillis();
        obj = (ArrayList)ak.p().get();
        message = (ArrayList)ak.q().get();
        k = arraylist1.size();
        for (i = 0; i < k; i++)
        {
            ak2 = (ak)arraylist1.get(i);
            if (ak.a(ak2, l1))
            {
                ((ArrayList) (obj)).add(ak2);
            }
        }

        k = ((ArrayList) (obj)).size();
        if (k > 0)
        {
            for (i = 0; i < k; i++)
            {
                ak2 = (ak)((ArrayList) (obj)).get(i);
                ak.b(ak2);
                ak.a(ak2, true);
                arraylist1.remove(ak2);
            }

            ((ArrayList) (obj)).clear();
        }
        i = arraylist.size();
        k = 0;
        while (k < i) 
        {
            obj = (ak)arraylist.get(k);
            if (((ak) (obj)).e(l1))
            {
                message.add(obj);
            }
            if (arraylist.size() == i)
            {
                i1 = k + 1;
                k = i;
                i = i1;
            } else
            {
                message.remove(obj);
                i1 = i - 1;
                i = k;
                k = i1;
            }
            i1 = k;
            k = i;
            i = i1;
        }
        if (message.size() > 0)
        {
            for (i = 0; i < message.size(); i++)
            {
                ak.c((ak)message.get(i));
            }

            message.clear();
        }
        if (l != 0 && (!arraylist.isEmpty() || !arraylist1.isEmpty()))
        {
            sendEmptyMessageDelayed(1, Math.max(0L, ak.r() - (AnimationUtils.currentAnimationTimeMillis() - l1)));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
