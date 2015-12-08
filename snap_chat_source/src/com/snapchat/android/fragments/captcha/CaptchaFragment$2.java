// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.captcha;

import android.content.Context;
import android.widget.GridView;
import java.util.List;
import wZ;

// Referenced classes of package com.snapchat.android.fragments.captcha:
//            CaptchaFragment

final class b extends wZ
{

    private CaptchaFragment b;

    public final boolean areAllItemsEnabled()
    {
        return CaptchaFragment.a(b).isClickable();
    }

    public final boolean isEnabled(int i)
    {
        return CaptchaFragment.a(b).isClickable();
    }

    (CaptchaFragment captchafragment, Context context, List list, ntext ntext)
    {
        b = captchafragment;
        super(context, list, ntext);
    }
}
