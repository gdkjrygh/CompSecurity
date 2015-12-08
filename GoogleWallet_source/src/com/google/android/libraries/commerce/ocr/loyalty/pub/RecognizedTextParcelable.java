// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.pub;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.pub:
//            AttributionParcelable

public class RecognizedTextParcelable
    implements Parcelable
{

    public static final Function CONVERTER = new Function() {

        private static RecognizedTextParcelable apply(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText recognizedtext)
        {
            return new RecognizedTextParcelable(recognizedtext);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText)obj);
        }

    };
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static RecognizedTextParcelable createFromParcel(Parcel parcel)
        {
            return new RecognizedTextParcelable(parcel);
        }

        private static RecognizedTextParcelable[] newArray(int i)
        {
            return new RecognizedTextParcelable[i];
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
    private final List attributions;
    private final float score;
    private final String value;

    public RecognizedTextParcelable(Parcel parcel)
    {
        value = parcel.readString();
        score = parcel.readFloat();
        attributions = new ArrayList();
        parcel.readTypedList(attributions, AttributionParcelable.CREATOR);
    }

    public RecognizedTextParcelable(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText recognizedtext)
    {
        this(recognizedtext.getValue(), recognizedtext.getScore(), Lists.transform(recognizedtext.getAttributionList(), AttributionParcelable.CONVERTER));
    }

    public RecognizedTextParcelable(String s, float f, List list)
    {
        value = s;
        score = f;
        attributions = list;
    }

    private Float getScore()
    {
        return Float.valueOf(score);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass() == obj.getClass())
        {
            obj = (RecognizedTextParcelable)obj;
            if (Objects.equal(value, ((RecognizedTextParcelable) (obj)).getValue()) && Objects.equal(Float.valueOf(score), ((RecognizedTextParcelable) (obj)).getScore()))
            {
                return true;
            }
        }
        return false;
    }

    public final String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            value, Float.valueOf(score)
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/android/libraries/commerce/ocr/loyalty/pub/RecognizedTextParcelable).add("value", value).add("score", score).add("attributions", attributions).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(value);
        parcel.writeFloat(score);
        parcel.writeTypedList(attributions);
    }

}
