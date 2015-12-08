// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import me.lyft.android.analytics.ScreenAnalytics;

public class SlideMenuController
{

    private final android.support.v4.widget.DrawerLayout.DrawerListener drawerListener = new android.support.v4.widget.DrawerLayout.DrawerListener() {

        final SlideMenuController this$0;

        public void onDrawerClosed(View view)
        {
            ScreenAnalytics.trackMenuClose();
        }

        public void onDrawerOpened(View view)
        {
            ScreenAnalytics.trackMenuOpen();
        }

        public void onDrawerSlide(View view, float f)
        {
        }

        public void onDrawerStateChanged(int i)
        {
        }

            
            {
                this$0 = SlideMenuController.this;
                super();
            }
    };
    private final DrawerLayout menuDrawer;

    public SlideMenuController(DrawerLayout drawerlayout)
    {
        menuDrawer = drawerlayout;
        menuDrawer.setDrawerListener(drawerListener);
        disableMenu();
    }

    public void close()
    {
        if (menuDrawer.f(0x800003))
        {
            menuDrawer.e(0x800003);
        }
    }

    public void disableMenu()
    {
        menuDrawer.setDrawerLockMode(1);
    }

    public void enableMenu()
    {
        menuDrawer.setDrawerLockMode(0);
    }

    public boolean isOpen()
    {
        return menuDrawer.f(0x800003);
    }

    public void open()
    {
        if (!menuDrawer.f(0x800003))
        {
            menuDrawer.d(0x800003);
        }
    }

    public void toggle()
    {
        if (isOpen())
        {
            close();
            return;
        } else
        {
            open();
            return;
        }
    }
}
