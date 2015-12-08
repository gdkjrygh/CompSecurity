// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.interfaces;

import com.dominos.android.sdk.core.models.LabsAddress;

// Referenced classes of package com.dominos.controllers.interfaces:
//            IDominosView

public interface IDominosNewOrderFragment
    extends IDominosView
{

    public abstract void dismissProgressSpinner();

    public abstract void goToCart(String s, LabsAddress labsaddress, String s1);

    public abstract void showAddressDeliveryActivity();

    public abstract void showNetworkError();

    public abstract void showNoCarryoutAlert(String s);

    public abstract void showNoDeliveryAlert();

    public abstract void showProgressSpinner();

    public abstract void showStoreClosedAlert(String s, String s1);

    public abstract void showStoreInfoActivity();

    public abstract void showStoreListActivity();

    public abstract void showStoreOfflineAlert(String s, String s1);

    public abstract void toggleCarryout();

    public abstract void toggleDelivery();
}
