// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.widget.RelativeLayout;

// Referenced classes of package com.tinder.fragments:
//            FragmentAnchoredPopup, bd

final class a
    implements Runnable
{

    final FragmentAnchoredPopup a;

    public final void run()
    {
        FragmentAnchoredPopup.a(a, (bd)a.n[0]);
        a.f = FragmentAnchoredPopup.a(a).q.getScaleX();
    }

    (FragmentAnchoredPopup fragmentanchoredpopup)
    {
        a = fragmentanchoredpopup;
        super();
    }
}
