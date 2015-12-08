// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedBarcodeParcelable;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Multisets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class WobsResultMerger
{

    private static RecognizedBarcodeParcelable findMostCommonBarcode(ArrayList arraylist)
    {
        HashMultiset hashmultiset = HashMultiset.create(arraylist.size());
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); hashmultiset.addAll(((RecognizedWobInstanceParcelable)arraylist.next()).getBarcodeCandidates())) { }
        return (RecognizedBarcodeParcelable)Iterables.getFirst(Multisets.copyHighestCountFirst(hashmultiset), null);
    }

    public static ArrayList mergeResults(ArrayList arraylist)
    {
        ArrayList arraylist2 = Lists.newArrayListWithExpectedSize(4);
        ArrayList arraylist1 = Lists.newArrayListWithExpectedSize(arraylist.size());
        Iterator iterator = arraylist.iterator();
        do
        {
            if (iterator.hasNext())
            {
                Object obj = (RecognizedWobInstanceParcelable)iterator.next();
                static final class _cls1
                {

                    static final int $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType[];

                    static 
                    {
                        $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType = new int[com.google.commerce.ocr.definitions.WireProto.WobType.values().length];
                        try
                        {
                            $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType[com.google.commerce.ocr.definitions.WireProto.WobType.UNKNOWN.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType[com.google.commerce.ocr.definitions.WireProto.WobType.GIFTCARD.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$google$commerce$ocr$definitions$WireProto$WobType[com.google.commerce.ocr.definitions.WireProto.WobType.LOYALTY.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls1..SwitchMap.com.google.commerce.ocr.definitions.WireProto.WobType[((RecognizedWobInstanceParcelable) (obj)).getWobType().ordinal()])
                {
                default:
                    obj = String.valueOf(((RecognizedWobInstanceParcelable) (obj)).getWobType());
                    Log.e("WobsResultMerger", (new StringBuilder(String.valueOf(obj).length() + 24)).append("Unexpected result type: ").append(((String) (obj))).toString());
                    break;

                case 1: // '\001'
                    arraylist2.add(obj);
                    break;

                case 2: // '\002'
                case 3: // '\003'
                    arraylist1.add(obj);
                    break;
                }
            } else
            if (!arraylist2.isEmpty())
            {
                if (arraylist1.isEmpty())
                {
                    return arraylist2;
                }
                arraylist = findMostCommonBarcode(arraylist2);
                if (arraylist != null)
                {
                    setMostCommonBarcodeAsPriority(arraylist1, arraylist);
                }
                return arraylist1;
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    private static void setMostCommonBarcodeAsPriority(ArrayList arraylist, RecognizedBarcodeParcelable recognizedbarcodeparcelable)
    {
        RecognizedWobInstanceParcelable recognizedwobinstanceparcelable;
        ArrayList arraylist1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); recognizedwobinstanceparcelable.setBarcodeCandidates(arraylist1))
        {
            recognizedwobinstanceparcelable = (RecognizedWobInstanceParcelable)arraylist.next();
            arraylist1 = Lists.newArrayList(recognizedwobinstanceparcelable.getBarcodeCandidates());
            arraylist1.add(0, recognizedbarcodeparcelable);
        }

    }
}
