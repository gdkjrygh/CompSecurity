// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.android.a;
import kik.a.e.b;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class jy
    implements android.content.DialogInterface.OnClickListener
{

    final KikConversationsFragment a;

    jy(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.f.b("Address Book Cancel Prompt Confirmed").g().b();
        KikConversationsFragment.g(a);
        a.n.e();
    }
}
