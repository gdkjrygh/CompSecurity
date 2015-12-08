// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.pub;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Function;
import com.google.common.base.Objects;

public class RecognizedBarcodeParcelable
    implements Parcelable
{

    public static final Function CONVERTER = new Function() {

        private static RecognizedBarcodeParcelable apply(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode)
        {
            return new RecognizedBarcodeParcelable(recognizedbarcode);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)obj);
        }

    };
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static RecognizedBarcodeParcelable createFromParcel(Parcel parcel)
        {
            return new RecognizedBarcodeParcelable(parcel);
        }

        private static RecognizedBarcodeParcelable[] newArray(int i)
        {
            return new RecognizedBarcodeParcelable[i];
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
    private final com.google.commerce.ocr.definitions.PrimitivesProto.Barcode barcode;
    private float score;

    public RecognizedBarcodeParcelable(Parcel parcel)
    {
        com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type type = com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.valueOf(parcel.readInt());
        String s = parcel.readString();
        barcode = (com.google.commerce.ocr.definitions.PrimitivesProto.Barcode)com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.newBuilder().setType(type).setValue(s).build();
        score = parcel.readFloat();
    }

    public RecognizedBarcodeParcelable(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode)
    {
        barcode = recognizedbarcode.getValue();
        score = recognizedbarcode.getScore();
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
            obj = (RecognizedBarcodeParcelable)obj;
            if (Objects.equal(getBarcode().getType(), ((RecognizedBarcodeParcelable) (obj)).getBarcode().getType()) && Objects.equal(getBarcode().getValue(), ((RecognizedBarcodeParcelable) (obj)).getBarcode().getValue()) && Objects.equal(getScore(), ((RecognizedBarcodeParcelable) (obj)).getScore()))
            {
                return true;
            }
        }
        return false;
    }

    public final com.google.commerce.ocr.definitions.PrimitivesProto.Barcode getBarcode()
    {
        return barcode;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Integer.valueOf(barcode.getType().getNumber()), barcode.getValue(), Float.valueOf(score)
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/commerce/ocr/definitions/PrimitivesProto$RecognizedBarcode).add("barcode type", barcode.getType()).add("barcode value", barcode.getValue()).add("score", score).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(barcode.getType().getNumber());
        parcel.writeString(barcode.getValue());
        parcel.writeFloat(score);
    }

}
