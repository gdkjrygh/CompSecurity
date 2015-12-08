// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import kik.android.q;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class ke
    implements android.content.DialogInterface.OnCancelListener
{

    final KikConversationsFragment a;

    ke(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        q.a().b();
        a.h = null;
    }
}
