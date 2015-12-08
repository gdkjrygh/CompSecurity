// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package me.lyft.android.ui.settings:
//            EditPhoneVerifyNumberView, PhoneVerifyView

public class I
    implements butterknife.w..ViewInjector
{

    public volatile void inject(butterknife.w..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EditPhoneVerifyNumberView)obj, obj1);
    }

    public void inject(butterknife.w..ViewInjector viewinjector, EditPhoneVerifyNumberView editphoneverifynumberview, Object obj)
    {
        editphoneverifynumberview.phoneVerifyView = (PhoneVerifyView)viewinjector.phoneVerifyView((View)viewinjector.phoneVerifyView(obj, 0x7f0d0269, "field 'phoneVerifyView'"), 0x7f0d0269, "field 'phoneVerifyView'");
        editphoneverifynumberview.backButton = (ImageButton)viewinjector.backButton((View)viewinjector.backButton(obj, 0x7f0d0173, "field 'backButton'"), 0x7f0d0173, "field 'backButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((EditPhoneVerifyNumberView)obj);
    }

    public void reset(EditPhoneVerifyNumberView editphoneverifynumberview)
    {
        editphoneverifynumberview.phoneVerifyView = null;
        editphoneverifynumberview.backButton = null;
    }

    public I()
    {
    }
}
