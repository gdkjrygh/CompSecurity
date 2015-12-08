// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.Toggle;

// Referenced classes of package me.lyft.android.ui:
//            MenuView

public class ener
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (MenuView)obj, obj1);
    }

    public void inject(butterknife.jector jector, final MenuView target, Object obj)
    {
        target.fullNameTextView = (TextView)jector.eTextView((View)jector.eTextView(obj, 0x7f0d0278, "field 'fullNameTextView'"), 0x7f0d0278, "field 'fullNameTextView'");
        View view = (View)jector.eTextView(obj, 0x7f0d027a, "field 'homeNavigationItem' and method 'onMenuItemSelected'");
        target.homeNavigationItem = (RadioButton)jector.igationItem(view, 0x7f0d027a, "field 'homeNavigationItem'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
        view = (View)jector.jector(obj, 0x7f0d027b, "field 'inviteNavigationItem' and method 'onMenuItemSelected'");
        target.inviteNavigationItem = (RadioButton)jector.avigationItem(view, 0x7f0d027b, "field 'inviteNavigationItem'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
        view = (View)jector.jector(obj, 0x7f0d027c, "field 'rideHistoryNavigationItem' and method 'onMenuItemSelected'");
        target.rideHistoryNavigationItem = (RadioButton)jector.toryNavigationItem(view, 0x7f0d027c, "field 'rideHistoryNavigationItem'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
        view = (View)jector.jector(obj, 0x7f0d027d, "field 'paymentNavigationItem' and method 'onMenuItemSelected'");
        target.paymentNavigationItem = (RadioButton)jector.NavigationItem(view, 0x7f0d027d, "field 'paymentNavigationItem'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
        view = (View)jector.jector(obj, 0x7f0d027e, "field 'helpNavigationItem' and method 'onMenuItemSelected'");
        target.helpNavigationItem = (RadioButton)jector.igationItem(view, 0x7f0d027e, "field 'helpNavigationItem'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
        view = (View)jector.jector(obj, 0x7f0d027f, "field 'settingsNavigationItem' and method 'onMenuItemSelected'");
        target.settingsNavigationItem = (RadioButton)jector.sNavigationItem(view, 0x7f0d027f, "field 'settingsNavigationItem'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
        view = (View)jector.jector(obj, 0x7f0d0282, "field 'developmentNavigationItem' and method 'onMenuItemSelected'");
        target.developmentNavigationItem = (RadioButton)jector.mentNavigationItem(view, 0x7f0d0282, "field 'developmentNavigationItem'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
        target.photoImageView = (ImageView)jector.ageView((View)jector.ageView(obj, 0x7f0d0277, "field 'photoImageView'"), 0x7f0d0277, "field 'photoImageView'");
        target.menuSelectorRadioGroup = (RadioGroup)jector.ectorRadioGroup((View)jector.ectorRadioGroup(obj, 0x7f0d0279, "field 'menuSelectorRadioGroup'"), 0x7f0d0279, "field 'menuSelectorRadioGroup'");
        target.modeSwitchToggle = (Toggle)jector.tchToggle((View)jector.tchToggle(obj, 0x7f0d0281, "field 'modeSwitchToggle'"), 0x7f0d0281, "field 'modeSwitchToggle'");
        view = (View)jector.tchToggle(obj, 0x7f0d0280, "field 'driverModeSwitcherView' and method 'onMenuItemSelected'");
        target.driverModeSwitcherView = (LinearLayout)jector.odeSwitcherView(view, 0x7f0d0280, "field 'driverModeSwitcherView'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
        ((View)jector.jector(obj, 0x7f0d0276, "method 'onMenuItemSelected'")).setOnClickListener(new DebouncingOnClickListener() {

            final MenuView..ViewInjector this$0;
            final MenuView val$target;

            public void doClick(View view1)
            {
                target.onMenuItemSelected(view1);
            }

            
            {
                this$0 = MenuView..ViewInjector.this;
                target = menuview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((MenuView)obj);
    }

    public void reset(MenuView menuview)
    {
        menuview.fullNameTextView = null;
        menuview.homeNavigationItem = null;
        menuview.inviteNavigationItem = null;
        menuview.rideHistoryNavigationItem = null;
        menuview.paymentNavigationItem = null;
        menuview.helpNavigationItem = null;
        menuview.settingsNavigationItem = null;
        menuview.developmentNavigationItem = null;
        menuview.photoImageView = null;
        menuview.menuSelectorRadioGroup = null;
        menuview.modeSwitchToggle = null;
        menuview.driverModeSwitcherView = null;
    }

    public ener()
    {
    }
}
