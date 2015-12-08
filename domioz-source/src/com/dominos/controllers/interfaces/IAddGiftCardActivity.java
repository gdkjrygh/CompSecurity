// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.interfaces;

import android.app.Activity;

// Referenced classes of package com.dominos.controllers.interfaces:
//            IDominosView

public interface IAddGiftCardActivity
    extends IDominosView
{

    public abstract void dismissProgressSpinner();

    public abstract Activity getActivity();

    public abstract void removeGiftCards();

    public abstract void showAlertDialog(int i);

    public abstract void showProgressSpinner();

    public abstract void showToast(int i);

    public abstract void updateViews();
}
