// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.FacebookException;
import com.facebook.share.internal.LikeActionController;

// Referenced classes of package com.facebook.share.widget:
//            LikeView

private class <init>
    implements com.facebook.share.internal.nit>
{

    private boolean isCancelled;
    final LikeView this$0;

    public void cancel()
    {
        isCancelled = true;
    }

    public void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception)
    {
        if (isCancelled)
        {
            return;
        }
        FacebookException facebookexception1 = facebookexception;
        if (likeactioncontroller != null)
        {
            if (!likeactioncontroller.shouldEnableView())
            {
                facebookexception = new FacebookException("Cannot use LikeView. The device may not be supported.");
            }
            LikeView.access$1100(LikeView.this, likeactioncontroller);
            LikeView.access$700(LikeView.this);
            facebookexception1 = facebookexception;
        }
        if (facebookexception1 != null && LikeView.access$800(LikeView.this) != null)
        {
            LikeView.access$800(LikeView.this)._mth0(facebookexception1);
        }
        LikeView.access$1202(LikeView.this, null);
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
