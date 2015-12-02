// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.warn;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.alipay.android.app.pay.activity.AbsActivity;

public interface IActivityAdapter
{

    public abstract void disMissTopLoading();

    public abstract void finishCurrentTrade(int i, String s);

    public abstract void finishCurrentTradeOnException(int i, String s);

    public abstract void initializeTheme(AbsActivity absactivity);

    public abstract void onActivityResult(int i, int j, Intent intent);

    public abstract boolean onConfigurationChanged(Configuration configuration);

    public abstract void onDestroy();

    public abstract boolean onKeyDown(int i, KeyEvent keyevent);

    public abstract void onResume();

    public abstract void onStop();

    public abstract void oncreate(Bundle bundle, AbsActivity absactivity);

    public abstract void sendUiMsgWhenException(int i, Throwable throwable);
}
