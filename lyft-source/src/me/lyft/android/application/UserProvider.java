// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import me.lyft.android.domain.User;
import me.lyft.android.rx.ReactiveProperty;
import rx.Observable;

// Referenced classes of package me.lyft.android.application:
//            IUserProvider

public class UserProvider
    implements IUserProvider
{

    private final ReactiveProperty userSubject = ReactiveProperty.create(User.empty());

    public UserProvider()
    {
    }

    public User getUser()
    {
        return (User)userSubject.get();
    }

    public Observable observeUserUpdates()
    {
        return userSubject.asObservable();
    }

    public void updateUser(User user)
    {
        userSubject.onNext(user);
    }
}
