// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.test.shadow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package roboguice.test.shadow:
//            ShadowFragmentActivity

class  extends FragmentTransaction
{

    final  this$1;

    public FragmentTransaction add(int i, Fragment fragment)
    {
        return null;
    }

    public FragmentTransaction add(int i, Fragment fragment, String s)
    {
        return null;
    }

    public FragmentTransaction add(Fragment fragment, String s)
    {
        return null;
    }

    public FragmentTransaction addToBackStack(String s)
    {
        return null;
    }

    public FragmentTransaction attach(Fragment fragment)
    {
        return null;
    }

    public int commit()
    {
        return 0;
    }

    public int commitAllowingStateLoss()
    {
        return 0;
    }

    public FragmentTransaction detach(Fragment fragment)
    {
        return null;
    }

    public FragmentTransaction disallowAddToBackStack()
    {
        return null;
    }

    public FragmentTransaction hide(Fragment fragment)
    {
        return null;
    }

    public boolean isAddToBackStackAllowed()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public FragmentTransaction remove(Fragment fragment)
    {
        return null;
    }

    public FragmentTransaction replace(int i, Fragment fragment)
    {
        return null;
    }

    public FragmentTransaction replace(int i, Fragment fragment, String s)
    {
        return null;
    }

    public FragmentTransaction setBreadCrumbShortTitle(int i)
    {
        return null;
    }

    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charsequence)
    {
        return null;
    }

    public FragmentTransaction setBreadCrumbTitle(int i)
    {
        return null;
    }

    public FragmentTransaction setBreadCrumbTitle(CharSequence charsequence)
    {
        return null;
    }

    public FragmentTransaction setCustomAnimations(int i, int j)
    {
        return null;
    }

    public FragmentTransaction setCustomAnimations(int i, int j, int k, int l)
    {
        return this;
    }

    public FragmentTransaction setTransition(int i)
    {
        return null;
    }

    public FragmentTransaction setTransitionStyle(int i)
    {
        return null;
    }

    public FragmentTransaction show(Fragment fragment)
    {
        return null;
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class roboguice/test/shadow/ShadowFragmentActivity$1

/* anonymous class */
    class ShadowFragmentActivity._cls1 extends FragmentManager
    {

        final ShadowFragmentActivity this$0;

        public void addOnBackStackChangedListener(android.support.v4.app.FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
        {
        }

        public FragmentTransaction beginTransaction()
        {
            return new ShadowFragmentActivity._cls1._cls1();
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
        }

        public boolean executePendingTransactions()
        {
            return false;
        }

        public Fragment findFragmentById(int i)
        {
            return null;
        }

        public Fragment findFragmentByTag(String s)
        {
            return null;
        }

        public android.support.v4.app.FragmentManager.BackStackEntry getBackStackEntryAt(int i)
        {
            return null;
        }

        public int getBackStackEntryCount()
        {
            return 0;
        }

        public Fragment getFragment(Bundle bundle, String s)
        {
            return null;
        }

        public void popBackStack()
        {
        }

        public void popBackStack(int i, int j)
        {
        }

        public void popBackStack(String s, int i)
        {
        }

        public boolean popBackStackImmediate()
        {
            return false;
        }

        public boolean popBackStackImmediate(int i, int j)
        {
            return false;
        }

        public boolean popBackStackImmediate(String s, int i)
        {
            return false;
        }

        public void putFragment(Bundle bundle, String s, Fragment fragment)
        {
        }

        public void removeOnBackStackChangedListener(android.support.v4.app.FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
        {
        }

        public android.support.v4.app.Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
        {
            return null;
        }

            
            {
                this$0 = ShadowFragmentActivity.this;
                super();
            }
    }

}
