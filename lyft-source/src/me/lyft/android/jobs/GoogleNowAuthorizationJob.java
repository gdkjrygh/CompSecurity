// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import com.google.android.now.NowAuthService;
import java.util.concurrent.TimeUnit;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.infrastructure.googlenow.GoogleNowAuthenticationApi;
import me.lyft.android.infrastructure.lyft.googlenow.GoogleNowAuthCodeDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SecureObserver;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class GoogleNowAuthorizationJob
    implements Job
{

    private static final long AUTH_CODE_EXPIRATION_ERROR_THRESHOLD;
    private static final long AUTH_CODE_EXPIRATION_THRESHOLD;
    ApiFacade apiFacade;
    LyftApplication application;
    GoogleNowAuthenticationApi authenticationApi;
    ILyftPreferences preferences;
    private UserDTO user;

    public GoogleNowAuthorizationJob(UserDTO userdto)
    {
        user = userdto;
    }

    private GoogleNowAuthCodeDTO getGoogleNowAuthCode(long l)
    {
        return (GoogleNowAuthCodeDTO)Objects.firstNonNull(preferences.getGoogleNowAuthCode(), new GoogleNowAuthCodeDTO(null, l));
    }

    private void revokeToken(String s)
    {
        final GoogleNowAuthCodeDTO googleNowAuthCode = getGoogleNowAuthCode(System.currentTimeMillis() + AUTH_CODE_EXPIRATION_THRESHOLD);
        if (!Strings.isNullOrEmpty(s))
        {
            authenticationApi.revokeToken(s).subscribe(new SimpleSubscriber() {

                final GoogleNowAuthorizationJob this$0;
                final GoogleNowAuthCodeDTO val$googleNowAuthCode;

                public void onError(Throwable throwable)
                {
                    preferences.setGoogleNowAuthCode(googleNowAuthCode);
                }

                public volatile void onNext(Object obj)
                {
                    onNext((Unit)obj);
                }

                public void onNext(Unit unit)
                {
                    preferences.setGoogleNowAuthCode(null);
                }

            
            {
                this$0 = GoogleNowAuthorizationJob.this;
                googleNowAuthCode = googlenowauthcodedto;
                super();
            }
            });
        }
    }

    private boolean shouldGetNewAuthCode(GoogleNowAuthCodeDTO googlenowauthcodedto)
    {
label0:
        {
            boolean flag2 = false;
            boolean flag;
            boolean flag1;
            if (System.currentTimeMillis() - ((Long)Objects.firstNonNull(googlenowauthcodedto.expirationTimestamp, Long.valueOf(0L))).longValue() > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!Strings.isNullOrEmpty(googlenowauthcodedto.authCode))
            {
                flag1 = flag2;
                if (!Strings.isNullOrEmpty(user.getGoogleNowRefreshToken()))
                {
                    break label0;
                }
            }
            flag1 = flag2;
            if (flag)
            {
                flag1 = true;
            }
        }
        return flag1;
    }

    private void updateGoogleAuthCode(GoogleNowAuthCodeDTO googlenowauthcodedto)
    {
        if (!Strings.isNullOrEmpty(googlenowauthcodedto.authCode))
        {
            apiFacade.updateGoogleAuthToken(user.getId(), googlenowauthcodedto).subscribe(new SecureObserver() {

                final GoogleNowAuthorizationJob this$0;

                public void onSafeError(Throwable throwable)
                {
                    L.w(throwable, throwable.getMessage(), new Object[0]);
                }

            
            {
                this$0 = GoogleNowAuthorizationJob.this;
                super();
            }
            });
        }
    }

    private GoogleNowAuthCodeDTO updateTtlForError(GoogleNowAuthCodeDTO googlenowauthcodedto)
    {
        GoogleNowAuthCodeDTO googlenowauthcodedto1 = new GoogleNowAuthCodeDTO(googlenowauthcodedto.authCode, System.currentTimeMillis() + AUTH_CODE_EXPIRATION_ERROR_THRESHOLD);
        preferences.setGoogleNowAuthCode(googlenowauthcodedto);
        return googlenowauthcodedto1;
    }

    public void execute()
    {
        Object obj = getGoogleNowAuthCode(System.currentTimeMillis());
        if (!shouldGetNewAuthCode(((GoogleNowAuthCodeDTO) (obj)))) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        GoogleNowAuthCodeDTO googlenowauthcodedto;
        GoogleNowAuthCodeDTO googlenowauthcodedto1;
        obj1 = obj;
        obj2 = obj;
        googlenowauthcodedto = ((GoogleNowAuthCodeDTO) (obj));
        googlenowauthcodedto1 = ((GoogleNowAuthCodeDTO) (obj));
        obj = getGoogleNowAuthCode(System.currentTimeMillis() + AUTH_CODE_EXPIRATION_THRESHOLD);
        obj1 = obj;
        obj2 = obj;
        googlenowauthcodedto = ((GoogleNowAuthCodeDTO) (obj));
        googlenowauthcodedto1 = ((GoogleNowAuthCodeDTO) (obj));
        obj = new GoogleNowAuthCodeDTO(NowAuthService.a(application.getApplicationContext(), application.getString(0x7f070187)), System.currentTimeMillis() + AUTH_CODE_EXPIRATION_THRESHOLD);
        preferences.setGoogleNowAuthCode(((GoogleNowAuthCodeDTO) (obj)));
_L3:
        updateGoogleAuthCode(((GoogleNowAuthCodeDTO) (obj)));
_L2:
        return;
        obj2;
        obj = obj1;
        obj1 = obj2;
_L6:
        L.w(((Throwable) (obj1)), ((com.google.android.now.NowAuthService.HaveTokenAlreadyException) (obj1)).getMessage(), new Object[0]);
        revokeToken(((com.google.android.now.NowAuthService.HaveTokenAlreadyException) (obj1)).a());
          goto _L3
        obj;
        obj = obj2;
_L5:
        obj = updateTtlForError(((GoogleNowAuthCodeDTO) (obj)));
          goto _L3
        Throwable throwable;
        throwable;
        obj = googlenowauthcodedto;
_L4:
        L.w(throwable, throwable.getMessage(), new Object[0]);
        obj = updateTtlForError(((GoogleNowAuthCodeDTO) (obj)));
          goto _L3
        throwable;
          goto _L4
        throwable;
          goto _L5
        com.google.android.now.NowAuthService.DisabledException disabledexception;
        disabledexception;
        disabledexception = googlenowauthcodedto1;
          goto _L5
        throwable;
          goto _L5
        throwable;
          goto _L6
    }

    static 
    {
        AUTH_CODE_EXPIRATION_THRESHOLD = TimeUnit.MINUTES.toMillis(5L);
        AUTH_CODE_EXPIRATION_ERROR_THRESHOLD = TimeUnit.HOURS.toMillis(24L);
    }
}
