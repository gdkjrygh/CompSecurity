// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class PlayerSessionParameters
    implements JacksonModel
{

    public String sessionUri;

    public PlayerSessionParameters(String s)
    {
        sessionUri = s;
    }
}
