// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class hk
    implements android.content.DialogInterface.OnCancelListener
{

    final kik.android.util.p.a a;
    final KikChatInfoFragment b;

    hk(KikChatInfoFragment kikchatinfofragment, kik.android.util.p.a a1)
    {
        b = kikchatinfofragment;
        a = a1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.cancel(true);
    }
}
