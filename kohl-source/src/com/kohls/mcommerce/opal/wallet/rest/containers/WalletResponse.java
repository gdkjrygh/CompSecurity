// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.containers:
//            WalletBaseResponse

public class WalletResponse extends WalletBaseResponse
{

    private List addedItems;
    private List currentItems;
    private List currentWalletItems;
    private List deletedWalletItems;
    private String walletEmail;
    private String walletId;

    public WalletResponse()
    {
    }

    public List getAddedItems()
    {
        return addedItems;
    }

    public List getCurrentItems()
    {
        return currentItems;
    }

    public List getDeletedWalletItems()
    {
        return deletedWalletItems;
    }

    public String getWalletEmail()
    {
        return walletEmail;
    }

    public String getWalletId()
    {
        return walletId;
    }

    public List getWalletItems()
    {
        return currentWalletItems;
    }

    public void setAddedItems(List list)
    {
        addedItems = list;
    }

    public void setCurrentItems(List list)
    {
        currentItems = list;
    }

    public void setDeletedWalletItems(List list)
    {
        deletedWalletItems = list;
    }

    public void setWalletEmail(String s)
    {
        walletEmail = s;
    }

    public void setWalletId(String s)
    {
        walletId = s;
    }

    public void setWalletItems(List list)
    {
        currentWalletItems = list;
    }
}
