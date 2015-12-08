// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class FixedFragmentStatePagerAdapter extends PagerAdapter
{

    private static final String TAG = com/google/android/apps/wallet/purchaserecord/FixedFragmentStatePagerAdapter.getSimpleName();
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
    private ArrayList mFragments;
    private String mItemIds[];
    private ArrayList mSavedState;

    public FixedFragmentStatePagerAdapter(FragmentManager fragmentmanager)
    {
        mCurTransaction = null;
        mItemIds = new String[0];
        mSavedState = new ArrayList();
        mFragments = new ArrayList();
        mCurrentPrimaryItem = null;
        mFragmentManager = fragmentmanager;
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (Fragment)obj;
        if (mCurTransaction == null)
        {
            mCurTransaction = mFragmentManager.beginTransaction();
        }
        i = getItemPosition(obj);
        if (i >= 0)
        {
            for (; mSavedState.size() <= i; mSavedState.add(null)) { }
            mSavedState.set(i, mFragmentManager.saveFragmentInstanceState(viewgroup));
            mFragments.set(i, null);
        }
        mCurTransaction.remove(viewgroup);
    }

    public final void finishUpdate(ViewGroup viewgroup)
    {
        if (mCurTransaction != null)
        {
            mCurTransaction.commitAllowingStateLoss();
            mCurTransaction = null;
            mFragmentManager.executePendingTransactions();
        }
    }

    public abstract Fragment getItem(int i);

    public abstract String getItemId(int i);

    public final Object instantiateItem(ViewGroup viewgroup, int i)
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
        if (mSavedState.size() > i)
        {
            android.support.v4.app.Fragment.SavedState savedstate = (android.support.v4.app.Fragment.SavedState)mSavedState.get(i);
            if (savedstate != null)
            {
                fragment1.setInitialSavedState(savedstate);
            }
        }
        for (; mFragments.size() <= i; mFragments.add(null)) { }
        fragment1.setMenuVisibility(false);
        mFragments.set(i, fragment1);
        mCurTransaction.add(viewgroup.getId(), fragment1);
        return fragment1;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return ((Fragment)obj).getView() == view;
    }

    public final void notifyDataSetChanged()
    {
label0:
        {
            String as[] = new String[getCount()];
            for (int i = 0; i < as.length; i++)
            {
                as[i] = getItemId(i);
            }

            if (Arrays.equals(mItemIds, as))
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
label1:
            for (int k = 0; k < mItemIds.length; k++)
            {
                int l;
label2:
                {
                    byte byte0 = -2;
                    int j = 0;
                    android.support.v4.app.Fragment.SavedState savedstate;
label3:
                    do
                    {
label4:
                        {
                            l = byte0;
                            if (j < as.length)
                            {
                                if (!Objects.equal(mItemIds[k], as[j]))
                                {
                                    break label4;
                                }
                                l = j;
                            }
                            if (l < 0)
                            {
                                continue label1;
                            }
                            if (k >= mSavedState.size())
                            {
                                break label2;
                            }
                            savedstate = (android.support.v4.app.Fragment.SavedState)mSavedState.get(k);
                            if (savedstate == null)
                            {
                                break label2;
                            }
                            for (; arraylist.size() <= l; arraylist.add(null)) { }
                            break label3;
                        }
                        j++;
                    } while (true);
                    arraylist.set(l, savedstate);
                }
                if (k >= mFragments.size())
                {
                    continue;
                }
                Fragment fragment = (Fragment)mFragments.get(k);
                if (fragment == null)
                {
                    continue;
                }
                for (; arraylist1.size() <= l; arraylist1.add(null)) { }
                arraylist1.set(l, fragment);
            }

            mItemIds = as;
            mSavedState = arraylist;
            mFragments = arraylist1;
        }
        super.notifyDataSetChanged();
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
        if (parcelable != null)
        {
            Bundle bundle = (Bundle)parcelable;
            bundle.setClassLoader(classloader);
            mItemIds = bundle.getStringArray("itemids");
            if (mItemIds == null)
            {
                mItemIds = new String[0];
            }
            parcelable = bundle.getParcelableArray("states");
            mSavedState.clear();
            mFragments.clear();
            if (parcelable != null)
            {
                for (int i = 0; i < parcelable.length; i++)
                {
                    mSavedState.add((android.support.v4.app.Fragment.SavedState)parcelable[i]);
                }

            }
            classloader = bundle.keySet().iterator();
            do
            {
                if (!classloader.hasNext())
                {
                    break;
                }
                parcelable = (String)classloader.next();
                if (parcelable.startsWith("f"))
                {
                    int j = Integer.parseInt(parcelable.substring(1));
                    Fragment fragment = mFragmentManager.getFragment(bundle, parcelable);
                    if (fragment != null)
                    {
                        for (; mFragments.size() <= j; mFragments.add(null)) { }
                        fragment.setMenuVisibility(false);
                        mFragments.set(j, fragment);
                    } else
                    {
                        String s = TAG;
                        parcelable = String.valueOf(parcelable);
                        if (parcelable.length() != 0)
                        {
                            parcelable = "Bad fragment at key ".concat(parcelable);
                        } else
                        {
                            parcelable = new String("Bad fragment at key ");
                        }
                        WLog.w(s, parcelable);
                    }
                }
            } while (true);
        }
    }

    public final Parcelable saveState()
    {
        Bundle bundle = new Bundle();
        if (mItemIds.length > 0)
        {
            bundle.putStringArray("itemids", mItemIds);
        }
        if (mSavedState.size() > 0)
        {
            android.support.v4.app.Fragment.SavedState asavedstate[] = new android.support.v4.app.Fragment.SavedState[mSavedState.size()];
            mSavedState.toArray(asavedstate);
            bundle.putParcelableArray("states", asavedstate);
        }
        for (int i = 0; i < mFragments.size(); i++)
        {
            Fragment fragment = (Fragment)mFragments.get(i);
            if (fragment != null)
            {
                String s = (new StringBuilder(12)).append("f").append(i).toString();
                mFragmentManager.putFragment(bundle, s, fragment);
            }
        }

        return bundle;
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

}
