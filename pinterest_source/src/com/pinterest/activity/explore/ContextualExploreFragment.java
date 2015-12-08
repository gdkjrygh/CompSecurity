// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.explore.adapter.ContextualExploreAdapter;
import com.pinterest.activity.explore.adapter.ExploreBaseAdapter;
import com.pinterest.activity.explore.view.ExploreContextualSectionFooter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.analytics.ImpressionView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.ContextualItem;
import com.pinterest.api.remote.ExploreApi;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.CollectionUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.pinterest.activity.explore:
//            ExploreFragment

public class ContextualExploreFragment extends ExploreFragment
{

    private static final long IMPRESSION_DUMP_TIMEOUT = 30000L;
    private Handler _handler;
    private Runnable dumpImpressionInterval;

    public ContextualExploreFragment()
    {
        dumpImpressionInterval = new _cls2();
        _layoutId = 0x7f0300b5;
        _handler = new Handler();
    }

    private List gatherBoardImpressions()
    {
        if (_gridVw == null)
        {
            return null;
        }
        PinterestAdapterView pinterestadapterview = _gridVw.getAdapterView();
        List list = pinterestadapterview.dumpBoardImpressions();
        for (int i = 0; i < pinterestadapterview.getChildCount(); i++)
        {
            Pinalytics.a(pinterestadapterview.getChildAt(i), list);
        }

        PLog.log("AdapterView Board Impression Count: %d", new Object[] {
            Integer.valueOf(list.size())
        });
        return list;
    }

    private List gatherSearchImpressions()
    {
        if (_gridVw == null)
        {
            return null;
        }
        PinterestAdapterView pinterestadapterview = _gridVw.getAdapterView();
        List list = pinterestadapterview.dumpSearchImpressions();
        for (int i = 0; i < pinterestadapterview.getChildCount(); i++)
        {
            Pinalytics.c(pinterestadapterview.getChildAt(i), list);
        }

        PLog.log("AdapterView Search Impression Count: %d", new Object[] {
            Integer.valueOf(list.size())
        });
        return list;
    }

    private List gatherUserImpressions()
    {
        if (_gridVw == null)
        {
            return null;
        }
        PinterestAdapterView pinterestadapterview = _gridVw.getAdapterView();
        List list = pinterestadapterview.dumpUserImpressions();
        for (int i = 0; i < pinterestadapterview.getChildCount(); i++)
        {
            Pinalytics.b(pinterestadapterview.getChildAt(i), list);
        }

        PLog.log("AdapterView User Impression Count: %d", new Object[] {
            Integer.valueOf(list.size())
        });
        return list;
    }

    private void onContextualDataLoaded(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            if (!((ExploreBaseAdapter)_adapter).isLoading())
            {
                ((ExploreBaseAdapter)_adapter).resetCachedItemHeights();
                ((ContextualExploreAdapter)_adapter).setContextualItems(arraylist);
                if (_gridVw != null)
                {
                    _gridVw.reset();
                    return;
                }
            } else
            {
                ((ContextualExploreAdapter)_adapter).setContextualItems(arraylist);
                return;
            }
        }
    }

    private void reportImpressions()
    {
        List list = gatherBoardImpressions();
        if (CollectionUtils.isNotEmpty(list))
        {
            Pinalytics.b(EventType.BOARD_IMPRESSION_ONE_PIXEL, list);
            PLog.log("Dumping %d board impressions", new Object[] {
                Integer.valueOf(list.size())
            });
        }
        list = gatherUserImpressions();
        if (CollectionUtils.isNotEmpty(list))
        {
            Pinalytics.c(EventType.USER_IMPRESSION_ONE_PIXEL, list);
            PLog.log("Dumping %d user impressions", new Object[] {
                Integer.valueOf(list.size())
            });
        }
        list = gatherSearchImpressions();
        if (CollectionUtils.isNotEmpty(list))
        {
            Pinalytics.d(EventType.SEARCH_IMPRESSION_ONE_PIXEL, list);
            PLog.log("Dumping %d search impressions", new Object[] {
                Integer.valueOf(list.size())
            });
        }
    }

    private void restartImpressions()
    {
        if (_gridVw != null && _gridVw.getAdapterView() != null)
        {
            PinterestAdapterView pinterestadapterview = _gridVw.getAdapterView();
            PLog.log("AdapterView restartImpressions", new Object[0]);
            pinterestadapterview.clearBoardImpressions();
            pinterestadapterview.clearUserImpressions();
            pinterestadapterview.clearSearchImpressions();
            int i = 0;
            while (i < pinterestadapterview.getChildCount()) 
            {
                View view = pinterestadapterview.getChildAt(i);
                if (view instanceof ImpressionView)
                {
                    ((ImpressionView)view).markImpressionStart();
                }
                i++;
            }
        }
    }

    protected void initAdapter()
    {
        _adapter = new ContextualExploreAdapter();
    }

    protected void loadData()
    {
        super.loadData();
        ExploreApi.a(new ContextualItemsApiHandler(), getApiTag());
        (new _cls1()).execute();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if ((Category)((ExploreBaseAdapter)_adapter).getItem(i) == null && ((ExploreBaseAdapter)_adapter).getItemViewType(i) == 1)
        {
            ContextualItem contextualitem = ((ContextualExploreAdapter)_adapter).getContextualItemAtPosition(i);
            int j = ((ContextualExploreAdapter)_adapter).getContextualItemIndex(i);
            ((ExploreContextualSectionFooter)view).setLoading();
            HashMap hashmap = new HashMap();
            hashmap.put("story_index", String.valueOf(j));
            hashmap.put("story_type", contextualitem.getObjectType().name());
            Pinalytics.a(ElementType.SEE_MORE_BUTTON, ComponentType.CONTEXTUAL_STORY, contextualitem.getId(), hashmap);
            ExploreApi.f(contextualitem.getId(), new ContextualRelatedObjectsApiHandler(contextualitem), getApiTag());
        }
        super.onItemClick(adapterview, view, i, l);
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








    private class _cls2
        implements Runnable
    {

        final ContextualExploreFragment this$0;

        public void run()
        {
            reportImpressions();
            if (isAdded() && isActive() && _handler != null)
            {
                PLog.log("Rescheduling another runnable for dumping impressions", new Object[0]);
                _handler.postDelayed(this, 30000L);
            }
        }

        _cls2()
        {
            this$0 = ContextualExploreFragment.this;
            super();
        }
    }


    private class ContextualItemsApiHandler extends BaseApiResponseHandler
    {

        final ContextualExploreFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            class _cls1 extends BackgroundTask
            {

                private ArrayList result;
                final ContextualItemsApiHandler this$1;
                final PinterestJsonArray val$dataArray;

                public void onFinish()
                {
                    super.onFinish();
                    onContextualDataLoaded(result);
                }

                public void run()
                {
                    result = ContextualItem.parseContextualItemList(dataArray);
                    DiskCache.setJsonArray("CONTEXTUAL_EXPLORE", dataArray);
                }

                _cls1()
                {
                    this$1 = ContextualItemsApiHandler.this;
                    dataArray = pinterestjsonarray;
                    super();
                    result = null;
                }
            }

            (new _cls1()).execute();
        }

        public ContextualItemsApiHandler()
        {
            this$0 = ContextualExploreFragment.this;
            super();
        }
    }


    private class _cls1 extends BackgroundTask
    {

        private ArrayList result;
        final ContextualExploreFragment this$0;

        public void onFinish()
        {
            onContextualDataLoaded(result);
        }

        public void run()
        {
            PinterestJsonArray pinterestjsonarray = DiskCache.getJsonArray("CONTEXTUAL_EXPLORE");
            if (pinterestjsonarray != null)
            {
                result = ContextualItem.parseContextualItemList(pinterestjsonarray);
            }
        }

        _cls1()
        {
            this$0 = ContextualExploreFragment.this;
            super();
            result = null;
        }
    }


    private class ContextualRelatedObjectsApiHandler extends BaseApiResponseHandler
    {

        private ContextualItem _item;
        final ContextualExploreFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            ContextualItem.updateRelatedObjects(apiresponse.getData(), _item);
            ((ExploreBaseAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        public ContextualRelatedObjectsApiHandler(ContextualItem contextualitem)
        {
            this$0 = ContextualExploreFragment.this;
            super();
            _item = contextualitem;
        }
    }

}
