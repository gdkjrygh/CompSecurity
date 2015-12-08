// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.os.Bundle;
import android.view.View;

public interface Q
{

    public abstract void onFinish();

    public abstract void onSetContentView(View view);

    public abstract void onSetRequestedOrientation(int i);

    public abstract void onStartActivityForResult(Class class1, int i, Bundle bundle);
}
