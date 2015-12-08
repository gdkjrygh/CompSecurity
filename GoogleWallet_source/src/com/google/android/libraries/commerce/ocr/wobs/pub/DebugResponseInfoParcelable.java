// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.pub;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import java.util.List;

public class DebugResponseInfoParcelable
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static DebugResponseInfoParcelable createFromParcel(Parcel parcel)
        {
            return new DebugResponseInfoParcelable(parcel);
        }

        private static DebugResponseInfoParcelable[] newArray(int i)
        {
            return new DebugResponseInfoParcelable[i];
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
    private final List experimentalInstances;
    private final String flatVssText;

    public DebugResponseInfoParcelable(Parcel parcel)
    {
        experimentalInstances = Lists.newArrayList();
        parcel.readList(experimentalInstances, com/google/android/libraries/commerce/ocr/loyalty/pub/RecognizedWobInstanceParcelable.getClassLoader());
        flatVssText = parcel.readString();
    }

    public DebugResponseInfoParcelable(com.google.commerce.ocr.definitions.WireProto.DebugResponseInfo debugresponseinfo)
    {
        experimentalInstances = Lists.newArrayList();
        experimentalInstances.addAll(Lists.transform(debugresponseinfo.getExperimentalInstanceList(), new Function() {

            final DebugResponseInfoParcelable this$0;

            private static RecognizedWobInstanceParcelable apply(com.google.commerce.ocr.definitions.WireProto.RecognizedInstance recognizedinstance)
            {
                return new RecognizedWobInstanceParcelable(recognizedinstance);
            }

            public final volatile Object apply(Object obj)
            {
                return apply((com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)obj);
            }

            
            {
                this$0 = DebugResponseInfoParcelable.this;
                super();
            }
        }));
        flatVssText = debugresponseinfo.getFlatVssText();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass() == obj.getClass())
        {
            obj = (DebugResponseInfoParcelable)obj;
            if (Objects.equal(experimentalInstances, ((DebugResponseInfoParcelable) (obj)).getExperimentalInstances()) && Objects.equal(flatVssText, ((DebugResponseInfoParcelable) (obj)).getFlatVssText()))
            {
                return true;
            }
        }
        return false;
    }

    public List getExperimentalInstances()
    {
        return experimentalInstances;
    }

    public Optional getFlatVssText()
    {
        return Optional.fromNullable(flatVssText);
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            experimentalInstances, flatVssText
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/android/libraries/commerce/ocr/wobs/pub/DebugResponseInfoParcelable).add("experimental instances", Joiner.on("\n").join(experimentalInstances)).add("vss response", flatVssText).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(experimentalInstances);
        parcel.writeString(flatVssText);
    }

}
