// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.os.Bundle;
import kik.android.chat.fragment.ProgressDialogFragment;

// Referenced classes of package com.kik.cards.browser:
//            CaptchaWindowFragment

final class b
    implements Runnable
{

    final CaptchaWindowFragment a;

    b(CaptchaWindowFragment captchawindowfragment)
    {
        a = captchawindowfragment;
        super();
    }

    public final void run()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("network", true);
        a.a(bundle);
        a.a.dismissAllowingStateLoss();
        a.J();
    }
}
