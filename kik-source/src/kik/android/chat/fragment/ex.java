// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.view.View;
import android.widget.Button;
import com.kik.m.c;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ex extends c
{

    final KikChatFragment a;

    ex(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onAnimationStart(Animator animator)
    {
        a._newMessagesButton.setAlpha(1.0F);
        cv.b(new View[] {
            a._newMessagesButton
        });
    }
}
