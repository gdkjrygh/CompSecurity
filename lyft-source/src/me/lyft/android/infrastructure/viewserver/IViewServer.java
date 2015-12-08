// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.viewserver;

import android.app.Activity;

public interface IViewServer
{

    public abstract void addWindow(Activity activity);

    public abstract void removeWindow(Activity activity);

    public abstract void setFocusedWindow(Activity activity);
}
