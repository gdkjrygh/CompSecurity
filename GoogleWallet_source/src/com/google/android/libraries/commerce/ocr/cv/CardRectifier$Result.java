// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import com.google.common.base.Objects;

// Referenced classes of package com.google.android.libraries.commerce.ocr.cv:
//            CardRectifier, Boundaries, OcrImage

public static class cardImage
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

    public (Boundaries boundaries1, OcrImage ocrimage, OcrImage ocrimage1, OcrImage ocrimage2, OcrImage ocrimage3)
    {
        boundaries = boundaries1;
        rectifiedCard = ocrimage;
        expirationDateImage = ocrimage1;
        nameImage = ocrimage2;
        cardImage = ocrimage3;
    }
}
