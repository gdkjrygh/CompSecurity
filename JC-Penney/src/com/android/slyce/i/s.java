// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;


public class s
{

    public int a;
    public int b;

    protected s()
    {
        a = -1;
        b = -1;
    }

    protected s(int i, int j)
    {
        a = i;
        b = j;
    }

    protected s(android.hardware.Camera.Size size)
    {
        a = size.width;
        b = size.height;
    }

    protected boolean a()
    {
        return a >= 0 && b >= 0;
    }

    protected s b()
    {
        return new s(a, b);
    }

    protected Object clone()
    {
        return b();
    }
}
