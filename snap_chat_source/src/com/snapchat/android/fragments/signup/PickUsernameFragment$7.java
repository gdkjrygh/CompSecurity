// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Bt;
import Ei;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.EditText;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class a extends Handler
{

    private PickUsernameFragment a;

    public final void handleMessage(Message message)
    {
        boolean flag = true;
        if (PickUsernameFragment.b(a) != null && (message.what == 1 || message.what == 2))
        {
            Set set = PickUsernameFragment.a(a);
            Ei ei = PickUsernameFragment.l(a);
            android.support.v4.app.FragmentActivity fragmentactivity = PickUsernameFragment.b(a);
            PickUsernameFragment.k(a);
            String s = Bt.S();
            String s1 = PickUsernameFragment.f(a).getText().toString();
            if (message.what != 1)
            {
                flag = false;
            }
            message = ei.c(fragmentactivity);
            message.putExtra("op_code", 1020);
            message.putExtra("email", s);
            message.putExtra("requested_username", s1);
            message.putExtra("refresh_suggestions", flag);
            set.add(Integer.valueOf(ei.a(fragmentactivity, message)));
            a.a(ernameState.IN_PROGRESS);
        }
    }

    ernameState(PickUsernameFragment pickusernamefragment)
    {
        a = pickusernamefragment;
        super();
    }
}
