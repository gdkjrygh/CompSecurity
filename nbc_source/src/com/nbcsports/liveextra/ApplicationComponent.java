// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra;

import air.com.nbcuni.com.nbcsports.liveextra.MainSupportWrapperActivity;
import android.app.Application;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.ConfigurationProvider;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import com.nbcsports.liveextra.ui.core.CaptionStyle;
import com.phunware.nbc.sochi.FAQActivity;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.phunware.nbc.sochi.services.FavoriteReminderService;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.Picasso;

public interface ApplicationComponent
{

    public abstract com.nbcsports.liveextra.library.tve.Anvato.API anvato();

    public abstract Gson anvatoGson();

    public abstract AppPreferences appPreferences();

    public abstract Application application();

    public abstract CaptionPreviewHelper captionPreviewHelper();

    public abstract CaptionStyle captionStyle();

    public abstract Configuration configuration();

    public abstract ConfigurationProvider configurationProvider();

    public abstract ContentService contentService();

    public abstract AuthService entitlementService();

    public abstract FavoriteService favorites();

    public abstract Gson gson();

    public abstract void inject(MainSupportWrapperActivity mainsupportwrapperactivity);

    public abstract void inject(FAQActivity faqactivity);

    public abstract void inject(NBCSportsApplication nbcsportsapplication);

    public abstract void inject(FavoriteReminderService favoritereminderservice);

    public abstract MvpdLookups lookups();

    public abstract OkHttpClient okHttpClient();

    public abstract Picasso picasso();

    public abstract SharedPreferences preferences();

    public abstract TrackingHelper trackingHelper();
}
