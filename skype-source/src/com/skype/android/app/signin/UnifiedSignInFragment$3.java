// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInFragment

final class tResources
    implements android.view.lLayoutListener
{

    int currentHeight;
    int screenHeight;
    final UnifiedSignInFragment this$0;
    int topPadding;
    final int val$orientation;

    public final void onGlobalLayout()
    {
        int j = 8;
        boolean flag1 = false;
        View view = getActivity().findViewById(0x1020002);
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
                view1 = createAccountBtn;
                if (flag || UnifiedSignInFragment.access$200(UnifiedSignInFragment.this))
                {
                    i = 8;
                } else
                {
                    i = 0;
                }
                view1.setVisibility(i);
                if (val$orientation == 2)
                {
                    View view2 = signInLogo;
                    if (flag)
                    {
                        i = j;
                    } else
                    {
                        i = 0;
                    }
                    view2.setVisibility(i);
                    view2 = signInContent;
                    j = signInContent.getPaddingLeft();
                    i = ((flag1) ? 1 : 0);
                    if (flag)
                    {
                        i = topPadding;
                    }
                    view2.setPadding(j, i, signInContent.getPaddingRight(), signInContent.getPaddingBottom());
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = final_unifiedsigninfragment;
        val$orientation = I.this;
        super();
        currentHeight = -1;
        topPadding = getResources().getDimensionPixelSize(0x7f0c0022);
        screenHeight = getResources().getDisplayMetrics().heightPixels;
    }
}
