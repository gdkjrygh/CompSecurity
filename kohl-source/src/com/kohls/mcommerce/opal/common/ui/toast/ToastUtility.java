// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.ui.toast;

import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;

// Referenced classes of package com.kohls.mcommerce.opal.common.ui.toast:
//            KohlsToast

public class ToastUtility
{

    public ToastUtility()
    {
    }

    public static void hideAllCustomToast()
    {
        KohlsToast.cancelAllSuperToasts();
    }

    public static void showAddToBagToastMessages(int i, String s)
    {
        KohlsToast kohlstoast = KohlsPhoneApplication.getInstance().getKohlsToast();
        kohlstoast.setDuration(3500);
        kohlstoast.setGravity(55, 0, i);
        kohlstoast.setText(s);
        kohlstoast.setTextGravity(17);
        kohlstoast.setBackground(KohlsToast.Background.GREEN);
        kohlstoast.setAnimations(KohlsToast.Animations.POPUP);
        if (!KohlsPhoneApplication.getInstance().isAppGoingToBackground())
        {
            kohlstoast.show();
        }
    }

    public static void showCustomToast(int i, String s)
    {
        KohlsToast kohlstoast = KohlsPhoneApplication.getInstance().getKohlsToast();
        kohlstoast.setDuration(3500);
        kohlstoast.setGravity(55, 0, i);
        kohlstoast.setText(s);
        kohlstoast.setTextGravity(17);
        kohlstoast.setBackground(KohlsToast.Background.GREEN);
        kohlstoast.setAnimations(KohlsToast.Animations.POPUP);
        if (!KohlsPhoneApplication.getInstance().isAppGoingToBackground())
        {
            kohlstoast.show();
        }
    }

    public static void showCustomToastBottom(String s)
    {
        KohlsToast kohlstoast = KohlsPhoneApplication.getInstance().getKohlsToast();
        kohlstoast.setDuration(2000);
        kohlstoast.setGravity(87, 0, 0);
        kohlstoast.setText(s);
        kohlstoast.setTextGravity(17);
        kohlstoast.setBackground(KohlsToast.Background.GREEN);
        kohlstoast.setAnimations(KohlsToast.Animations.POPUP);
        if (!KohlsPhoneApplication.getInstance().isAppGoingToBackground())
        {
            kohlstoast.show();
        }
    }
}
