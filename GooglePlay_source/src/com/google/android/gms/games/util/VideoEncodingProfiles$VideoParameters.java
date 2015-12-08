// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;


// Referenced classes of package com.google.android.gms.games.util:
//            VideoEncodingProfiles

private static final class <init>
{

    int bitRate;
    int height;
    boolean isSupported;
    boolean specifyProfile;
    int width;

    public final String toString()
    {
        return (new StringBuilder("[ specifyProfile=")).append(specifyProfile).append(", width=").append(width).append(", height=").append(height).append(", bitrate=").append(bitRate).append(", isSupported=").append(isSupported).append(" ]").toString();
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
