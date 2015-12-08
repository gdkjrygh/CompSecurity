// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.locationsettings;

import rx.Observable;

public interface ILocationSettingsService
{

    public abstract boolean mockLocationEnabled();

    public abstract Observable observeLocationSettingsEnabled();
}
