// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.pub;

import android.util.Log;
import java.util.Arrays;

public class OcrImageHolder
{
    public static final class Side extends Enum
    {

        private static final Side $VALUES[];
        public static final Side BACK;
        public static final Side FRONT;
        private final int imageIndex;

        public static Side valueOf(String s)
        {
            return (Side)Enum.valueOf(com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder$Side, s);
        }

        public static Side[] values()
        {
            return (Side[])$VALUES.clone();
        }

        public final int getImageIndex()
        {
            return imageIndex;
        }

        static 
        {
            BACK = new Side("BACK", 0, 0);
            FRONT = new Side("FRONT", 1, 1);
            $VALUES = (new Side[] {
                BACK, FRONT
            });
        }

        private Side(String s, int i, int j)
        {
            super(s, i);
            imageIndex = j;
        }
    }


    private static final String TAG = "OcrImageHolder";
    private static byte images[][] = new byte[2][];

    private OcrImageHolder()
    {
    }

    public static void clear()
    {
        com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder;
        JVM INSTR monitorenter ;
        Arrays.fill(images, null);
        Log.d("OcrImageHolder", "OCR Images cleared");
        com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static byte[] get(Side side)
    {
        com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder;
        JVM INSTR monitorenter ;
        side = images[side.getImageIndex()];
        com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder;
        JVM INSTR monitorexit ;
        return side;
        side;
        throw side;
    }

    public static boolean isEmpty()
    {
        boolean flag = true;
        com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder;
        JVM INSTR monitorenter ;
        if (images[0] != null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = images[1];
        if (abyte0 != null) goto _L2; else goto _L3
_L3:
        com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L3; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public static void setImage(byte abyte0[], Side side)
    {
        com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder;
        JVM INSTR monitorenter ;
        images[side.getImageIndex()] = abyte0;
        Log.d("OcrImageHolder", String.format("OCR Image set for %s with %d K", new Object[] {
            side, Integer.valueOf(abyte0.length / 8)
        }));
        com/google/android/libraries/commerce/ocr/wobs/pub/OcrImageHolder;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

}
