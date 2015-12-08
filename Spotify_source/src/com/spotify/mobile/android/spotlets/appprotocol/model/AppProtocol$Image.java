// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Locale;

public class height
    implements JacksonModel
{

    public int height;
    public byte imageData[];
    public int width;

    public String toString()
    {
        return String.format(Locale.US, "{\"image\":<binary of size %d>,\"width\":%d,\"height\":%d}", new Object[] {
            Integer.valueOf(imageData.length), Integer.valueOf(width), Integer.valueOf(height)
        });
    }

    public (byte abyte0[], int i, int j)
    {
        imageData = abyte0;
        width = i;
        height = j;
    }
}
