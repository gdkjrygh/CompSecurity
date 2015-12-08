// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

public class WobsClient
{

    private static final String TAG = com/google/android/apps/wallet/wobs/provider/WobsClient.getSimpleName();
    private final AppControl appControl;
    private final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters contextParameters;
    private final FeatureManager featureManager;
    private final RpcCaller rpcCaller;
    private final UserEventLogger userEventLogger;

    WobsClient(RpcCaller rpccaller, com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters, AppControl appcontrol, FeatureManager featuremanager, UserEventLogger usereventlogger)
    {
        rpcCaller = rpccaller;
        contextParameters = layoutcontextparameters;
        appControl = appcontrol;
        featureManager = featuremanager;
        userEventLogger = usereventlogger;
    }

    private Iterable getAllEntryPoints()
    {
        java.util.HashSet hashset = Sets.newHashSet(LayoutMatcher.WOBS_ENTRY_POINT_NAMES);
        Iterables.addAll(hashset, Splitter.on(",").omitEmptyStrings().trimResults().split(appControl.getString(AppControlKey.WOB_EXTRA_ENTRY_POINTS)));
        return hashset;
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.DeleteWobResponse deleteWob(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletWobs.DeleteWobRequest deletewobrequest = new com.google.wallet.proto.api.NanoWalletWobs.DeleteWobRequest();
        deletewobrequest.holderVersion = wobinstance.holderVersion;
        deletewobrequest.instanceVersion = wobinstance.version;
        deletewobrequest.instanceId = wobinstance.id;
        return (com.google.wallet.proto.api.NanoWalletWobs.DeleteWobResponse)rpcCaller.call("b/wobs/delete", deletewobrequest, new com.google.wallet.proto.api.NanoWalletWobs.DeleteWobResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse performWobsAction(String s)
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionRequest performwobsactionrequest = new com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionRequest();
        performwobsactionrequest.actionUri = s;
        performwobsactionrequest.renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
        performwobsactionrequest.renderInfo.contextParameters = contextParameters;
        performwobsactionrequest.renderInfo.entrypointNames = (String[])Iterables.toArray(getAllEntryPoints(), java/lang/String);
        return (com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse)rpcCaller.call("b/wobs/performWobsAction", performwobsactionrequest, new com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse());
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.UpdateInstanceNotificationSettingsResponse updateInstanceNotificationSettings(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance, boolean flag)
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletWobs.UpdateInstanceNotificationSettingsRequest updateinstancenotificationsettingsrequest = new com.google.wallet.proto.api.NanoWalletWobs.UpdateInstanceNotificationSettingsRequest();
        updateinstancenotificationsettingsrequest.instanceId = wobinstance.id;
        updateinstancenotificationsettingsrequest.instanceVersion = wobinstance.version;
        updateinstancenotificationsettingsrequest.holderVersion = wobinstance.holderVersion;
        wobinstance = new com.google.wallet.proto.NanoWalletObjects.WobNotificationSettings();
        wobinstance.geofencedNotificationsEnabled = Boolean.valueOf(flag);
        updateinstancenotificationsettingsrequest.notificationSettings = wobinstance;
        return (com.google.wallet.proto.api.NanoWalletWobs.UpdateInstanceNotificationSettingsResponse)rpcCaller.call("b/wobs/updateInstanceNotificationSettings", updateinstancenotificationsettingsrequest, new com.google.wallet.proto.api.NanoWalletWobs.UpdateInstanceNotificationSettingsResponse());
    }

}
