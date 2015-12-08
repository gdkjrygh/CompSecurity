// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.os.Bundle;
import android.util.Log;
import com.facebook.share.model.AppInviteContent;

// Referenced classes of package com.facebook.share.widget:
//            AppInviteDialog

class val.content
    implements com.facebook.internal.r
{

    final val.content this$1;
    final AppInviteContent val$content;

    public Bundle getLegacyParameters()
    {
        Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
        return new Bundle();
    }

    public Bundle getParameters()
    {
        return AppInviteDialog.access$300(val$content);
    }

    ()
    {
        this$1 = final_;
        val$content = AppInviteContent.this;
        super();
    }
}
