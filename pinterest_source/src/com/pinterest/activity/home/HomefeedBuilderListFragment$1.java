// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.os.Handler;
import android.view.View;
import com.pinterest.activity.home.adapter.HomefeedBuilderListAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.List;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderListFragment

class this._cls0
    implements com.pinterest.base.agment._cls1
{

    final HomefeedBuilderListFragment this$0;

    private void allowTouchEventsOnList(boolean flag)
    {
        HomefeedBuilderListFragment.access$600(HomefeedBuilderListFragment.this).setAllowScrolling(flag);
        View view = getView().findViewById(0x7f0f026a);
        if (view != null)
        {
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    private void setupDatasourceForDismissalAnimation(int i, List list)
    {
        int j = HomefeedBuilderListFragment.access$500(HomefeedBuilderListFragment.this).getAdapterView().getIndexOfNextPageFirstView();
        if (j != -1)
        {
            for (; i < j; i++)
            {
                ((Interest)list.get(i)).setShouldAnimateOnAppear(true);
            }

        }
    }

    public void onEventMainThread(com.pinterest.activity.home.view.tDismissedViewEndEvent tdismissedviewendevent)
    {
        List list = HomefeedBuilderListFragment.access$000(HomefeedBuilderListFragment.this).getDataSource().getItems();
        int i = list.indexOf(tdismissedviewendevent.getInterest());
        if (i != -1)
        {
            HomefeedBuilderListFragment.access$100(HomefeedBuilderListFragment.this).getDataSource().removeItem(i);
            setupDatasourceForDismissalAnimation(i, list);
            HomefeedBuilderListFragment.access$200(HomefeedBuilderListFragment.this).notifyDataSetChanged();
            HomefeedBuilderListFragment.access$300(HomefeedBuilderListFragment.this).reset();
            class _cls2
                implements Runnable
            {

                final HomefeedBuilderListFragment._cls1 this$1;

                public void run()
                {
                    allowTouchEventsOnList(true);
                }

            _cls2()
            {
                this$1 = HomefeedBuilderListFragment._cls1.this;
                super();
            }
            }

            tdismissedviewendevent = new _cls2();
            _handler.postDelayed(tdismissedviewendevent, HomefeedBuilderListAdapter.SCROLL_UP_ON_DISMISSAL_ANIMATION_DURATION);
        }
    }

    public void onEventMainThread(com.pinterest.activity.home.view.tDismissedViewStartEvent tdismissedviewstartevent)
    {
        tdismissedviewstartevent = tdismissedviewstartevent.getInterest();
        class _cls1 extends ApiResponseHandler
        {

            final HomefeedBuilderListFragment._cls1 this$1;

            _cls1()
            {
                this$1 = HomefeedBuilderListFragment._cls1.this;
                super();
            }
        }

        InterestsApi.a(MyUser.getUid(), tdismissedviewstartevent.getUid(), new _cls1(), getApiTag());
        allowTouchEventsOnList(false);
    }


    adeoutDismissedViewStartEvent()
    {
        this$0 = HomefeedBuilderListFragment.this;
        super();
    }
}
