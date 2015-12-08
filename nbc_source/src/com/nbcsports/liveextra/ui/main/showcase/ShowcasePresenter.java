// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.showcase;

import android.os.Handler;
import android.os.Looper;
import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.library.api.models.AssetList;
import com.nbcsports.liveextra.library.api.models.FeaturedContent;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.core.SortOrder;
import com.nbcsports.liveextra.ui.main.core.AssetFilter;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import javax.inject.Provider;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.HandlerScheduler;
import rx.functions.Func1;
import rx.subscriptions.CompositeSubscription;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.main.showcase:
//            ShowcasePagerView

public class ShowcasePresenter
{
    public static interface Listener
    {

        public abstract void onShowcaseListReceived(boolean flag);
    }


    private Handler handler;
    private boolean hasLoaded;
    protected Listener listener;
    private final ContentService service;
    private List set;
    private Provider sport;
    protected CompositeSubscription subscriptions;
    private final AssetViewModelTransformer transformer;
    private ShowcasePagerView view;

    public ShowcasePresenter(ContentService contentservice, AssetViewModelTransformer assetviewmodeltransformer, Provider provider)
    {
        set = new ArrayList();
        service = contentservice;
        transformer = assetviewmodeltransformer;
        sport = provider;
        handler = new Handler(Looper.getMainLooper());
    }

    private void loadData()
    {
        set.clear();
        Object obj;
        if (sport.get() == null)
        {
            obj = service.loadFeaturedContent();
        } else
        {
            obj = service.loadFeaturedSportContent(((Sport)sport.get()).getCode());
        }
        obj = ((Observable) (obj)).observeOn(HandlerScheduler.from(handler)).map(new Func1() {

            final ShowcasePresenter this$0;

            public AssetList call(FeaturedContent featuredcontent)
            {
                return featuredcontent.getShowCase();
            }

            public volatile Object call(Object obj1)
            {
                return call((FeaturedContent)obj1);
            }

            
            {
                this$0 = ShowcasePresenter.this;
                super();
            }
        }).subscribe(new Subscriber() {

            final ShowcasePresenter this$0;

            public void onCompleted()
            {
                if (!hasView())
                {
                    return;
                }
                Object obj1;
                if (sport == null)
                {
                    obj1 = null;
                } else
                {
                    obj1 = (Sport)sport.get();
                }
                if (obj1 == null || !((Sport) (obj1)).isRSN())
                {
                    obj1 = EnumSet.of(AssetFilter.RSN);
                } else
                {
                    obj1 = EnumSet.noneOf(com/nbcsports/liveextra/ui/main/core/AssetFilter);
                }
                obj1 = transformer.transform(set, SortOrder.NONE, ((EnumSet) (obj1)));
                handler.post(((_cls1) (obj1)). new Runnable() {

                    final _cls1 this$1;
                    final List val$viewModels;

                    public void run()
                    {
                        if (view == null)
                        {
                            return;
                        }
                        getView().bind(viewModels);
                        if (listener != null)
                        {
                            listener.onShowcaseListReceived(set.isEmpty());
                        }
                        hasLoaded = true;
                    }

            
            {
                this$1 = final__pcls1;
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

            public volatile void onNext(Object obj1)
            {
                onNext((AssetList)obj1);
            }

            
            {
                this$0 = ShowcasePresenter.this;
                super();
            }
        });
        subscriptions.add(((rx.Subscription) (obj)));
    }

    protected void bindView(ShowcasePagerView showcasepagerview)
    {
        view = showcasepagerview;
    }

    public ShowcasePagerView getView()
    {
        return view;
    }

    public boolean hasView()
    {
        return view != null;
    }

    public void hide()
    {
        view.hide();
    }

    public void onLoad()
    {
        if (!hasView())
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
        onLoad();
    }

    public void releaseView()
    {
        view = null;
        if (subscriptions != null)
        {
            subscriptions.unsubscribe();
        }
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
        if (hasLoaded)
        {
            listener1.onShowcaseListReceived(set.isEmpty());
        }
    }

    public void show()
    {
        view.show();
    }






/*
    static boolean access$402(ShowcasePresenter showcasepresenter, boolean flag)
    {
        showcasepresenter.hasLoaded = flag;
        return flag;
    }

*/

}
