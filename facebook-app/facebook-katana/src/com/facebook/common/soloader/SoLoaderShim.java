// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.soloader;


public class SoLoaderShim
{

    private static volatile Handler a = new DefaultHandler();

    public SoLoaderShim()
    {
    }

    public static void a(Handler handler)
    {
        if (handler == null)
        {
            throw new NullPointerException("Handler cannot be null");
        } else
        {
            a = handler;
            return;
        }
    }

    public static void a(String s)
    {
        a.a(s);
    }


    private class Handler
    {

        public abstract void a(String s);
    }


    private class DefaultHandler
        implements Handler
    {

        public final void a(String s)
        {
            System.loadLibrary(s);
        }

        public DefaultHandler()
        {
        }
    }

}
