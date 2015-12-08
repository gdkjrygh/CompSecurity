// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.view.View;
import android.widget.ImageView;
import com.kohls.mcommerce.opal.wallet.adapter.WalletAdapter;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseKohlsCashOffersFragment

class this._cls0
    implements android.support.v4.view.
{

    final BaseKohlsCashOffersFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        int j = i;
        if (i > 0)
        {
            if (i == mAdapter.getCount() - 1 && mAdapter.getCount() > 2)
            {
                j = 2;
            } else
            {
                j = 1;
            }
        }
        switch (j)
        {
        default:
            ((ImageView)mParent.findViewById(0x7f0d0115)).setImageResource(0x7f020165);
            ((ImageView)mParent.findViewById(0x7f0d0116)).setImageResource(0x7f020164);
            ((ImageView)mParent.findViewById(0x7f0d0117)).setImageResource(0x7f020165);
            return;

        case 0: // '\0'
            ((ImageView)mParent.findViewById(0x7f0d0115)).setImageResource(0x7f020164);
            ((ImageView)mParent.findViewById(0x7f0d0116)).setImageResource(0x7f020165);
            ((ImageView)mParent.findViewById(0x7f0d0117)).setImageResource(0x7f020165);
            return;

        case 1: // '\001'
            ((ImageView)mParent.findViewById(0x7f0d0115)).setImageResource(0x7f020165);
            ((ImageView)mParent.findViewById(0x7f0d0116)).setImageResource(0x7f020164);
            ((ImageView)mParent.findViewById(0x7f0d0117)).setImageResource(0x7f020165);
            return;

        case 2: // '\002'
            ((ImageView)mParent.findViewById(0x7f0d0115)).setImageResource(0x7f020165);
            break;
        }
        ((ImageView)mParent.findViewById(0x7f0d0116)).setImageResource(0x7f020165);
        ((ImageView)mParent.findViewById(0x7f0d0117)).setImageResource(0x7f020164);
    }

    ()
    {
        this$0 = BaseKohlsCashOffersFragment.this;
        super();
    }
}
