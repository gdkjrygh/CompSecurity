// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.widget.rewards:
//            TermsAndConditionsFooter

class e extends DebouncingOnClickListener
{

    final TermsAndConditionsFooter a;
    final TermsAndConditionsFooter..ViewInjector b;

    e(TermsAndConditionsFooter..ViewInjector viewinjector, TermsAndConditionsFooter termsandconditionsfooter)
    {
        b = viewinjector;
        a = termsandconditionsfooter;
        super();
    }

    public void doClick(View view)
    {
        a.openRewardsFaq();
    }
}
