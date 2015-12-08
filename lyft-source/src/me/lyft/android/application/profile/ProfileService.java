// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.ProfileAnalytics;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.domain.profile.ProfileMapper;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.ImageUploadDTO;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.s3.IS3Api;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.profile:
//            IProfileService, IProfilePhotoFileRecipient

public class ProfileService
    implements IProfileService
{

    final IS3Api IS3Api;
    final ILyftApi api;
    final IFacebookService facebookService;
    final IProfilePhotoFileRecipient profilePhotoFileRecipient;
    final IUserSession userSession;

    public ProfileService(IUserSession iusersession, IS3Api is3api, ILyftApi ilyftapi, IProfilePhotoFileRecipient iprofilephotofilerecipient, IFacebookService ifacebookservice)
    {
        userSession = iusersession;
        IS3Api = is3api;
        api = ilyftapi;
        profilePhotoFileRecipient = iprofilephotofilerecipient;
        facebookService = ifacebookservice;
    }

    public boolean isPassengerPhotoUploadEnabled()
    {
        return ((Boolean)Objects.firstNonNull(userSession.getUser().isPassengerPhotoUploadEnabled(), Boolean.valueOf(false))).booleanValue();
    }

    public Observable refreshFacebookToken()
    {
        final AsyncActionAnalytics analytics = ProfileAnalytics.trackRefreshFacebookSession();
        return facebookService.openFacebookSession().flatMap(new Func1() {

            final ProfileService this$0;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                return api.refreshFacebookAuthToken(userSession.getUser().getId(), facebookService.getFacebookToken());
            }

            
            {
                this$0 = ProfileService.this;
                super();
            }
        }).doOnNext(new Action1() {

            final ProfileService this$0;
            final AsyncActionAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                analytics.trackResponseSuccess();
            }

            
            {
                this$0 = ProfileService.this;
                analytics = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final ProfileService this$0;
            final AsyncActionAnalytics val$analytics;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                analytics.trackResponseFailure(throwable);
                return Observable.empty();
            }

            
            {
                this$0 = ProfileService.this;
                analytics = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public boolean shouldRequestProfileV1FacebookPermissions()
    {
        return ((Boolean)Objects.firstNonNull(userSession.getUser().shouldRequestProfileV1FacebookPermissions(), Boolean.valueOf(false))).booleanValue();
    }

    public Observable uploadProfileData(Profile profile)
    {
        final AsyncActionAnalytics saveData = ProfileAnalytics.saveDataAnalytics();
        saveData.trackRequest();
        profile = ProfileMapper.asUserDTOForUpdateProfile(profile, null);
        return api.updateUser(userSession.getUser().getId(), profile).doOnNext(new Action1() {

            final ProfileService this$0;
            final AsyncActionAnalytics val$saveData;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                saveData.trackResponseSuccess();
            }

            
            {
                this$0 = ProfileService.this;
                saveData = asyncactionanalytics;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final ProfileService this$0;
            final AsyncActionAnalytics val$saveData;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                saveData.trackResponseFailure(throwable);
                return Observable.empty();
            }

            
            {
                this$0 = ProfileService.this;
                saveData = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable uploadProfilePicture(final File file)
    {
        final AsyncActionAnalytics savePhoto = ProfileAnalytics.savePhotoAnalytics();
        savePhoto.trackRequest();
        final AtomicReference image = new AtomicReference();
        ImageUploadDTO imageuploaddto = new ImageUploadDTO("profilePicture", null);
        return api.getImageUploadUrl(imageuploaddto).flatMap(new Func1() {

            final ProfileService this$0;
            final File val$file;
            final AtomicReference val$image;

            public volatile Object call(Object obj)
            {
                return call((ImageUploadDTO)obj);
            }

            public Observable call(ImageUploadDTO imageuploaddto1)
            {
                image.set(imageuploaddto1);
                return ProfileService.this.IS3Api.uploadFile(imageuploaddto1.getUploadUrl(), file);
            }

            
            {
                this$0 = ProfileService.this;
                image = atomicreference;
                file = file1;
                super();
            }
        }).flatMap(new Func1() {

            final ProfileService this$0;
            final AtomicReference val$image;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                unit = (new UpdateUserRequestBuilder()).withImage((ImageUploadDTO)image.get()).build();
                return api.updateUser(userSession.getUser().getId(), unit);
            }

            
            {
                this$0 = ProfileService.this;
                image = atomicreference;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final ProfileService this$0;
            final AsyncActionAnalytics val$savePhoto;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                savePhoto.trackResponseFailure(throwable);
                return Observable.empty();
            }

            
            {
                this$0 = ProfileService.this;
                savePhoto = asyncactionanalytics;
                super();
            }
        }).doOnNext(new Action1() {

            final ProfileService this$0;
            final File val$file;
            final AsyncActionAnalytics val$savePhoto;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                profilePhotoFileRecipient.usePhotoFile(file);
                savePhoto.trackResponseSuccess();
            }

            
            {
                this$0 = ProfileService.this;
                file = file1;
                savePhoto = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable uploadProfilePictureAndData(final File file, final Profile profile)
    {
        final AsyncActionAnalytics savePhotoAndData = ProfileAnalytics.savePhotoAndDataAnalytics();
        savePhotoAndData.trackRequest();
        final AtomicReference image = new AtomicReference();
        ImageUploadDTO imageuploaddto = new ImageUploadDTO("profilePicture", null);
        return api.getImageUploadUrl(imageuploaddto).flatMap(new Func1() {

            final ProfileService this$0;
            final File val$file;
            final AtomicReference val$image;

            public volatile Object call(Object obj)
            {
                return call((ImageUploadDTO)obj);
            }

            public Observable call(ImageUploadDTO imageuploaddto1)
            {
                image.set(imageuploaddto1);
                return ProfileService.this.IS3Api.uploadFile(imageuploaddto1.getUploadUrl(), file);
            }

            
            {
                this$0 = ProfileService.this;
                image = atomicreference;
                file = file1;
                super();
            }
        }).flatMap(new Func1() {

            final ProfileService this$0;
            final AtomicReference val$image;
            final Profile val$profile;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                unit = ProfileMapper.asUserDTOForUpdateProfile(profile, (ImageUploadDTO)image.get());
                return api.updateUser(userSession.getUser().getId(), unit);
            }

            
            {
                this$0 = ProfileService.this;
                profile = profile1;
                image = atomicreference;
                super();
            }
        }).onErrorResumeNext(new Func1() {

            final ProfileService this$0;
            final AsyncActionAnalytics val$savePhotoAndData;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                savePhotoAndData.trackResponseFailure(throwable);
                return Observable.empty();
            }

            
            {
                this$0 = ProfileService.this;
                savePhotoAndData = asyncactionanalytics;
                super();
            }
        }).doOnNext(new Action1() {

            final ProfileService this$0;
            final File val$file;
            final AsyncActionAnalytics val$savePhotoAndData;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                profilePhotoFileRecipient.usePhotoFile(file);
                savePhotoAndData.trackResponseSuccess();
            }

            
            {
                this$0 = ProfileService.this;
                file = file1;
                savePhotoAndData = asyncactionanalytics;
                super();
            }
        }).map(Unit.func1());
    }
}
