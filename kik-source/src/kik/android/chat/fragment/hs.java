// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import android.os.Handler;
import com.kik.android.a;
import com.kik.g.p;
import com.kik.sdkutils.d;
import kik.a.d.k;
import kik.a.e.r;

// Referenced classes of package kik.android.chat.fragment:
//            hr, hq, KikChatInfoFragment, ht

final class hs
    implements android.content.DialogInterface.OnClickListener
{

    final hr a;

    hs(hr hr1)
    {
        a = hr1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.b.a.o.b("Chat Info Block Tapped").b();
        dialoginterface = a.b.a.s.c(kik.android.chat.fragment.KikChatInfoFragment.a(a.b.a).a());
        if (!dialoginterface.g())
        {
            KikChatInfoFragment.g(a.b.a).sendEmptyMessage(1);
        }
        dialoginterface.a(d.a(a.b.a.getView(), new ht(this)));
    }
}
