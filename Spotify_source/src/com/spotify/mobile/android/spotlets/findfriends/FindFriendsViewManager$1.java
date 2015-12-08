// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends;

import android.text.TextUtils;
import android.widget.Filter;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import esj;
import esl;
import fop;
import gas;
import gfp;

// Referenced classes of package com.spotify.mobile.android.spotlets.findfriends:
//            FindFriendsViewManager

final class a
    implements gas
{

    private FindFriendsViewManager a;

    public final void a()
    {
    }

    public final void a(gfp gfp)
    {
    }

    public final void a(String s)
    {
        FindFriendsViewManager.a(a).getFilter().filter(s);
        esj esj1 = FindFriendsViewManager.a(a);
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        esj1.c = flag;
        FindFriendsViewManager.b().a(FindFriendsViewManager.a(a));
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            esl esl1 = FindFriendsViewManager.b();
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.dsViewManager.b, com.spotify.mobile.android.util.dsViewManager.b);
            clientevent.a("n_friends", String.valueOf(esl1.c));
            clientevent.a("n_friends", String.valueOf(esl1.d));
            fop fop1 = esl1.a;
            fop.a(esl1.b, ViewUri.p, clientevent);
        }
    }

    (FindFriendsViewManager findfriendsviewmanager)
    {
        a = findfriendsviewmanager;
        super();
    }
}
