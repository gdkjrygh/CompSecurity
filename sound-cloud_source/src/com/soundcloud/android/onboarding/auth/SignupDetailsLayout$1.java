// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupDetailsLayout

class val.avatarText
    implements android.widget.nListener
{

    final SignupDetailsLayout this$0;
    final TextView val$avatarText;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
label0:
        {
            boolean flag3 = false;
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (i == 6)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (keyevent != null && keyevent.getKeyCode() == 66)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (keyevent != null && keyevent.getAction() == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (i == 0)
            {
                flag2 = flag3;
                if (!flag)
                {
                    break label0;
                }
                flag2 = flag3;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag2 = flag3;
            if (SignupDetailsLayout.access$000(SignupDetailsLayout.this) == null)
            {
                flag2 = flag3;
                if (val$avatarText.performClick())
                {
                    flag2 = true;
                }
            }
        }
        return flag2;
    }

    ()
    {
        this$0 = final_signupdetailslayout;
        val$avatarText = TextView.this;
        super();
    }
}
