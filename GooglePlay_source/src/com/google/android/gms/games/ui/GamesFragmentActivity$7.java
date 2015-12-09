// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity, LogflowEventListener

final class val.isFlinging
    implements android.view.Listener
{

    final GamesFragmentActivity this$0;
    final boolean val$isFlinging;
    final LogflowEventListener val$logListener;

    public final void onViewAttachedToWindow(View view)
    {
        val$logListener.logImpression(view, val$isFlinging);
    }

    public final void onViewDetachedFromWindow(View view)
    {
    }

    ()
    {
        this$0 = final_gamesfragmentactivity;
        val$logListener = logfloweventlistener;
        val$isFlinging = Z.this;
        super();
    }
}
