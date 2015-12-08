// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.model.AppInviteContent;

// Referenced classes of package com.facebook.share.widget:
//            AppInviteDialog

class <init> extends com.facebook.internal.
{

    final AppInviteDialog this$0;

    public boolean canShow(AppInviteContent appinvitecontent)
    {
        return AppInviteDialog.access$200();
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((AppInviteContent)obj);
    }

    public AppCall createAppCall(final AppInviteContent content)
    {
        AppCall appcall = createBaseAppCall();
        class _cls1
            implements com.facebook.internal.DialogPresenter.ParameterProvider
        {

            final AppInviteDialog.NativeHandler this$1;
            final AppInviteContent val$content;

            public Bundle getLegacyParameters()
            {
                Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
                return new Bundle();
            }

            public Bundle getParameters()
            {
                return AppInviteDialog.access$300(content);
            }

            _cls1()
            {
                this$1 = AppInviteDialog.NativeHandler.this;
                content = appinvitecontent;
                super();
            }
        }

        DialogPresenter.setupAppCallForNativeDialog(appcall, new _cls1(), AppInviteDialog.access$400());
        return appcall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((AppInviteContent)obj);
    }

    private _cls1()
    {
        this$0 = AppInviteDialog.this;
        super(AppInviteDialog.this);
    }

    it>(it> it>)
    {
        this();
    }
}
