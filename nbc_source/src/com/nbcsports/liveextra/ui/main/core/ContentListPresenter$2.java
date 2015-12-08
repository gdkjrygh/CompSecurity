// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.os.Handler;
import com.nbcsports.liveextra.library.api.models.AssetList;
import com.nbcsports.liveextra.library.configuration.Sport;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            ContentListPresenter, AssetViewModelTransformer, ContentListView

class val.filter extends Subscriber
{

    final ContentListPresenter this$0;
    final boolean val$filter;

    public void onCompleted()
    {
        final Object viewModels = listener;
        boolean flag;
        if (ContentListPresenter.this.set.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((stener) (viewModels)).onContentListReceived(flag);
        if (!hasView())
        {
            return;
        }
        AssetViewModelTransformer assetviewmodeltransformer = transformer;
        Set set = ContentListPresenter.this.set;
        if (val$filter)
        {
            if (sport == null)
            {
                viewModels = null;
            } else
            {
                viewModels = (Sport)sport.get();
            }
        } else
        {
            viewModels = null;
        }
        viewModels = assetviewmodeltransformer.transform(set, ((Sport) (viewModels)), getSortOrder(), getFilters());
        handler.post(new Runnable() {

            final ContentListPresenter._cls2 this$1;
            final List val$viewModels;

            public void run()
            {
                if (!hasView())
                {
                    return;
                }
                getView().bind(viewModels, this$0.listener);
                ContentListPresenter.Listener listener = this$0.listener;
                boolean flag1;
                if (set.size() == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                listener.onContentListReceived(flag1);
                ContentListPresenter.access$002(this$0, true);
            }

            
            {
                this$1 = ContentListPresenter._cls2.this;
                viewModels = list;
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

    _cls1.val.viewModels()
    {
        this$0 = final_contentlistpresenter;
        val$filter = Z.this;
        super();
    }
}
