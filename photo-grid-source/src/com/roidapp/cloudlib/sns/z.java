// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;


public final class z extends Exception
{

    private int a;

    public z(int i)
    {
        super((new StringBuilder("SNS Server respond error code : ")).append(i).toString());
        a = i;
    }

    public final int a()
    {
        return a;
    }
}
