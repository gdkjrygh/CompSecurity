// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.animation.Animator;
import android.view.View;
import com.kik.m.c;

// Referenced classes of package kik.android.util:
//            cv

final class bc extends c
{

    final View a[];

    bc(View aview[])
    {
        a = aview;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        cv.e(a);
    }
}
