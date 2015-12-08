// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import java.util.concurrent.atomic.AtomicReference;
import me.lyft.android.IUserSession;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.ImageUploadDTO;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.profile:
//            ProfileService

class val.image
    implements Func1
{

    final ProfileService this$0;
    final AtomicReference val$image;

    public volatile Object call(Object obj)
    {
        return call((Unit)obj);
    }

    public Observable call(Unit unit)
    {
        unit = (new UpdateUserRequestBuilder()).withImage((ImageUploadDTO)val$image.get()).build();
        return api.updateUser(userSession.getUser().getId(), unit);
    }

    adDTO()
    {
        this$0 = final_profileservice;
        val$image = AtomicReference.this;
        super();
    }
}
