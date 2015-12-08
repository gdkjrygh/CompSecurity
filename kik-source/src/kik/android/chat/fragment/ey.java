// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.widget.Button;
import com.kik.m.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ey extends c
{

    final KikChatFragment a;

    ey(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.y = false;
        a._newMessagesButton.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator)
    {
        a.y = true;
    }
}
