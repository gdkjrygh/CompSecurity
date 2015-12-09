// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, FragmentTransaction, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private TabInfo mLastTab;
    private android.widget.TabHost.OnTabChangeListener mOnTabChangeListener;
    private FrameLayout mRealTabContent;
    private final ArrayList mTabs;

    public FragmentTabHost(Context context)
    {
        super(context, null);
        mTabs = new ArrayList();
        initFragmentTabHost(context, null);
    }

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mTabs = new ArrayList();
        initFragmentTabHost(context, attributeset);
    }

    private FragmentTransaction doTabChanged(String s, FragmentTransaction fragmenttransaction)
    {
        TabInfo tabinfo = null;
    /* block-local class not found */
    class TabInfo {}

        for (int i = 0; i < mTabs.size(); i++)
        {
            TabInfo tabinfo1 = (TabInfo)mTabs.get(i);
            if (TabInfo.access._mth200(tabinfo1).equals(s))
            {
                tabinfo = tabinfo1;
            }
        }

        if (tabinfo == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No tab known for tag ").append(s).toString());
        }
        s = fragmenttransaction;
        if (mLastTab != tabinfo)
        {
            s = fragmenttransaction;
            if (fragmenttransaction == null)
            {
                s = mFragmentManager.beginTransaction();
            }
            if (mLastTab != null && TabInfo.access._mth100(mLastTab) != null)
            {
                s.detach(TabInfo.access._mth100(mLastTab));
            }
            if (tabinfo != null)
            {
                if (TabInfo.access._mth100(tabinfo) == null)
                {
                    TabInfo.access._mth102(tabinfo, Fragment.instantiate(mContext, TabInfo.access._mth300(tabinfo).getName(), TabInfo.access._mth400(tabinfo)));
                    s.add(mContainerId, TabInfo.access._mth100(tabinfo), TabInfo.access._mth200(tabinfo));
                } else
                {
                    s.attach(TabInfo.access._mth100(tabinfo));
                }
            }
            mLastTab = tabinfo;
        }
        return s;
    }

    private void ensureContent()
    {
        if (mRealTabContent == null)
        {
            mRealTabContent = (FrameLayout)findViewById(mContainerId);
            if (mRealTabContent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("No tab content FrameLayout found for id ").append(mContainerId).toString());
            }
        }
    }

    private void ensureHierarchy(Context context)
    {
        if (findViewById(0x1020013) == null)
        {
            LinearLayout linearlayout = new LinearLayout(context);
            linearlayout.setOrientation(1);
            addView(linearlayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
            Object obj = new TabWidget(context);
            ((TabWidget) (obj)).setId(0x1020013);
            ((TabWidget) (obj)).setOrientation(0);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0F));
            obj = new FrameLayout(context);
            ((FrameLayout) (obj)).setId(0x1020011);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(0, 0, 0.0F));
            context = new FrameLayout(context);
            mRealTabContent = context;
            mRealTabContent.setId(mContainerId);
            linearlayout.addView(context, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F));
        }
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        mContainerId = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    public void addTab(android.widget.TabHost.TabSpec tabspec, Class class1, Bundle bundle)
    {
    /* block-local class not found */
    class DummyTabFactory {}

        tabspec.setContent(new DummyTabFactory(mContext));
        String s = tabspec.getTag();
        class1 = new TabInfo(s, class1, bundle);
        if (mAttached)
        {
            TabInfo.access._mth102(class1, mFragmentManager.findFragmentByTag(s));
            if (TabInfo.access._mth100(class1) != null && !TabInfo.access._mth100(class1).isDetached())
            {
                bundle = mFragmentManager.beginTransaction();
                bundle.detach(TabInfo.access._mth100(class1));
                bundle.commit();
            }
        }
        mTabs.add(class1);
        addTab(tabspec);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        FragmentTransaction fragmenttransaction = null;
        int i = 0;
        while (i < mTabs.size()) 
        {
            TabInfo tabinfo = (TabInfo)mTabs.get(i);
            TabInfo.access._mth102(tabinfo, mFragmentManager.findFragmentByTag(TabInfo.access._mth200(tabinfo)));
            FragmentTransaction fragmenttransaction1 = fragmenttransaction;
            if (TabInfo.access._mth100(tabinfo) != null)
            {
                fragmenttransaction1 = fragmenttransaction;
                if (!TabInfo.access._mth100(tabinfo).isDetached())
                {
                    if (TabInfo.access._mth200(tabinfo).equals(s))
                    {
                        mLastTab = tabinfo;
                        fragmenttransaction1 = fragmenttransaction;
                    } else
                    {
                        fragmenttransaction1 = fragmenttransaction;
                        if (fragmenttransaction == null)
                        {
                            fragmenttransaction1 = mFragmentManager.beginTransaction();
                        }
                        fragmenttransaction1.detach(TabInfo.access._mth100(tabinfo));
                    }
                }
            }
            i++;
            fragmenttransaction = fragmenttransaction1;
        }
        mAttached = true;
        fragmenttransaction = doTabChanged(s, fragmenttransaction);
        if (fragmenttransaction != null)
        {
            fragmenttransaction.commit();
            mFragmentManager.executePendingTransactions();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mAttached = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
    /* block-local class not found */
    class SavedState {}

        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setCurrentTabByTag(((SavedState) (parcelable)).curTab);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.curTab = getCurrentTabTag();
        return savedstate;
    }

    public void onTabChanged(String s)
    {
        if (mAttached)
        {
            FragmentTransaction fragmenttransaction = doTabChanged(s, null);
            if (fragmenttransaction != null)
            {
                fragmenttransaction.commit();
            }
        }
        if (mOnTabChangeListener != null)
        {
            mOnTabChangeListener.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        mOnTabChangeListener = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setup(Context context, FragmentManager fragmentmanager)
    {
        ensureHierarchy(context);
        super.setup();
        mContext = context;
        mFragmentManager = fragmentmanager;
        ensureContent();
    }

    public void setup(Context context, FragmentManager fragmentmanager, int i)
    {
        ensureHierarchy(context);
        super.setup();
        mContext = context;
        mFragmentManager = fragmentmanager;
        mContainerId = i;
        ensureContent();
        mRealTabContent.setId(i);
        if (getId() == -1)
        {
            setId(0x1020012);
        }
    }
}
