// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.view.View;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            ErrorWrapper

class this._cls0
    implements android.view.tener
{

    final ErrorWrapper this$0;

    public void onClick(View view)
    {
        Log.v("ErrorWrapper", "Retry requested");
        if (ErrorWrapper.access$000(ErrorWrapper.this) != null)
        {
            ErrorWrapper.access$000(ErrorWrapper.this).onRetryRequested();
        }
    }

    llback()
    {
        this$0 = ErrorWrapper.this;
        super();
    }
}
