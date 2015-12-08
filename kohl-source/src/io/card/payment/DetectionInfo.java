// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;


// Referenced classes of package io.card.payment:
//            CreditCard

class DetectionInfo
{

    public boolean bottomEdge;
    public CreditCard detectedCard;
    public float focusScore;
    public boolean leftEdge;
    public int prediction[];
    public boolean rightEdge;
    public boolean topEdge;

    public DetectionInfo()
    {
        prediction = new int[16];
        prediction[0] = -1;
        prediction[15] = -1;
        detectedCard = new CreditCard();
    }

    final boolean a()
    {
        return topEdge && bottomEdge && rightEdge && leftEdge;
    }

    final boolean a(DetectionInfo detectioninfo)
    {
        return detectioninfo.topEdge == topEdge && detectioninfo.bottomEdge == bottomEdge && detectioninfo.leftEdge == leftEdge && detectioninfo.rightEdge == rightEdge;
    }

    final boolean b()
    {
        boolean flag = false;
        if (prediction[0] >= 0)
        {
            flag = true;
        }
        return flag;
    }

    final CreditCard c()
    {
        String s = new String();
        for (int i = 0; i < 16 && prediction[i] >= 0 && prediction[i] < 10; i++)
        {
            s = (new StringBuilder()).append(s).append(String.valueOf(prediction[i])).toString();
        }

        detectedCard.cardNumber = s;
        return detectedCard;
    }

    final int d()
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
}
