// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public interface NanoClock
{

    public static final NanoClock SYSTEM = new NanoClock() {

        public long nanoTime()
        {
            return System.nanoTime();
        }

    };

    public abstract long nanoTime();

}
