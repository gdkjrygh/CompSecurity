// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.pub;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.kyc.fragments.KycOcrFlagModule;
import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;

public interface KycOcrResult
{
    public static interface Analytics
    {

        public abstract Long timeToCaptureMillis();

        public abstract Long timeToConfirmMillis();

        public abstract Long timeToFirstFocusedFrameMillis();

        public abstract Long timeToFirstFrameMillis();
    }

    public static class CardSideImage
    {

        public static final String TAG = com/google/android/libraries/commerce/ocr/kyc/pub/KycOcrResult$CardSideImage.getSimpleName();
        private Bitmap bitmap;
        private byte cardJpegImageData[];
        private final int jpegCompression;

        public Bitmap getCardBitmapImage()
        {
            if (bitmap == null)
            {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inPurgeable = true;
                bitmap = BitmapFactory.decodeByteArray(cardJpegImageData, 0, cardJpegImageData.length, options);
            }
            return bitmap;
        }

        public byte[] getCardJpegImageData()
        {
            if (cardJpegImageData == null)
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                if (bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, jpegCompression, bytearrayoutputstream))
                {
                    cardJpegImageData = bytearrayoutputstream.toByteArray();
                } else
                {
                    Log.e(TAG, "Could not compress image to JPEG");
                }
            }
            return cardJpegImageData;
        }


        public CardSideImage(Bitmap bitmap1, int i)
        {
            bitmap = (Bitmap)Preconditions.checkNotNull(bitmap1);
            jpegCompression = i;
        }

        public CardSideImage(OcrImage ocrimage, ImageUtil imageutil)
        {
            if (ocrimage.getFormat() == 256)
            {
                cardJpegImageData = (byte[])Preconditions.checkNotNull(ocrimage.getData());
                boolean flag;
                if (cardJpegImageData.length > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
            } else
            {
                cardJpegImageData = imageutil.nativeToJpeg(ocrimage.getData(), KycOcrFlagModule.provideJpegCompressionRate());
            }
            jpegCompression = 0;
        }

        public CardSideImage(byte abyte0[])
        {
            cardJpegImageData = (byte[])Preconditions.checkNotNull(abyte0);
            boolean flag;
            if (abyte0.length > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            jpegCompression = 0;
        }
    }

    public static final class Side extends Enum
    {

        private static final Side $VALUES[];
        public static final Side BACK;
        public static final Side FRONT;

        public static Side valueOf(String s)
        {
            return (Side)Enum.valueOf(com/google/android/libraries/commerce/ocr/kyc/pub/KycOcrResult$Side, s);
        }

        public static Side[] values()
        {
            return (Side[])$VALUES.clone();
        }

        static 
        {
            FRONT = new Side("FRONT", 0);
            BACK = new Side("BACK", 1);
            $VALUES = (new Side[] {
                FRONT, BACK
            });
        }

        private Side(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode getBarcode();

    public abstract Analytics getSideAnalytics(Side side);

    public abstract CardSideImage getSideImage(Side side);
}
