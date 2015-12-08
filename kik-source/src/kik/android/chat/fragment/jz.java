// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class jz
    implements android.content.DialogInterface.OnClickListener
{

    final KikConversationsFragment a;

    jz(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        KikConversationsFragment.g(a);
        KikConversationsFragment.a(a);
    }
}
