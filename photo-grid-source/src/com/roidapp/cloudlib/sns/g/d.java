// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.g;


public abstract class d
{

    public d()
    {
    }

    static int a(int i, int j)
    {
        if (i == 0x80000000)
        {
            return j;
        } else
        {
            return i;
        }
    }

    static int a(int i, int j, boolean flag)
    {
        if (i == 0x80000000)
        {
            if (flag)
            {
                i = j + 1;
            } else
            {
                i = j - 1;
            }
        } else
        if (flag)
        {
            i++;
        } else
        {
            i--;
        }
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        return j;
    }
}
