// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.assist;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo360.mobilesafe.assist:
//            SysclearAsyncTask19

class <init> extends <init>
{

    final SysclearAsyncTask19 a;

    public Object call()
        throws Exception
    {
        SysclearAsyncTask19.a(a).set(true);
        Process.setThreadPriority(10);
        return SysclearAsyncTask19.b(a, a.a(b));
    }

    (SysclearAsyncTask19 sysclearasynctask19)
    {
        a = sysclearasynctask19;
        super(null);
    }
}
