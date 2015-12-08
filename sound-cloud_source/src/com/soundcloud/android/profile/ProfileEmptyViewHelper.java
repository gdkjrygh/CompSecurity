// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.view.EmptyView;

class ProfileEmptyViewHelper
{

    private final AccountOperations accountOperations;

    public ProfileEmptyViewHelper(AccountOperations accountoperations)
    {
        accountOperations = accountoperations;
    }

    private boolean isLoggedInUser(Urn urn)
    {
        return accountOperations.isLoggedInUser(urn);
    }

    public void configureBuilderForUserDetails(EmptyView emptyview, Urn urn)
    {
        if (isLoggedInUser(urn))
        {
            emptyview.setMessageText(0x7f07014c);
            emptyview.setSecondaryText(0x7f07014d);
            emptyview.setImage(0x7f020102);
            return;
        } else
        {
            emptyview.setMessageText(0x7f07014b);
            emptyview.setImage(0x7f0200ff);
            return;
        }
    }
}
