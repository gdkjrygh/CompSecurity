// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import drn;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonThrobberItem, PorcelainJsonBaseItem

final class  extends drn
{

    public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
    {
        return new PorcelainJsonThrobberItem(s, porcelainjsonmetricsdata);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PorcelainJsonThrobberItem[i];
    }

    ()
    {
    }
}
