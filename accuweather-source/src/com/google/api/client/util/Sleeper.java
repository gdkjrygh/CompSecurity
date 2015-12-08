// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public interface Sleeper
{

    public static final Sleeper DEFAULT = new Sleeper() {

        public void sleep(long l)
            throws InterruptedException
        {
            Thread.sleep(l);
        }

    };

    public abstract void sleep(long l)
        throws InterruptedException;

}
