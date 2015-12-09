// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.ImageView;
import com.jcp.model.rewards.Certificate;
import com.jcp.util.a;
import com.jcp.util.bt;

// Referenced classes of package com.jcp.adapters:
//            RewardsItemAdapter

class ck
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final RewardsItemAdapter.RewardsListViewHolder a;
    final Certificate b;
    final RewardsItemAdapter c;

    ck(RewardsItemAdapter rewardsitemadapter, RewardsItemAdapter.RewardsListViewHolder rewardslistviewholder, Certificate certificate)
    {
        c = rewardsitemadapter;
        a = rewardslistviewholder;
        b = certificate;
        super();
    }

    public void onGlobalLayout()
    {
        a.barcodeImage.setImageBitmap(com.jcp.util.a.a(b.getBarcode(), a.barcodeImage.getMeasuredHeight(), a.barcodeImage.getMeasuredWidth()));
        bt.a(a.barcodeImage.getViewTreeObserver(), this);
    }
}
