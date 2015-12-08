// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.callbacks;


public abstract class A
    implements Runnable
{

    private String a;

    public abstract void onResponse(String s);

    public void run()
    {
        onResponse(a);
    }

    public void setResponseHandler(String s)
    {
        a = s;
    }

    public A()
    {
    }
}
