// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.internal.LikeActionController;

// Referenced classes of package com.facebook.widget:
//            LikeView

class <init>
    implements com.facebook.internal.nit>
{

    private boolean isCancelled;
    final LikeView this$0;

    public void cancel()
    {
        isCancelled = true;
    }

    public void onComplete(LikeActionController likeactioncontroller)
    {
        if (isCancelled)
        {
            return;
        } else
        {
            LikeView.access$1000(LikeView.this, likeactioncontroller);
            LikeView.access$700(LikeView.this);
            LikeView.access$1102(LikeView.this, null);
            return;
        }
    }

    private ()
    {
        this$0 = LikeView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
