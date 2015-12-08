// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.facebook.share.internal:
//            LikeDialog, LikeContent

class val.content
    implements com.facebook.internal.ovider
{

    final val.content this$1;
    final LikeContent val$content;

    public Bundle getLegacyParameters()
    {
        Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
        return new Bundle();
    }

    public Bundle getParameters()
    {
        return LikeDialog.access$200(val$content);
    }

    ()
    {
        this$1 = final_;
        val$content = LikeContent.this;
        super();
    }
}
