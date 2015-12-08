// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.CustomViewPager;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFrag;
import com.netflix.mediaclient.util.ThreadUtils;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPagerAdapter

public class LoMoViewPager extends CustomViewPager
    implements com.netflix.mediaclient.ui.lolomo.BaseLoLoMoAdapter.LoMoRowContent
{
    public static class State
    {

        LoMoViewPagerAdapter.Memento adapterMemento;
        int currPage;

        public String toString()
        {
            return (new StringBuilder()).append("Page: ").append(currPage).append(", adapter: ").append(adapterMemento.toString()).toString();
        }

        public State()
        {
        }
    }


    private static final float KIDS_TOUCH_SLOP_SCALE_FACTOR = 0.75F;
    private static final long ROTATE_TO_NEXT_VIEW_DELAY_MS;
    private static final String TAG = "LoMoViewPager";
    private final LoMoViewPagerAdapter adapter;
    private final Handler handler = new Handler();
    private final CirclePageIndicator pageIndicator;
    private final Runnable rotateToNextViewRunnable = new Runnable() {

        final LoMoViewPager this$0;

        public void run()
        {
            if (getActivity().destroyed())
            {
                return;
            }
            int j = getCurrentItem() + 1;
            int i = j;
            if (j >= adapter.getCount())
            {
                i = 0;
            }
            if (Log.isLoggable("LoMoViewPager", 2))
            {
                Log.v("LoMoViewPager", (new StringBuilder()).append("Auto-rotating to next view, id: ").append(i).toString());
            }
            setCurrentItem(i, true, true);
            handler.postDelayed(this, LoMoViewPager.ROTATE_TO_NEXT_VIEW_DELAY_MS);
        }

            
            {
                this$0 = LoMoViewPager.this;
                super();
            }
    };
    private boolean shouldAutoPaginate;
    private State state;
    private String stateKey;
    private final Map stateMap;

    public LoMoViewPager(LoLoMoFrag lolomofrag, ServiceManager servicemanager, CirclePageIndicator circlepageindicator, ViewRecycler viewrecycler, View view, boolean flag)
    {
        super(lolomofrag.getActivity());
        stateMap = lolomofrag.getStateMap();
        ThreadUtils.assertOnMain();
        pageIndicator = circlepageindicator;
        adapter = new LoMoViewPagerAdapter(this, servicemanager, viewrecycler, view, flag);
        setAdapter(adapter);
        if (lolomofrag.getNetflixActivity().isForKids())
        {
            setTouchSlop((int)((float)getTouchSlop() * 0.75F));
        }
    }

    private NetflixActivity getActivity()
    {
        return (NetflixActivity)getContext();
    }

    private void handleTouchEvent(MotionEvent motionevent)
    {
        switch (motionevent.getAction())
        {
        case 2: // '\002'
        default:
            return;

        case 0: // '\0'
            updateAutoPagination(false);
            return;

        case 1: // '\001'
        case 3: // '\003'
            updateAutoPagination(shouldAutoPaginate);
            break;
        }
    }

    private void onCurrentItemSet(int i)
    {
        Log.v("LoMoViewPager", (new StringBuilder()).append("onCurrentItemSet: ").append(i).toString());
        if (pageIndicator != null)
        {
            pageIndicator.setCurrentItem(i);
        }
    }

    private boolean restoreState(String s)
    {
        stateKey = s;
        state = (State)stateMap.get(stateKey);
        if (state == null)
        {
            Log.v("LoMoViewPager", (new StringBuilder()).append("No state found for key: ").append(stateKey).toString());
            return false;
        }
        if (Log.isLoggable("LoMoViewPager", 2))
        {
            Log.v("LoMoViewPager", (new StringBuilder()).append("Restoring state for key: ").append(stateKey).append(", state: ").append(state).toString());
        }
        adapter.restoreFromMemento(state.adapterMemento);
        adapter.notifyDataSetChanged();
        notifyDataSetChanged();
        setCurrentItem(state.currPage, false, false);
        return true;
    }

    private void saveState(int i)
    {
        state = new State();
        state.currPage = i;
        state.adapterMemento = adapter.saveToMemento();
        if (Log.isLoggable("LoMoViewPager", 2))
        {
            Log.v("LoMoViewPager", (new StringBuilder()).append("Saving state: ").append(stateKey).append(": ").append(state).toString());
        }
        stateMap.put(stateKey, state);
    }

    private void updateAutoPagination(boolean flag)
    {
        if (Log.isLoggable("LoMoViewPager", 2))
        {
            Log.v("LoMoViewPager", (new StringBuilder()).append("updateAutoPagination, enabled: ").append(flag).toString());
        }
        handler.removeCallbacks(rotateToNextViewRunnable);
        if (flag)
        {
            handler.postDelayed(rotateToNextViewRunnable, ROTATE_TO_NEXT_VIEW_DELAY_MS);
        }
    }

    private void updatePageIndicatorVisibility()
    {
        boolean flag = true;
        int i = 0;
        if (!adapter.isShowingBillboard() || adapter.getCount() <= 1)
        {
            flag = false;
        }
        if (Log.isLoggable("LoMoViewPager", 2))
        {
            Log.v("LoMoViewPager", (new StringBuilder()).append("hasBillboardData: ").append(flag).toString());
        }
        if (pageIndicator != null)
        {
            CirclePageIndicator circlepageindicator = pageIndicator;
            if (!flag)
            {
                i = 8;
            }
            circlepageindicator.setVisibility(i);
        }
    }

    public void destroy()
    {
        adapter.destroy();
    }

    public void invalidateCwCache()
    {
        stateMap.remove("CW");
    }

    public void invalidateIqCache()
    {
        stateMap.remove("IQ");
    }

    public void invalidateRequestId()
    {
        if (adapter != null)
        {
            adapter.invalidateRequestId();
        }
    }

    public boolean isLoading()
    {
        if (Log.isLoggable("NflxLoading", 2))
        {
            Log.v("NflxLoading", (new StringBuilder()).append("Class: ").append(getClass().getSimpleName()).append(", loading: ").append(adapter.isLoading()).toString());
        }
        return adapter.isLoading();
    }

    public void notifyDataSetChanged()
    {
        Log.v("LoMoViewPager", "Notifying pager indicator of data set change");
        if (pageIndicator != null)
        {
            pageIndicator.notifyDataSetChanged();
        }
        updatePageIndicatorVisibility();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        handleTouchEvent(motionevent);
        return super.onInterceptTouchEvent(motionevent);
    }

    protected void onPageSelected(int i)
    {
        super.onPageSelected(i);
        Log.v("LoMoViewPager", (new StringBuilder()).append("onPageSelected: ").append(i).toString());
        saveStateAndTrack(i);
    }

    public void onPause()
    {
        handler.removeCallbacks(rotateToNextViewRunnable);
    }

    public void onResume()
    {
        if (shouldAutoPaginate)
        {
            updateAutoPagination(true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        handleTouchEvent(motionevent);
        return super.onTouchEvent(motionevent);
    }

    public void refresh(BasicLoMo basiclomo, int i)
    {
        boolean flag1 = true;
        ThreadUtils.assertOnMain();
        boolean flag;
        if (basiclomo.getType() != LoMoType.BILLBOARD)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setPagesToOverlap(flag);
        if (basiclomo.getType() == LoMoType.BILLBOARD)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        shouldAutoPaginate = flag;
        updateAutoPagination(shouldAutoPaginate);
        if (Log.isLoggable("LoMoViewPager", 2))
        {
            Log.v("LoMoViewPager", (new StringBuilder()).append("Setting layout params for: ").append(basiclomo.getType()).toString());
        }
        setLayoutParams(adapter.getLayoutParams(basiclomo.getType()));
        if (restoreState(basiclomo.getId()))
        {
            adapter.trackPresentation(state.currPage);
            return;
        } else
        {
            adapter.refresh(basiclomo, i);
            updatePageIndicatorVisibility();
            return;
        }
    }

    void saveStateAndTrack(int i)
    {
        saveState(i);
        adapter.trackPresentation(i);
    }

    public void setCurrentItem(int i)
    {
        super.setCurrentItem(i);
        onCurrentItemSet(i);
    }

    public void setCurrentItem(int i, boolean flag)
    {
        super.setCurrentItem(i, flag);
        onCurrentItemSet(i);
    }

    public void setCurrentItem(int i, boolean flag, boolean flag1)
    {
        super.setCurrentItem(i, flag, flag1);
        onCurrentItemSet(i);
    }

    static 
    {
        ROTATE_TO_NEXT_VIEW_DELAY_MS = TimeUnit.MILLISECONDS.convert(15L, TimeUnit.SECONDS);
    }




}
