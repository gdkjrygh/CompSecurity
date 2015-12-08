// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package com.b.a:
//            ab

final class ah extends Handler
{

    private ah()
    {
    }

    ah(byte byte0)
    {
        this();
    }

    public final void handleMessage(Message message)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        arraylist = (ArrayList)ab.e().get();
        arraylist1 = (ArrayList)ab.f().get();
        message.what;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 49
    //                   1 163;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        message = (ArrayList)ab.g().get();
        Object obj;
        ab ab2;
        int i;
        int j;
        int l;
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
            j = i;
            if (message.size() <= 0)
            {
                break;
            }
            ArrayList arraylist2 = (ArrayList)message.clone();
            message.clear();
            int k = arraylist2.size();
            j = 0;
            while (j < k) 
            {
                ab ab1 = (ab)arraylist2.get(j);
                if (ab.a(ab1) == 0L)
                {
                    ab.b(ab1);
                } else
                {
                    arraylist1.add(ab1);
                }
                j++;
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L3:
        j = 1;
        l1 = AnimationUtils.currentAnimationTimeMillis();
        obj = (ArrayList)ab.h().get();
        message = (ArrayList)ab.i().get();
        l = arraylist1.size();
        for (i = 0; i < l; i++)
        {
            ab2 = (ab)arraylist1.get(i);
            if (ab.a(ab2, l1))
            {
                ((ArrayList) (obj)).add(ab2);
            }
        }

        l = ((ArrayList) (obj)).size();
        if (l > 0)
        {
            for (i = 0; i < l; i++)
            {
                ab2 = (ab)((ArrayList) (obj)).get(i);
                ab.b(ab2);
                ab.c(ab2);
                arraylist1.remove(ab2);
            }

            ((ArrayList) (obj)).clear();
        }
        l = arraylist.size();
        for (i = 0; i < l;)
        {
            obj = (ab)arraylist.get(i);
            if (((ab) (obj)).b(l1))
            {
                message.add(obj);
            }
            if (arraylist.size() == l)
            {
                i++;
            } else
            {
                l--;
                message.remove(obj);
            }
        }

        if (message.size() > 0)
        {
            for (i = 0; i < message.size(); i++)
            {
                ab.d((ab)message.get(i));
            }

            message.clear();
        }
        if (j != 0 && (!arraylist.isEmpty() || !arraylist1.isEmpty()))
        {
            sendEmptyMessageDelayed(1, Math.max(0L, ab.j() - (AnimationUtils.currentAnimationTimeMillis() - l1)));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
