// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.support.v4.app.Fragment;
import android.util.SparseArray;
import java.util.Stack;

public final class ai
{

    private final SparseArray a = new SparseArray();

    public ai()
    {
    }

    public final Fragment a(int i)
    {
        Stack stack = (Stack)a.get(i);
        if (stack != null && stack.size() > 0)
        {
            return (Fragment)stack.get(0);
        } else
        {
            return null;
        }
    }

    public final Fragment a(int i, Fragment fragment)
    {
        Stack stack = (Stack)a.get(i);
        if (stack != null && stack.size() > 0)
        {
            return (Fragment)stack.set(0, fragment);
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        for (int i = 0; i < a.size(); i++)
        {
            Stack stack = (Stack)a.get(i);
            if (stack != null)
            {
                stack.clear();
            }
        }

        a.clear();
    }

    public final void a(int i, int j)
    {
        Stack stack = (Stack)a.get(i);
        if (stack != null)
        {
            stack.remove(j);
        }
    }

    public final int[] a(Fragment fragment)
    {
        int ai1[] = new int[2];
        int[] _tmp = ai1;
        ai1[0] = -1;
        ai1[1] = -1;
        int i = 0;
        do
        {
label0:
            {
                if (i < a.size())
                {
                    Stack stack = (Stack)a.get(i);
                    if (stack == null || !stack.contains(fragment))
                    {
                        break label0;
                    }
                    ai1[0] = i;
                    ai1[1] = stack.indexOf(fragment);
                }
                return ai1;
            }
            i++;
        } while (true);
    }

    public final Fragment b(int i)
    {
        Stack stack = (Stack)a.get(i);
        if (stack != null)
        {
            if (stack.isEmpty())
            {
                return null;
            } else
            {
                return (Fragment)stack.pop();
            }
        } else
        {
            return null;
        }
    }

    public final void b(int i, Fragment fragment)
    {
        Stack stack1 = (Stack)a.get(i);
        Stack stack = stack1;
        if (stack1 == null)
        {
            stack = new Stack();
            a.put(i, stack);
        }
        stack.push(fragment);
    }
}
