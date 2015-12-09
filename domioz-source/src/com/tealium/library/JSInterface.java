// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;


public final class JSInterface
{

    private final Callback a;

    public JSInterface(Callback callback)
    {
        a = callback;
    }

    public final void receivedConfig(boolean flag, long l, String s, String s1, String s2)
    {
        if (a != null)
        {
            a.receivedConfig(flag, l, s, s1, s2);
        }
    }

    private class Callback
    {

        public abstract void receivedConfig(boolean flag, long l, String s, String s1, String s2);
    }

}
