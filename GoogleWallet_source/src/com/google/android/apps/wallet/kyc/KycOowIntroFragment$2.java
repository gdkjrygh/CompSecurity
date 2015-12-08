// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.os.SystemClock;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycOowIntroFragment, KycUiModel, KycNavListener

final class this._cls0
    implements OnActionListener
{

    final KycOowIntroFragment this$0;

    private void onAction(Void void1)
    {
        if (KycOowIntroFragment.access$000(KycOowIntroFragment.this).getOowQuizDurationAllowedMillis() - (SystemClock.elapsedRealtime() - KycOowIntroFragment.access$000(KycOowIntroFragment.this).getOowQuizStartTimeMillis()) <= 0L)
        {
            KycOowIntroFragment.access$100(KycOowIntroFragment.this).onRequestNav(e.REFERRED);
            return;
        } else
        {
            KycOowIntroFragment.access$100(KycOowIntroFragment.this).onRequestNav(e.ENTER_OOW);
            return;
        }
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    e()
    {
        this$0 = KycOowIntroFragment.this;
        super();
    }
}
