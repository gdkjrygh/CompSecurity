// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.f;

import android.graphics.Bitmap;
import android.view.View;
import com.b.a.b.a.b;

public interface a
{

    public abstract void onLoadingCancelled(String s, View view);

    public abstract void onLoadingComplete(String s, View view, Bitmap bitmap);

    public abstract void onLoadingFailed(String s, View view, b b);

    public abstract void onLoadingStarted(String s, View view);
}
