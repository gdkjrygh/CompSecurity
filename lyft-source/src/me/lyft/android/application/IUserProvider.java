// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import me.lyft.android.domain.User;
import rx.Observable;

public interface IUserProvider
{

    public abstract User getUser();

    public abstract Observable observeUserUpdates();

    public abstract void updateUser(User user);
}
