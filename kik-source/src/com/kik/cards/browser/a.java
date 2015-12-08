// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.content.DialogInterface;
import kik.android.chat.fragment.ProgressDialogFragment;

// Referenced classes of package com.kik.cards.browser:
//            CaptchaWindowFragment

final class a
    implements android.content.DialogInterface.OnCancelListener
{

    final CaptchaWindowFragment a;

    a(CaptchaWindowFragment captchawindowfragment)
    {
        a = captchawindowfragment;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (a.a.isAdded())
        {
            a.a.dismissAllowingStateLoss();
            a.J();
        }
    }
}
