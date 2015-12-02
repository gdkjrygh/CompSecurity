// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.auth.user.interf;

import abl;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public interface ISnsUserPlugin
{

    public abstract boolean checkAuthLoginEnvironmentAvailable(Activity activity);

    public abstract void initialize(Context context);

    public abstract void onActivityResult(int i, int j, Intent intent);

    public abstract void onDestroy(Activity activity);

    public abstract void onPause(Activity activity);

    public abstract void onResume(Activity activity);

    public abstract void snsAuthLogin(Activity activity, abl abl);
}
