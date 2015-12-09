// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

// Referenced classes of package com.spotify.music.spotlets.radio.model:
//            ClusterRadioStationModel, RadioStationModel

public class RadioStationsModel
    implements JacksonModel
{

    public final ClusterRadioStationModel clusterStations[];
    public final RadioStationModel genreStations[];
    public final RadioStationModel recommendedStations[];
    public final RadioStationModel savedStations[];
    public final RadioStationModel userStations[];

    public RadioStationsModel(RadioStationModel aradiostationmodel[], RadioStationModel aradiostationmodel1[], RadioStationModel aradiostationmodel2[], RadioStationModel aradiostationmodel3[], ClusterRadioStationModel aclusterradiostationmodel[])
    {
        userStations = safeArray(aradiostationmodel);
        recommendedStations = safeArray(aradiostationmodel1);
        genreStations = safeArray(aradiostationmodel2);
        savedStations = safeArray(aradiostationmodel3);
        aradiostationmodel = aclusterradiostationmodel;
        if (aclusterradiostationmodel == null)
        {
            aradiostationmodel = new ClusterRadioStationModel[0];
        }
        clusterStations = aradiostationmodel;
    }

    private static RadioStationModel[] safeArray(RadioStationModel aradiostationmodel[])
    {
        RadioStationModel aradiostationmodel1[] = aradiostationmodel;
        if (aradiostationmodel == null)
        {
            aradiostationmodel1 = new RadioStationModel[0];
        }
        return aradiostationmodel1;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof RadioStationsModel)
        {
            obj = (RadioStationsModel)obj;
            flag = flag1;
            if (Arrays.equals(userStations, ((RadioStationsModel) (obj)).userStations))
            {
                flag = flag1;
                if (Arrays.equals(recommendedStations, ((RadioStationsModel) (obj)).recommendedStations))
                {
                    flag = flag1;
                    if (Arrays.equals(genreStations, ((RadioStationsModel) (obj)).genreStations))
                    {
                        flag = flag1;
                        if (Arrays.equals(savedStations, ((RadioStationsModel) (obj)).savedStations))
                        {
                            flag = flag1;
                            if (Arrays.equals(clusterStations, ((RadioStationsModel) (obj)).clusterStations))
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(Arrays.hashCode(userStations)), Integer.valueOf(Arrays.hashCode(recommendedStations)), Integer.valueOf(Arrays.hashCode(genreStations)), Integer.valueOf(Arrays.hashCode(savedStations)), Integer.valueOf(Arrays.hashCode(clusterStations))
        });
    }
}
