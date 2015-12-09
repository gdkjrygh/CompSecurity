// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import android.app.Application;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.google.android.apps.wallet.locale.util.Bcp47;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Locale;

public class LocaleModule
{

    private static final String TAG = com/google/android/apps/wallet/locale/LocaleModule.getSimpleName();

    public LocaleModule()
    {
    }

    static List getAvailableLocales(Application application)
    {
        application = application.getResources();
        int i = application.getIdentifier("com.google.android.apps.walletnfcrel:array/available_locales", null, null);
        if (i == 0)
        {
            WLog.d(TAG, "IDE build detected, defaulting to available locales of en-US");
            return ImmutableList.of(Locale.US);
        }
        application = application.obtainTypedArray(i);
        Object obj = ImmutableList.builder();
        for (int j = 0; j < application.length(); j++)
        {
            ((com.google.common.collect.ImmutableList.Builder) (obj)).add(Bcp47.toLocale(application.getString(j)));
        }

        application.recycle();
        application = ((com.google.common.collect.ImmutableList.Builder) (obj)).build();
        obj = TAG;
        String s = String.valueOf(application);
        WLog.d(((String) (obj)), (new StringBuilder(String.valueOf(s).length() + 19)).append("Available locales: ").append(s).toString());
        return application;
    }

}
