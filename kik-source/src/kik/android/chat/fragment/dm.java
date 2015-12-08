// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import android.view.View;
import kik.android.f.a.f;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dm
    implements android.content.DialogInterface.OnClickListener
{

    final KikChatFragment a;

    dm(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.sendButton.setEnabled(true);
        KikChatFragment.ag(a).a(null, false, null);
        dialoginterface.dismiss();
    }
}
