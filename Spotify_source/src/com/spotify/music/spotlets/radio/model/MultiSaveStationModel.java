// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import java.util.Arrays;

public class MultiSaveStationModel
    implements JacksonModel
{

    public final String seedUris[];

    public MultiSaveStationModel(String as[])
    {
        seedUris = (String[])ctz.a(as);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof MultiSaveStationModel)
        {
            obj = (MultiSaveStationModel)obj;
            return Arrays.equals(seedUris, ((MultiSaveStationModel) (obj)).seedUris);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(seedUris);
    }
}
