// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.password;

import Ei;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.password:
//            ChangePasswordFragment

final class a
    implements android.view.r
{

    private ChangePasswordFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (!flag && !TextUtils.isEmpty(a.a.getText()))
        {
            view = ChangePasswordFragment.a(a);
            Ei ei = ChangePasswordFragment.d(a);
            android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
            String s = a.a.getText().toString();
            Intent intent = ei.c(fragmentactivity);
            intent.putExtra("op_code", 1018);
            intent.putExtra("new_password", s);
            view.add(Integer.valueOf(ei.a(fragmentactivity, intent)));
            a.c.setVisibility(0);
            a.b.setVisibility(8);
        }
    }

    (ChangePasswordFragment changepasswordfragment)
    {
        a = changepasswordfragment;
        super();
    }
}
