// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.android.a;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class hh
    implements android.content.DialogInterface.OnClickListener
{

    final KikChatInfoFragment a;

    hh(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.o.b("Chat Info Leave Chat Tapped").b();
        KikChatInfoFragment.y(a);
    }
}
