// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


// Referenced classes of package com.google.api.client.util:
//            PemReader, Preconditions

public static final class kNotNull
{

    private final byte base64decodedBytes[];
    private final String title;

    public byte[] getBase64DecodedBytes()
    {
        return base64decodedBytes;
    }

    public String getTitle()
    {
        return title;
    }

    (String s, byte abyte0[])
    {
        title = (String)Preconditions.checkNotNull(s);
        base64decodedBytes = (byte[])Preconditions.checkNotNull(abyte0);
    }
}
