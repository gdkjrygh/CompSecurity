// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture;

import com.google.android.libraries.commerce.ocr.wobs.fragments.TransitionHandler;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.capture:
//            WobsActionDecoratingResponseHandler

final class val.resultCode extends TimerTask
{

    final WobsActionDecoratingResponseHandler this$0;
    final int val$resultCode;

    public final void run()
    {
        WobsActionDecoratingResponseHandler.access$000(WobsActionDecoratingResponseHandler.this).exit(val$resultCode);
    }

    ()
    {
        this$0 = final_wobsactiondecoratingresponsehandler;
        val$resultCode = I.this;
        super();
    }
}
