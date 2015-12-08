// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;

// Referenced classes of package com.facebook.share.internal:
//            LikeDialog, LikeContent

class <init> extends com.facebook.internal.ndler
{

    final LikeDialog this$0;

    public boolean canShow(LikeContent likecontent)
    {
        return likecontent != null && LikeDialog.canShowNativeDialog();
    }

    public volatile boolean canShow(Object obj)
    {
        return canShow((LikeContent)obj);
    }

    public AppCall createAppCall(final LikeContent content)
    {
        AppCall appcall = createBaseAppCall();
        DialogPresenter.setupAppCallForNativeDialog(appcall, new com.facebook.internal.DialogPresenter.ParameterProvider() {

            final LikeDialog.NativeHandler this$1;
            final LikeContent val$content;

            public Bundle getLegacyParameters()
            {
                Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
                return new Bundle();
            }

            public Bundle getParameters()
            {
                return LikeDialog.access$200(content);
            }

            
            {
                this$1 = LikeDialog.NativeHandler.this;
                content = likecontent;
                super();
            }
        }, LikeDialog.access$300());
        return appcall;
    }

    public volatile AppCall createAppCall(Object obj)
    {
        return createAppCall((LikeContent)obj);
    }

    private _cls1.val.content()
    {
        this$0 = LikeDialog.this;
        super(LikeDialog.this);
    }

    <init>(<init> <init>1)
    {
        this();
    }
}
