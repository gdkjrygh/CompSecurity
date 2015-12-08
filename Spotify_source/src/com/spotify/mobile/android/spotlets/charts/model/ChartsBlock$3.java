// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.spotify.mobile.android.spotlets.charts.model:
//            ChartsBlock

final class pe
    implements android.os.ator
{

    public final Object createFromParcel(Parcel parcel)
    {
        pe pe = com.spotify.mobile.android.spotlets.charts.model.pe.values()[parcel.readInt()];
        String s = parcel.readString();
        ArrayList arraylist = new ArrayList();
        parcel.readList(arraylist, com/spotify/mobile/android/spotlets/charts/model/ChartsBlock.getClassLoader());
        return new ChartsBlock(pe.name(), s, arraylist);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ChartsBlock[i];
    }

    pe()
    {
    }
}
