// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import android.text.TextUtils;

public final class btu
{

    public static String a(android.os.PowerManager.WakeLock wakelock)
    {
        Object obj = null;
        StringBuilder stringbuilder = (new StringBuilder()).append(String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(wakelock)));
        wakelock = obj;
        if (TextUtils.isEmpty(null))
        {
            wakelock = "";
        }
        return stringbuilder.append(wakelock).toString();
    }
}
