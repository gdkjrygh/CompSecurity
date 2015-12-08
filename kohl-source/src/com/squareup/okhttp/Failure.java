// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


// Referenced classes of package com.squareup.okhttp:
//            Request

class Failure
{
    public static class Builder
    {

        private Throwable exception;
        private Request request;

        public Failure build()
        {
            return new Failure(this);
        }

        public Builder exception(Throwable throwable)
        {
            exception = throwable;
            return this;
        }

        public Builder request(Request request1)
        {
            request = request1;
            return this;
        }



        public Builder()
        {
        }
    }


    private final Throwable exception;
    private final Request request;

    private Failure(Builder builder)
    {
        request = builder.request;
        exception = builder.exception;
    }


    public Throwable exception()
    {
        return exception;
    }

    public Request request()
    {
        return request;
    }
}
