// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;

// Referenced classes of package com.facebook.share.widget:
//            ShareDialog

class <init> extends com.facebook.internal.er
{

    final ShareDialog this$0;

    private String getActionName(ShareContent sharecontent)
    {
        if (sharecontent instanceof ShareLinkContent)
        {
            return "share";
        }
        if (sharecontent instanceof ShareOpenGraphContent)
        {
            return "share_open_graph";
        } else
        {
            return null;
        }
    }

    public boolean canShow(ShareContent sharecontent)
    {
        return sharecontent != null && ShareDialog.access$700(sharecontent.getClass());
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((ShareContent)obj);
    }

    public AppCall createAppCall(ShareContent sharecontent)
    {
        ShareDialog.access$500(ShareDialog.this, ShareDialog.access$800(ShareDialog.this), sharecontent, this._fld0);
        AppCall appcall = createBaseAppCall();
        ShareContentValidation.validateForWebShare(sharecontent);
        android.os.Bundle bundle;
        if (sharecontent instanceof ShareLinkContent)
        {
            bundle = WebDialogParameters.create((ShareLinkContent)sharecontent);
        } else
        {
            bundle = WebDialogParameters.create((ShareOpenGraphContent)sharecontent);
        }
        DialogPresenter.setupAppCallForWebDialog(appcall, getActionName(sharecontent), bundle);
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

    init>(init> init>)
    {
        this();
    }
}
