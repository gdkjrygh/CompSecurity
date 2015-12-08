// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.reporting.CrashReporting;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            Fragment, FragmentManager, FragmentTransaction, TaggedFragment

public abstract class BetterFragmentStatePagerAdapter extends PagerAdapter
{

    private static final boolean DEBUG = true;
    private static final String TAG = "FragmentStatePagerAdapter".substring(0, 23);
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
    private ArrayList mFragments;
    private ArrayList mSavedState;

    public BetterFragmentStatePagerAdapter(FragmentManager fragmentmanager)
    {
        mCurTransaction = null;
        mSavedState = new ArrayList();
        mFragments = new ArrayList();
        mCurrentPrimaryItem = null;
        mFragmentManager = fragmentmanager;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (Fragment)obj;
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        Log.v(TAG, (new StringBuilder("Removing item #")).append(i).append(": f=").append(obj).append(" v=").append(((Fragment)obj).getView()).toString());
        for (; mSavedState.size() <= i; mSavedState.add(null)) { }
        if (shouldSaveFragmentState(i))
        {
            mSavedState.set(i, mFragmentManager.saveFragmentInstanceState(viewgroup));
        } else
        {
            mSavedState.set(i, null);
        }
        if (i < mFragments.size())
        {
            mFragments.set(i, null);
        }
        mCurTransaction.remove(viewgroup);
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
        if (mCurTransaction == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        mCurTransaction.commitAllowingStateLoss();
        mCurTransaction = null;
        mFragmentManager.executePendingTransactions();
        return;
        viewgroup;
        CrashReporting.a(viewgroup);
        return;
    }

    public Fragment getCurrentPrimaryItem()
    {
        return mCurrentPrimaryItem;
    }

    public ArrayList getFragments()
    {
        return mFragments;
    }

    public abstract Fragment getItem(int i);

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        if (mFragments.size() > i)
        {
            Fragment fragment = (Fragment)mFragments.get(i);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        Fragment fragment1 = getItem(i);
        Log.v(TAG, (new StringBuilder("Adding item #")).append(i).append(": f=").append(fragment1).toString());
        if (mSavedState.size() > i)
        {
            Fragment.SavedState savedstate = (Fragment.SavedState)mSavedState.get(i);
            if (savedstate != null)
            {
                fragment1.setInitialSavedState(savedstate);
            }
        }
        for (; mFragments.size() <= i; mFragments.add(null)) { }
        fragment1.setMenuVisibility(false);
        mFragments.set(i, fragment1);
        if (fragment1 instanceof TaggedFragment)
        {
            mCurTransaction.add(viewgroup.getId(), fragment1, ((TaggedFragment)fragment1).getFragmentTag());
        } else
        {
            mCurTransaction.add(viewgroup.getId(), fragment1);
        }
        return fragment1;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return ((Fragment)obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
        if (parcelable != null)
        {
            parcelable = (Bundle)parcelable;
            parcelable.setClassLoader(classloader);
            classloader = parcelable.getParcelableArray("states");
            mSavedState.clear();
            mFragments.clear();
            if (classloader != null)
            {
                for (int i = 0; i < classloader.length; i++)
                {
                    mSavedState.add((Fragment.SavedState)classloader[i]);
                }

            }
            classloader = parcelable.keySet().iterator();
            do
            {
                if (!classloader.hasNext())
                {
                    break;
                }
                String s = (String)classloader.next();
                if (s.startsWith("f"))
                {
                    int j = Integer.parseInt(s.substring(1));
                    Fragment fragment = mFragmentManager.getFragment(parcelable, s);
                    if (fragment != null)
                    {
                        for (; mFragments.size() <= j; mFragments.add(null)) { }
                        fragment.setMenuVisibility(false);
                        mFragments.set(j, fragment);
                    } else
                    {
                        Log.w(TAG, (new StringBuilder("Bad fragment at key ")).append(s).toString());
                    }
                }
            } while (true);
        }
    }

    public Parcelable saveState()
    {
        Object obj = null;
        if (mSavedState.size() > 0)
        {
            obj = new Bundle();
            Fragment.SavedState asavedstate[] = new Fragment.SavedState[mSavedState.size()];
            mSavedState.toArray(asavedstate);
            ((Bundle) (obj)).putParcelableArray("states", asavedstate);
        }
        for (int i = 0; i < mFragments.size();)
        {
            Fragment fragment = (Fragment)mFragments.get(i);
            Object obj1 = obj;
            if (fragment != null)
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new Bundle();
                }
                obj = (new StringBuilder("f")).append(i).toString();
                mFragmentManager.putFragment(((Bundle) (obj1)), ((String) (obj)), fragment);
            }
            i++;
            obj = obj1;
        }

        return ((Parcelable) (obj));
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (Fragment)obj;
        if (viewgroup != mCurrentPrimaryItem)
        {
            if (mCurrentPrimaryItem != null)
            {
                mCurrentPrimaryItem.setMenuVisibility(false);
            }
            if (viewgroup != null)
            {
                viewgroup.setMenuVisibility(true);
            }
            mCurrentPrimaryItem = viewgroup;
        }
    }

    protected boolean shouldSaveFragmentState(int i)
    {
        return true;
    }

    public void startUpdate(ViewGroup viewgroup)
    {
    }

}
