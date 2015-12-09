// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.widget.CompoundButton;
import android.widget.ProgressBar;
import com.google.android.apps.wallet.preferences.PreferenceClient;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinner;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment

final class this._cls0
    implements android.widget.istener
{

    final KycEnterPersonalInfoFragment this$0;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (KycEnterPersonalInfoFragment.access$500(KycEnterPersonalInfoFragment.this) == null) goto _L2; else goto _L1
_L1:
        KycEnterPersonalInfoFragment.access$600(KycEnterPersonalInfoFragment.this, KycEnterPersonalInfoFragment.access$500(KycEnterPersonalInfoFragment.this));
_L4:
        return;
_L2:
        KycEnterPersonalInfoFragment.access$700(KycEnterPersonalInfoFragment.this).setVisibility(0);
        KycEnterPersonalInfoFragment.access$800(KycEnterPersonalInfoFragment.this).setVisibility(8);
        if (KycEnterPersonalInfoFragment.access$900(KycEnterPersonalInfoFragment.this, "fetch_preferences")) goto _L4; else goto _L3
_L3:
        executeAction("fetch_preferences", new Callable() {

            final KycEnterPersonalInfoFragment._cls3 this$1;

            private Void call()
                throws Exception
            {
                com.google.wallet.proto.NanoWalletEntities.DisplayableP2pCommercialUses.DisplayableP2pCommercialUse adisplayablep2pcommercialuse[] = preferenceClient.getDisplayableCommercialUses().displaybleP2PCommercialUses;
                KycEnterPersonalInfoFragment.P2bCategory ap2bcategory[] = new KycEnterPersonalInfoFragment.P2bCategory[adisplayablep2pcommercialuse.length];
                for (int i = 0; i < adisplayablep2pcommercialuse.length; i++)
                {
                    ap2bcategory[i] = new KycEnterPersonalInfoFragment.P2bCategory(adisplayablep2pcommercialuse[i]);
                }

                KycEnterPersonalInfoFragment.access$502(this$0, ap2bcategory);
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$1 = KycEnterPersonalInfoFragment._cls3.this;
                super();
            }
        });
        return;
        KycEnterPersonalInfoFragment.access$700(KycEnterPersonalInfoFragment.this).setVisibility(8);
        KycEnterPersonalInfoFragment.access$800(KycEnterPersonalInfoFragment.this).setVisibility(8);
        validationGroup.removeInput(KycEnterPersonalInfoFragment.access$800(KycEnterPersonalInfoFragment.this));
        return;
    }

    _cls1.this._cls1()
    {
        this$0 = KycEnterPersonalInfoFragment.this;
        super();
    }
}
