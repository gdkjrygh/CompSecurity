// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import drj;
import drn;
import dsi;
import dsn;
import ghl;
import java.util.Collections;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseItem

public class PorcelainJsonThrobberItem extends PorcelainJsonBaseItem
    implements drj
{

    public static final android.os.Parcelable.Creator CREATOR = new drn() {

        public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
        {
            return new PorcelainJsonThrobberItem(s, porcelainjsonmetricsdata);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonThrobberItem[i];
        }

    };

    public PorcelainJsonThrobberItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata)
    {
        super(s, porcelainjsonmetricsdata);
    }

    public volatile dsi getInfo()
    {
        return getInfo();
    }

    public dsn getInfo()
    {
        return (dsn)b.a(this);
    }

    public Iterable getPlayables()
    {
        return Collections.emptySet();
    }

    protected PorcelainMetricsRenderType getRenderType()
    {
        return PorcelainMetricsRenderType.g;
    }

    public int getType()
    {
        return 0x7f1100fb;
    }

}
