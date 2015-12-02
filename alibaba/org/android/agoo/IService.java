// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import org.android.agoo.callback.IServiceCallBack;

public interface IService
{

    public abstract IBinder bind(Intent intent);

    public abstract void create(Context context, IServiceCallBack iservicecallback);

    public abstract void destroy(Context context);

    public abstract int startCommand(Intent intent, int i, int j);

    public abstract boolean unbind(Intent intent);
}
