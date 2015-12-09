// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import drp;
import drq;

public class PorcelainJsonMetricsData
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PorcelainJsonMetricsData(parcel.readString(), parcel.readString(), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonMetricsData[i];
        }

    };
    private static final String JSON_KEY_BLOCK_INDEX = "blockIndex";
    private static final String JSON_KEY_GROUP = "group";
    private static final String JSON_KEY_INDEX_IN_BLOCK = "indexInBlock";
    private static final String JSON_KEY_SOURCE = "source";
    private final int mBlockIndex;
    private final String mGroup;
    private final int mIndexInBlock;
    private final String mSource;

    public PorcelainJsonMetricsData(String s, String s1, Integer integer, Integer integer1)
    {
        mSource = s;
        mGroup = s1;
        s = Integer.valueOf(-1);
        if (integer != null)
        {
            s = integer;
        }
        mIndexInBlock = ((Integer)s).intValue();
        s = Integer.valueOf(-1);
        if (integer1 != null)
        {
            s = integer1;
        }
        mBlockIndex = ((Integer)s).intValue();
    }

    public static PorcelainJsonMetricsData fromInfo(drp drp1)
    {
        if (drp1 == null)
        {
            return null;
        } else
        {
            return new PorcelainJsonMetricsData(drp1.b, drp1.c, Integer.valueOf(drp1.d), Integer.valueOf(drp1.e));
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getBlockIndex()
    {
        return mBlockIndex;
    }

    public String getGroup()
    {
        return mGroup;
    }

    public int getIndexInBlock()
    {
        return mIndexInBlock;
    }

    public String getSource()
    {
        return mSource;
    }

    public drp toInfo(PorcelainMetricsRenderType porcelainmetricsrendertype)
    {
        porcelainmetricsrendertype = drp.a(porcelainmetricsrendertype);
        porcelainmetricsrendertype.a = getSource();
        porcelainmetricsrendertype.b = getGroup();
        porcelainmetricsrendertype.d = getBlockIndex();
        porcelainmetricsrendertype.c = getIndexInBlock();
        return porcelainmetricsrendertype.a();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mSource);
        parcel.writeString(mGroup);
        parcel.writeInt(mIndexInBlock);
        parcel.writeInt(mBlockIndex);
    }

}
