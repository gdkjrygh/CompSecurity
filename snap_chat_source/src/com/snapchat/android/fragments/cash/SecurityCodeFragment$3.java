// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Jo;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.snapchat.android.api2.cash.square.data.ErrorType;
import com.snapchat.android.ui.cash.CardCvvEditText;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            SecurityCodeFragment

final class b
    implements Runnable
{

    private ErrorType a;
    private int b;
    private SecurityCodeFragment c;

    public final void run()
    {
        SecurityCodeFragment.a(c, false);
        SecurityCodeFragment.a(c).setText(SecurityCodeFragment.b(a, b));
        if (!ErrorType.isNonRecoverableError(a))
        {
            SecurityCodeFragment.b(c).setText("");
            SecurityCodeFragment.b(c).setEnabled(true);
            if (SecurityCodeFragment.b(c).requestFocus())
            {
                Jo.h(c.getActivity());
            }
        } else
        {
            SecurityCodeFragment.c(c);
        }
        SecurityCodeFragment.d(c).setVisibility(8);
        SecurityCodeFragment.e(c).setBackgroundColor(c.getResources().getColor(0x7f0c0059));
        SecurityCodeFragment.b(c, true);
    }

    (SecurityCodeFragment securitycodefragment, ErrorType errortype, int i)
    {
        c = securitycodefragment;
        a = errortype;
        b = i;
        super();
    }
}
