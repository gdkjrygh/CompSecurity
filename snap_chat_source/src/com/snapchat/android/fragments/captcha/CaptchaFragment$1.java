// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.captcha;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.captcha:
//            CaptchaFragment

final class a
    implements android.view.er
{

    private CaptchaFragment a;

    public final void onClick(View view)
    {
        a.getActivity().onBackPressed();
    }

    (CaptchaFragment captchafragment)
    {
        a = captchafragment;
        super();
    }
}
