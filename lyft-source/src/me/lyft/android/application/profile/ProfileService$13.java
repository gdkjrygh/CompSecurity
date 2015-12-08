// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import me.lyft.android.IUserSession;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.profile:
//            ProfileService

class this._cls0
    implements Func1
{

    final ProfileService this$0;

    public volatile Object call(Object obj)
    {
        return call((Unit)obj);
    }

    public Observable call(Unit unit)
    {
        return api.refreshFacebookAuthToken(userSession.getUser().getId(), facebookService.getFacebookToken());
    }

    ce()
    {
        this$0 = ProfileService.this;
        super();
    }
}
