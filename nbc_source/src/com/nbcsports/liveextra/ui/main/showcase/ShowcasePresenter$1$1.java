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

class val.viewModels
    implements Runnable
{

    final is._cls0 this$1;
    final List val$viewModels;

    public void run()
    {
        if (ShowcasePresenter.access$300(_fld0) == null)
        {
            return;
        }
        getView().bind(val$viewModels);
        if (listener != null)
        {
            listener.onShowcaseListReceived(ShowcasePresenter.access$100(_fld0).isEmpty());
        }
        ShowcasePresenter.access$402(_fld0, true);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$viewModels = List.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/main/showcase/ShowcasePresenter$1

/* anonymous class */
    class ShowcasePresenter._cls1 extends Subscriber
    {

        final ShowcasePresenter this$0;

        public void onCompleted()
        {
            if (!hasView())
            {
                return;
            }
            Object obj;
            if (ShowcasePresenter.access$000(ShowcasePresenter.this) == null)
            {
                obj = null;
            } else
            {
                obj = (Sport)ShowcasePresenter.access$000(ShowcasePresenter.this).get();
            }
            if (obj == null || !((Sport) (obj)).isRSN())
            {
                obj = EnumSet.of(AssetFilter.RSN);
            } else
            {
                obj = EnumSet.noneOf(com/nbcsports/liveextra/ui/main/core/AssetFilter);
            }
            obj = ShowcasePresenter.access$200(ShowcasePresenter.this).transform(ShowcasePresenter.access$100(ShowcasePresenter.this), SortOrder.NONE, ((EnumSet) (obj)));
            ShowcasePresenter.access$500(ShowcasePresenter.this).post(((ShowcasePresenter._cls1._cls1) (obj)). new ShowcasePresenter._cls1._cls1());
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

            
            {
                this$0 = ShowcasePresenter.this;
                super();
            }
    }

}
