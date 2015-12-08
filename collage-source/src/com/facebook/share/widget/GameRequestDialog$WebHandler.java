// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;

// Referenced classes of package com.facebook.share.widget:
//            GameRequestDialog

private class <init> extends com.facebook.internal.r
{

    final GameRequestDialog this$0;

    public boolean canShow(GameRequestContent gamerequestcontent)
    {
        return true;
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((GameRequestContent)obj);
    }

    public AppCall createAppCall(GameRequestContent gamerequestcontent)
    {
        GameRequestValidation.validate(gamerequestcontent);
        AppCall appcall = createBaseAppCall();
        DialogPresenter.setupAppCallForWebDialog(appcall, "apprequests", WebDialogParameters.create(gamerequestcontent));
        return appcall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((GameRequestContent)obj);
    }

    private ()
    {
        this$0 = GameRequestDialog.this;
        super(GameRequestDialog.this);
    }

    nit>(nit> nit>)
    {
        this();
    }
}
