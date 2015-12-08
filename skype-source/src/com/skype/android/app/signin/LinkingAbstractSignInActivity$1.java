// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractSignInActivity

final class tResources
    implements android.view.istener
{

    int currentHeight;
    int screenHeight;
    final LinkingAbstractSignInActivity this$0;
    int topPadding;

    public final void onGlobalLayout()
    {
        byte byte0 = 0;
        View view = findViewById(0x1020002);
        int i;
        if (view != null)
        {
            if (currentHeight != (i = view.getHeight()))
            {
                currentHeight = i;
                View view1;
                boolean flag;
                int j;
                if (screenHeight - i > screenHeight / 4)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    j = topPadding;
                } else
                {
                    j = 0;
                }
                view1 = signInHeader;
                if (flag)
                {
                    byte0 = 8;
                }
                view1.setVisibility(byte0);
                signInContent.setPadding(signInContent.getPaddingLeft(), j, signInContent.getPaddingRight(), signInContent.getPaddingBottom());
                return;
            }
        }
    }

    ()
    {
        this$0 = LinkingAbstractSignInActivity.this;
        super();
        currentHeight = -1;
        topPadding = getResources().getDimensionPixelSize(0x7f0c00be);
        screenHeight = getResources().getDisplayMetrics().heightPixels;
    }
}
