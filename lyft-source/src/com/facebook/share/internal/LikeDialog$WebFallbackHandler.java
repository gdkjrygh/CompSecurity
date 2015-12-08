// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;

// Referenced classes of package com.facebook.share.internal:
//            LikeDialog, LikeContent

class <init> extends com.facebook.internal.
{

    final LikeDialog this$0;

    public boolean canShow(LikeContent likecontent)
    {
        return likecontent != null && LikeDialog.canShowWebFallback();
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((LikeContent)obj);
    }

    public AppCall createAppCall(LikeContent likecontent)
    {
        AppCall appcall = createBaseAppCall();
        DialogPresenter.setupAppCallForWebFallbackDialog(appcall, LikeDialog.access$200(likecontent), LikeDialog.access$300());
        return appcall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((LikeContent)obj);
    }

    private ()
    {
        this$0 = LikeDialog.this;
        super(LikeDialog.this);
    }

    >(> >)
    {
        this();
    }
}
