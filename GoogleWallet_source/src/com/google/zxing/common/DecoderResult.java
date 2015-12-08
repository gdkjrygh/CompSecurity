// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import java.util.List;

public final class DecoderResult
{

    private final List byteSegments;
    private final String ecLevel;
    private Integer erasures;
    private Integer errorsCorrected;
    private Object other;
    private final byte rawBytes[];
    private final String text;

    public DecoderResult(byte abyte0[], String s, List list, String s1)
    {
        rawBytes = abyte0;
        text = s;
        byteSegments = list;
        ecLevel = s1;
    }

    public final List getByteSegments()
    {
        return byteSegments;
    }

    public final String getECLevel()
    {
        return ecLevel;
    }

    public final Object getOther()
    {
        return other;
    }

    public final byte[] getRawBytes()
    {
        return rawBytes;
    }

    public final String getText()
    {
        return text;
    }

    public final void setErasures(Integer integer)
    {
        erasures = integer;
    }

    public final void setErrorsCorrected(Integer integer)
    {
        errorsCorrected = integer;
    }

    public final void setOther(Object obj)
    {
        other = obj;
    }
}
