// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class a
    implements android.view.p.PickUsernameFragment._cls5
{

    private PickUsernameFragment a;

    public final void onClick(View view)
    {
        a.a(null);
        PickUsernameFragment.f(a).setText("");
    }

    (PickUsernameFragment pickusernamefragment)
    {
        a = pickusernamefragment;
        super();
    }
}
