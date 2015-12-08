// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.sendto;

import Mf;
import Oi;
import android.view.View;
import com.snapchat.android.fragments.addfriends.AddFriendsMenuFragment;
import com.squareup.otto.Bus;
import lv;

// Referenced classes of package com.snapchat.android.fragments.sendto:
//            SendToFragment

final class a
    implements android.view.ner
{

    private SendToFragment a;

    public final void onClick(View view)
    {
        if (SendToFragment.h(a))
        {
            SendToFragment.i(a);
        }
        view = SendToFragment.a(a);
        view.a("add_friend");
        view.d();
        Mf.a().a(new Oi(new AddFriendsMenuFragment()));
    }

    uFragment(SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }
}
