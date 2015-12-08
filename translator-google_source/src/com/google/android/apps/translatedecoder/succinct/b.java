// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.succinct;


public final class b
{

    int a;
    int b;
    public double c;

    public b()
    {
        this((byte)0);
    }

    public b(byte byte0)
    {
        a = -1;
        b = -1;
        c = -1D;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof b)
        {
            obj = (b)obj;
            flag = flag1;
            if (a == ((b) (obj)).a)
            {
                flag = flag1;
                if (b == ((b) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((b) (obj)).c)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    public final String toString()
    {
        int i = a;
        int j = b;
        double d = c;
        return (new StringBuilder(70)).append("wordId=").append(i).append("; offSet=").append(j).append("; value=").append(d).toString();
    }
}
