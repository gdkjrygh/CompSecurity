// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing;

import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.exceptions.DuplicatePhoneException;
import me.lyft.android.application.landing.exceptions.InvalidPhoneExeception;
import me.lyft.android.application.landing.exceptions.InvalidPhoneFormatException;
import me.lyft.android.application.landing.exceptions.InvalidVerificationCodeException;
import me.lyft.android.application.landing.exceptions.LandingValidationException;
import me.lyft.android.application.landing.exceptions.SuspendedPhoneException;
import me.lyft.android.application.landing.exceptions.TermsNotAcceptedException;
import me.lyft.android.application.landing.exceptions.VerificationCodeTooShortException;
import me.lyft.android.common.IntegerExtensions;
import me.lyft.android.common.PhoneUtils;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.profile.LoginRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.PhoneDTO;
import me.lyft.android.infrastructure.lyft.profile.PhoneRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.persistence.landing.SignupUser;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.landing:
//            ILandingService

public class LandingService
    implements ILandingService
{

    private static final int MIN_CODE_LENGTH = 4;
    public static final String REASON_DUPLICATE_PHONE = "duplicatePhoneNumber";
    public static final String REASON_INVALID_PHONE = "invalidPhone";
    public static final String REASON_INVALID_PHONE_FORMAT = "invalidFormat";
    public static final String REASON_SUSPENDED = "suspended";
    private final IFacebookService facebookService;
    private final ILocationService locationService;
    private final ILyftApi lyftApi;
    private final ILyftPreferences preferences;
    private ISignUpUserRepository signupUserRepository;
    private IUserProvider userProvider;

    public LandingService(ISignUpUserRepository isignupuserrepository, IUserProvider iuserprovider, ILyftApi ilyftapi, ILocationService ilocationservice, IFacebookService ifacebookservice, ILyftPreferences ilyftpreferences)
    {
        signupUserRepository = isignupuserrepository;
        userProvider = iuserprovider;
        lyftApi = ilyftapi;
        locationService = ilocationservice;
        facebookService = ifacebookservice;
        preferences = ilyftpreferences;
    }

    private Observable handleError(Throwable throwable)
    {
        if (throwable instanceof LyftApiException)
        {
            Object obj = (LyftApiException)throwable;
            if (((LyftApiException) (obj)).getStatusCode() == 422 && ((LyftApiException) (obj)).getValidationErrors().size() > 0)
            {
                Object obj1 = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)((LyftApiException) (obj)).getValidationErrors().get(0);
                obj = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getField();
                String s = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getReason();
                obj1 = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getMessage();
                if (((String) (obj)).equalsIgnoreCase("verificationCode"))
                {
                    return Observable.error(new InvalidVerificationCodeException(((String) (obj1)), throwable));
                }
                if (s.equalsIgnoreCase("invalidPhone") || s.equalsIgnoreCase("invalidFormat"))
                {
                    return Observable.error(new InvalidPhoneExeception(((String) (obj1)), throwable));
                }
                if (s.equalsIgnoreCase("duplicatePhoneNumber"))
                {
                    return Observable.error(new DuplicatePhoneException(((String) (obj1)), throwable));
                }
                if (s.equalsIgnoreCase("suspended"))
                {
                    return Observable.error(new SuspendedPhoneException(((String) (obj1)), throwable));
                } else
                {
                    return Observable.error(throwable);
                }
            }
        }
        return Observable.error(throwable);
    }

    public void agreedTermsOfService(boolean flag)
    {
        SignupUser signupuser = signupUserRepository.get();
        signupuser.setAgreedToS(flag);
        signupUserRepository.update(signupuser);
    }

    public Observable createFacebookUser()
    {
        return facebookService.openFacebookSession().flatMap(new Func1() {

            final LandingService this$0;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                return locationService.getLastLocation().flatMap(new Func1() {

                    final _cls5 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((Location)obj);
                    }

                    public Observable call(Location location)
                    {
                        location = LocationMapper.fromLocationDomain(location);
                        location = new LoginRequestDTO(null, null, null, facebookService.getFacebookToken(), null, null, null, location, preferences.getMatId());
                        return lyftApi.createUser(location);
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
            }

            
            {
                this$0 = LandingService.this;
                super();
            }
        }).map(Unit.func1()).onErrorResumeNext(new Func1() {

            final LandingService this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                return handleError(throwable);
            }

            
            {
                this$0 = LandingService.this;
                super();
            }
        });
    }

    public Observable createUser(SignupUser signupuser)
    {
        if (!signupuser.isValid())
        {
            LandingValidationException landingvalidationexception = new LandingValidationException();
            if (!signupuser.validateFirstName())
            {
                landingvalidationexception.addField("first_name");
            }
            if (!signupuser.validateLastName())
            {
                landingvalidationexception.addField("last_name");
            }
            if (!signupuser.validateEmail())
            {
                landingvalidationexception.addField("email");
            }
            return Observable.error(landingvalidationexception);
        } else
        {
            signupUserRepository.update(signupuser);
            return Unit.just();
        }
    }

    public Observable loadUser()
    {
        if (!userProvider.getUser().isNull())
        {
            return Unit.just();
        } else
        {
            return locationService.getLastLocation().flatMap(new Func1() {

                final LandingService this$0;

                public volatile Object call(Object obj)
                {
                    return call((Location)obj);
                }

                public Observable call(Location location)
                {
                    location = LocationMapper.fromLocationDomain(location);
                    location = new LoginRequestDTO(null, null, null, facebookService.getFacebookToken(), null, preferences.getInstallReferrer(), null, location, preferences.getMatId());
                    return lyftApi.createUser(location);
                }

            
            {
                this$0 = LandingService.this;
                super();
            }
            }).map(Unit.func1());
        }
    }

    public Observable refreshFacebookToken()
    {
        if (userProvider.getUser().isNull())
        {
            return Unit.just();
        }
        Object obj = facebookService.getFacebookToken();
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            return Unit.just();
        } else
        {
            obj = (new UpdateUserRequestBuilder()).withFbToken(((String) (obj))).build();
            return lyftApi.updateUser(userProvider.getUser().getId(), ((me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO) (obj))).first().map(Unit.func1());
        }
    }

    public Observable requestVerificationCode(String s, Boolean boolean1)
    {
        if (!PhoneUtils.isLengthValid(s))
        {
            return Observable.error(new InvalidPhoneFormatException());
        }
        if (boolean1 != null && !boolean1.booleanValue())
        {
            return Observable.error(new TermsNotAcceptedException());
        } else
        {
            s = new PhoneRequestDTO(new PhoneDTO(PhoneUtils.cleanPhoneNumber(s), null, null));
            return lyftApi.requestPhoneAuthentication(s).onErrorResumeNext(new Func1() {

                final LandingService this$0;

                public volatile Object call(Object obj)
                {
                    return call((Throwable)obj);
                }

                public Observable call(Throwable throwable)
                {
                    return handleError(throwable);
                }

            
            {
                this$0 = LandingService.this;
                super();
            }
            });
        }
    }

    public Observable setTosAcceptedAndUpdateUser()
    {
        me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO updateuserrequestdto = (new UpdateUserRequestBuilder()).withTermsAccepted(true).build();
        return lyftApi.updateUser(userProvider.getUser().getId(), updateuserrequestdto).map(Unit.func1());
    }

    public Observable updateExistingUser(SignupUser signupuser)
    {
        if (!signupuser.hasAgreedToS())
        {
            return Observable.error(new TermsNotAcceptedException());
        }
        if (!signupuser.isValid())
        {
            LandingValidationException landingvalidationexception = new LandingValidationException();
            if (!signupuser.validateFirstName())
            {
                landingvalidationexception.addField("first_name");
            }
            if (!signupuser.validateLastName())
            {
                landingvalidationexception.addField("last_name");
            }
            if (!signupuser.validateEmail())
            {
                landingvalidationexception.addField("email");
            }
            return Observable.error(landingvalidationexception);
        } else
        {
            User user = userProvider.getUser();
            signupuser = (new UpdateUserRequestBuilder()).withTermsAccepted(true).withFirstName(signupuser.getFirstName()).withLastName(signupuser.getLastName()).withEmail(signupuser.getEmail()).build();
            return lyftApi.updateUser(user.getId(), signupuser).map(Unit.func1()).onErrorResumeNext(new Func1() {

                final LandingService this$0;

                public volatile Object call(Object obj)
                {
                    return call((Throwable)obj);
                }

                public Observable call(Throwable throwable)
                {
                    return handleError(throwable);
                }

            
            {
                this$0 = LandingService.this;
                super();
            }
            });
        }
    }

    public Observable verifyPhone(final String phone, String s)
    {
        if (s.length() != 4)
        {
            return Observable.error(new VerificationCodeTooShortException());
        }
        User user = userProvider.getUser();
        final SignupUser signupUser = signupUserRepository.get();
        phone = new PhoneDTO(PhoneUtils.cleanPhoneNumber(phone), IntegerExtensions.tryParse(s, 0), null);
        if (user.isNull())
        {
            phone = locationService.getLastLocation().flatMap(new Func1() {

                final LandingService this$0;
                final PhoneDTO val$phone;
                final SignupUser val$signupUser;

                public volatile Object call(Object obj)
                {
                    return call((Location)obj);
                }

                public Observable call(Location location)
                {
                    location = LocationMapper.fromLocationDomain(location);
                    location = new LoginRequestDTO(signupUser.getEmail().trim(), signupUser.getFirstName().trim(), signupUser.getLastName().trim(), null, phone, preferences.getInstallReferrer(), Boolean.valueOf(signupUser.hasAgreedToS()), location, preferences.getMatId());
                    return lyftApi.createUser(location);
                }

            
            {
                this$0 = LandingService.this;
                signupUser = signupuser;
                phone = phonedto;
                super();
            }
            }).map(Unit.func1());
        } else
        {
            phone = (new UpdateUserRequestBuilder()).withPhone(phone).withCouponCode(preferences.getInstallReferrer()).withTermsAccepted(signupUser.hasAgreedToS()).build();
            phone = lyftApi.updateUser(user.getId(), phone).map(Unit.func1());
        }
        return phone.onErrorResumeNext(new Func1() {

            final LandingService this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                return handleError(throwable);
            }

            
            {
                this$0 = LandingService.this;
                super();
            }
        });
    }





}
