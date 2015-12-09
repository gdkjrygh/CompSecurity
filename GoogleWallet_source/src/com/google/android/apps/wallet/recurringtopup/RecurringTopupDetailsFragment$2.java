// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupDetailsFragment

final class this._cls0
    implements android.view.istener
{

    final RecurringTopupDetailsFragment this$0;

    public final void onGlobalLayout()
    {
        RecurringTopupDetailsFragment.access$200(RecurringTopupDetailsFragment.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        RecurringTopupDetailsFragment.access$200(RecurringTopupDetailsFragment.this).smoothScrollTo(0, RecurringTopupDetailsFragment.access$200(RecurringTopupDetailsFragment.this).getMeasuredHeight());
    }

    ()
    {
        this$0 = RecurringTopupDetailsFragment.this;
        super();
    }
}
