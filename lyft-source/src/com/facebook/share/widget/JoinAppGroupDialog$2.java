// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.content.Intent;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;

// Referenced classes of package com.facebook.share.widget:
//            JoinAppGroupDialog

class val.resultProcessor
    implements com.facebook.internal.allback
{

    final JoinAppGroupDialog this$0;
    final ResultProcessor val$resultProcessor;

    public boolean onActivityResult(int i, Intent intent)
    {
        return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, val$resultProcessor);
    }

    y()
    {
        this$0 = final_joinappgroupdialog;
        val$resultProcessor = ResultProcessor.this;
        super();
    }
}
