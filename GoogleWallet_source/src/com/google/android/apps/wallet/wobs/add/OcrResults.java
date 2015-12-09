// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedBarcodeParcelable;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedTextParcelable;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OcrResults
{
    public static class OcrResultsExtractor
    {

        public static final ImmutableBiMap BARCODE_TYPES;
        private static final String TAG = com/google/android/apps/wallet/wobs/add/OcrResults$OcrResultsExtractor.getSimpleName();

        private static com.google.wallet.proto.NanoWalletEntities.Barcode extractBarcode(RecognizedWobInstanceParcelable recognizedwobinstanceparcelable)
        {
            if (recognizedwobinstanceparcelable.getBarcodeCandidates() != null && !recognizedwobinstanceparcelable.getBarcodeCandidates().isEmpty())
            {
                recognizedwobinstanceparcelable = ((RecognizedBarcodeParcelable)recognizedwobinstanceparcelable.getBarcodeCandidates().get(0)).getBarcode();
                com.google.wallet.proto.NanoWalletEntities.Barcode barcode1 = new com.google.wallet.proto.NanoWalletEntities.Barcode();
                barcode1.value = recognizedwobinstanceparcelable.getValue();
                barcode1.type = (Integer)BARCODE_TYPES.get(recognizedwobinstanceparcelable.getType());
                return barcode1;
            } else
            {
                return null;
            }
        }

        private static String extractCardNumber(RecognizedWobInstanceParcelable recognizedwobinstanceparcelable)
        {
            if (recognizedwobinstanceparcelable.getIdCandidates() != null && !recognizedwobinstanceparcelable.getIdCandidates().isEmpty())
            {
                return (String)recognizedwobinstanceparcelable.getIdCandidate(0).orNull();
            } else
            {
                return null;
            }
        }

        private static String extractDiscoverableId(RecognizedWobInstanceParcelable recognizedwobinstanceparcelable)
        {
            return (String)recognizedwobinstanceparcelable.getDiscoverableId().orNull();
        }

        private static String extractMerchantName(RecognizedWobInstanceParcelable recognizedwobinstanceparcelable)
        {
            recognizedwobinstanceparcelable = recognizedwobinstanceparcelable.getMerchant();
            if (recognizedwobinstanceparcelable != null && !TextUtils.isEmpty(recognizedwobinstanceparcelable.getValue()))
            {
                return recognizedwobinstanceparcelable.getValue();
            } else
            {
                return null;
            }
        }

        public static OcrResults extractOcrResults(ArrayList arraylist)
        {
            ArrayList arraylist1 = Lists.newArrayList();
            for (arraylist = arraylist.iterator(); arraylist.hasNext(); arraylist1.add((RecognizedWobInstanceParcelable)(Parcelable)arraylist.next())) { }
            return extractOcrResults(((List) (arraylist1)));
        }

        public static OcrResults extractOcrResults(List list)
        {
            Object obj4 = null;
            Object obj1 = null;
            com.google.wallet.proto.NanoWalletEntities.Barcode barcode2 = null;
            String s1 = null;
            Iterator iterator = null;
            Object obj = null;
            String s2 = null;
            com.google.wallet.proto.NanoWalletEntities.Barcode barcode1 = null;
            Object obj3 = null;
            Object obj2 = null;
            RecognizedWobInstanceParcelable recognizedwobinstanceparcelable = null;
            String s = null;
            if (list != null)
            {
                iterator = list.iterator();
                list = ((List) (obj2));
                do
                {
                    recognizedwobinstanceparcelable = s;
                    obj4 = obj1;
                    barcode2 = s1;
                    obj3 = list;
                    s2 = barcode1;
                    obj2 = obj;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    recognizedwobinstanceparcelable = (RecognizedWobInstanceParcelable)iterator.next();
                    obj2 = obj1;
                    if (obj1 == null)
                    {
                        obj2 = extractMerchantName(recognizedwobinstanceparcelable);
                    }
                    s2 = s1;
                    if (s1 == null)
                    {
                        s2 = extractCardNumber(recognizedwobinstanceparcelable);
                    }
                    obj3 = obj;
                    if (obj == null)
                    {
                        obj3 = extractProgramName(recognizedwobinstanceparcelable);
                    }
                    barcode2 = barcode1;
                    if (barcode1 == null)
                    {
                        barcode2 = extractBarcode(recognizedwobinstanceparcelable);
                    }
                    obj4 = list;
                    if (list == null)
                    {
                        obj4 = extractPin(recognizedwobinstanceparcelable);
                    }
                    obj1 = obj2;
                    s1 = s2;
                    list = ((List) (obj4));
                    barcode1 = barcode2;
                    obj = obj3;
                    if (s == null)
                    {
                        s = extractDiscoverableId(recognizedwobinstanceparcelable);
                        obj1 = obj2;
                        s1 = s2;
                        list = ((List) (obj4));
                        barcode1 = barcode2;
                        obj = obj3;
                    }
                } while (true);
            } else
            {
                WLog.w(TAG, "ocrResultSet is null, returning empty OcrResults.");
                obj2 = iterator;
            }
            return new OcrResults(recognizedwobinstanceparcelable, ((String) (obj4)), barcode2, ((String) (obj3)), s2, ((String) (obj2)));
        }

        private static String extractPin(RecognizedWobInstanceParcelable recognizedwobinstanceparcelable)
        {
            recognizedwobinstanceparcelable = recognizedwobinstanceparcelable.getPin();
            if (recognizedwobinstanceparcelable != null && !TextUtils.isEmpty(recognizedwobinstanceparcelable.getValue()))
            {
                return recognizedwobinstanceparcelable.getValue();
            } else
            {
                return null;
            }
        }

        private static String extractProgramName(RecognizedWobInstanceParcelable recognizedwobinstanceparcelable)
        {
            recognizedwobinstanceparcelable = recognizedwobinstanceparcelable.getProgram();
            if (recognizedwobinstanceparcelable != null && !TextUtils.isEmpty(recognizedwobinstanceparcelable.getValue()))
            {
                return recognizedwobinstanceparcelable.getValue();
            } else
            {
                return null;
            }
        }

        static 
        {
            BARCODE_TYPES = ImmutableBiMap.builder().put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UNKNOWN_FORMAT, Integer.valueOf(1)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.AZTEC, Integer.valueOf(2)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_39, Integer.valueOf(3)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_128, Integer.valueOf(5)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODABAR, Integer.valueOf(6)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.DATA_MATRIX, Integer.valueOf(7)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.EAN_8, Integer.valueOf(8)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.EAN_13, Integer.valueOf(9)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.ITF_14, Integer.valueOf(10)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.PDF_417, Integer.valueOf(11)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.QR_CODE, Integer.valueOf(14)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UPC_A, Integer.valueOf(15)).put(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UPC_E, Integer.valueOf(16)).build();
        }

        public OcrResultsExtractor()
        {
        }
    }


    public final com.google.wallet.proto.NanoWalletEntities.Barcode barcode;
    public final String cardNumber;
    public final String discoverableId;
    public final String merchantName;
    public final String pin;
    public final String programName;

    private OcrResults(String s, String s1, String s2, String s3, com.google.wallet.proto.NanoWalletEntities.Barcode barcode1, String s4)
    {
        discoverableId = s;
        merchantName = s1;
        cardNumber = s2;
        pin = s3;
        barcode = barcode1;
        programName = s4;
    }

}
