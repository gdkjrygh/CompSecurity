// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import android.graphics.Rect;
import com.google.common.base.Objects;
import java.util.Random;

// Referenced classes of package com.google.android.libraries.commerce.ocr.cv:
//            OcrImage, Boundaries

public class CardRectifier
{
    public static class Result
    {

        private Boundaries boundaries;
        private final OcrImage cardImage;
        private final OcrImage expirationDateImage;
        private final OcrImage nameImage;
        private final OcrImage rectifiedCard;

        public Boundaries getBoundaries()
        {
            return boundaries;
        }

        public OcrImage getCardImage()
        {
            return cardImage;
        }

        public OcrImage getExpirationDateImage()
        {
            return expirationDateImage;
        }

        public OcrImage getNameImage()
        {
            return nameImage;
        }

        public OcrImage getRectifiedCard()
        {
            return rectifiedCard;
        }

        public void setBoundaries(Boundaries boundaries1)
        {
            boundaries = boundaries1;
        }

        public String toString()
        {
            return Objects.toStringHelper(this).add("boundaries", boundaries).add("rectifiedCard", rectifiedCard).toString();
        }

        public Result(Boundaries boundaries1, OcrImage ocrimage, OcrImage ocrimage1, OcrImage ocrimage2, OcrImage ocrimage3)
        {
            boundaries = boundaries1;
            rectifiedCard = ocrimage;
            expirationDateImage = ocrimage1;
            nameImage = ocrimage2;
            cardImage = ocrimage3;
        }
    }


    public CardRectifier()
    {
    }

    private native Result rectify(OcrImage ocrimage, Rect rect, float f, float f1, int i, boolean flag);

    public Result rectify(OcrImage ocrimage, Rect rect, float f, float f1, boolean flag)
    {
        Result result = rectify(ocrimage, rect, f, f1, ocrimage.getOrientation(), flag);
        Object obj = result.getBoundaries();
        if (result.getCardImage() == null && obj != null && ((Boundaries) (obj)).allEdgesDetected())
        {
            int i = (new Random()).nextInt(4);
            Edge edge;
            if (i == 0)
            {
                ocrimage = null;
            } else
            {
                ocrimage = ((Boundaries) (obj)).getTop();
            }
            if (i == 1)
            {
                rect = null;
            } else
            {
                rect = ((Boundaries) (obj)).getLeft();
            }
            if (i == 2)
            {
                edge = null;
            } else
            {
                edge = ((Boundaries) (obj)).getRight();
            }
            if (i == 3)
            {
                obj = null;
            } else
            {
                obj = ((Boundaries) (obj)).getBottom();
            }
            result.setBoundaries(new Boundaries(ocrimage, rect, edge, ((Edge) (obj))));
        }
        return result;
    }
}
