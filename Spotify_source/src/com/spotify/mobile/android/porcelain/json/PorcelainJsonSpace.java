// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection;
import ctz;
import doz;
import dps;
import gen;

public class PorcelainJsonSpace
    implements Parcelable, JacksonModel, doz
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            boolean flag = gen.a(parcel);
            int i = parcel.readInt();
            return new PorcelainJsonSpace((PorcelainJsonImmutableLinearCollection)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/collection/PorcelainJsonImmutableLinearCollection.getClassLoader()), Boolean.valueOf(flag), Integer.valueOf(i), gen.e(parcel));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonSpace[i];
        }

    };
    private static final String KEY_ADJUST_CARD_ROWS = "adjustCardRows";
    private static final String KEY_EXTRA_DATA = "extraData";
    private static final String KEY_MAX_GRID_ROWS = "maxGridRows";
    private static final String KEY_VIEWS = "views";
    private final boolean mAdjustCardRows;
    private final int mDefaultMaxGridRows;
    private final JsonNode mExtraData;
    private final PorcelainJsonImmutableLinearCollection mViews;

    public PorcelainJsonSpace(PorcelainJsonImmutableLinearCollection porcelainjsonimmutablelinearcollection, Boolean boolean1, Integer integer, JsonNode jsonnode)
    {
        mViews = (PorcelainJsonImmutableLinearCollection)ctz.a(porcelainjsonimmutablelinearcollection);
        int i;
        boolean flag;
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mAdjustCardRows = flag;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = -1;
        }
        mDefaultMaxGridRows = i;
        if (jsonnode == null || jsonnode.isNull())
        {
            jsonnode = MissingNode.getInstance();
        }
        mExtraData = jsonnode;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getDefaultCardGridMaxRows()
    {
        return mDefaultMaxGridRows;
    }

    public JsonNode getExtraData()
    {
        return mExtraData;
    }

    public PorcelainJsonImmutableLinearCollection getViews()
    {
        return mViews;
    }

    public volatile dps getViews()
    {
        return getViews();
    }

    public boolean shouldAdjustCardGridRows()
    {
        return mAdjustCardRows;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, mAdjustCardRows);
        parcel.writeInt(mDefaultMaxGridRows);
        parcel.writeParcelable(mViews, 0);
        gen.a(parcel, mExtraData);
    }

}
