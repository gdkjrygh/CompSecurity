// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.showcase;

import android.os.Handler;
import com.nbcsports.liveextra.library.api.models.AssetList;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.core.SortOrder;
import com.nbcsports.liveextra.ui.main.core.AssetFilter;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import java.util.EnumSet;
import java.util.List;
import javax.inject.Provider;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.main.showcase:
//            ShowcasePresenter, ShowcasePagerView

class this._cls0 extends Subscriber
{

    final ShowcasePresenter this$0;

    public void onCompleted()
    {
        if (!hasView())
        {
            return;
        }
        final Object viewModels;
        if (ShowcasePresenter.access$000(ShowcasePresenter.this) == null)
        {
            viewModels = null;
        } else
        {
            viewModels = (Sport)ShowcasePresenter.access$000(ShowcasePresenter.this).get();
        }
        if (viewModels == null || !((Sport) (viewModels)).isRSN())
        {
            viewModels = EnumSet.of(AssetFilter.RSN);
        } else
        {
            viewModels = EnumSet.noneOf(com/nbcsports/liveextra/ui/main/core/AssetFilter);
        }
        viewModels = ShowcasePresenter.access$200(ShowcasePresenter.this).transform(ShowcasePresenter.access$100(ShowcasePresenter.this), SortOrder.NONE, ((EnumSet) (viewModels)));
        ShowcasePresenter.access$500(ShowcasePresenter.this).post(new Runnable() {

            final ShowcasePresenter._cls1 this$1;
            final List val$viewModels;

            public void run()
            {
                if (ShowcasePresenter.access$300(this$0) == null)
                {
                    return;
                }
                getView().bind(viewModels);
                if (listener != null)
                {
                    listener.onShowcaseListReceived(ShowcasePresenter.access$100(this$0).isEmpty());
                }
                ShowcasePresenter.access$402(this$0, true);
            }

            
            {
                this$1 = ShowcasePresenter._cls1.this;
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
        ShowcasePresenter.access$100(ShowcasePresenter.this).addAll(assetlist);
    }

    public volatile void onNext(Object obj)
    {
        onNext((AssetList)obj);
    }

    _cls1.val.viewModels()
    {
        this$0 = ShowcasePresenter.this;
        super();
    }
}
