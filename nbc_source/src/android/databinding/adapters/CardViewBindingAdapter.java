// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.support.v7.widget.CardView;

public class CardViewBindingAdapter
{

    public CardViewBindingAdapter()
    {
    }

    public static void setContentPadding(CardView cardview, int i)
    {
        cardview.setContentPadding(i, i, i, i);
    }

    public static void setContentPaddingBottom(CardView cardview, int i)
    {
        cardview.setContentPadding(cardview.getContentPaddingLeft(), cardview.getContentPaddingTop(), cardview.getContentPaddingRight(), i);
    }

    public static void setContentPaddingLeft(CardView cardview, int i)
    {
        cardview.setContentPadding(i, cardview.getContentPaddingTop(), cardview.getContentPaddingRight(), cardview.getContentPaddingBottom());
    }

    public static void setContentPaddingRight(CardView cardview, int i)
    {
        cardview.setContentPadding(cardview.getContentPaddingLeft(), cardview.getContentPaddingTop(), i, cardview.getContentPaddingBottom());
    }

    public static void setContentPaddingTop(CardView cardview, int i)
    {
        cardview.setContentPadding(cardview.getContentPaddingLeft(), i, cardview.getContentPaddingRight(), cardview.getContentPaddingBottom());
    }
}
