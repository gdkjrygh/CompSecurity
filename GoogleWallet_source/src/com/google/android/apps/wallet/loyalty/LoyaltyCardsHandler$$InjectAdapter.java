// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.support.v4.app.FragmentActivity;
import com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardsHandler, LoyaltyFactory, LoyaltyApiClient, LoyaltyViewHelper

public final class eChecker extends Binding
    implements Provider
{

    private Binding activity;
    private Binding imageCapturePrerequisiteChecker;
    private Binding loyaltyApiClient;
    private Binding loyaltyFactory;
    private Binding loyaltyViewHelper;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/loyalty/LoyaltyCardsHandler, getClass().getClassLoader());
        loyaltyFactory = linker.requestBinding("com.google.android.apps.wallet.loyalty.LoyaltyFactory", com/google/android/apps/wallet/loyalty/LoyaltyCardsHandler, getClass().getClassLoader());
        loyaltyApiClient = linker.requestBinding("com.google.android.apps.wallet.loyalty.LoyaltyApiClient", com/google/android/apps/wallet/loyalty/LoyaltyCardsHandler, getClass().getClassLoader());
        loyaltyViewHelper = linker.requestBinding("com.google.android.apps.wallet.loyalty.LoyaltyViewHelper", com/google/android/apps/wallet/loyalty/LoyaltyCardsHandler, getClass().getClassLoader());
        imageCapturePrerequisiteChecker = linker.requestBinding("com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker", com/google/android/apps/wallet/loyalty/LoyaltyCardsHandler, getClass().getClassLoader());
    }

    public final LoyaltyCardsHandler get()
    {
        return new LoyaltyCardsHandler((FragmentActivity)activity.get(), (LoyaltyFactory)loyaltyFactory.get(), (LoyaltyApiClient)loyaltyApiClient.get(), (LoyaltyViewHelper)loyaltyViewHelper.get(), (ImageCapturePrerequisiteChecker)imageCapturePrerequisiteChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(loyaltyFactory);
        set.add(loyaltyApiClient);
        set.add(loyaltyViewHelper);
        set.add(imageCapturePrerequisiteChecker);
    }

    public eChecker()
    {
        super("com.google.android.apps.wallet.loyalty.LoyaltyCardsHandler", "members/com.google.android.apps.wallet.loyalty.LoyaltyCardsHandler", false, com/google/android/apps/wallet/loyalty/LoyaltyCardsHandler);
    }
}
