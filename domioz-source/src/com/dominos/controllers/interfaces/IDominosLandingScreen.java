// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.interfaces;


// Referenced classes of package com.dominos.controllers.interfaces:
//            IDominosView

public interface IDominosLandingScreen
    extends IDominosView
{

    public abstract void analyticsUpdate();

    public abstract void dismissProgressSpinner();

    public abstract void showErrorToast();

    public abstract void showNetworkError();

    public abstract void showNoCachedAddressFragment();

    public abstract void showProfiledUserFragment();

    public abstract void showProgressSpinner();
}
