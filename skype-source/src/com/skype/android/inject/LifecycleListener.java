// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.os.Bundle;

public interface LifecycleListener
{

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void onStart();

    public abstract void onStop();
}
