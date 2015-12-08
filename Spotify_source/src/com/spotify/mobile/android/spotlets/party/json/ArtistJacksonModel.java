// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

public class ArtistJacksonModel
    implements JacksonModel
{

    public final String image;
    public final String name;
    public final String uri;

    public ArtistJacksonModel(String s, String s1, String s2)
    {
        image = (String)ctz.a(s);
        name = (String)ctz.a(s1);
        uri = (String)ctz.a(s2);
    }
}
