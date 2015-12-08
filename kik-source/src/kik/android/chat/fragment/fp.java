// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.android.a;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, fn

final class fp
    implements android.content.DialogInterface.OnClickListener
{

    final fn a;

    fp(fn fn1)
    {
        a = fn1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        kik.a.d.a.a a1 = KikChatFragment.k();
        if (a1 != null)
        {
            a.a.g.b("Attachment Deleted").a("Type", kik.android.chat.fragment.KikChatFragment.a(a1)).b();
            kik.android.chat.fragment.KikChatFragment.a(a.a, a1);
        }
        KikChatFragment.v(a.a);
        dialoginterface.dismiss();
    }
}
