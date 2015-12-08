// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;
import java.util.ArrayList;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gx
    implements android.view.View.OnClickListener
{

    final KikChatInfoFragment a;

    gx(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void onClick(View view)
    {
        a.o.b("Chat Info Start Group Tapped").b();
        view = new ArrayList();
        view.add(kik.android.chat.fragment.KikChatInfoFragment.a(a).b());
        KikStartGroupFragment.a a1 = new KikStartGroupFragment.a();
        a1.a(kik.android.chat.fragment.KikChatInfoFragment.a(a).e()).c(view);
        a.a(a1);
        a.o.b("Start Group Screen Visited").a("Source", "Chat Info").b();
    }
}
