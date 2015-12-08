// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Handler;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.analytics.ImpressionView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.EventType;
import com.pinterest.schemas.event.PinImpressionType;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.List;

// Referenced classes of package com.pinterest.fragment:
//            PinterestGridFragment

public class PinGridFragment extends PinterestGridFragment
{

    private static final int IMPRESSION_DUMP_TIMEOUT = 30000;
    private Handler _handler;
    protected PinImpressionType _impType;
    private Runnable dumpImpressionInterval;

    public PinGridFragment()
    {
        _impType = PinImpressionType.GRID_CELL;
        dumpImpressionInterval = new _cls1();
        _adapter = new PinGridAdapter();
        _handler = new Handler();
    }

    private List gatherAllImpressions()
    {
        int i = 0;
        if (_gridVw == null)
        {
            return null;
        }
        PinterestAdapterView pinterestadapterview = _gridVw.getAdapterView();
        List list = pinterestadapterview.dumpPinImpressions();
        PLog.log("AdapterView Impression Count: %d", new Object[] {
            Integer.valueOf(list.size())
        });
        for (; i < pinterestadapterview.getChildCount(); i++)
        {
            Pinalytics.a(pinterestadapterview.getChildAt(i), list, _impType);
        }

        return list;
    }

    private void reportImpressions()
    {
        List list = gatherAllImpressions();
        if (list == null)
        {
            return;
        } else
        {
            Pinalytics.a(EventType.PIN_IMPRESSION_ONE_PIXEL, list);
            PLog.log("Dumping %d impressions", new Object[] {
                Integer.valueOf(list.size())
            });
            return;
        }
    }

    private void restartImpressions()
    {
        if (_gridVw != null && _gridVw.getAdapterView() != null)
        {
            PinterestAdapterView pinterestadapterview = _gridVw.getAdapterView();
            PLog.log("AdapterView restartImpressions", new Object[0]);
            pinterestadapterview.clearImpressions();
            int i = 0;
            while (i < pinterestadapterview.getChildCount()) 
            {
                android.view.View view = pinterestadapterview.getChildAt(i);
                if (view instanceof ImpressionView)
                {
                    ((ImpressionView)view).markImpressionStart();
                }
                i++;
            }
        }
    }

    protected void onActivate()
    {
        super.onActivate();
        ((PinGridAdapter)_adapter).setParentClass(getClass());
    }

    public void setActive(boolean flag)
    {
        boolean flag1;
        if (_active != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            _handler.removeCallbacksAndMessages(null);
            if (_active)
            {
                reportImpressions();
            } else
            {
                restartImpressions();
                _handler.postDelayed(dumpImpressionInterval, 30000L);
            }
        }
        super.setActive(flag);
    }

    protected void setCompactCells(boolean flag)
    {
        ((PinGridAdapter)_adapter).setRenderCompactUserOnly(flag);
    }

    public void setImpressionType(PinImpressionType pinimpressiontype)
    {
        _impType = pinimpressiontype;
        if (_gridVw != null)
        {
            _gridVw.setPinImpressionType(pinimpressiontype);
        }
    }



    private class _cls1
        implements Runnable
    {

        final PinGridFragment this$0;

        public void run()
        {
            reportImpressions();
            if (isAdded() && isActive() && _handler != null)
            {
                PLog.log("Rescheduling another runnable for dumping impressions", new Object[0]);
                _handler.postDelayed(this, 30000L);
            }
        }

        _cls1()
        {
            this$0 = PinGridFragment.this;
            super();
        }
    }

}
