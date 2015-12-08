// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.DialogInterface;
import android.webkit.ValueCallback;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkResourceClientInternal

class val.valueCallback
    implements android.content.r
{

    final XWalkResourceClientInternal this$0;
    final ValueCallback val$valueCallback;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$valueCallback.onReceiveValue(Boolean.valueOf(true));
        dialoginterface.dismiss();
    }

    ()
    {
        this$0 = final_xwalkresourceclientinternal;
        val$valueCallback = ValueCallback.this;
        super();
    }
}
