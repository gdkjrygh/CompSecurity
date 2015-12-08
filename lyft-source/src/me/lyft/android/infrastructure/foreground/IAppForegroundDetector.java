// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.foreground;

import rx.Observable;

public interface IAppForegroundDetector
{

    public abstract boolean isForegrounded();

    public abstract Observable observeAppForegrounded();

    public abstract void onStart();

    public abstract void onStop();
}
