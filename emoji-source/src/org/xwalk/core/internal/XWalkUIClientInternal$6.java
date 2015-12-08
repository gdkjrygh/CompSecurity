// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.DialogInterface;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkUIClientInternal, XWalkJavascriptResultInternal

class ernal
    implements android.content.Listener
{

    final XWalkUIClientInternal this$0;
    final XWalkJavascriptResultInternal val$fResult;

    public void onCancel(DialogInterface dialoginterface)
    {
        val$fResult.cancel();
    }

    ernal()
    {
        this$0 = final_xwalkuiclientinternal;
        val$fResult = XWalkJavascriptResultInternal.this;
        super();
    }
}
