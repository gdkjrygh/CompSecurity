// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import java.io.OutputStream;

public class mData
    implements mData
{

    private final String mData;

    public void writeTo(OutputStream outputstream)
    {
        outputstream.write(mData.getBytes());
    }

    public _cls9(String s)
    {
        mData = s;
    }
}
