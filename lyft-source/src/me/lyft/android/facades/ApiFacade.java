// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.facades;

import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.googlenow.GoogleNowAuthCodeDTO;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.Observable;

public class ApiFacade
{

    private final ILyftApi lyftApi;
    private final IUserSession userSession;

    public ApiFacade(IUserSession iusersession, ILyftApi ilyftapi)
    {
        userSession = iusersession;
        lyftApi = ilyftapi;
    }

    public Observable switchMode(boolean flag)
    {
        UpdateUserRequestBuilder updateuserrequestbuilder = new UpdateUserRequestBuilder();
        Object obj;
        if (flag)
        {
            obj = "driver";
        } else
        {
            obj = "passenger";
        }
        obj = updateuserrequestbuilder.withMode(((String) (obj))).build();
        return lyftApi.updateUser(userSession.getUser().getId(), ((me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO) (obj)));
    }

    public Observable updateGoogleAuthToken(String s, GoogleNowAuthCodeDTO googlenowauthcodedto)
    {
        return lyftApi.updateGoogleAuthToken(s, googlenowauthcodedto);
    }
}
