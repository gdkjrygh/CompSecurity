// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.pub;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.pub:
//            RecognizedTextParcelable, RecognizedBarcodeParcelable, AttributionParcelable

public class RecognizedWobInstanceParcelable
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static RecognizedWobInstanceParcelable createFromParcel(Parcel parcel)
        {
            return new RecognizedWobInstanceParcelable(parcel);
        }

        private static RecognizedWobInstanceParcelable[] newArray(int i)
        {
            return new RecognizedWobInstanceParcelable[i];
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
    private List barcodeCandidates;
    private String discoverableId;
    private final List idCandidates;
    private RecognizedTextParcelable merchant;
    private RecognizedTextParcelable pin;
    private RecognizedTextParcelable program;
    private final com.google.commerce.ocr.definitions.WireProto.WobType wobType;

    public RecognizedWobInstanceParcelable(Parcel parcel)
    {
        idCandidates = Lists.newArrayList();
        barcodeCandidates = Lists.newArrayList();
        wobType = com.google.commerce.ocr.definitions.WireProto.WobType.valueOf(parcel.readString());
        merchant = (RecognizedTextParcelable)parcel.readParcelable(com/google/android/libraries/commerce/ocr/loyalty/pub/RecognizedTextParcelable.getClassLoader());
        program = (RecognizedTextParcelable)parcel.readParcelable(com/google/android/libraries/commerce/ocr/loyalty/pub/RecognizedTextParcelable.getClassLoader());
        parcel.readList(idCandidates, com/google/android/libraries/commerce/ocr/loyalty/pub/RecognizedTextParcelable.getClassLoader());
        parcel.readList(barcodeCandidates, com/google/android/libraries/commerce/ocr/loyalty/pub/RecognizedBarcodeParcelable.getClassLoader());
        discoverableId = parcel.readString();
        pin = (RecognizedTextParcelable)parcel.readParcelable(com/google/android/libraries/commerce/ocr/loyalty/pub/RecognizedTextParcelable.getClassLoader());
    }

    public RecognizedWobInstanceParcelable(com.google.commerce.ocr.definitions.WireProto.RecognizedInstance recognizedinstance)
    {
        idCandidates = Lists.newArrayList();
        barcodeCandidates = Lists.newArrayList();
        wobType = recognizedinstance.getWobType();
        static final class _cls2
        {

            static final int $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType[];

            static 
            {
                $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType = new int[com.google.commerce.ocr.definitions.WireProto.WobType.values().length];
                try
                {
                    $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType[com.google.commerce.ocr.definitions.WireProto.WobType.LOYALTY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType[com.google.commerce.ocr.definitions.WireProto.WobType.GIFTCARD.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType[com.google.commerce.ocr.definitions.WireProto.WobType.UNKNOWN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.google.commerce.ocr.definitions.WireProto.WobType[wobType.ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 81
    //                   2 89;
           goto _L1 _L2 _L3
_L1:
        barcodeCandidates.addAll(Collections2.transform(recognizedinstance.getBarcodeList(), RecognizedBarcodeParcelable.CONVERTER));
        return;
_L2:
        setLoyaltyCardData(recognizedinstance);
        continue; /* Loop/switch isn't completed */
_L3:
        setGiftCardData(recognizedinstance);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static String getNullOrString(RecognizedTextParcelable recognizedtextparcelable)
    {
        if (recognizedtextparcelable != null)
        {
            return Strings.emptyToNull(recognizedtextparcelable.getValue());
        } else
        {
            return null;
        }
    }

    private void setGiftCardData(com.google.commerce.ocr.definitions.WireProto.RecognizedInstance recognizedinstance)
    {
        Preconditions.checkArgument(recognizedinstance.hasGiftCardData());
        com.google.commerce.ocr.definitions.GiftCardProto.GiftCardData.ClassData classdata = recognizedinstance.getGiftCardData().getClassData();
        discoverableId = classdata.getDiscoverableId();
        merchant = new RecognizedTextParcelable(classdata.getMerchantName(), classdata.getScore(), Lists.transform(classdata.getAttributionList(), AttributionParcelable.CONVERTER));
        recognizedinstance = recognizedinstance.getGiftCardData().getInstanceData();
        if (recognizedinstance.hasCardNumber())
        {
            idCandidates.add(new RecognizedTextParcelable(recognizedinstance.getCardNumber()));
        }
        if (recognizedinstance.hasPin())
        {
            pin = new RecognizedTextParcelable(recognizedinstance.getPin());
        }
    }

    private void setLoyaltyCardData(com.google.commerce.ocr.definitions.WireProto.RecognizedInstance recognizedinstance)
    {
        Preconditions.checkNotNull(recognizedinstance.getLoyaltyCardData());
        merchant = new RecognizedTextParcelable(recognizedinstance.getLoyaltyCardData().getMerchantName());
        program = new RecognizedTextParcelable(recognizedinstance.getLoyaltyCardData().getProgramName());
        idCandidates.addAll(Lists.transform(recognizedinstance.getLoyaltyCardData().getAccountIdList(), RecognizedTextParcelable.CONVERTER));
        discoverableId = recognizedinstance.getLoyaltyCardData().getDiscoverableProgramId().getValue();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass() == obj.getClass())
        {
            obj = (RecognizedWobInstanceParcelable)obj;
            if (Objects.equal(wobType, ((RecognizedWobInstanceParcelable) (obj)).getWobType()) && Objects.equal(program, ((RecognizedWobInstanceParcelable) (obj)).getProgram()) && idCandidates.equals(((RecognizedWobInstanceParcelable) (obj)).getIdCandidates()) && barcodeCandidates.equals(((RecognizedWobInstanceParcelable) (obj)).getBarcodeCandidates()) && Objects.equal(getDiscoverableId(), ((RecognizedWobInstanceParcelable) (obj)).getDiscoverableId()) && Objects.equal(getPin(), ((RecognizedWobInstanceParcelable) (obj)).getPin()))
            {
                return true;
            }
        }
        return false;
    }

    public final List getBarcodeCandidates()
    {
        return barcodeCandidates;
    }

    public final Optional getDiscoverableId()
    {
        return Optional.fromNullable(Strings.emptyToNull(discoverableId));
    }

    public final Optional getIdCandidate(int i)
    {
        return Optional.fromNullable(getNullOrString((RecognizedTextParcelable)idCandidates.get(i)));
    }

    public final List getIdCandidates()
    {
        return idCandidates;
    }

    public final RecognizedTextParcelable getMerchant()
    {
        return merchant;
    }

    public final RecognizedTextParcelable getPin()
    {
        return pin;
    }

    public final RecognizedTextParcelable getProgram()
    {
        return program;
    }

    public final com.google.commerce.ocr.definitions.WireProto.WobType getWobType()
    {
        return wobType;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            wobType, program, idCandidates, barcodeCandidates, discoverableId, pin
        });
    }

    public final void setBarcodeCandidates(List list)
    {
        barcodeCandidates = list;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/android/libraries/commerce/ocr/loyalty/pub/RecognizedWobInstanceParcelable).add("type", wobType.name()).add("merchant", merchant).add("program", program).add("ids", Joiner.on("/").join(idCandidates)).add("barcodes", Joiner.on("/").join(barcodeCandidates)).add("discoverableId", discoverableId).add("pin", pin).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(wobType.name());
        parcel.writeParcelable(merchant, i);
        parcel.writeParcelable(program, i);
        parcel.writeList(idCandidates);
        parcel.writeList(barcodeCandidates);
        parcel.writeString(discoverableId);
        parcel.writeParcelable(pin, i);
    }

}
