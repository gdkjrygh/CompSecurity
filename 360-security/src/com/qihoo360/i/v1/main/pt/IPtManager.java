// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.i.v1.main.pt;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qihoo360.i.IModule;
import java.util.ArrayList;
import java.util.List;

public interface IPtManager
    extends IModule
{

    public static final String ACTION_REQUEST_FINISH = "com.qihoo360.mobilesafe.request_root_finish";

    public abstract boolean bindRtService(Context context, ServiceConnection serviceconnection);

    public abstract void dismissConn(Context context, IBinder ibinder);

    public abstract byte[] exec(IBinder ibinder, String s, List list, List list1);

    public abstract byte[] execp(IBinder ibinder, String s, ArrayList arraylist);

    public abstract int execve(IBinder ibinder, String s, List list, List list1);

    public abstract int execvp(IBinder ibinder, String s, List list);

    public abstract IBinder getRtConn(Context context)
        throws Exception;

    public abstract boolean isPhoneRted();

    public abstract boolean isRtServiceRunning();

    public abstract void requestRtAuth(Context context);

    public abstract void unBindRtService(Context context, ServiceConnection serviceconnection);
}
