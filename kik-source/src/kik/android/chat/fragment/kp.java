// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;
import com.kik.cards.util.b;
import com.kik.cards.web.bf;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kp
    implements android.view.View.OnClickListener
{

    final KikConversationsFragment a;

    kp(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.f.b("Browser Screen Opened").a("Reason", "Browser Button").a("URL", "https://home.kik.com/").a("Domain", bf.i("https://home.kik.com/")).a("Depth", k.e()).b();
        a.f.b("Browser Button Tapped").b();
        view = (new KikCardBrowserFragment.a()).a("https://home.kik.com/").b(b.b("https://home.kik.com/")).a(com.kik.ui.fragment.FragmentBase.a.a.c);
        a.a(view);
    }
}
