// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class a
    implements android.view.alLayoutListener
{

    private PickUsernameFragment a;

    public final void onGlobalLayout()
    {
        boolean flag = false;
        int k = PickUsernameFragment.h(a).getWidth();
        int l = PickUsernameFragment.f(a).getWidth();
        Object obj = PickUsernameFragment.j(a);
        int i;
        int j;
        if (k < l)
        {
            i = PickUsernameFragment.i(a);
        } else
        {
            i = 0;
        }
        if (k < l)
        {
            j = PickUsernameFragment.i(a);
        } else
        {
            j = 0;
        }
        ((HorizontalScrollView) (obj)).setPadding(i, 0, j, 0);
        obj = (android.widget.s)PickUsernameFragment.h(a).getLayoutParams();
        i = ((flag) ? 1 : 0);
        if (k - l > 0)
        {
            i = ((flag) ? 1 : 0);
            if (k - l < PickUsernameFragment.i(a) * 2)
            {
                i = 1;
            }
        }
        if (((android.widget.s) (obj)).gravity != i)
        {
            obj.gravity = i;
            PickUsernameFragment.h(a).setLayoutParams(((android.view.tParams) (obj)));
        }
    }

    (PickUsernameFragment pickusernamefragment)
    {
        a = pickusernamefragment;
        super();
    }
}
