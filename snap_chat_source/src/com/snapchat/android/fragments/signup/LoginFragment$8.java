// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            LoginFragment

final class a
    implements Runnable
{

    private LoginFragment a;

    public final void run()
    {
        LoginFragment.i(a).setVisibility(0);
    }

    (LoginFragment loginfragment)
    {
        a = loginfragment;
        super();
    }
}
