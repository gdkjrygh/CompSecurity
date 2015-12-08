// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import android.graphics.Rect;
import android.view.View;
import android.view.Window;

// Referenced classes of package com.snapchat.android:
//            LoginAndSignupActivity

final class a
    implements android.view.LayoutListener
{

    private LoginAndSignupActivity a;

    public final void onGlobalLayout()
    {
        Object obj = a.getWindow().getDecorView();
        ((View) (obj)).getWindowVisibleDisplayFrame(LoginAndSignupActivity.a(a));
        int i = LoginAndSignupActivity.a(a).bottom;
        ((View) (obj)).getGlobalVisibleRect(LoginAndSignupActivity.a(a));
        i = LoginAndSignupActivity.a(a).bottom - i;
        obj = LoginAndSignupActivity.b(a).getLayoutParams();
        if (((android.view.ivity._cls1.a) (obj)).ight != i)
        {
            obj.ight = i;
            LoginAndSignupActivity.b(a).setLayoutParams(((android.view.ivity._cls1.a) (obj)));
        }
    }

    stener(LoginAndSignupActivity loginandsignupactivity)
    {
        a = loginandsignupactivity;
        super();
    }
}
