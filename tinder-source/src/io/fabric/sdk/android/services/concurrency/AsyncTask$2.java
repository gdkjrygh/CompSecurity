// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

final class <init> extends <init>
{

    final AsyncTask a;

    public final Object call()
        throws Exception
    {
        AsyncTask.a(a).set(true);
        Process.setThreadPriority(10);
        return AsyncTask.a(a, a.e());
    }

    (AsyncTask asynctask)
    {
        a = asynctask;
        super((byte)0);
    }
}
