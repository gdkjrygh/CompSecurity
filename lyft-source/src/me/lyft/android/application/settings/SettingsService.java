// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import me.lyft.android.IUserSession;
import me.lyft.android.common.IntegerExtensions;
import me.lyft.android.common.PhoneUtils;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.PhoneDTO;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.settings:
//            ISettingsService

public class SettingsService
    implements ISettingsService
{

    private ILyftApi lyftApi;
    private IUserSession userSession;

    public SettingsService(ILyftApi ilyftapi, IUserSession iusersession)
    {
        lyftApi = ilyftapi;
        userSession = iusersession;
    }

    public Observable requestVerificationCode(String s)
    {
        s = new PhoneDTO(PhoneUtils.cleanPhoneNumber(s), null, null);
        s = (new UpdateUserRequestBuilder()).withPhone(s).build();
        return lyftApi.updateUser(userSession.getUser().getId(), s).flatMap(new Func1() {

            final SettingsService this$0;

            public volatile Object call(Object obj)
            {
                return call((AppStateDTO)obj);
            }

            public Observable call(AppStateDTO appstatedto)
            {
                return Unit.just();
            }

            
            {
                this$0 = SettingsService.this;
                super();
            }
        });
    }

    public Observable updateEmail(String s)
    {
        s = (new UpdateUserRequestBuilder()).withEmail(s).build();
        return lyftApi.updateUser(userSession.getUser().getId(), s).flatMap(new Func1() {

            final SettingsService this$0;

            public volatile Object call(Object obj)
            {
                return call((AppStateDTO)obj);
            }

            public Observable call(AppStateDTO appstatedto)
            {
                return Unit.just();
            }

            
            {
                this$0 = SettingsService.this;
                super();
            }
        });
    }

    public Observable verifyPhone(String s, String s1)
    {
        s = new PhoneDTO(PhoneUtils.cleanPhoneNumber(s), IntegerExtensions.tryParse(s1, 0), null);
        s = (new UpdateUserRequestBuilder()).withPhone(s).build();
        return lyftApi.updateUser(userSession.getUser().getId(), s).flatMap(new Func1() {

            final SettingsService this$0;

            public volatile Object call(Object obj)
            {
                return call((AppStateDTO)obj);
            }

            public Observable call(AppStateDTO appstatedto)
            {
                return Unit.just();
            }

            
            {
                this$0 = SettingsService.this;
                super();
            }
        });
    }
}
