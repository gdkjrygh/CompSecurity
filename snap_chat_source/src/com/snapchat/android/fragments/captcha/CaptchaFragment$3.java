// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.captcha;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.captcha:
//            CaptchaFragment

final class 
    implements android.view.er
{

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return motionevent.getAction() == 2;
    }

    ()
    {
    }
}
