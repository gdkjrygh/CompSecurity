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
        for (int i = 0; i < mTabs.size(); i++)
        {
            TabInfo tabinfo1 = (TabInfo)mTabs.get(i);
            if (tabinfo1.tag.equals(s))
            {
                tabinfo = tabinfo1;
            }
        }

        if (tabinfo == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        s = fragmenttransaction;
        if (mLastTab != tabinfo)
        {
            s = fragmenttransaction;
            if (fragmenttransaction == null)
            {
                s = mFragmentManager.beginTransaction();
            }
            if (mLastTab != null && mLastTab.fragment != null)
            {
                s.detach(mLastTab.fragment);
            }
            if (tabinfo != null)
            {
                if (tabinfo.fragment == null)
                {
                    tabinfo.fragment = Fragment.instantiate(mContext, tabinfo.clss.getName(), tabinfo.args);
                    s.add(mContainerId, tabinfo.fragment, tabinfo.tag);
                } else
                {
                    s.attach(tabinfo.fragment);
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
                throw new IllegalStateException((new StringBuilder("No tab content FrameLayout found for id ")).append(mContainerId).toString());
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
        tabspec.setContent(new DummyTabFactory(mContext));
        String s = tabspec.getTag();
        class1 = new TabInfo(s, class1, bundle);
        if (mAttached)
        {
            class1.fragment = mFragmentManager.findFragmentByTag(s);
            if (((TabInfo) (class1)).fragment != null && !((TabInfo) (class1)).fragment.isDetached())
            {
                bundle = mFragmentManager.beginTransaction();
                bundle.detach(((TabInfo) (class1)).fragment);
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
            tabinfo.fragment = mFragmentManager.findFragmentByTag(tabinfo.tag);
            FragmentTransaction fragmenttransaction1 = fragmenttransaction;
            if (tabinfo.fragment != null)
            {
                fragmenttransaction1 = fragmenttransaction;
                if (!tabinfo.fragment.isDetached())
                {
                    if (tabinfo.tag.equals(s))
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
                        fragmenttransaction1.detach(tabinfo.fragment);
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

    private class TabInfo
    {

        private final Bundle args;
        private final Class clss;
        private Fragment fragment;
        private final String tag;



/*
        static Fragment access$102(TabInfo tabinfo, Fragment fragment1)
        {
            tabinfo.fragment = fragment1;
            return fragment1;
        }

*/




        TabInfo(String s, Class class1, Bundle bundle)
        {
            tag = s;
            clss = class1;
            args = bundle;
        }
    }


    private class DummyTabFactory
        implements android.widget.TabHost.TabContentFactory
    {

        private final Context mContext;

        public View createTabContent(String s)
        {
            s = new View(mContext);
            s.setMinimumWidth(0);
            s.setMinimumHeight(0);
            return s;
        }

        public DummyTabFactory(Context context)
        {
            mContext = context;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        String curTab;

        public String toString()
        {
            return (new StringBuilder("FragmentTabHost.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(curTab).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(curTab);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            curTab = parcel.readString();
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }

}
