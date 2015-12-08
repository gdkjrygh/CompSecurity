// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.os.Handler;
import android.os.Looper;
import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.library.api.models.AssetList;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.core.SortOrder;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.HandlerScheduler;
import rx.functions.Func1;
import rx.subscriptions.CompositeSubscription;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            ContentListView, AssetViewModelTransformer

public abstract class ContentListPresenter
{
    public static interface Listener
    {

        public abstract com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo getPageInfo();

        public abstract void onContentListLoading();

        public abstract void onContentListReceived(boolean flag);
    }


    protected Handler handler;
    private boolean hasLoaded;
    protected Listener listener;
    protected final ContentService service;
    Set set;
    protected Provider sport;
    protected CompositeSubscription subscriptions;
    protected final AssetViewModelTransformer transformer;
    private ContentListView view;

    public ContentListPresenter(ContentService contentservice, AssetViewModelTransformer assetviewmodeltransformer, Provider provider)
    {
        set = new HashSet();
        listener = new Listener() {

            final ContentListPresenter this$0;

            public com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo getPageInfo()
            {
                return null;
            }

            public void onContentListLoading()
            {
            }

            public void onContentListReceived(boolean flag)
            {
            }

            
            {
                this$0 = ContentListPresenter.this;
                super();
            }
        };
        service = contentservice;
        transformer = assetviewmodeltransformer;
        sport = provider;
        handler = new Handler(Looper.getMainLooper());
    }

    public void bindView(ContentListView contentlistview)
    {
        view = contentlistview;
        onLoad();
    }

    public boolean canHideTimeline()
    {
        return false;
    }

    protected abstract EnumSet getFilters();

    protected abstract SortOrder getSortOrder();

    public Subscriber getSubscriber(final boolean filter)
    {
        set.clear();
        return new Subscriber() {

            final ContentListPresenter this$0;
            final boolean val$filter;

            public void onCompleted()
            {
                Object obj = listener;
                boolean flag;
                if (set.size() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((Listener) (obj)).onContentListReceived(flag);
                if (!hasView())
                {
                    return;
                }
                AssetViewModelTransformer assetviewmodeltransformer = transformer;
                Set set1 = set;
                if (filter)
                {
                    if (sport == null)
                    {
                        obj = null;
                    } else
                    {
                        obj = (Sport)sport.get();
                    }
                } else
                {
                    obj = null;
                }
                obj = assetviewmodeltransformer.transform(set1, ((Sport) (obj)), getSortOrder(), getFilters());
                handler.post(((_cls1) (obj)). new Runnable() {

                    final _cls2 this$1;
                    final List val$viewModels;

                    public void run()
                    {
                        if (!hasView())
                        {
                            return;
                        }
                        getView().bind(viewModels, listener);
                        Listener listener1 = listener;
                        boolean flag;
                        if (set.size() == 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        listener1.onContentListReceived(flag);
                        hasLoaded = true;
                    }

            
            {
                this$1 = final__pcls2;
                viewModels = List.this;
                super();
            }
                });
            }

            public void onError(Throwable throwable)
            {
                Timber.w(throwable.getMessage(), new Object[0]);
                onCompleted();
            }

            public void onNext(AssetList assetlist)
            {
                set.addAll(assetlist);
            }

            public volatile void onNext(Object obj)
            {
                onNext((AssetList)obj);
            }

            
            {
                this$0 = ContentListPresenter.this;
                filter = flag;
                super();
            }
        };
    }

    public ContentListView getView()
    {
        return view;
    }

    public boolean hasView()
    {
        return view != null;
    }

    protected abstract void loadData();

    protected void onLoad()
    {
        while (!hasView() || hasLoaded) 
        {
            return;
        }
        if (subscriptions != null && !subscriptions.isUnsubscribed())
        {
            subscriptions.unsubscribe();
        }
        subscriptions = new CompositeSubscription();
        loadData();
    }

    public void refresh()
    {
        service.evictAll();
        hasLoaded = false;
        view.onHideTimeline();
        onLoad();
    }

    public void releaseView()
    {
        view = null;
        hasLoaded = false;
        if (subscriptions != null)
        {
            subscriptions.unsubscribe();
        }
    }

    protected void reset()
    {
        set.clear();
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
        if (hasLoaded)
        {
            listener1.onContentListReceived(set.isEmpty());
        }
    }

    public void subscribe(Observable observable, Func1 func1)
    {
        observable = observable.map(func1).observeOn(HandlerScheduler.from(handler)).subscribe(getSubscriber(false));
        subscriptions.add(observable);
    }

    public transient void subscribe(Observable aobservable[])
    {
        if (aobservable.length == 0)
        {
            listener.onContentListReceived(true);
            return;
        } else
        {
            Observable.merge(aobservable).observeOn(HandlerScheduler.from(handler)).subscribe(getSubscriber(true));
            return;
        }
    }


/*
    static boolean access$002(ContentListPresenter contentlistpresenter, boolean flag)
    {
        contentlistpresenter.hasLoaded = flag;
        return flag;
    }

*/
}
