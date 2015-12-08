// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import java.util.List;
import org.joda.time.DateTime;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            TimelineGestureWrapper, AssetViewAdapter, TimeLineAdapter, ContentListPresenter

public abstract class ContentListView extends LinearLayout
    implements com.nbcsports.liveextra.content.FavoriteService.FavoriteActionListener, TimeLineAdapter.OnItemClickListener, TimelineGestureWrapper.Listener
{

    protected AssetViewAdapter adapter;
    private android.support.v7.widget.RecyclerView.AdapterDataObserver dataObserver;
    protected TextView empty;
    FavoriteService favorites;
    TimelineGestureWrapper gestureWrapper;
    private Handler handler;
    private long lastHeaderId;
    protected LinearLayoutManager layoutManager;
    private ContentListPresenter.Listener listener;
    SwipeRefreshLayout refresh;
    RecyclerView rv;
    protected android.support.v7.widget.RecyclerView.OnScrollListener scrollListener = new android.support.v7.widget.RecyclerView.OnScrollListener() {

        private static final int HIDE_THRESHOLD = 20;
        public boolean hasScrolled;
        private int scrolledDistance;
        final ContentListView this$0;

        public void onScrollStateChanged(RecyclerView recyclerview, int j)
        {
            super.onScrollStateChanged(recyclerview, j);
            switch (j)
            {
            default:
                return;

            case 0: // '\0'
                hasScrolled = false;
                break;
            }
            scrolledDistance = 0;
        }

        public void onScrolled(RecyclerView recyclerview, int j, int k)
        {
            super.onScrolled(recyclerview, j, k);
            selectTimelineItem();
            if (listener != null && !hasScrolled && getPresenter().canHideTimeline())
            {
                boolean flag;
                if (timelineWrapper.getVisibility() == 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (layoutManager.findFirstCompletelyVisibleItemPosition() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                while (false) 
                {
                    if ((!flag || j == 0) && scrolledDistance > 20 && j == 0 && !flag)
                    {
                        hasScrolled = true;
                        onShowTimeline();
                    }
                    if (j == 0 && k > 0)
                    {
                        scrolledDistance = scrolledDistance + k;
                        return;
                    }
                }
            }
        }

            
            {
                this$0 = ContentListView.this;
                super();
                scrolledDistance = 0;
            }
    };
    RecyclerView timeline;
    protected TimeLineAdapter timelineAdapter;
    protected View timelineWrapper;

    public ContentListView(Context context)
    {
        this(context, null);
    }

    public ContentListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContentListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        handler = new Handler();
        inject();
    }

    private void initTimeline()
    {
        timeline.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        if (listener != null)
        {
            gestureWrapper.setListener(this);
        }
    }

    private void selectTimelineItem()
    {
        long l;
        if (adapter != null && layoutManager != null)
        {
            if (lastHeaderId != (l = adapter.getHeaderId(layoutManager.findFirstVisibleItemPosition())))
            {
                lastHeaderId = l;
                final int position = timelineAdapter.findPositionByTime(Long.valueOf(l));
                handler.post(new Runnable() {

                    final ContentListView this$0;
                    final int val$position;

                    public void run()
                    {
                        if (timeline == null || timelineAdapter == null)
                        {
                            return;
                        } else
                        {
                            timeline.getLayoutManager().scrollToPosition(position);
                            timelineAdapter.selectItem(position);
                            return;
                        }
                    }

            
            {
                this$0 = ContentListView.this;
                position = i;
                super();
            }
                });
                return;
            }
        }
    }

    public void bind(List list, final ContentListPresenter.Listener decor)
    {
        listener = decor;
        if (gestureWrapper != null)
        {
            gestureWrapper.setListener(this);
        }
        if (adapter == null)
        {
            adapter = new AssetViewAdapter(getContext(), decor.getPageInfo(), showRelativeDateHeader());
            rv.setAdapter(adapter);
            decor = new StickyRecyclerHeadersDecoration(adapter);
            rv.addItemDecoration(decor);
            dataObserver = new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

                final ContentListView this$0;
                final StickyRecyclerHeadersDecoration val$decor;

                public void onChanged()
                {
                    ContentListView contentlistview = ContentListView.this;
                    boolean flag;
                    if (adapter.getItemCount() == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    contentlistview.onContentListReceived(flag);
                    decor.invalidateHeaders();
                }

                public void onItemRangeChanged(int i, int j)
                {
                    super.onItemRangeChanged(i, j);
                    ContentListView contentlistview = ContentListView.this;
                    boolean flag;
                    if (adapter.getItemCount() == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    contentlistview.onContentListReceived(flag);
                    decor.invalidateHeaders();
                }

                public void onItemRangeRemoved(int i, int j)
                {
                    super.onItemRangeRemoved(i, j);
                    ContentListView contentlistview = ContentListView.this;
                    boolean flag;
                    if (adapter.getItemCount() == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    contentlistview.onContentListReceived(flag);
                    decor.invalidateHeaders();
                }

            
            {
                this$0 = ContentListView.this;
                decor = stickyrecyclerheadersdecoration;
                super();
            }
            };
            adapter.registerAdapterDataObserver(dataObserver);
            timelineAdapter = new TimeLineAdapter(getContext(), this);
            timeline.setAdapter(timelineAdapter);
        }
        adapter.update(list);
        timelineAdapter.update(list);
    }

    protected boolean canRefresh()
    {
        return true;
    }

    public com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo getPageInfo()
    {
        if (listener != null)
        {
            return listener.getPageInfo();
        } else
        {
            return null;
        }
    }

    protected abstract ContentListPresenter getPresenter();

    protected abstract void inject();

    public void onAdded(Asset asset)
    {
        adapter.notifyDataSetChanged();
        Toast.makeText(getContext(), 0x7f07010c, 0).show();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.bind(this);
        favorites.register(this);
        initTimeline();
        layoutManager = new LinearLayoutManager(getContext());
        rv.setLayoutManager(layoutManager);
        rv.addOnScrollListener(scrollListener);
        refresh.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final ContentListView this$0;

            public void onRefresh()
            {
                if (!canRefresh())
                {
                    return;
                } else
                {
                    getPresenter().refresh();
                    return;
                }
            }

            
            {
                this$0 = ContentListView.this;
                super();
            }
        });
    }

    public void onContentListReceived(boolean flag)
    {
        TextView textview = empty;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        refresh.setRefreshing(false);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        favorites.unregister(this);
        if (dataObserver != null && adapter != null)
        {
            adapter.unregisterAdapterDataObserver(dataObserver);
        }
        rv.removeOnScrollListener(null);
        ButterKnife.unbind(this);
    }

    public void onHideTimeline()
    {
        if (getPresenter().canHideTimeline())
        {
            timelineWrapper.setVisibility(8);
        }
    }

    public void onItemClick(final DateTime date)
    {
        Observable.create(new rx.Observable.OnSubscribe() {

            final ContentListView this$0;
            final DateTime val$date;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                subscriber.onNext(Integer.valueOf(adapter.findFirstPositionForDate(date)));
                subscriber.onCompleted();
            }

            
            {
                this$0 = ContentListView.this;
                date = datetime;
                super();
            }
        }).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final ContentListView this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public void onNext(Integer integer)
            {
                post(integer. new Runnable() {

                    final _cls5 this$1;
                    final Integer val$position;

                    public void run()
                    {
                        layoutManager.scrollToPositionWithOffset(position.intValue(), 0);
                    }

            
            {
                this$1 = final__pcls5;
                position = Integer.this;
                super();
            }
                });
            }

            public volatile void onNext(Object obj)
            {
                onNext((Integer)obj);
            }

            
            {
                this$0 = ContentListView.this;
                super();
            }
        });
    }

    public void onRemove(Asset asset)
    {
        adapter.notifyDataSetChanged();
        Toast.makeText(getContext(), 0x7f07010e, 0).show();
    }

    public void onShowTimeline()
    {
        timelineWrapper.setVisibility(0);
    }

    public void setListener(ContentListPresenter.Listener listener1)
    {
        getPresenter().setListener(listener1);
    }

    protected boolean showRelativeDateHeader()
    {
        return true;
    }


}
