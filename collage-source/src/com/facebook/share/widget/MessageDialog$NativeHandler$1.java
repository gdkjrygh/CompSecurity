// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.model.ShareContent;

// Referenced classes of package com.facebook.share.widget:
//            MessageDialog

class val.shouldFailOnDataError
    implements com.facebook.internal.der
{

    final val.shouldFailOnDataError this$1;
    final AppCall val$appCall;
    final ShareContent val$content;
    final boolean val$shouldFailOnDataError;

    public Bundle getLegacyParameters()
    {
        return LegacyNativeDialogParameters.create(val$appCall.getCallId(), val$content, val$shouldFailOnDataError);
    }

    public Bundle getParameters()
    {
        return NativeDialogParameters.create(val$appCall.getCallId(), val$content, val$shouldFailOnDataError);
    }

    ()
    {
        this$1 = final_;
        val$appCall = appcall;
        val$content = sharecontent;
        val$shouldFailOnDataError = Z.this;
        super();
    }
}
