// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.location;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public interface LLSInterface
{

    public abstract double getVersion();

    public abstract IBinder onBind(Intent intent);

    public abstract void onCreate(Context context);

    public abstract void onDestroy();

    public abstract int onStartCommand(Intent intent, int i, int j);

    public abstract boolean onUnBind(Intent intent);
}
