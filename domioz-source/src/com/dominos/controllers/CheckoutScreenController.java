// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.controllers.interfaces.IDominosCheckoutScreen;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;

public class CheckoutScreenController
    implements IDominosViewController
{

    IDominosCheckoutScreen view;

    public CheckoutScreenController()
    {
    }

    public void dispose()
    {
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        view = (IDominosCheckoutScreen)idominosview;
        return this;
    }
}
