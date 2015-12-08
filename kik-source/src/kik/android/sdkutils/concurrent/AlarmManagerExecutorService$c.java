// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package kik.android.sdkutils.concurrent:
//            AlarmManagerExecutorService

private final class <init> extends <init>
{

    final AlarmManagerExecutorService c;

    protected final boolean runAndReset()
    {
        boolean flag = super.runAndReset();
        if (!isCancelled())
        {
            a(AlarmManagerExecutorService.f(c), this, e());
        }
        return flag;
    }

    public (AlarmManagerExecutorService alarmmanagerexecutorservice, Callable callable, long l, long l1, TimeUnit timeunit)
    {
        c = alarmmanagerexecutorservice;
        super(alarmmanagerexecutorservice, callable, l, l1, timeunit, (byte)0);
    }
}
