// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.rx.ScSchedulers;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.storage:
//            UserDAO

public class LegacyUserStorage
{

    private final R scheduler;
    private UserDAO userDAO;

    public LegacyUserStorage()
    {
        this(new UserDAO(SoundCloudApplication.instance.getContentResolver()));
    }

    public LegacyUserStorage(UserDAO userdao)
    {
        this(userdao, ScSchedulers.HIGH_PRIO_SCHEDULER);
    }

    LegacyUserStorage(UserDAO userdao, R r)
    {
        userDAO = userdao;
        scheduler = r;
    }

    public PublicApiUser createOrUpdate(PublicApiUser publicapiuser)
    {
        userDAO.createOrUpdate(publicapiuser.getId(), publicapiuser.buildContentValues());
        return publicapiuser;
    }

    public PublicApiUser getUser(long l)
    {
        return (PublicApiUser)userDAO.queryById(l);
    }

    public b getUserAsync(final long id)
    {
        return b.create(new _cls1()).subscribeOn(scheduler);
    }

    private class _cls1
        implements rx.b.f
    {

        final LegacyUserStorage this$0;
        final long val$id;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x.onNext(getUser(id));
            x.onCompleted();
        }

        _cls1()
        {
            this$0 = LegacyUserStorage.this;
            id = l;
            super();
        }
    }

}
