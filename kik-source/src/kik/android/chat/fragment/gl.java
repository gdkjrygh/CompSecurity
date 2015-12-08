// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment, gm

final class gl
    implements android.content.DialogInterface.OnClickListener
{

    final KikChatInfoFragment a;

    gl(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.b.post(new gm(this));
    }
}
