// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.interfaces;

import android.app.Activity;
import com.dominos.android.sdk.common.dom.locator.BuildingResult;
import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;
import com.dominos.android.sdk.core.models.LabsAddress;

// Referenced classes of package com.dominos.controllers.interfaces:
//            IDominosView

public interface IDominosAddressDelivery
    extends IDominosView
{

    public abstract Activity getActivity();

    public abstract void goToCart(String s, LabsAddress labsaddress);

    public abstract void hideLoading();

    public abstract void onAddressSaved(LabsAddress labsaddress, String s);

    public abstract void onGetBuildingCompleted(BuildingResult buildingresult);

    public abstract void onGetRegionCompleted(RegionResult regionresult);

    public abstract void onGetSitesCompleted(SiteResult siteresult);

    public abstract void showAddressDuplicatedAlert(String s);

    public abstract void showAddressSavingErrorAlert();

    public abstract void showLoading();

    public abstract void showLoadingSpinner();

    public abstract void showLongToast(String s);

    public abstract void showNoDeliveryAlert();

    public abstract void showStoreClosedAlert(String s, String s1, LabsAddress labsaddress);

    public abstract void showStoreConnectionError();

    public abstract void showStoreOfflineAlert(String s, String s1, LabsAddress labsaddress);
}
