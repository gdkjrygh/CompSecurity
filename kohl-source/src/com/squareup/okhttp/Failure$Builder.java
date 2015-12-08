// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


// Referenced classes of package com.squareup.okhttp:
//            Failure, Request

public static class 
{

    private Throwable exception;
    private Request request;

    public Failure build()
    {
        return new Failure(this, null);
    }

    public  exception(Throwable throwable)
    {
        exception = throwable;
        return this;
    }

    public exception request(Request request1)
    {
        request = request1;
        return this;
    }



    public ()
    {
    }
}
