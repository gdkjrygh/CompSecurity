// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;

// Referenced classes of package kik.android.chat.fragment:
//            qg, MissedConversationsFragment

final class qi
    implements android.content.DialogInterface.OnClickListener
{

    final qg a;

    qi(qg qg1)
    {
        a = qg1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        MissedConversationsFragment.a(a.a);
    }
}
