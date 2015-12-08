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
//            ContentListPresenter, ContentListView, AssetViewModelTransformer

class val.viewModels
    implements Runnable
{

    final is._cls0 this$1;
    final List val$viewModels;

    public void run()
    {
        if (!hasView())
        {
            return;
        }
        getView().bind(val$viewModels, listener);
        ener ener = listener;
        boolean flag;
        if (set.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ener.onContentListReceived(flag);
        ContentListPresenter.access$002(_fld0, true);
    }

    l.filter()
    {
        this$1 = final_filter;
        val$viewModels = List.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/main/core/ContentListPresenter$2

/* anonymous class */
    class ContentListPresenter._cls2 extends Subscriber
    {

        final ContentListPresenter this$0;
        final boolean val$filter;

        public void onCompleted()
        {
            Object obj = listener;
            boolean flag;
            if (ContentListPresenter.this.set.size() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((ContentListPresenter.Listener) (obj)).onContentListReceived(flag);
            if (!hasView())
            {
                return;
            }
            AssetViewModelTransformer assetviewmodeltransformer = transformer;
            Set set = ContentListPresenter.this.set;
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
            obj = assetviewmodeltransformer.transform(set, ((Sport) (obj)), getSortOrder(), getFilters());
            handler.post(((ContentListPresenter._cls2._cls1) (obj)). new ContentListPresenter._cls2._cls1());
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
                this$0 = final_contentlistpresenter;
                filter = Z.this;
                super();
            }
    }

}
