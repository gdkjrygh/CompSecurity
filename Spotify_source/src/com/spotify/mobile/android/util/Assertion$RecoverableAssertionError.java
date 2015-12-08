// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;


public class mDetails extends Error
{

    private static final long serialVersionUID = 1L;
    final String mDetails;

    public I(String s)
    {
        this(s, ((String) (null)));
    }

    public <init>(String s, String s1)
    {
        super(s);
        mDetails = s1;
    }

    public mDetails(String s, Throwable throwable)
    {
        this(s, throwable, (byte)0);
    }

    private <init>(String s, Throwable throwable, byte byte0)
    {
        super(s, throwable);
        mDetails = null;
    }
}
