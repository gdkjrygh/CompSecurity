// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import me.lyft.android.IUserSession;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.settings:
//            IAccessibilitySettingsService

public class AccessibilitySettingsService
    implements IAccessibilitySettingsService
{

    private final ILyftApi lyftApi;
    private final IUserSession userSession;

    public AccessibilitySettingsService(IUserSession iusersession, ILyftApi ilyftapi)
    {
        userSession = iusersession;
        lyftApi = ilyftapi;
    }

    public Observable setAccessibilityEnabled(boolean flag)
    {
        me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO updateuserrequestdto = (new UpdateUserRequestBuilder()).withWheelchair(Boolean.valueOf(flag)).build();
        return lyftApi.updateUser(userSession.getUser().getId(), updateuserrequestdto).flatMap(new Func1() {

            final AccessibilitySettingsService this$0;

            public volatile Object call(Object obj)
            {
                return call((AppStateDTO)obj);
            }

            public Observable call(AppStateDTO appstatedto)
            {
                return Unit.just();
            }

            
            {
                this$0 = AccessibilitySettingsService.this;
                super();
            }
        });
    }
}
