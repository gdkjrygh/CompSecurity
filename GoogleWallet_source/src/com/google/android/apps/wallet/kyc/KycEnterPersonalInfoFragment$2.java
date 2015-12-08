// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.view.View;
import android.widget.AdapterView;
import java.io.PrintStream;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment, KycAddressAdapter, KycNavListener, KycUiModel

final class this._cls0
    implements android.widget.ner
{

    final KycEnterPersonalInfoFragment this$0;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (addressAdapter.isAddAddressSelected(i))
        {
            System.out.println("about to click 1");
            KycEnterPersonalInfoFragment.access$000(KycEnterPersonalInfoFragment.this);
            KycEnterPersonalInfoFragment.access$400(KycEnterPersonalInfoFragment.this).onRequestNav(DDRESS);
            return;
        } else
        {
            System.out.println("about to click 2");
            KycEnterPersonalInfoFragment.access$100(KycEnterPersonalInfoFragment.this).setSelectedAddressIndex(i);
            return;
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = KycEnterPersonalInfoFragment.this;
        super();
    }
}
