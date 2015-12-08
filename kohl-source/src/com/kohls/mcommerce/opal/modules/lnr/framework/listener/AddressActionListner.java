// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.listener;

import java.util.List;

public interface AddressActionListner
{

    public static final String TITLE = "title";

    public abstract String getActionBarTitle();

    public abstract String getSelectedShippingId();

    public abstract List getShippingAddresses();

    public abstract void onActionBarBack();

    public abstract void onAddressSelected(com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address address);

    public abstract void performSignOut();

    public abstract void setActionBarParams(android.view.View.OnClickListener onclicklistener);

    public abstract void setShippingAddresses(List list);
}
