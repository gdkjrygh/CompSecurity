// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import com.snapchat.android.util.SnapchatViewPager;

// Referenced classes of package com.snapchat.android.ui:
//            ChatLayout

final class b
    implements android.animation.atorListener
{

    private boolean a;
    private boolean b;
    private ChatLayout c;

    public final void onAnimationCancel(Animator animator)
    {
        animator = ChatLayout.a(c);
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        animator.setPagingEnabled(flag);
        ChatLayout.a(c, b);
    }

    public final void onAnimationEnd(Animator animator)
    {
        animator = ChatLayout.a(c);
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        animator.setPagingEnabled(flag);
        ChatLayout.a(c, a);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    wPager(ChatLayout chatlayout, boolean flag, boolean flag1)
    {
        c = chatlayout;
        a = flag;
        b = flag1;
        super();
    }
}
