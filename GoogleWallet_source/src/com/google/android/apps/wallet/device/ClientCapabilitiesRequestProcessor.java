// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.device;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcRequestMetadataProcessor;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class ClientCapabilitiesRequestProcessor
    implements RpcRequestMetadataProcessor
{

    private static final String TAG = com/google/android/apps/wallet/device/ClientCapabilitiesRequestProcessor.getSimpleName();
    private final Application application;
    private final ImmutableSet supportedServerControlledFeatures;
    private final UriRegistry uriRegistry;

    ClientCapabilitiesRequestProcessor(UriRegistry uriregistry, ImmutableSet immutableset, Application application1)
    {
        uriRegistry = uriregistry;
        supportedServerControlledFeatures = immutableset;
        application = application1;
    }

    public final void process(com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata)
    {
        Object obj = new com.google.wallet.proto.NanoWalletTransport.ClientCapabilities();
        obj.supportsPinToken = Boolean.valueOf(true);
        obj.allowTapTargetQueryParams = Boolean.valueOf(true);
        com.google.wallet.proto.NanoWalletEntities.Features features = new com.google.wallet.proto.NanoWalletEntities.Features();
        features.features = new com.google.wallet.proto.NanoWalletEntities.Feature[supportedServerControlledFeatures.size()];
        int i = 0;
        for (com.google.common.collect.UnmodifiableIterator unmodifiableiterator = supportedServerControlledFeatures.iterator(); unmodifiableiterator.hasNext();)
        {
            Feature feature = (Feature)unmodifiableiterator.next();
            com.google.wallet.proto.NanoWalletEntities.Feature feature1 = new com.google.wallet.proto.NanoWalletEntities.Feature();
            feature1.code = feature.getFeatureCode();
            features.features[i] = feature1;
            i++;
        }

        obj.clientSupportedFeatures = features;
        requestmetadata.capabilities = ((com.google.wallet.proto.NanoWalletTransport.ClientCapabilities) (obj));
        obj = Lists.newArrayList();
        com.google.wallet.proto.NanoWalletUris.URI uri;
        for (Iterator iterator = uriRegistry.getSupportedUris().iterator(); iterator.hasNext(); ((List) (obj)).add(uri))
        {
            Integer integer = (Integer)iterator.next();
            uri = new com.google.wallet.proto.NanoWalletUris.URI();
            uri.pattern = integer;
        }

        requestmetadata.capabilities.supportedUri = (com.google.wallet.proto.NanoWalletUris.URI[])((List) (obj)).toArray(new com.google.wallet.proto.NanoWalletUris.URI[0]);
        try
        {
            obj = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128);
            if (((ApplicationInfo) (obj)).metaData != null)
            {
                requestmetadata.buildIdentifier = ((ApplicationInfo) (obj)).metaData.getString("com.google.android.apps.wallet.BuildIdentifier");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata)
        {
            obj = TAG;
        }
        requestmetadata = String.valueOf(application.getPackageName());
        if (requestmetadata.length() != 0)
        {
            requestmetadata = "Could not find package application info: ".concat(requestmetadata);
        } else
        {
            requestmetadata = new String("Could not find package application info: ");
        }
        WLog.e(((String) (obj)), requestmetadata);
    }

}
