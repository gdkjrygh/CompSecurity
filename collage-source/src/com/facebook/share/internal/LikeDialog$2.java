// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Intent;

// Referenced classes of package com.facebook.share.internal:
//            LikeDialog, ShareInternalUtility, ResultProcessor

class or
    implements com.facebook.internal.erImpl.Callback
{

    final LikeDialog this$0;
    final ResultProcessor val$resultProcessor;

    public boolean onActivityResult(int i, Intent intent)
    {
        return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, val$resultProcessor);
    }

    or()
    {
        this$0 = final_likedialog;
        val$resultProcessor = ResultProcessor.this;
        super();
    }
}
