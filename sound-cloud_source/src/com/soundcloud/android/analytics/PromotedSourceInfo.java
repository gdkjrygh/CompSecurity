// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.PromotedListItem;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import java.util.List;

public final class PromotedSourceInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final int NO_FLAGS = 0;
    private final String adUrn;
    private boolean playedBefore;
    private final Urn promotedItemUrn;
    private final Optional promoterUrn;
    private final List trackingUrls;

    public PromotedSourceInfo(Parcel parcel)
    {
        ClassLoader classloader = com/soundcloud/android/analytics/PromotedSourceInfo.getClassLoader();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playedBefore = flag;
        adUrn = parcel.readString();
        promotedItemUrn = (Urn)parcel.readParcelable(classloader);
        promoterUrn = Optional.fromNullable((Urn)parcel.readParcelable(classloader));
        trackingUrls = parcel.readArrayList(classloader);
    }

    public PromotedSourceInfo(String s, Urn urn, Optional optional, List list)
    {
        adUrn = s;
        promotedItemUrn = urn;
        trackingUrls = list;
        promoterUrn = optional;
    }

    public static PromotedSourceInfo fromItem(PromotedListItem promotedlistitem)
    {
        return new PromotedSourceInfo(promotedlistitem.getAdUrn(), promotedlistitem.getEntityUrn(), promotedlistitem.getPromoterUrn(), promotedlistitem.getPlayUrls());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PromotedSourceInfo)obj;
            if (!MoreObjects.equal(((PromotedSourceInfo) (obj)).adUrn, adUrn) || !MoreObjects.equal(((PromotedSourceInfo) (obj)).promotedItemUrn, promotedItemUrn) || !MoreObjects.equal(((PromotedSourceInfo) (obj)).promoterUrn, promoterUrn) || !MoreObjects.equal(((PromotedSourceInfo) (obj)).trackingUrls, trackingUrls))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAdUrn()
    {
        return adUrn;
    }

    public final Urn getPromotedItemUrn()
    {
        return promotedItemUrn;
    }

    public final Optional getPromoterUrn()
    {
        return promoterUrn;
    }

    public final List getTrackingUrls()
    {
        return trackingUrls;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            adUrn, promotedItemUrn, promoterUrn, trackingUrls
        });
    }

    public final boolean isFirstPlay()
    {
        return !playedBefore;
    }

    public final void setAsPlayed()
    {
        playedBefore = true;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        Urn urn;
        if (playedBefore)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeString(adUrn);
        parcel.writeParcelable(promotedItemUrn, 0);
        if (promoterUrn.isPresent())
        {
            urn = (Urn)promoterUrn.get();
        } else
        {
            urn = null;
        }
        parcel.writeParcelable(urn, 0);
        parcel.writeList(trackingUrls);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PromotedSourceInfo createFromParcel(Parcel parcel)
        {
            return new PromotedSourceInfo(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PromotedSourceInfo[] newArray(int i)
        {
            return new PromotedSourceInfo[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
