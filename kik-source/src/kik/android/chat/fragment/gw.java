// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.cards.util.b;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gw
    implements android.view.View.OnClickListener
{

    final k a;
    final KikChatInfoFragment b;

    gw(KikChatInfoFragment kikchatinfofragment, k k1)
    {
        b = kikchatinfofragment;
        a = k1;
        super();
    }

    public final void onClick(View view)
    {
        view = String.format("http://kik-popbot-staging.twg.ca/users/%s", new Object[] {
            a.e()
        });
        view = (new KikCardBrowserFragment.a()).a(view).b(com.kik.cards.util.b.b(view)).a(com.kik.ui.fragment.FragmentBase.a.a.b);
        b.a(view);
    }
}
