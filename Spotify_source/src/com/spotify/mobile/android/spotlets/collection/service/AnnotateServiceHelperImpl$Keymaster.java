// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import com.spotify.mobile.android.cosmos.JacksonModel;

class expiresIn
    implements JacksonModel
{

    public String accessToken;
    public int expiresIn;

    public ()
    {
    }

    public (String s, int i)
    {
        accessToken = s;
        expiresIn = i;
    }
}
