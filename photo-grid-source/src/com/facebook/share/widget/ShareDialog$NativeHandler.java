// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.model.ShareContent;

// Referenced classes of package com.facebook.share.widget:
//            ShareDialog

class <init> extends com.facebook.internal.dler
{

    final ShareDialog this$0;

    public boolean canShow(ShareContent sharecontent)
    {
        return sharecontent != null && ShareDialog.access$300(sharecontent.getClass());
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((ShareContent)obj);
    }

    public AppCall createAppCall(final ShareContent content)
    {
        ShareDialog.access$500(ShareDialog.this, ShareDialog.access$400(ShareDialog.this), content, this._fld0);
        ShareContentValidation.validateForNativeShare(content);
        final AppCall appCall = createBaseAppCall();
        class _cls1
            implements com.facebook.internal.DialogPresenter.ParameterProvider
        {

            final ShareDialog.NativeHandler this$1;
            final AppCall val$appCall;
            final ShareContent val$content;
            final boolean val$shouldFailOnDataError;

            public Bundle getLegacyParameters()
            {
                return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
            }

            public Bundle getParameters()
            {
                return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
            }

            _cls1()
            {
                this$1 = ShareDialog.NativeHandler.this;
                appCall = appcall;
                content = sharecontent;
                shouldFailOnDataError = flag;
                super();
            }
        }

        DialogPresenter.setupAppCallForNativeDialog(appCall, new _cls1(), ShareDialog.access$600(content.getClass()));
        return appCall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((ShareContent)obj);
    }

    public Object getMode()
    {
        return createAppCall;
    }

    private _cls1()
    {
        this$0 = ShareDialog.this;
        super(ShareDialog.this);
    }

    ( )
    {
        this();
    }
}
