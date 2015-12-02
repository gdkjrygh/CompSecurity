// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.warn;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public interface ICashierWebInterFace
{

    public abstract void onCashierActionBarAction(int i);

    public abstract void onCreate(Bundle bundle, Activity activity);

    public abstract boolean onDestroy();

    public abstract boolean onKeyDown(int i, KeyEvent keyevent, Activity activity);

    public abstract boolean onPause();
}
