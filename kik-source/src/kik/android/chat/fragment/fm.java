// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fm
    implements android.content.DialogInterface.OnClickListener
{

    final KikChatFragment a;

    fm(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW");
        dialoginterface.setData(Uri.parse("market://details?id=kik.android"));
        a.startActivity(dialoginterface);
    }
}
