// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import IV;
import IZ;
import Md;
import Mf;
import OC;
import OI;
import S;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.NetworkAnalytics;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;

public class SnapchatViewPager extends ViewPager
{

    public static final int ADDED_ME_PAGE_NUMBER = 13;
    public static final int ADD_BY_USERNAME_PAGE_NUMBER = 15;
    public static final int ADD_FRIENDS_MENU_PAGE_NUMBER = 14;
    public static final int ADD_FROM_ADDRESS_BOOK_PAGE_NUMBER = 16;
    public static final int ADD_FROM_CAMERA_ROLL_PAGE_NUMBER = 18;
    public static final int ADD_NEARBY_PAGE_NUMBER = 17;
    public static final int CAMERA_PAGE_NUMBER = 2;
    public static final int CHAT_PAGE_NUMBER = 0;
    public static final int DISCOVER_PAGE_NUMBER = 4;
    public static final int FEED_PAGE_NUMBER = 1;
    public static final int MY_CONTACTS_PAGE_NUMBER = 12;
    public static final int MY_FRIEND_PAGE_NUMBER = 11;
    private static final int OFFSCREEN_PAGE_LIMIT = 2;
    public static final int PAGER_WINDOW_OFFSET = 1;
    public static final int STORIES_PAGE_NUMBER = 3;
    private static final String TAG = "SnapchatViewPager";
    public static final int UNDEFINED_PAGE_NUMBER = -1;
    private IZ mAdapter;
    public boolean mIsAnimating;
    public boolean mIsChatFragmentAccessible;
    public boolean mIsPagingEnabled;
    public boolean mIsScrolling;
    public int mLastOnScrollPage;
    private int mLastOnScrollPagePixelOffset;
    private float mLastRawX;
    private NetworkAnalytics mNetworkAnalytics;
    public OI mUserSwipedIntoChatEvent;

    public SnapchatViewPager(Context context)
    {
        super(context);
        mIsPagingEnabled = true;
        mIsChatFragmentAccessible = false;
        mIsAnimating = false;
        mLastOnScrollPage = -1;
        mLastOnScrollPagePixelOffset = -1;
        mLastRawX = -1F;
        mNetworkAnalytics = NetworkAnalytics.a();
        setOffscreenPageLimit(2);
    }

    public SnapchatViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mIsPagingEnabled = true;
        mIsChatFragmentAccessible = false;
        mIsAnimating = false;
        mLastOnScrollPage = -1;
        mLastOnScrollPagePixelOffset = -1;
        mLastRawX = -1F;
        mNetworkAnalytics = NetworkAnalytics.a();
        setOffscreenPageLimit(2);
    }

    public static String a(Integer integer)
    {
        if (integer == null)
        {
            return "Background";
        }
        switch (integer.intValue())
        {
        default:
            return "Unknown";

        case 0: // '\0'
            return "Chat";

        case 1: // '\001'
            return "Feed";

        case 2: // '\002'
            return "Camera";

        case 3: // '\003'
            return "Stories";

        case 4: // '\004'
            return "Discover";
        }
    }

    private boolean a(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return true;
        }
        return flag;
    }

    private boolean d()
    {
        return mUserSwipedIntoChatEvent != null;
    }

    public final SnapchatFragment a(int i)
    {
        if (mAdapter == null)
        {
            return null;
        } else
        {
            IZ iz = mAdapter;
            String s = IZ.a(getId(), i);
            return (SnapchatFragment)iz.mFragmentManager.a(s);
        }
    }

    protected final void a(int i, float f, int j)
    {
        super.a(i, f, j);
        boolean flag;
        if (f != 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsScrolling = flag;
        if (mLastOnScrollPage == -1)
        {
            mLastOnScrollPage = i;
        }
        if (mLastOnScrollPagePixelOffset == -1)
        {
            mLastOnScrollPagePixelOffset = j;
        }
        if (mLastOnScrollPage == 3 && i == 2 || mLastOnScrollPage == 1 && mLastOnScrollPagePixelOffset == 0 && j != 0 && i == 1 || mLastOnScrollPage == 0 && i == 2)
        {
            Mf.a().a(new OC(TitleBarManager.Visibility.HIDDEN));
        }
        if (i == 1 && f == 0.0F || mLastOnScrollPage == 2 && i > 2 || mLastOnScrollPage == 1 && i <= 0)
        {
            Mf.a().a(new OC(TitleBarManager.Visibility.VISIBLE));
        }
        mLastOnScrollPage = i;
        mLastOnScrollPagePixelOffset = j;
        if (i == 0 && !mIsChatFragmentAccessible)
        {
            mLastOnScrollPage = 1;
            mLastOnScrollPagePixelOffset = 0;
            try
            {
                setCurrentItem(2, false);
                setCurrentItem(1, false);
            }
            catch (IllegalStateException illegalstateexception)
            {
                Timber.a("SnapchatViewPager", illegalstateexception);
            }
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        a(i, getChildCount());
        if (i != 1) goto _L4; else goto _L3
_L3:
        mNetworkAnalytics.b();
_L2:
        i = mLastOnScrollPage;
        j = mLastOnScrollPagePixelOffset;
        if (ReleaseManager.f())
        {
            Timber.a(com.snapchat.android.Timber.LogType.INFO, "SnapchatViewPager", false, null, "onPageScrolled position [%d] offset [%d]", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
        }
        return;
_L4:
        if (i == 3)
        {
            mNetworkAnalytics.b();
        } else
        if (i == 0)
        {
            mUserSwipedIntoChatEvent = null;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void a(int i, int j)
    {
        int k = 0;
        while (k < j) 
        {
            SnapchatFragment snapchatfragment = a(k);
            if (snapchatfragment != null)
            {
                if (Math.abs(i - k) <= 1)
                {
                    if (!snapchatfragment.mAreLargeUiUpdatesEnabled)
                    {
                        snapchatfragment.d();
                    }
                } else
                if (snapchatfragment.mAreLargeUiUpdatesEnabled)
                {
                    snapchatfragment.mAreLargeUiUpdatesEnabled = false;
                }
            }
            k++;
        }
    }

    public final boolean a(KeyEvent keyevent)
    {
        return false;
    }

    public void onAllowAccessToChatFragmentEvent(Md md)
    {
        mIsChatFragmentAccessible = md.allow;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        if (motionevent.getPointerCount() > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mIsPagingEnabled && !flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!d())
        {
            break; /* Loop/switch isn't completed */
        }
        if (motionevent.getAction() == 2)
        {
            motionevent.setAction(0);
            a(motionevent);
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 88
    //                   0 110
    //                   1 88
    //                   2 121;
           goto _L4 _L5 _L4 _L6
_L4:
        mLastRawX = motionevent.getRawX();
        flag = false;
_L8:
        if (!flag)
        {
            boolean flag1;
            try
            {
                flag1 = super.onInterceptTouchEvent(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                return true;
            }
            return flag1;
        }
          goto _L1
_L5:
        mLastRawX = motionevent.getRawX();
          goto _L4
_L6:
        if (motionevent.getRawX() <= mLastRawX || (mLastOnScrollPage != 1 || mLastOnScrollPagePixelOffset != 0) && (mLastOnScrollPage != 0 || mLastOnScrollPagePixelOffset != 0)) goto _L4; else goto _L7
_L7:
        flag = true;
          goto _L8
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        Timber.c("SnapchatViewPager", "onRestoreInstanceState", new Object[0]);
        int i = super.mCurItem;
        super.onRestoreInstanceState(parcelable);
        setCurrentItem(i);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (mIsPagingEnabled)
        {
            if (d())
            {
                if (motionevent.getPointerCount() <= 1)
                {
                    if (motionevent.getAction() == 1)
                    {
                        if (mUserSwipedIntoChatEvent.mFeedListItem != null)
                        {
                            Object obj = mUserSwipedIntoChatEvent.mFeedListItem.findViewById(0x7f0d02cd);
                            if (obj != null)
                            {
                                obj = new IV(((View) (obj)), (int)((View) (obj)).getTranslationX());
                                obj.mPreviousXPositionForShutAnimator = ((IV) (obj)).mStartOffset;
                                ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                                    ((IV) (obj)).mStartOffset, ((IV) (obj)).mEndOffset
                                }).setDuration(((IV) (obj)).mDuration);
                                valueanimator.addUpdateListener(new IV._cls1(((IV) (obj))));
                                valueanimator.start();
                            }
                        }
                        if (mUserSwipedIntoChatEvent.mIsFlinging)
                        {
                            setCurrentItem(0, true);
                        }
                        mUserSwipedIntoChatEvent = null;
                    }
                    return a(motionevent);
                }
            } else
            {
                return a(motionevent);
            }
        }
        return false;
    }

    public void onUserSwipedIntoChatEvent(OI oi)
    {
        mUserSwipedIntoChatEvent = oi;
    }

    public void setAdapter(IZ iz)
    {
        super.setAdapter(iz);
        mAdapter = iz;
    }

    public void setAnimating(boolean flag)
    {
        mIsAnimating = flag;
    }

    public void setChatFragmentAccessible(boolean flag)
    {
        mIsChatFragmentAccessible = flag;
    }

    public void setCurrentItem(int i, boolean flag)
    {
        Timber.c("SnapchatViewPager", "setCurrentItem %d, smoothScroll %b", new Object[] {
            Integer.valueOf(i), Boolean.valueOf(flag)
        });
        super.setCurrentItem(i, flag);
    }

    public void setPagingEnabled(boolean flag)
    {
        mIsPagingEnabled = flag;
    }
}
