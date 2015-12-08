// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.model.ShareContent;

// Referenced classes of package com.facebook.share.widget:
//            MessageDialog

class <init> extends com.facebook.internal.er
{

    final MessageDialog this$0;

    public boolean canShow(ShareContent sharecontent)
    {
        return sharecontent != null && MessageDialog.canShow(sharecontent.getClass());
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((ShareContent)obj);
    }

    public AppCall createAppCall(final ShareContent content)
    {
        ShareContentValidation.validateForMessage(content);
        final AppCall appCall = createBaseAppCall();
        final boolean shouldFailOnDataError = getShouldFailOnDataError();
        android.app.Activity _tmp = MessageDialog.access$100(MessageDialog.this);
        class _cls1
            implements com.facebook.internal.DialogPresenter.ParameterProvider
        {

            final MessageDialog.NativeHandler this$1;
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
                this$1 = MessageDialog.NativeHandler.this;
                appCall = appcall;
                content = sharecontent;
                shouldFailOnDataError = flag;
                super();
            }
        }

        DialogPresenter.setupAppCallForNativeDialog(appCall, new _cls1(), MessageDialog.access$200(content.getClass()));
        return appCall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((ShareContent)obj);
    }

    private _cls1()
    {
        this$0 = MessageDialog.this;
        super(MessageDialog.this);
    }

    init>(init> init>)
    {
        this();
    }
}
