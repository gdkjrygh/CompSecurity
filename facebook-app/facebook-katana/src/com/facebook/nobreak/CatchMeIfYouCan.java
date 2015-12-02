// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.content.Intent;
import com.facebook.common.process.ProcessName;

// Referenced classes of package com.facebook.nobreak:
//            ResetHandler

public interface CatchMeIfYouCan
    extends Thread.UncaughtExceptionHandler
{

    public abstract void a(Intent intent);

    public abstract void a(ResetHandler resethandler);

    public abstract boolean a(ProcessName processname);

    public abstract void b(ProcessName processname);

    public abstract void uncaughtException(Thread thread, Throwable throwable);
}
