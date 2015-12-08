// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import android.app.Activity;
import com.pinterest.activity.commerce.CommerceSettingsFragment;
import com.pinterest.activity.commerce.dialog.CommerceOptionsDialog;
import com.pinterest.activity.pin.view.modules.PinCloseupCommerceModule;

// Referenced classes of package com.pinterest.di.components:
//            ApplicationComponent

public interface ActivityComponent
    extends ApplicationComponent
{

    public abstract Activity activity();

    public abstract void inject(CommerceSettingsFragment commercesettingsfragment);

    public abstract void inject(CommerceOptionsDialog commerceoptionsdialog);

    public abstract void inject(PinCloseupCommerceModule pincloseupcommercemodule);
}
