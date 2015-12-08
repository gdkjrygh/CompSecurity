// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.player;

import com.adobe.mediacore.metadata.AdvertisingMetadata;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;

public interface AuditudeConfiguration
{

    public abstract AdvertisingMetadata create(AssetViewModel assetviewmodel, String s, String s1);

    public abstract void setupMidrolls(AssetViewModel assetviewmodel);

    public abstract void updateAssetId(AssetViewModel assetviewmodel);
}
