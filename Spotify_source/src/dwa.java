// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;

public class dwa
    implements dmx
{

    public dwa()
    {
    }

    public static void a()
    {
        Process.killProcess(Process.myPid());
    }
}
