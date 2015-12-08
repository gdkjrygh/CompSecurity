// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


public abstract class s
{

    private static final s a = new s() {

        public final long a()
        {
            return System.nanoTime();
        }

    };

    public s()
    {
    }

    public static s b()
    {
        return a;
    }

    public abstract long a();

}
