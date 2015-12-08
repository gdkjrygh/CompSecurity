// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;

// Referenced classes of package com.facebook.share.widget:
//            ShareDialog

private class <init> extends com.facebook.internal.andler
{

    final ShareDialog this$0;

    public boolean canShow(ShareContent sharecontent)
    {
        return (sharecontent instanceof ShareLinkContent) || (sharecontent instanceof ShareFeedContent);
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((ShareContent)obj);
    }

    public AppCall createAppCall(ShareContent sharecontent)
    {
        ShareDialog.access$500(ShareDialog.this, ShareDialog.access$900(ShareDialog.this), sharecontent, this._fld0);
        AppCall appcall = createBaseAppCall();
        if (sharecontent instanceof ShareLinkContent)
        {
            sharecontent = (ShareLinkContent)sharecontent;
            ShareContentValidation.validateForWebShare(sharecontent);
            sharecontent = WebDialogParameters.createForFeed(sharecontent);
        } else
        {
            sharecontent = WebDialogParameters.createForFeed((ShareFeedContent)sharecontent);
        }
        DialogPresenter.setupAppCallForWebDialog(appcall, "feed", sharecontent);
        return appcall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((ShareContent)obj);
    }

    public Object getMode()
    {
        return createAppCall;
    }

    private ()
    {
        this$0 = ShareDialog.this;
        super(ShareDialog.this);
    }

    er(er er)
    {
        this();
    }
}
