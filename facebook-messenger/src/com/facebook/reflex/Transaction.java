// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


public class Transaction
{

    public static final Transaction a = new Transaction();

    protected Transaction()
    {
    }

    public static Transaction a()
    {
        return a;
    }

    private static native void nativeBegin();

    private static native void nativeCommit();

    public void b()
    {
        nativeBegin();
    }

    public void c()
    {
        nativeCommit();
    }

}
