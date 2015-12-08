// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.R;
import rx.b;

public class OnboardingOperations
{
    static class EmailOptIn
    {

        final boolean newsletter = true;
        final boolean productUpdates = true;
        final boolean surveys = true;

        EmailOptIn()
        {
        }
    }


    public static final String ONBOARDING_TAG = "ScOnboarding";
    private final ApiClientRx apiClientRx;
    private final R scheduler;

    public OnboardingOperations(ApiClientRx apiclientrx, R r)
    {
        apiClientRx = apiclientrx;
        scheduler = r;
    }

    public void sendEmailOptIn()
    {
        ApiRequest apirequest = ApiRequest.put(ApiEndpoints.SUBSCRIPTIONS.path()).forPrivateApi(1).withContent(new EmailOptIn()).build();
        DefaultSubscriber.fireAndForget(apiClientRx.response(apirequest).subscribeOn(scheduler));
    }
}
