// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Jo;
import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class a
    implements android.view.p.PickUsernameFragment._cls2
{

    private PickUsernameFragment a;

    public final void onClick(View view)
    {
        Jo.a(PickUsernameFragment.b(a), view);
        PickUsernameFragment.b(a).onBackPressed();
    }

    (PickUsernameFragment pickusernamefragment)
    {
        a = pickusernamefragment;
        super();
    }
}
