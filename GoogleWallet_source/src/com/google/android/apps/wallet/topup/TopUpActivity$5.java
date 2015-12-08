// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.topup;

import android.view.View;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupErrorActivity;
import com.google.android.apps.wallet.recurringtopup.RecurringTopupEvent;
import com.google.android.apps.wallet.recurringtopup.ViewRecurringTopupActivity;

// Referenced classes of package com.google.android.apps.wallet.topup:
//            TopUpActivity

final class this._cls0
    implements android.view.ener
{

    final TopUpActivity this$0;

    public final void onClick(View view)
    {
        TopUpActivity topupactivity = TopUpActivity.this;
        TopUpActivity topupactivity1 = TopUpActivity.this;
        if (TopUpActivity.access$300(TopUpActivity.this).getTopupSchedule().errorState != null)
        {
            view = com/google/android/apps/wallet/recurringtopup/RecurringTopupErrorActivity;
        } else
        {
            view = com/google/android/apps/wallet/recurringtopup/ViewRecurringTopupActivity;
        }
        topupactivity.startActivity(InternalIntents.forClass(topupactivity1, view));
    }

    urringTopupActivity()
    {
        this$0 = TopUpActivity.this;
        super();
    }
}
