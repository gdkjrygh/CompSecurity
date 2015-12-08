// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import Jo;
import aU;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bb;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.ui.DSnapIntroVideoView;
import com.snapchat.android.discover.ui.media.DiscoverEditionPageView;
import com.snapchat.android.ui.SwipeOutTracker;
import java.util.List;
import wt;

public class EditionViewerPager extends ViewPager
{
    final class a extends android.support.v4.view.ViewPager.h
    {

        private EditionViewerPager a;

        public final void a(int j)
        {
            a.a(j, -1);
        }

        public final void b(int j)
        {
            EditionViewerPager.a(a, j);
            if (j == 2 && ((ViewPager) (a)).mCurItem != EditionViewerPager.a(a))
            {
                a.a(EditionViewerPager.a(a));
            } else
            {
                if (j == 0 && ((ViewPager) (a)).mCurItem != EditionViewerPager.a(a))
                {
                    a.a(EditionViewerPager.a(a));
                    return;
                }
                if (j == 1)
                {
                    EditionViewerPager.b(a, ((ViewPager) (a)).mCurItem);
                    return;
                }
            }
        }

        private a()
        {
            a = EditionViewerPager.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    public SwipeOutTracker a;
    int b;
    private float c;
    private float d;
    private int e;
    private float f;
    private View g;
    private int h;
    private boolean i;

    public EditionViewerPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
        i = false;
        setOffscreenPageLimit(2);
        setPageMargin(4);
        setPageMarginDrawable(0x7f0c0002);
        e = bb.a(ViewConfiguration.get(getContext()));
        setOnPageChangeListener(new a((byte)0));
    }

    static int a(EditionViewerPager editionviewerpager)
    {
        return editionviewerpager.h;
    }

    static int a(EditionViewerPager editionviewerpager, int j)
    {
        editionviewerpager.b = j;
        return j;
    }

    private boolean a(float f1, float f2)
    {
        boolean flag1 = true;
        boolean flag;
        if (c - f1 <= (float)e || Math.abs(f2 - d) >= Math.abs(f1 - c))
        {
            flag = false;
        } else
        {
            DiscoverEditionPageView discovereditionpageview = d();
            flag = flag1;
            if (discovereditionpageview != null)
            {
                flag = flag1;
                if (discovereditionpageview.c())
                {
                    return false;
                }
            }
        }
        return flag;
    }

    static int b(EditionViewerPager editionviewerpager, int j)
    {
        editionviewerpager.h = j;
        return j;
    }

    private DiscoverEditionPageView b(int j)
    {
        View view = ((wt)super.mAdapter).b(this, j);
        if (view instanceof DiscoverEditionPageView)
        {
            return (DiscoverEditionPageView)view;
        } else
        {
            return null;
        }
    }

    public final void a(int j)
    {
        DiscoverEditionPageView discovereditionpageview = b(j);
        if (discovereditionpageview != null)
        {
            discovereditionpageview.a();
        }
    }

    public final void a(int j, int k)
    {
        DiscoverEditionPageView discovereditionpageview = b(-1);
        if (discovereditionpageview != null && (discovereditionpageview instanceof DSnapIntroVideoView) && j != 0)
        {
            ((DSnapIntroVideoView)discovereditionpageview).setCanAdvance(true);
        }
        discovereditionpageview = b(j);
        if (discovereditionpageview != null)
        {
            discovereditionpageview.a(k);
        }
    }

    public void addView(View view, int j, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, j, layoutparams);
        if (!i && (view instanceof DiscoverEditionPageView))
        {
            i = true;
            post(new Runnable() {

                private EditionViewerPager a;

                public final void run()
                {
                    a.a(((ViewPager) (a)).mCurItem, -1);
                }

            
            {
                a = EditionViewerPager.this;
                super();
            }
            });
        }
    }

    final DiscoverEditionPageView d()
    {
        return b(super.mCurItem);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        DiscoverEditionPageView discovereditionpageview = d();
        if (discovereditionpageview == null || !discovereditionpageview.d()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        float f1;
        float f2;
        int j;
        j = super.mCurItem;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 68
    //                   0 80
    //                   1 68
    //                   2 127;
           goto _L3 _L4 _L3 _L5
_L3:
        if (a.a())
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        f = super.getScrollX();
        g = b(j);
        c = f1;
        d = f2;
        a.a(c, d);
        continue; /* Loop/switch isn't completed */
_L5:
        if (g == null || !g.canScrollVertically(-1))
        {
            a.a(motionevent, j, super.mAdapter.c(), a(f1, f2));
        }
        if (true) goto _L3; else goto _L6
_L6:
        if (a(f1, f2)) goto _L1; else goto _L7
_L7:
        boolean flag;
        try
        {
            flag = super.onInterceptTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            Timber.d("EditionViewerPager", "Swallowing exception from ViewPager.onInterceptTouchEvent: %s", new Object[] {
                motionevent
            });
            return false;
        }
        return flag;
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        SwipeOutTracker swipeouttracker = a;
        swipeouttracker.d = (float)getWidth() / 8F;
        swipeouttracker.e = (float)getHeight() / 8F;
    }

    protected void onSizeChanged(int j, int k, int l, int i1)
    {
        super.onSizeChanged(j - super.mPageMargin, k, l - super.mPageMargin, i1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        boolean flag;
        flag = false;
        obj = d();
        if (obj == null || !((DiscoverEditionPageView) (obj)).d()) goto _L2; else goto _L1
_L1:
        obj = d();
        if (obj != null)
        {
            ((DiscoverEditionPageView) (obj)).onTouchEvent(motionevent);
        }
        flag = true;
_L10:
        return flag;
_L2:
        float f1;
        float f2;
        if (a.j == 1)
        {
            return true;
        }
        int j = super.mCurItem;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        int j1 = super.getScrollX();
        if (a.j == 0)
        {
            if (motionevent.getAction() == 0)
            {
                a.a(f1, f2);
            } else
            if (motionevent.getAction() == 2 && f == (float)j1)
            {
                a.a(motionevent, j, super.mAdapter.c(), a(f1, f2));
            }
        }
        if (!a.a()) goto _L4; else goto _L3
_L3:
        obj = a;
        ((SwipeOutTracker) (obj)).a(motionevent);
        motionevent.getAction();
        JVM INSTR tableswitch 1 3: default 160
    //                   1 284
    //                   2 217
    //                   3 372;
           goto _L4 _L5 _L6 _L7
_L4:
        if (a.a())
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k = 0;
        while (k < ((SwipeOutTracker) (obj)).a.size()) 
        {
            ((com.snapchat.android.ui.SwipeOutTracker.a)((SwipeOutTracker) (obj)).a.get(k)).a(motionevent.getX() - ((SwipeOutTracker) (obj)).b, motionevent.getY() - ((SwipeOutTracker) (obj)).c);
            k++;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (((SwipeOutTracker) (obj)).b())
        {
            ((SwipeOutTracker) (obj)).a(((SwipeOutTracker) (obj)).i);
            obj.j = 1;
        } else
        {
            for (int l = 0; l < ((SwipeOutTracker) (obj)).a.size(); l++)
            {
                ((com.snapchat.android.ui.SwipeOutTracker.a)((SwipeOutTracker) (obj)).a.get(l)).p();
            }

            obj.j = 0;
        }
        ((SwipeOutTracker) (obj)).c();
        continue; /* Loop/switch isn't completed */
_L7:
        ((SwipeOutTracker) (obj)).c();
        for (int i1 = 0; i1 < ((SwipeOutTracker) (obj)).a.size(); i1++)
        {
            ((com.snapchat.android.ui.SwipeOutTracker.a)((SwipeOutTracker) (obj)).a.get(i1)).p();
        }

        obj.j = 0;
        if (true) goto _L4; else goto _L8
_L8:
        if (a(f1, f2)) goto _L10; else goto _L9
_L9:
        boolean flag1;
        try
        {
            flag1 = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            Timber.d("EditionViewerPager", "Swallowing exception from ViewPager.onTouchEvent: %s", new Object[] {
                motionevent
            });
            return false;
        }
        return flag1;
    }

    public void setCurrentItem(int j)
    {
        setCurrentItem(j, true);
    }

    public void setCurrentItem(int j, boolean flag)
    {
        if (j != super.mCurItem)
        {
            a(super.mCurItem);
            super.setCurrentItem(j, flag);
            a(j, -1);
        }
    }

    public void setPanel(int j)
    {
        a(super.mCurItem, j);
    }

    public void setSwipeOutTracker(SwipeOutTracker swipeouttracker)
    {
        a = swipeouttracker;
        swipeouttracker = a;
        Context context = getContext();
        swipeouttracker.f = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        swipeouttracker.g = (int)Jo.a(700F, context);
        swipeouttracker.h = (int)Jo.a(200F, context);
    }
}
