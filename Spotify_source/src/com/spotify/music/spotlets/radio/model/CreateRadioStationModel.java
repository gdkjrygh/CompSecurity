// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;
import ctz;
import java.util.Arrays;

// Referenced classes of package com.spotify.music.spotlets.radio.model:
//            RadioStationModel

public class CreateRadioStationModel
    implements JacksonModel
{

    public final String imageUri;
    public final String seeds[];
    public final String title;

    public CreateRadioStationModel(RadioStationModel radiostationmodel)
    {
        seeds = (String[])ctz.a(radiostationmodel.seeds);
        title = radiostationmodel.title;
        imageUri = radiostationmodel.imageUri;
    }

    public CreateRadioStationModel(String as[])
    {
        seeds = (String[])ctz.a(as);
        title = null;
        imageUri = null;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof CreateRadioStationModel)
        {
            obj = (CreateRadioStationModel)obj;
            flag = flag1;
            if (Arrays.equals(seeds, ((CreateRadioStationModel) (obj)).seeds))
            {
                flag = flag1;
                if (cty.a(title, ((CreateRadioStationModel) (obj)).title))
                {
                    flag = flag1;
                    if (cty.a(imageUri, ((CreateRadioStationModel) (obj)).imageUri))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            title, imageUri, seeds
        });
    }
}
