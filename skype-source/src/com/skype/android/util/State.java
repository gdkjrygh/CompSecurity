// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.Comparator;

public class State
{
    public static interface OnStateUpdateListener
    {

        public abstract void onStateChanged(Object obj, Object obj1);
    }


    private Object a;
    private Comparator b;
    private OnStateUpdateListener c;

    public State()
    {
        this((byte)0);
    }

    private State(byte byte0)
    {
        b = null;
        a(null);
    }

    public final void a(OnStateUpdateListener onstateupdatelistener)
    {
        c = onstateupdatelistener;
    }

    public final boolean a(Object obj)
    {
        boolean flag1 = true;
        Object obj1 = a;
        boolean flag;
        if (b != null)
        {
            if (b.compare(obj1, obj) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (obj1 == null)
        {
            if (obj1 == obj)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = obj1.equals(obj);
        }
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag && c != null)
        {
            c.onStateChanged(a, obj);
        }
        a = obj;
        return flag;
    }
}
