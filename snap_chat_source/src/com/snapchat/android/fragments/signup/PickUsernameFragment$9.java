// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class c
    implements android.view.p.PickUsernameFragment._cls9
{

    private TextView a;
    private String b;
    private List c;
    private PickUsernameFragment d;

    public final void onClick(View view)
    {
        PickUsernameFragment.c(d, true);
        PickUsernameFragment.f(d).setText(a.getText());
        PickUsernameFragment.f(d).setSelection(a.getText().length());
        PickUsernameFragment.c(d, false);
        PickUsernameFragment.a(d, b);
        PickUsernameFragment.a(d, c.indexOf(b));
        PickUsernameFragment.a(d, false);
    }

    (PickUsernameFragment pickusernamefragment, TextView textview, String s, List list)
    {
        d = pickusernamefragment;
        a = textview;
        b = s;
        c = list;
        super();
    }
}
