// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ai
{
    public static interface a
    {

        public abstract boolean K();

        public abstract boolean M();
    }


    private static volatile ai a;
    private List b;

    private ai()
    {
        b = new ArrayList();
    }

    public static ai a()
    {
        if (a == null)
        {
            a = new ai();
        }
        return a;
    }

    private boolean a(boolean flag)
    {
        Iterator iterator = b.iterator();
        boolean flag1 = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (flag ? a1.K() : a1.M())
            {
                flag1 = true;
            }
        } while (true);
        return flag1;
    }

    public void a(a a1)
    {
        if (!b.contains(a1))
        {
            b.add(a1);
        }
    }

    public boolean a(KeyEvent keyevent)
    {
        int i = keyevent.getAction();
        keyevent.getKeyCode();
        JVM INSTR tableswitch 24 25: default 32
    //                   24 34
    //                   25 44;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        if (i == 0)
        {
            return a(true);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i == 0)
        {
            return a(false);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean b(a a1)
    {
        return b.remove(a1);
    }
}
