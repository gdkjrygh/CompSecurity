// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gr
    implements android.view.View.OnClickListener
{

    final KikChatInfoFragment a;

    gr(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void onClick(View view)
    {
        a.o.b("Chat Info Unblock Tapped").b();
        KikChatInfoFragment.r(a);
    }
}
