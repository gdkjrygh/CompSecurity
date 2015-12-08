// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra;

import android.app.Application;
import android.content.Context;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

public class ApplicationModule
{

    private final NBCSportsApplication application;

    public ApplicationModule(NBCSportsApplication nbcsportsapplication)
    {
        application = nbcsportsapplication;
    }

    Application application()
    {
        return application;
    }

    String configurationUrl()
    {
        return "http://stream.nbcsports.com/data/mobile/configuration-liveextra-android.json";
    }

    Context context()
    {
        return application;
    }

    NBCSportsApplication getApplication()
    {
        return application;
    }

    Picasso picasso()
    {
        com.squareup.picasso.Picasso.Builder builder = new com.squareup.picasso.Picasso.Builder(application);
        builder.downloader(new OkHttpDownloader(application));
        return builder.build();
    }
}
