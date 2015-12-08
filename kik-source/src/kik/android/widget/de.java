// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            PullToRevealView

final class de
    implements PullToRevealView.b
{

    final PullToRevealView a;

    de(PullToRevealView pulltorevealview)
    {
        a = pulltorevealview;
        super();
    }

    public final void a(boolean flag)
    {
        PullToRevealView.a(a).setVisibility(0);
    }
}
