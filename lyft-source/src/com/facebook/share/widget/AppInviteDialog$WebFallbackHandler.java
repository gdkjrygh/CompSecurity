// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.model.AppInviteContent;

// Referenced classes of package com.facebook.share.widget:
//            AppInviteDialog

class <init> extends com.facebook.internal.ler
{

    final AppInviteDialog this$0;

    public boolean canShow(AppInviteContent appinvitecontent)
    {
        return AppInviteDialog.access$500();
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((AppInviteContent)obj);
    }

    public AppCall createAppCall(AppInviteContent appinvitecontent)
    {
        AppCall appcall = createBaseAppCall();
        DialogPresenter.setupAppCallForWebFallbackDialog(appcall, AppInviteDialog.access$300(appinvitecontent), AppInviteDialog.access$400());
        return appcall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((AppInviteContent)obj);
    }

    private ()
    {
        this$0 = AppInviteDialog.this;
        super(AppInviteDialog.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
