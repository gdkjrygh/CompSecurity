// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.base.fragment.WalletFragment;

public abstract class ActivationFragment extends WalletFragment
{
    public static interface NavListener
    {

        public abstract void onRequestNav(NavState navstate);
    }

    public static final class NavState extends Enum
    {

        private static final NavState $VALUES[];
        public static final NavState ACTIVATE;
        public static final NavState CONGRATULATIONS;
        public static final NavState HOW_IT_WORKS;
        public static final NavState UNINITIALIZED;

        public static NavState valueOf(String s)
        {
            return (NavState)Enum.valueOf(com/google/android/apps/wallet/plastic/ActivationFragment$NavState, s);
        }

        public static NavState[] values()
        {
            return (NavState[])$VALUES.clone();
        }

        static 
        {
            UNINITIALIZED = new NavState("UNINITIALIZED", 0);
            ACTIVATE = new NavState("ACTIVATE", 1);
            HOW_IT_WORKS = new NavState("HOW_IT_WORKS", 2);
            CONGRATULATIONS = new NavState("CONGRATULATIONS", 3);
            $VALUES = (new NavState[] {
                UNINITIALIZED, ACTIVATE, HOW_IT_WORKS, CONGRATULATIONS
            });
        }

        private NavState(String s, int i)
        {
            super(s, i);
        }
    }


    private NavListener mNavListener;

    public ActivationFragment()
    {
    }

    protected final void requestNav(NavState navstate)
    {
        if (mNavListener != null)
        {
            mNavListener.onRequestNav(navstate);
        }
    }

    public final void setNavListener(NavListener navlistener)
    {
        mNavListener = navlistener;
    }
}
