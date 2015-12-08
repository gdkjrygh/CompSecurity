// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;


public class g extends Exception
{

    private boolean a;

    public g(Throwable throwable)
    {
        super("Peer not trusted by any of the system trust managers.", throwable);
        a = false;
    }

    public boolean a()
    {
        return a;
    }
}
