// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.fragments;

import android.os.Looper;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.libraries.commerce.ocr.fragments:
//            FragmentModule

final class val.handlerProvider
    implements Runnable
{

    final FragmentModule this$0;
    final FutureTask val$handlerProvider;

    public final void run()
    {
        Looper.prepare();
        val$handlerProvider.run();
        Looper.loop();
    }

    ()
    {
        this$0 = final_fragmentmodule;
        val$handlerProvider = FutureTask.this;
        super();
    }
}
