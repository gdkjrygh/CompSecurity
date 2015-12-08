// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Jo;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class a
    implements android.view.p.PickUsernameFragment._cls8
{

    private PickUsernameFragment a;

    public final void onClick(View view)
    {
        view = PickUsernameFragment.f(a).getText().toString().trim();
        PickUsernameFragment.m(a);
        (new <init>(a, view)).execute();
        Jo.a(PickUsernameFragment.b(a), PickUsernameFragment.f(a));
    }

    (PickUsernameFragment pickusernamefragment)
    {
        a = pickusernamefragment;
        super();
    }
}
