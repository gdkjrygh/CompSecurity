// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.view.View;
import com.kik.m.c;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class js extends c
{

    final KikConversationsFragment a;

    js(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        cv.e(new View[] {
            a._composeButton, a._statusbarUnderlay, a._navBarShadow, a._composeButtonShadow, a._conversationsTopbar, a._missedConvoButton, a._settingsButton, a._animationContainer
        });
        if (!KikConversationsFragment.b(a))
        {
            cv.e(new View[] {
                a._webButton
            });
        }
    }
}
