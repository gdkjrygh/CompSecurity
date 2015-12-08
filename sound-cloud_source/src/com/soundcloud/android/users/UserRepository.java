// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.sync.SyncInitiator;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.users:
//            UserStorage

public class UserRepository
{

    private static final f IS_NOT_EMPTY = new _cls1();
    private final R scheduler;
    private final SyncInitiator syncInitiator;
    private final UserStorage userStorage;

    public UserRepository(UserStorage userstorage, SyncInitiator syncinitiator, R r)
    {
        userStorage = userstorage;
        syncInitiator = syncinitiator;
        scheduler = r;
    }

    public b localAndSyncedUserInfo(Urn urn)
    {
        return b.concat(localUserInfo(urn), syncedUserInfo(urn));
    }

    public b localUserInfo(Urn urn)
    {
        return userStorage.loadUser(urn).filter(IS_NOT_EMPTY).subscribeOn(scheduler);
    }

    public b syncedUserInfo(Urn urn)
    {
        return syncInitiator.syncUser(urn).flatMap(RxUtils.continueWith(localUserInfo(urn)));
    }

    public b userInfo(Urn urn)
    {
        return b.concat(userStorage.loadUser(urn).filter(IS_NOT_EMPTY), syncedUserInfo(urn)).first().subscribeOn(scheduler);
    }


    private class _cls1
        implements f
    {

        public final Boolean call(PropertySet propertyset)
        {
            boolean flag;
            if (!propertyset.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls1()
        {
        }
    }

}
