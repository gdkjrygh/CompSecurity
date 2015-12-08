// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragment;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.widget.finsky.PlayTabContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            TabSpec, InboxCountAdapter

public final class GamesFragmentPagerAdapter extends FragmentPagerAdapter
    implements InboxCountAdapter.InboxCountAdapterProvider
{
    public static class GamesFragmentPageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        private final GamesFragmentPagerAdapter mPagerAdapter;
        private final PlayTabContainer mTabContainer;
        private final ViewPager mViewPager;

        public final void logClick(int i)
        {
            Object obj = mPagerAdapter.getTabSpecAt(i);
            if (obj != null && ((TabSpec) (obj)).args != null && ((TabSpec) (obj)).args.containsKey("FRAGMENT_TAGS"))
            {
                int j = ((TabSpec) (obj)).args.getInt("FRAGMENT_TAGS");
                obj = mPagerAdapter.getFragmentAt(i);
                if (obj != null)
                {
                    Asserts.checkState(obj instanceof GamesFragment);
                    GamesFragmentActivity gamesfragmentactivity = (GamesFragmentActivity)((Fragment) (obj)).mActivity;
                    gamesfragmentactivity.startNewImpression(((Fragment) (obj)).mView);
                    gamesfragmentactivity.logClickEvent(j, ((Fragment) (obj)).mView);
                }
            }
        }

        public final void onPageScrollStateChanged(int i)
        {
            mTabContainer.mScrollState = i;
            i;
            JVM INSTR tableswitch 0 2: default 36
        //                       0 65
        //                       1 64
        //                       2 64;
               goto _L1 _L2 _L3 _L3
_L3:
            break; /* Loop/switch isn't completed */
_L1:
            GamesLog.wtf(mPagerAdapter.mContext, "GFragmentPageChangeListener", (new StringBuilder("onPageScrollStateChanged(): unexpected state:")).append(i).toString());
_L5:
            return;
_L2:
            i = mViewPager.mCurItem;
            Fragment fragment = mPagerAdapter.getFragmentAt(i);
            if (fragment instanceof OnPageScrolledToListener)
            {
                ((OnPageScrolledToListener)fragment).onPageScrolledTo();
                return;
            }
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void onPageScrolled(int i, float f, int j)
        {
            mTabContainer.onPageScrolled(i, f, j);
            for (Iterator iterator = mPagerAdapter.getFragments().iterator(); iterator.hasNext(); iterator.next()) { }
        }

        public void onPageSelected(int i)
        {
            Fragment fragment = mPagerAdapter.getFragmentAt(i);
            if (fragment instanceof OnPageScrolledToListener)
            {
                ((OnPageScrolledToListener)fragment).onPageSelected();
            }
            logClick(i);
            mTabContainer.onPageSelected(i);
            if (PlatformVersion.checkVersion(16))
            {
                mViewPager.getRootView().announceForAccessibility(mPagerAdapter.mContext.getString(0x7f100089, new Object[] {
                    mPagerAdapter.getPageTitle(i)
                }));
            }
        }

        public GamesFragmentPageChangeListener(ViewPager viewpager, GamesFragmentPagerAdapter gamesfragmentpageradapter, PlayTabContainer playtabcontainer)
        {
            mViewPager = viewpager;
            mPagerAdapter = gamesfragmentpageradapter;
            mTabContainer = playtabcontainer;
        }
    }

    public static interface OnFragmentCreatedListener
    {

        public abstract void onFragmentCreated(Fragment fragment, int i);
    }

    public static interface OnPageScrolledToListener
    {

        public abstract void onPageScrolledTo();

        public abstract void onPageSelected();
    }

    public static interface ViewPagerWidthAdapter
    {

        public abstract float getPageWidth$13461e();
    }


    Context mContext;
    public OnFragmentCreatedListener mFragmentCreatedListener;
    private FragmentManager mFragmentManager;
    private SparseArray mFragmentSparseArray;
    private InboxCountAdapter mInboxCountAdapter;
    public boolean mNotifyOnChange;
    private ArrayList mTabSpecList;
    private ViewPagerWidthAdapter mWidthAdapter;

    public GamesFragmentPagerAdapter(Context context, FragmentManager fragmentmanager, TabSpec atabspec[], ViewPagerWidthAdapter viewpagerwidthadapter)
    {
        this(context, fragmentmanager, atabspec, null, null);
    }

    public GamesFragmentPagerAdapter(Context context, FragmentManager fragmentmanager, TabSpec atabspec[], ViewPagerWidthAdapter viewpagerwidthadapter, InboxCountAdapter inboxcountadapter)
    {
        boolean flag = true;
        super(fragmentmanager);
        mNotifyOnChange = true;
        mContext = context;
        mFragmentManager = fragmentmanager;
        mWidthAdapter = viewpagerwidthadapter;
        mInboxCountAdapter = inboxcountadapter;
        Asserts.checkNotNull(atabspec);
        mTabSpecList = new ArrayList(Arrays.asList(atabspec));
        if (atabspec.length != mTabSpecList.size())
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mFragmentSparseArray = new SparseArray(atabspec.length);
    }

    public final void addFragment(TabSpec tabspec)
    {
        if (!mTabSpecList.contains(tabspec))
        {
            mTabSpecList.add(tabspec);
            if (mNotifyOnChange)
            {
                notifyDataSetChanged();
                return;
            }
        }
    }

    public final int getCount()
    {
        Asserts.checkNotNull(mTabSpecList);
        return mTabSpecList.size();
    }

    public final Fragment getFragmentAt(int i)
    {
        boolean flag1 = true;
        if (mTabSpecList.size() != 0) goto _L2; else goto _L1
_L1:
        Fragment fragment = null;
_L4:
        return fragment;
_L2:
        Fragment fragment1;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (i < mTabSpecList.size())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        fragment1 = (Fragment)mFragmentSparseArray.get(i);
        fragment = fragment1;
        if (fragment1 == null) goto _L4; else goto _L3
_L3:
        if (fragment1.mDetached)
        {
            break; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (!fragment1.mRemoving) goto _L4; else goto _L5
_L5:
        return null;
    }

    public final ArrayList getFragments()
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        for (int j = mTabSpecList.size(); i < j; i++)
        {
            Fragment fragment = (Fragment)mFragmentSparseArray.get(i);
            if (fragment != null && !fragment.mDetached && !fragment.mRemoving)
            {
                arraylist.add(fragment);
            }
        }

        return arraylist;
    }

    public final InboxCountAdapter getInboxCountAdapter()
    {
        return mInboxCountAdapter;
    }

    public final Fragment getItem(int i)
    {
        boolean flag1 = true;
        Object obj;
        Object obj1;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (i < mTabSpecList.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        obj = (TabSpec)mTabSpecList.get(i);
        obj1 = ((TabSpec) (obj)).fragmentClass;
        Asserts.checkNotNull(obj1);
        try
        {
            obj1 = (Fragment)((Class) (obj1)).newInstance();
            ((Fragment) (obj1)).setArguments(((TabSpec) (obj)).args);
            if (mFragmentCreatedListener != null)
            {
                mFragmentCreatedListener.onFragmentCreated(((Fragment) (obj1)), i);
            }
        }
        catch (InstantiationException instantiationexception)
        {
            throw new IllegalArgumentException((new StringBuilder("Couldn't instantiate Fragment at pos ")).append(i).append(": ").append(instantiationexception).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalArgumentException((new StringBuilder("Couldn't instantiate Fragment at pos ")).append(i).append(": ").append(illegalaccessexception).toString());
        }
        obj = (Fragment)mFragmentSparseArray.get(i);
        if (obj != null)
        {
            GamesLog.w("GFragmentPagerAdapter", "getItem(): fragment at this position was already instantiated!");
            GamesLog.w("GFragmentPagerAdapter", (new StringBuilder("  - position: ")).append(i).toString());
            GamesLog.w("GFragmentPagerAdapter", (new StringBuilder("  - previous instance: ")).append(obj).toString());
            GamesLog.w("GFragmentPagerAdapter", (new StringBuilder("  - new instance:      ")).append(obj1).toString());
        }
        if (obj == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "getItem(): fragment at this position was already instantiated!");
        mFragmentSparseArray.append(i, obj1);
        return ((Fragment) (obj1));
    }

    public final CharSequence getPageTitle(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (i < mTabSpecList.size())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        i = ((TabSpec)mTabSpecList.get(i)).titleResId;
        return mContext.getResources().getString(i).toUpperCase(Locale.getDefault());
    }

    public final float getPageWidth$13461e()
    {
        if (mWidthAdapter != null)
        {
            return mWidthAdapter._mth13461e();
        } else
        {
            return 1.0F;
        }
    }

    public final TabSpec getTabSpecAt(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (i < mTabSpecList.size())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return (TabSpec)mTabSpecList.get(i);
    }

    public final void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        mNotifyOnChange = true;
    }

    public final void restoreState$2cb49ec(Parcelable parcelable)
    {
        parcelable = ((Bundle)parcelable).getStringArray("FRAGMENT_TAGS");
        if (parcelable != null)
        {
            int i = 0;
            while (i < parcelable.length) 
            {
                String s = parcelable[i];
                if (s != null)
                {
                    mFragmentSparseArray.append(i, mFragmentManager.findFragmentByTag(s));
                }
                i++;
            }
        }
    }

    public final Parcelable saveState()
    {
        Bundle bundle = new Bundle();
        int j = mTabSpecList.size();
        String as[] = new String[j];
        int i = 0;
        while (i < j) 
        {
            Fragment fragment = (Fragment)mFragmentSparseArray.get(i);
            if (fragment != null && !fragment.mDetached && !fragment.mRemoving)
            {
                as[i] = fragment.mTag;
            } else
            {
                as[i] = null;
            }
            i++;
        }
        bundle.putStringArray("FRAGMENT_TAGS", as);
        return bundle;
    }
}
