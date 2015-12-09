// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.sdk;

import android.app.Activity;

public interface BaseApi
{

    public abstract void onPause(Activity activity);

    public abstract void onResume(Activity activity);

    public abstract void release(Activity activity);

    public abstract void setAge(int i);

    public abstract void setGender(String s);
}
