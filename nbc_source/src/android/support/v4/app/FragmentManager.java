// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            FragmentTransaction, Fragment

public abstract class FragmentManager
{
    public static interface OnBackStackChangedListener
    {

        public abstract void onBackStackChanged();
    }


    public FragmentManager()
    {
    }

    public abstract FragmentTransaction beginTransaction();

    public abstract boolean executePendingTransactions();

    public abstract Fragment findFragmentById(int i);

    public abstract Fragment findFragmentByTag(String s);

    public abstract Fragment getFragment(Bundle bundle, String s);

    public abstract void popBackStack(int i, int j);

    public abstract void putFragment(Bundle bundle, String s, Fragment fragment);

    public abstract Fragment.SavedState saveFragmentInstanceState(Fragment fragment);
}
