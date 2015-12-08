// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dd
    implements android.view.View.OnClickListener
{

    final KikChatFragment a;

    dd(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onClick(View view)
    {
        KikChatFragment.X(a);
        KikChatFragment.Y(a);
        KikChatFragment.s(a);
    }
}
