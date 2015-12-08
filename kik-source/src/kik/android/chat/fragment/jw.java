// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.android.a;

// Referenced classes of package kik.android.chat.fragment:
//            ju, KikConversationsFragment

final class jw
    implements android.content.DialogInterface.OnClickListener
{

    final ju a;

    jw(ju ju1)
    {
        a = ju1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a.f.b("Address Book Cancel Prompt Shown").g().b();
        KikConversationsFragment.f(a.a);
    }
}
