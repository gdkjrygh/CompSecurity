// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.List;

public class TracksJacksonModel
    implements JacksonModel
{

    public final List tracks;

    public TracksJacksonModel(List list)
    {
        tracks = (List)Optional.c(list).a(new ArrayList());
    }
}
