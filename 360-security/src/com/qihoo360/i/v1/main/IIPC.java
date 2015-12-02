// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.i.v1.main;

import android.content.Context;
import android.content.Intent;
import com.qihoo360.i.IModule;

public interface IIPC
    extends IModule
{

    public abstract String getCurrentProcessName();

    public abstract int getRunningProcessPID(Context context, String s);

    public abstract int getUIProcessPID(Context context);

    public abstract boolean isContactProcess();

    public abstract boolean isPersistentProcess();

    public abstract boolean isPersistentUIProcess();

    public abstract boolean isRunningProcess(String s);

    public abstract boolean isUIProcess();

    public abstract void sendIntent2PersistentProcess(Context context, Intent intent);

    public abstract void sendIntent2UIProcess(Context context, Intent intent);

    public abstract void sendLocalBroadcast2MainUI(Context context, Intent intent);

    public abstract void sendLocalBroadcast2MobileSafes(Context context, Intent intent);

    public abstract void sendLocalBroadcast2Persist(Context context, Intent intent);

    public abstract void sendLocalBroadcast2PersistAndMainUI(Context context, Intent intent);
}
