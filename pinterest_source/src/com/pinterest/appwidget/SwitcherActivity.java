// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.content.Intent;
import android.os.Bundle;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.appwidget:
//            PWidgetHelper

public class SwitcherActivity extends BaseActivity
{

    private static final boolean ENABLE_UNAUTH_PIN = true;

    public SwitcherActivity()
    {
    }

    private void route()
    {
        Object obj = null;
        Object obj2 = getIntent();
        Object obj1 = ((Intent) (obj2)).getStringExtra("com.pinterest.EXTRA_REDIRECT");
        if ("VALUE_LOGIN".equals(obj1))
        {
            Pinalytics.a(ElementType.LOGIN_BUTTON, ComponentType.WIDGET_HEADER);
            ActivityHelper.goSplashLogin(this);
            finish();
            return;
        }
        if ("VALUE_SIGNUP".equals(obj1))
        {
            Pinalytics.a(ElementType.SIGNUP_BUTTON, ComponentType.WIDGET_HEADER);
            ActivityHelper.goSplashSignup(this);
            finish();
            return;
        }
        if ("VALUE_WELCOME".equals(obj1))
        {
            Pinalytics.a(ElementType.APP_ICON, ComponentType.WIDGET_ACTION_BAR);
            ActivityHelper.goUnauthPage(this);
            finish();
            return;
        }
        if ("VALUE_SEARCH".equals(obj1))
        {
            Pinalytics.a(ElementType.SEARCH_BUTTON, ComponentType.WIDGET_ACTION_BAR);
            if (Experiments.N())
            {
                obj = new Navigation(Location.CONTEXTUAL_EXPLORE);
            } else
            {
                obj = new Navigation(Location.EXPLORE);
            }
            obj = ActivityHelper.getTaskIntent(this, ((Navigation) (obj)));
            PWidgetHelper.addSource(((Intent) (obj2)));
            startActivity(((Intent) (obj)));
            finish();
            return;
        }
        if ("VALUE_PROFILE".equals(obj1))
        {
            Pinalytics.a(ElementType.USER_ICON, ComponentType.WIDGET_ACTION_BAR);
            obj = ActivityHelper.getTaskIntent(this, new Navigation(Location.USER, MyUser.get()));
            PWidgetHelper.addSource(((Intent) (obj2)));
            startActivity(((Intent) (obj)));
            finish();
            return;
        }
        if ("VALUE_HOME".equals(obj1))
        {
            Pinalytics.a(ElementType.APP_ICON, ComponentType.WIDGET_ACTION_BAR);
            ActivityHelper.goHome(this);
            PWidgetHelper.addSource(((Intent) (obj2)));
            finish();
            return;
        }
        if (!MyUser.hasAccessTokenAndUser())
        {
            obj = ((Intent) (obj2)).getStringExtra("com.pinterest.EXTRA_PIN_ID");
            Pinalytics.a(ElementType.PIN_SOURCE_IMAGE, ComponentType.FLOWED_PIN, ((String) (obj)));
            if (obj != null)
            {
                ActivityHelper.goUnauthPin(this, ((String) (obj)));
            } else
            {
                ActivityHelper.goSplash(this);
            }
            finish();
            return;
        }
        if (((Intent) (obj2)).hasExtra("com.pinterest.EXTRA_BOARD_ID"))
        {
            obj1 = ElementType.PIN_BOARD;
            obj = ((Intent) (obj2)).getStringExtra("com.pinterest.EXTRA_BOARD_ID");
            obj2 = new Navigation(Location.BOARD, ((String) (obj)));
        } else
        if (((Intent) (obj2)).hasExtra("com.pinterest.EXTRA_USER_ID"))
        {
            obj1 = ElementType.PIN_USER;
            obj = ((Intent) (obj2)).getStringExtra("com.pinterest.EXTRA_USER_ID");
            obj2 = new Navigation(Location.USER, ((String) (obj)));
        } else
        if (((Intent) (obj2)).hasExtra("com.pinterest.EXTRA_PIN_ID"))
        {
            obj1 = ElementType.PIN_SOURCE_IMAGE;
            obj = ((Intent) (obj2)).getStringExtra("com.pinterest.EXTRA_PIN_ID");
            obj2 = new Navigation(Location.PIN, ((String) (obj)));
        } else
        {
            obj1 = null;
            obj2 = null;
        }
        if (obj2 != null)
        {
            Pinalytics.a(((ElementType) (obj1)), ComponentType.FLOWED_PIN, ((String) (obj)));
            startActivity(PWidgetHelper.addSource(ActivityHelper.getTaskIntent(this, ((Navigation) (obj2)))));
        } else
        {
            ActivityHelper.goHome(this);
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onResume()
    {
        super.onResume();
        route();
    }
}
