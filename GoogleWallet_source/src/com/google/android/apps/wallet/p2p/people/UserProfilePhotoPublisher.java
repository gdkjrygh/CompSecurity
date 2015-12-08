// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.people;

import android.accounts.Account;
import android.app.Application;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.Images;
import com.google.android.gms.people.People;
import com.google.android.gms.people.PeopleClientUtil;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.p2p.people:
//            UserProfilePhotoEvent

public class UserProfilePhotoPublisher
    implements InitializedEventPublisher, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, ResultCallback
{

    private static final String TAG = com/google/android/apps/wallet/p2p/people/UserProfilePhotoPublisher.getSimpleName();
    private final Account account;
    private final EventBus eventBus;
    private final ActionExecutor executor;
    private boolean initialized;
    private final GoogleApiClient peopleClient;
    private Bitmap photo;
    private final Cache photoEventCache;
    private final ThreadChecker threadChecker;

    protected UserProfilePhotoPublisher(Account account1, EventBus eventbus, ActionExecutor actionexecutor, Application application, ThreadChecker threadchecker, GoogleApiClient googleapiclient)
    {
        account = account1;
        executor = actionexecutor;
        eventBus = eventbus;
        threadChecker = threadchecker;
        peopleClient = googleapiclient;
        photoEventCache = CacheBuilder.newBuilder().maximumSize(1L).expireAfterWrite(1L, TimeUnit.DAYS).build();
    }

    private void loadImage()
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        peopleClient.registerConnectionCallbacks(this);
        peopleClient.registerConnectionFailedListener$40dd7b8f(this);
        peopleClient.connect();
    }

    private void onResult(com.google.android.gms.people.Images.LoadImageResult loadimageresult)
    {
        if (loadimageresult.getStatus().isSuccess())
        {
            if (loadimageresult.getParcelFileDescriptor() != null)
            {
                WLog.i(TAG, "Photo loaded");
                photo = PeopleClientUtil.decodeFileDescriptor(loadimageresult.getParcelFileDescriptor());
                loadimageresult = new UserProfilePhotoEvent(photo);
                photoEventCache.put(TAG, loadimageresult);
                eventBus.post(loadimageresult);
            }
        } else
        {
            String s = TAG;
            int i = loadimageresult.getStatus().getStatusCode();
            WLog.e(s, (new StringBuilder(45)).append("Could not load photo, error code: ").append(i).toString());
        }
        peopleClient.unregisterConnectionCallbacks(this);
        peopleClient.unregisterConnectionFailedListener$40dd7b8f(this);
        peopleClient.disconnect();
    }

    private void reloadImage()
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        if (!peopleClient.isConnecting() && !peopleClient.isConnected())
        {
            executor.executeAction(new Callable() {

                final UserProfilePhotoPublisher this$0;

                private Void call()
                    throws Exception
                {
                    loadImage();
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = UserProfilePhotoPublisher.this;
                super();
            }
            });
        }
    }

    public final void initialize()
    {
        if (initialized)
        {
            return;
        } else
        {
            initialized = true;
            eventBus.registerEventProducer(com/google/android/apps/wallet/p2p/people/UserProfilePhotoEvent, new RegistrationCallback() {

                final UserProfilePhotoPublisher this$0;

                public final void handleRegistration(Object obj)
                {
                    UserProfilePhotoEvent userprofilephotoevent1 = (UserProfilePhotoEvent)photoEventCache.getIfPresent(UserProfilePhotoPublisher.TAG);
                    EventBus eventbus = eventBus;
                    UserProfilePhotoEvent userprofilephotoevent;
                    if (userprofilephotoevent1 != null)
                    {
                        userprofilephotoevent = userprofilephotoevent1;
                    } else
                    {
                        userprofilephotoevent = new UserProfilePhotoEvent(photo);
                    }
                    eventbus.post(obj, userprofilephotoevent);
                    if (userprofilephotoevent1 == null)
                    {
                        reloadImage();
                    }
                }

            
            {
                this$0 = UserProfilePhotoPublisher.this;
                super();
            }
            });
            loadImage();
            return;
        }
    }

    public final void onConnected(Bundle bundle)
    {
        People.ImageApi.loadOwnerAvatar(peopleClient, account.name, null, 3, 1).setResultCallback(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        String s = TAG;
        int i = connectionresult.getErrorCode();
        WLog.e(s, (new StringBuilder(41)).append("Could not open PeopleClient %s").append(i).toString());
    }

    public final void onConnectionSuspended(int i)
    {
    }

    public final volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.people.Images.LoadImageResult)result);
    }







}
