// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.pub;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Function;
import com.google.common.base.Objects;

public class AttributionParcelable
    implements Parcelable
{

    public static final Function CONVERTER = new Function() {

        private static AttributionParcelable apply(com.google.commerce.ocr.definitions.PrimitivesProto.Attribution attribution)
        {
            return new AttributionParcelable(attribution);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((com.google.commerce.ocr.definitions.PrimitivesProto.Attribution)obj);
        }

    };
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static AttributionParcelable createFromParcel(Parcel parcel)
        {
            return new AttributionParcelable(parcel);
        }

        private static AttributionParcelable[] newArray(int i)
        {
            return new AttributionParcelable[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final float score;
    private final String source;

    public AttributionParcelable(Parcel parcel)
    {
        score = parcel.readFloat();
        source = parcel.readString();
    }

    public AttributionParcelable(com.google.commerce.ocr.definitions.PrimitivesProto.Attribution attribution)
    {
        score = attribution.getScore();
        source = attribution.getSource();
    }

    private float getScore()
    {
        return score;
    }

    private String getSource()
    {
        return source;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass() == obj.getClass())
        {
            obj = (AttributionParcelable)obj;
            if (Objects.equal(source, ((AttributionParcelable) (obj)).getSource()) && Float.compare(score, ((AttributionParcelable) (obj)).getScore()) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            source, Float.valueOf(score)
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/android/libraries/commerce/ocr/loyalty/pub/AttributionParcelable).add("source", source).add("score", score).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(score);
        parcel.writeString(source);
    }

}
