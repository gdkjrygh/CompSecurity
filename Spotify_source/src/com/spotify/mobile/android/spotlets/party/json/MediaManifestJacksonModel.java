// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class MediaManifestJacksonModel
    implements JacksonModel
{

    public final int bitrate;
    public final String encryption;
    public final String id;
    public final String mimeType;

    public MediaManifestJacksonModel(int i, String s, String s1, String s2)
    {
        bitrate = i;
        encryption = s;
        id = s1;
        mimeType = s2;
    }
}
