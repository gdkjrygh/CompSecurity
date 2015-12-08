// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import kik.android.q;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kd
    implements android.content.DialogInterface.OnClickListener
{

    final KikConversationsFragment a;

    kd(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        q.a().b();
        a.a(null);
        a.h = null;
    }
}
