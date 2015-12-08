// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.facebook;

import rx.Observable;

public interface IFacebookService
{

    public abstract String getFacebookToken();

    public abstract boolean isFacebookSessionOpened();

    public abstract void logout();

    public abstract Observable openFacebookSession();
}
