// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.app.Activity;
import android.view.MenuItem;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.create.helper.CreateImageHelper;
import com.pinterest.activity.findfriend.util.InviteUtil;
import com.pinterest.activity.task.dialog.GetHelpDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class MenuUtils
{

    public MenuUtils()
    {
    }

    public static boolean onOptionsItemSelected(int i, Activity activity)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 2131690758 2131690770: default 68
    //                   2131690758 150
    //                   2131690759 72
    //                   2131690760 105
    //                   2131690761 319
    //                   2131690762 174
    //                   2131690763 227
    //                   2131690764 256
    //                   2131690765 284
    //                   2131690766 304
    //                   2131690767 334
    //                   2131690768 368
    //                   2131690769 402
    //                   2131690770 198;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        flag = false;
_L16:
        return flag;
_L3:
        if (MyUser.get() == null) goto _L16; else goto _L15
_L15:
        Pinalytics.a(ElementType.PROFILE_BUTTON, ComponentType.NAVIGATION);
        Events.post(new Navigation(Location.USER, MyUser.get()));
        return true;
_L4:
        Pinalytics.a(ElementType.EXPLORE_BUTTON, ComponentType.NAVIGATION);
        if (Experiments.N())
        {
            Events.post(new Navigation(Location.CONTEXTUAL_EXPLORE));
            return true;
        } else
        {
            Events.post(new Navigation(Location.EXPLORE));
            return true;
        }
_L2:
        Pinalytics.a(ElementType.NOTIFICATIONS_ICON, ComponentType.NAVIGATION);
        Events.post(new Navigation(Location.NOTIFICATIONS));
        return true;
_L6:
        Pinalytics.a(ElementType.SETTINGS_BUTTON, ComponentType.NAVIGATION);
        Events.post(new Navigation(Location.ACCOUNT_SETTINGS));
        return true;
_L14:
        Pinalytics.a(ElementType.FIND_FRIENDS_PROFILE_BUTTON, ComponentType.NAVIGATION);
        Events.post(new Navigation(Location.INVITE_FRIENDS));
        InviteUtil.setInviteSource("user_profile_navbar_find_friends");
        return true;
_L7:
        Pinalytics.a(ElementType.FINDFRIENDS_BUTTON, ComponentType.NAVIGATION);
        Events.post(new Navigation(Location.FIND_FRIENDS));
        InviteUtil.setInviteSource("user_profile_find_friends");
        return true;
_L8:
        Pinalytics.a(ElementType.SUPPORT_BUTTON, ComponentType.NAVIGATION);
        Events.post(new DialogEvent(new GetHelpDialog()));
        return true;
_L9:
        Pinalytics.a(ElementType.TOS_BUTTON, ComponentType.NAVIGATION);
        ActivityHelper.goIntentView(activity, Resources.string(0x7f07074f));
        return true;
_L10:
        Pinalytics.a(ElementType.LOGOUT_BUTTON, ComponentType.NAVIGATION);
        ActivityHelper.doLogout(activity);
        return true;
_L5:
        Pinalytics.a(ElementType.CREATE_BUTTON, ComponentType.NAVIGATION);
        CreateImageHelper.showImageSourceDialog(activity);
        return true;
_L11:
        Pinalytics.a(ElementType.ORDER_HISTORY_BUTTON, ComponentType.NAVIGATION);
        activity = new Navigation(Location.COMMERCE_SETTINGS);
        activity.putExtra("com.pinterest.EXTRA_COMMERCE_SETTINGS", "VALUE_ORDER_HISTORY");
        Events.post(activity);
        return true;
_L12:
        Pinalytics.a(ElementType.PAYMENT_METHODS_BUTTON, ComponentType.NAVIGATION);
        activity = new Navigation(Location.COMMERCE_SETTINGS);
        activity.putExtra("com.pinterest.EXTRA_COMMERCE_SETTINGS", "VALUE_PAYMENT_METHODS");
        Events.post(activity);
        return true;
_L13:
        Pinalytics.a(ElementType.SHIPPING_ADDRESSES_BUTTON, ComponentType.NAVIGATION);
        activity = new Navigation(Location.COMMERCE_SETTINGS);
        activity.putExtra("com.pinterest.EXTRA_COMMERCE_SETTINGS", "VALUE_ADDRESSES");
        Events.post(activity);
        return true;
    }

    public static boolean onOptionsItemSelected(MenuItem menuitem, Activity activity)
    {
        return onOptionsItemSelected(menuitem.getItemId(), activity);
    }
}
