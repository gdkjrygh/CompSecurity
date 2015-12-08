// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.app.Application;
import android.text.format.DateFormat;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.device.DeviceInfoManager;
import com.google.android.apps.wallet.locale.util.Bcp47;
import com.google.android.apps.wallet.rpc.RpcRequestMetadataProcessor;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public final class WalletContextFactory
    implements RpcRequestMetadataProcessor
{

    private final int androidVersionCode;
    private final String androidVersionName;
    private final Application application;
    private final String buildId;
    private final String buildRelease;
    private final String buildTags;
    private final com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager.CloudConfig cloudConfig;
    private final DeviceInfoManager deviceInfoManager;
    private final int sdkVersion;
    private final String supportedLanguageCodes[];
    private final System system;
    private final String walletBuildType;

    WalletContextFactory(Application application1, DeviceInfoManager deviceinfomanager, String s, com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager.CloudConfig cloudconfig, System system1, List list, String s1, 
            int i, String s2, String s3, String s4, int j)
    {
        application = application1;
        deviceInfoManager = (DeviceInfoManager)Preconditions.checkNotNull(deviceinfomanager);
        walletBuildType = (String)Preconditions.checkNotNull(s);
        cloudConfig = (com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager.CloudConfig)Preconditions.checkNotNull(cloudconfig);
        system = (System)Preconditions.checkNotNull(system1);
        androidVersionName = (String)Preconditions.checkNotNull(s1);
        androidVersionCode = i;
        buildId = s2;
        buildTags = s3;
        buildRelease = s4;
        sdkVersion = j;
        supportedLanguageCodes = new String[list.size()];
        for (i = 0; i < supportedLanguageCodes.length; i++)
        {
            supportedLanguageCodes[i] = Bcp47.fromLocale((Locale)list.get(i));
        }

    }

    public final void process(com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata)
    {
        com.google.wallet.proto.NanoWalletShared.WalletContext walletcontext = new com.google.wallet.proto.NanoWalletShared.WalletContext();
        Object obj = deviceInfoManager.getUuid();
        if (obj != null)
        {
            walletcontext.walletUuid = ((String) (obj));
        }
        obj = system;
        long l = System.currentTimeMillis();
        obj = TimeZone.getDefault();
        walletcontext.androidVersionCode = Integer.toString(androidVersionCode);
        walletcontext.androidVersionName = androidVersionName;
        walletcontext.cloudConfig = cloudConfig.name();
        walletcontext.androidFeatureset = walletBuildType;
        walletcontext.buildId = buildId;
        walletcontext.buildTags = buildTags;
        walletcontext.buildRelease = buildRelease;
        walletcontext.sdkVersion = Integer.valueOf(sdkVersion);
        walletcontext.systemCurrentTimeMillis = Long.valueOf(l);
        walletcontext.systemGmtOffsetMillis = Long.valueOf(((TimeZone) (obj)).getRawOffset());
        walletcontext.timeZone = ((TimeZone) (obj)).getID();
        obj = Locale.getDefault();
        walletcontext.locale = ((Locale) (obj)).toString();
        walletcontext.languageCode = Bcp47.fromLocale(((Locale) (obj)));
        walletcontext.supportedLanguageCode = (String[])Arrays.copyOf(supportedLanguageCodes, supportedLanguageCodes.length);
        boolean flag;
        if (!DateFormat.is24HourFormat(application))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        walletcontext.twelveHourClock = Boolean.valueOf(flag);
        requestmetadata.walletContext = walletcontext;
    }
}
