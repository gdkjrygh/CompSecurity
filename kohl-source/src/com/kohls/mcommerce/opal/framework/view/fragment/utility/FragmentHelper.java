// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment.utility;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import java.lang.ref.WeakReference;

public class FragmentHelper
{

    private static String fragmentTag;

    public FragmentHelper()
    {
    }

    public static void addFragmentWithDefaultAnimation(WeakReference weakreference, Fragment fragment, Bundle bundle, String s)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            fragmentTag = s;
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.setCustomAnimations(0x7f050007, 0x7f050006, 0, 0);
            Logger.debug("test", (new StringBuilder()).append("goto : Total Fragment count : ").append(((Activity)weakreference.get()).getFragmentManager().getBackStackEntryCount()).toString());
            fragmenttransaction.add(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, s);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commit();
        }
    }

    public static void addFragmentWithNoAnimation(WeakReference weakreference, Fragment fragment, Bundle bundle)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.add(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, null);
            fragmenttransaction.addToBackStack(null);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commit();
        }
    }

    public static void addFragmentWithNoAnimation(WeakReference weakreference, Fragment fragment, Bundle bundle, String s)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.add(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, s);
            fragmenttransaction.addToBackStack(null);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commit();
        }
    }

    public static BaseFragment getFragmentonTop(WeakReference weakreference)
    {
        if (weakreference.get() != null)
        {
            BaseFragment basefragment = null;
            try
            {
                if (fragmentTag != null)
                {
                    basefragment = (BaseFragment)((Activity)weakreference.get()).getFragmentManager().findFragmentByTag(fragmentTag);
                }
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference)
            {
                weakreference.printStackTrace();
                return null;
            }
            return basefragment;
        } else
        {
            return null;
        }
    }

    public static void replaceFragment(WeakReference weakreference, Fragment fragment)
    {
        replaceFragment(weakreference, fragment, null);
    }

    public static void replaceFragment(WeakReference weakreference, Fragment fragment, Bundle bundle)
    {
        replaceFragmentWithDefaultAnimation(weakreference, fragment, bundle, null);
    }

    public static void replaceFragmentOnBackPress(WeakReference weakreference, Fragment fragment, Bundle bundle, String s)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            fragmentTag = s;
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.setCustomAnimations(0x7f050005, 0x7f050008, 0, 0);
            Log.d("test", (new StringBuilder()).append("goto : Total Fragment count : ").append(((Activity)weakreference.get()).getFragmentManager().getBackStackEntryCount()).toString());
            fragmenttransaction.replace(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, s);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commit();
        }
    }

    public static void replaceFragmentWithCustomAnimation(WeakReference weakreference, Fragment fragment, Bundle bundle, int i, int j, int k, int l, String s)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.setCustomAnimations(i, l, j, k);
            Log.d("test", (new StringBuilder()).append("goto : Total Fragment count : ").append(((Activity)weakreference.get()).getFragmentManager().getBackStackEntryCount()).toString());
            fragmenttransaction.replace(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, s);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commit();
        }
    }

    public static void replaceFragmentWithDefaultAnimation(WeakReference weakreference, Fragment fragment, Bundle bundle, String s)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            fragmentTag = s;
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.setCustomAnimations(0x7f050007, 0x7f050006, 0, 0);
            Logger.debug("test", (new StringBuilder()).append("goto : Total Fragment count : ").append(((Activity)weakreference.get()).getFragmentManager().getBackStackEntryCount()).toString());
            fragmenttransaction.replace(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, s);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commitAllowingStateLoss();
        }
    }

    public static void replaceFragmentWithFadeOutAnimation(WeakReference weakreference, Fragment fragment, Bundle bundle, String s)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.setCustomAnimations(0, 0x7f050004, 0, 0);
            fragmenttransaction.replace(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, s);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commit();
        }
    }

    public static void replaceFragmentWithNoAnimation(WeakReference weakreference, Fragment fragment, Bundle bundle)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.replace(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, null);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commit();
        }
    }

    public static void replaceFragmentWithStateLoss(WeakReference weakreference, Fragment fragment, Bundle bundle)
    {
        if (weakreference.get() != null && !((Activity)weakreference.get()).isFinishing())
        {
            FragmentTransaction fragmenttransaction = ((Activity)weakreference.get()).getFragmentManager().beginTransaction();
            if (bundle != null)
            {
                fragment.setArguments(bundle);
            }
            fragmenttransaction.replace(((Activity)weakreference.get()).findViewById(0x7f0d001f).getId(), fragment, null);
            fragmenttransaction.show(fragment);
            fragmenttransaction.commitAllowingStateLoss();
        }
    }
}
