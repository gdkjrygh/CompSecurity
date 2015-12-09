// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import drb;
import drm;
import dsi;
import dsn;
import ghl;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseCardItem

public final class PorcelainJsonCompactCardItem extends PorcelainJsonBaseCardItem
    implements drb
{

    public static final android.os.Parcelable.Creator CREATOR = new drm() {

        public final PorcelainJsonBaseCardItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable, int i, 
                boolean flag, Parcel parcel)
        {
            return new PorcelainJsonCompactCardItem(s, porcelainjsonmetricsdata, parcel.readString(), porcelainjsonimage, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, porcelainjsonplayable, Integer.valueOf(i), Boolean.valueOf(flag));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonCompactCardItem[i];
        }

    };

    public PorcelainJsonCompactCardItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, String s1, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable, 
            Integer integer, Boolean boolean1)
    {
        int i;
        boolean flag;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = -1;
        }
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super(s, porcelainjsonmetricsdata, porcelainjsonimage, s1, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, porcelainjsonplayable, i, flag);
    }

    public final volatile dsi getInfo()
    {
        return getInfo();
    }

    public final dsn getInfo()
    {
        return (dsn)c.a(this);
    }

    public final int getType()
    {
        return 0x7f1100ee;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString((String)getText());
    }

}
