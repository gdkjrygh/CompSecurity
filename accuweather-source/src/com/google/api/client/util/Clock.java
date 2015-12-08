// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public interface Clock
{

    public static final Clock SYSTEM = new Clock() {

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

    };

    public abstract long currentTimeMillis();

}
