// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.crashhandler;

import java.util.Map;

public interface IUTCrashCaughtListner
{

    public abstract Map onCrashCaught(Thread thread, Throwable throwable);
}
