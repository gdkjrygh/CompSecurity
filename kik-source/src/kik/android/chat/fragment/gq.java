// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.view.View;
import com.kik.android.a;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gq
    implements android.view.View.OnClickListener
{

    final KikChatInfoFragment a;

    gq(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void onClick(View view)
    {
        a.o.b("Chat Info Select Tapped").b();
        view = new Bundle();
        view.putString("chatContactJID", kik.android.chat.fragment.KikChatInfoFragment.a(a).b());
        view.putString("sessionId", KikChatInfoFragment.q(a));
        a.a(view);
        a.J();
    }
}
