// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.loader;

import com.dominos.android.sdk.app.Session;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.loader:
//            ApplicationLoader_

class val.callback extends c
{

    final ApplicationLoader_ this$0;
    final upLoadCallback val$callback;
    final Session val$session;

    public void execute()
    {
        try
        {
            ApplicationLoader_.access$001(ApplicationLoader_.this, val$session, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    upLoadCallback(String s1, Session session1, upLoadCallback uploadcallback)
    {
        this$0 = final_applicationloader_;
        val$session = session1;
        val$callback = uploadcallback;
        super(final_s, I.this, s1);
    }
}
