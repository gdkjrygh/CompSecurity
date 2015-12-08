// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine
{

    private static final AtomicReference a = new AtomicReference();
    private static boolean b;

    private CommandLine()
    {
    }

    public static boolean c()
    {
        return a.get() != null;
    }

    public static CommandLine d()
    {
        CommandLine commandline = (CommandLine)a.get();
        if (!b && commandline == null)
        {
            throw new AssertionError();
        } else
        {
            return commandline;
        }
    }

    private static native void nativeAppendSwitch(String s);

    private static native void nativeAppendSwitchWithValue(String s, String s1);

    private static native void nativeAppendSwitchesAndArguments(String as[]);

    private static native String nativeGetSwitchValue(String s);

    private static native boolean nativeHasSwitch(String s);

    private static native void nativeReset();

    public abstract boolean a();

    public abstract String b();

    static 
    {
        boolean flag;
        if (!org/chromium/base/CommandLine.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        new ArrayList();
    }
}
