// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;


// Referenced classes of package com.dominos.views:
//            CheckoutButtonSectionView_

class val.priceNotZero
    implements Runnable
{

    final CheckoutButtonSectionView_ this$0;
    final boolean val$enabled;
    final boolean val$priceNotZero;

    public void run()
    {
        CheckoutButtonSectionView_.access$001(CheckoutButtonSectionView_.this, val$enabled, val$priceNotZero);
    }

    ()
    {
        this$0 = final_checkoutbuttonsectionview_;
        val$enabled = flag;
        val$priceNotZero = Z.this;
        super();
    }
}
