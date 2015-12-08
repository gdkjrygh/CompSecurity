// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.view.View;
import com.kik.m.c;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            ih, KikCodeFragment

final class ii extends c
{

    final ih a;

    ii(ih ih1)
    {
        a = ih1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        cv.e(new View[] {
            a.a._fakeCode
        });
    }
}
