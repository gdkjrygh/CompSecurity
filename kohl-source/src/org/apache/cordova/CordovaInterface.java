// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.Intent;
import java.util.concurrent.ExecutorService;

// Referenced classes of package org.apache.cordova:
//            CordovaPlugin

public interface CordovaInterface
{

    public abstract Activity getActivity();

    public abstract ExecutorService getThreadPool();

    public abstract Object onMessage(String s, Object obj);

    public abstract void setActivityResultCallback(CordovaPlugin cordovaplugin);

    public abstract void startActivityForResult(CordovaPlugin cordovaplugin, Intent intent, int i);
}
