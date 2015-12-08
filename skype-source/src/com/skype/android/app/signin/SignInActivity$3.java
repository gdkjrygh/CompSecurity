// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package com.skype.android.app.signin:
//            SignInActivity

final class s
    implements android.view.OnGlobalLayoutListener
{

    int currentHeight;
    int screenHeight;
    final SignInActivity this$0;

    public final void onGlobalLayout()
    {
        byte byte0 = 0;
        View view = findViewById(0x1020002);
        int i;
        if (view != null)
        {
            if (currentHeight != (i = view.getHeight()))
            {
                View view1;
                boolean flag;
                if (screenHeight - i > screenHeight / 4)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                currentHeight = i;
                view1 = signInHeader;
                if (flag)
                {
                    byte0 = 8;
                }
                view1.setVisibility(byte0);
                return;
            }
        }
    }

    stener()
    {
        this$0 = SignInActivity.this;
        super();
        currentHeight = -1;
        screenHeight = getResources().getDisplayMetrics().heightPixels;
    }
}
