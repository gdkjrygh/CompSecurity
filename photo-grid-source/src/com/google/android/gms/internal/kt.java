// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;

public interface kt
    extends IInterface
{

    public abstract void onBackPressed();

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onRestart();

    public abstract void onResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void zzaE();

    public abstract boolean zzeF();
}
