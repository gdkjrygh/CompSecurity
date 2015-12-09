// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;

public final class ebu extends ebt
{

    public ebu(eay eay1, ecb ecb, Context context)
    {
        super(eay1, ecb, context);
    }

    public final boolean a(String s)
    {
        return String.valueOf(a.g()).equals(s);
    }

    protected final RadioStationModel[] b(RadioStationsModel radiostationsmodel)
    {
        return radiostationsmodel.genreStations;
    }
}
