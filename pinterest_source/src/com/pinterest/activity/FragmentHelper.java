// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.kit.activity.DialogHostActivity;
import com.pinterest.ui.ViewHelper;

public class FragmentHelper
{

    public FragmentHelper()
    {
    }

    public static void addFragment(FragmentManager fragmentmanager, int i, Fragment fragment)
    {
        fragmentmanager = getFragmentTransaction(fragmentmanager, Animation.DEFAULT);
        fragmentmanager.add(i, fragment);
        fragmentmanager.commit();
    }

    public static int getCloseupWidth()
    {
        int j = (int)Device.getScreenWidth();
        int i = j;
        if (Device.hasBigScreen())
        {
            if (Device.isLandscape())
            {
                i = (int)((float)j * 0.7F);
            } else
            {
                i = j;
                if (Device.isTablet())
                {
                    return (int)((float)j * 0.8F);
                }
            }
        }
        return i;
    }

    public static int getDesiredWidth()
    {
        int j = (int)Device.getScreenWidth();
        int i = j;
        if (Device.hasBigScreen())
        {
            if (Device.isLandscape())
            {
                i = (int)((float)j * 0.7F);
            } else
            {
                i = j;
                if (!Device.isTablet())
                {
                    return j - Constants.MARGIN * 2;
                }
            }
        }
        return i;
    }

    private static FragmentTransaction getFragmentTransaction(FragmentManager fragmentmanager, Animation animation)
    {
        fragmentmanager = fragmentmanager.beginTransaction();
        if (fragmentmanager != null)
        {
            if (animation == Animation.FADE)
            {
                fragmentmanager.setCustomAnimations(0x7f04000b, 0x7f04000f, 0x7f040008, 0x7f040009);
            } else
            {
                if (animation == Animation.SLIDE)
                {
                    fragmentmanager.setCustomAnimations(0x7f04001e, 0x7f040021, 0x7f040019, 0x7f04001a);
                    return fragmentmanager;
                }
                if (animation == Animation.MODAL)
                {
                    fragmentmanager.setCustomAnimations(0x7f04001b, 0x7f040020, 0x7f04001b, 0x7f040020);
                    return fragmentmanager;
                }
                if (animation == Animation.DEFAULT)
                {
                    fragmentmanager.setCustomAnimations(0x7f04000a, 0x7f04000e, 0x7f040008, 0x7f040009);
                    return fragmentmanager;
                }
                if (animation == Animation.MODAL_OUT)
                {
                    fragmentmanager.setCustomAnimations(0, 0, 0, 0x7f040020);
                    return fragmentmanager;
                }
            }
        }
        return fragmentmanager;
    }

    public static boolean isActivityRestored(Fragment fragment)
    {
        if (fragment == null)
        {
            return false;
        }
        fragment = fragment.getActivity();
        if (fragment instanceof DialogHostActivity)
        {
            return ((DialogHostActivity)fragment).isRestored();
        } else
        {
            return true;
        }
    }

    public static void removeFragment(FragmentManager fragmentmanager, Fragment fragment)
    {
        fragmentmanager = getFragmentTransaction(fragmentmanager, Animation.DEFAULT);
        fragmentmanager.remove(fragment);
        fragmentmanager.commit();
    }

    public static void replaceFragment(Fragment fragment, int i, Fragment fragment1, boolean flag)
    {
        replaceFragment(fragment, i, fragment1, flag, Animation.DEFAULT);
    }

    public static void replaceFragment(Fragment fragment, int i, Fragment fragment1, boolean flag, Animation animation)
    {
        replaceFragment(fragment.getChildFragmentManager(), i, fragment1, flag, animation);
    }

    public static void replaceFragment(Fragment fragment, Fragment fragment1, boolean flag)
    {
        replaceFragment(fragment, 0x7f0f0085, fragment1, flag);
    }

    public static void replaceFragment(FragmentActivity fragmentactivity, Fragment fragment, boolean flag)
    {
        replaceFragment(fragmentactivity.getSupportFragmentManager(), 0x7f0f0085, fragment, flag, Animation.DEFAULT);
    }

    public static void replaceFragment(FragmentActivity fragmentactivity, Fragment fragment, boolean flag, Animation animation)
    {
        replaceFragment(fragmentactivity.getSupportFragmentManager(), 0x7f0f0085, fragment, flag, animation);
    }

    public static void replaceFragment(FragmentManager fragmentmanager, int i, Fragment fragment, boolean flag, Animation animation)
    {
        if (isActivityRestored(fragment))
        {
            animation = getFragmentTransaction(fragmentmanager, animation);
            fragmentmanager = fragmentmanager.findFragmentById(i);
            if (fragment != null)
            {
                animation.replace(i, fragment);
            } else
            if (fragmentmanager != null)
            {
                animation.remove(fragmentmanager);
            }
            if (flag)
            {
                animation.addToBackStack(null);
            }
            if (!animation.isEmpty())
            {
                animation.commit();
            }
            if (fragmentmanager instanceof BaseFragment)
            {
                ((BaseFragment)fragmentmanager).setActive(false);
            }
            if (fragment instanceof BaseFragment)
            {
                Pinalytics.a(fragment);
                ((BaseFragment)fragment).setActive(true);
                return;
            }
        }
    }

    public static void replaceFragment(FragmentManager fragmentmanager, Fragment fragment, boolean flag)
    {
        replaceFragment(fragmentmanager, 0x7f0f0085, fragment, flag, Animation.DEFAULT);
    }

    public static void updateFragmentWidth(Activity activity)
    {
        if (activity != null && Device.hasBigScreen())
        {
            ViewHelper.updateViewWidth(activity.findViewById(0x7f0f0085), getDesiredWidth());
        }
    }

    private class Animation extends Enum
    {

        private static final Animation $VALUES[];
        public static final Animation DEFAULT;
        public static final Animation FADE;
        public static final Animation MODAL;
        public static final Animation MODAL_OUT;
        public static final Animation NONE;
        public static final Animation SLIDE;

        public static Animation valueOf(String s)
        {
            return (Animation)Enum.valueOf(com/pinterest/activity/FragmentHelper$Animation, s);
        }

        public static Animation[] values()
        {
            return (Animation[])$VALUES.clone();
        }

        static 
        {
            NONE = new Animation("NONE", 0);
            DEFAULT = new Animation("DEFAULT", 1);
            FADE = new Animation("FADE", 2);
            SLIDE = new Animation("SLIDE", 3);
            MODAL = new Animation("MODAL", 4);
            MODAL_OUT = new Animation("MODAL_OUT", 5);
            $VALUES = (new Animation[] {
                NONE, DEFAULT, FADE, SLIDE, MODAL, MODAL_OUT
            });
        }

        private Animation(String s, int i)
        {
            super(s, i);
        }
    }

}
