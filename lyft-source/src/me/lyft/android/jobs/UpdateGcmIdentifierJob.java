// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.common.Strings;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.gcm.IGcmIdService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UpdateGcmIdentifierJob
    implements Job
{

    private final UserDTO currentUser;
    IDefaultErrorHandler defaultErrorHandler;
    IGcmIdService gcmIdService;
    ILyftApi lyftApi;

    public UpdateGcmIdentifierJob(UserDTO userdto)
    {
        currentUser = userdto;
    }

    public void execute()
    {
        boolean flag1 = false;
        if (!NullUserDTO.isNull(currentUser))
        {
            Object obj = gcmIdService.getRegistrationId();
            String s = currentUser.getGooglePushToken();
            boolean flag;
            if (!Strings.isNullOrEmpty(((String) (obj))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (Strings.isNullOrEmpty(s) || !s.equalsIgnoreCase(((String) (obj))))
            {
                flag1 = true;
            }
            if (flag && flag1)
            {
                AppAnalytics.trackAllowPush(((String) (obj)));
                obj = (new UpdateUserRequestBuilder()).withGooglePushToken(((String) (obj))).build();
                String s1 = currentUser.getId();
                try
                {
                    lyftApi.updateUserSync(s1, ((me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO) (obj)));
                    return;
                }
                catch (Throwable throwable)
                {
                    defaultErrorHandler.handle(throwable);
                }
                return;
            }
        }
    }
}
