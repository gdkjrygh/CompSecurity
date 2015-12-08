// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.android.a;
import kik.a.d.f;
import kik.a.e.i;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class hi
    implements android.content.DialogInterface.OnClickListener
{

    final KikChatInfoFragment a;

    hi(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        a.o.b("Chat Info Delete Chat Tapped").b();
        a.r.c(kik.android.chat.fragment.KikChatInfoFragment.i(a).b());
        KikChatInfoFragment.x(a);
    }
}
