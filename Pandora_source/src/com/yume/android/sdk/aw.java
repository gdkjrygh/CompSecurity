// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;

final class aw
{

    private ArrayList a;
    private boolean b;

    aw()
    {
        b = false;
    }

    public final ArrayList a()
    {
        return a;
    }

    final void a(String s)
    {
        if (s != null)
        {
            if (a == null)
            {
                a = new ArrayList();
            }
            a.add(s);
        }
    }

    final void a(ArrayList arraylist)
    {
label0:
        {
            if (arraylist != null)
            {
                if (a != null)
                {
                    break label0;
                }
                a = new ArrayList(arraylist);
            }
            return;
        }
        a.addAll(arraylist);
    }

    public final void a(boolean flag)
    {
        b = flag;
    }

    public final boolean b()
    {
        return b;
    }
}
