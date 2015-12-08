// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dp extends KikDialogFragment.c
{

    final KikChatFragment a;

    dp(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a()
    {
        if (a.ac())
        {
            a.sendButton.setEnabled(true);
        }
    }
}
