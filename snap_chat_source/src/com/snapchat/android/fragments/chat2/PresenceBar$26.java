// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            PresenceBar

final class a extends AnimatorListenerAdapter
{

    private Drawable a;
    private PresenceBar b;

    public final void onAnimationEnd(Animator animator)
    {
        PresenceBar.a(b);
    }

    public final void onAnimationStart(Animator animator)
    {
        PresenceBar.a(b, a);
        PresenceBar.c(b);
    }

    _cls9(PresenceBar presencebar, Drawable drawable)
    {
        b = presencebar;
        a = drawable;
        super();
    }
}
