// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ap;

import java.io.IOException;

public interface e
{
    public static final class a extends IOException
    {

        public final int a = -1;

        public a(String s)
        {
            super(s);
        }
    }


    public abstract int a(byte abyte0[], String s);

    public abstract boolean a(String s);

    public abstract byte[] b(String s);
}
