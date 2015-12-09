// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;

class Utils
{

    Utils()
    {
    }

    static int digit16(byte byte0)
        throws DecoderException
    {
        int i = Character.digit((char)byte0, 16);
        if (i == -1)
        {
            throw new DecoderException((new StringBuilder()).append("Invalid URL encoding: not a valid digit (radix 16): ").append(byte0).toString());
        } else
        {
            return i;
        }
    }
}
