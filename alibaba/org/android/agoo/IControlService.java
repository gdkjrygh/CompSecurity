// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo;

import android.content.Context;
import android.content.Intent;
import org.android.agoo.callback.IControlCallBack;

public interface IControlService
{

    public abstract void onHandleIntent(Context context, Intent intent, IControlCallBack icontrolcallback);
}
