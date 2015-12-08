// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.AssetList;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.content:
//            FavoriteService

class this._cls1
    implements Predicate
{

    final evaluate this$1;

    public boolean evaluate(Asset asset)
    {
        boolean flag1 = false;
        if (!isLive) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (!asset.isLive())
            {
                flag = flag1;
                if (!asset.isFuture())
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!asset.isLive())
        {
            flag = flag1;
            if (!asset.isFuture())
            {
                return true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((Asset)obj);
    }

    l.isLive()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/content/FavoriteService$2

/* anonymous class */
    class FavoriteService._cls2
        implements rx.Observable.OnSubscribe
    {

        final FavoriteService this$0;
        final boolean val$isLive;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            java.util.List list = getAllFavorites();
            CollectionUtils.filter(list, new FavoriteService._cls2._cls1());
            subscriber.onNext(new AssetList(list));
            subscriber.onCompleted();
        }

            
            {
                this$0 = final_favoriteservice;
                isLive = Z.this;
                super();
            }
    }

}
