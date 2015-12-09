// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.util;

import java.io.ByteArrayOutputStream;

public class d extends ByteArrayOutputStream
{

    public d(int i)
    {
        super(i);
    }

    public byte[] toByteArray()
    {
        if (count == buf.length)
        {
            return buf;
        } else
        {
            return super.toByteArray();
        }
    }
}
