// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;


// Referenced classes of package io.card.payment:
//            CreditCard

class DetectionInfo
{

    public boolean bottomEdge;
    public boolean complete;
    public CreditCard detectedCard;
    public int expiry_month;
    public int expiry_year;
    public float focusScore;
    public boolean leftEdge;
    public int prediction[];
    public boolean rightEdge;
    public boolean topEdge;

    public DetectionInfo()
    {
        complete = false;
        prediction = new int[16];
        prediction[0] = -1;
        prediction[15] = -1;
        detectedCard = new CreditCard();
    }

    CreditCard creditCard()
    {
        String s = new String();
        for (int i = 0; i < 16 && prediction[i] >= 0 && prediction[i] < 10; i++)
        {
            s = (new StringBuilder()).append(s).append(String.valueOf(prediction[i])).toString();
        }

        detectedCard.cardNumber = s;
        detectedCard.expiryMonth = expiry_month;
        detectedCard.expiryYear = expiry_year;
        return detectedCard;
    }

    boolean detected()
    {
        return topEdge && bottomEdge && rightEdge && leftEdge;
    }

    int numVisibleEdges()
    {
        int l = 1;
        int i;
        int j;
        int k;
        if (topEdge)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (bottomEdge)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (leftEdge)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!rightEdge)
        {
            l = 0;
        }
        return k + (j + i) + l;
    }

    boolean predicted()
    {
        return complete;
    }

    boolean sameEdgesAs(DetectionInfo detectioninfo)
    {
        return detectioninfo.topEdge == topEdge && detectioninfo.bottomEdge == bottomEdge && detectioninfo.leftEdge == leftEdge && detectioninfo.rightEdge == rightEdge;
    }
}
