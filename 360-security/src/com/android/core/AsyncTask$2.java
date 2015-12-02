// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.core;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.android.core:
//            AsyncTask

class <init> extends <init>
{

    final AsyncTask a;

    public Object call()
        throws Exception
    {
        AsyncTask.a(a).set(true);
        Process.setThreadPriority(10);
        return AsyncTask.a(a, a.a(b));
    }

    tomicBoolean(AsyncTask asynctask)
    {
        a = asynctask;
        super(null);
    }
}
