// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import com.nbcsports.liveextra.content.models.FavoriteItem;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.AssetList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.joda.time.DateTime;
import rx.Observable;
import rx.Subscriber;

public class FavoriteService
{
    public static interface FavoriteActionListener
    {

        public abstract void onAdded(Asset asset);

        public abstract void onRemove(Asset asset);
    }


    private List listeners;

    public FavoriteService()
    {
        listeners = new ArrayList();
    }

    public void addFavorite(Asset asset)
    {
        String s = asset.getCoalescedEventId();
        if (FavoriteItem.find(com/nbcsports/liveextra/content/models/FavoriteItem, "asset_id = ?", new String[] {
    s
}).isEmpty())
        {
            FavoriteItem favoriteitem = new FavoriteItem();
            favoriteitem.setAssetId(s);
            favoriteitem.setCreatedDate(DateTime.now().toString());
            favoriteitem.setAsset(asset);
            favoriteitem.save();
        }
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((FavoriteActionListener)iterator.next()).onAdded(asset)) { }
    }

    public void deleteFavorite(String s)
    {
        Asset asset = getFavorite(s);
        if (asset != null)
        {
            FavoriteItem.deleteAll(com/nbcsports/liveextra/content/models/FavoriteItem, "asset_id = ?", new String[] {
                s
            });
            for (s = listeners.iterator(); s.hasNext(); ((FavoriteActionListener)s.next()).onRemove(asset)) { }
        }
    }

    public List getAllFavorites()
    {
        Iterator iterator = FavoriteItem.findAll(com/nbcsports/liveextra/content/models/FavoriteItem);
        if (iterator.hasNext())
        {
            return getFavoriteAssets(iterator);
        } else
        {
            return new ArrayList();
        }
    }

    public Asset getFavorite(String s)
    {
        Object obj = null;
        List list = FavoriteItem.find(com/nbcsports/liveextra/content/models/FavoriteItem, "asset_id = ?", new String[] {
            s
        });
        s = obj;
        if (list.size() > 0)
        {
            s = ((FavoriteItem)list.get(0)).getAsset();
        }
        return s;
    }

    public List getFavoriteAssets(Iterator iterator)
    {
        return new ArrayList(CollectionUtils.collect(iterator, new Transformer() {

            final FavoriteService this$0;

            public Asset transform(FavoriteItem favoriteitem)
            {
                return favoriteitem.getAsset();
            }

            public volatile Object transform(Object obj)
            {
                return transform((FavoriteItem)obj);
            }

            
            {
                this$0 = FavoriteService.this;
                super();
            }
        }));
    }

    public Observable getStoredFavoritesObservable(final boolean isLive)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final FavoriteService this$0;
            final boolean val$isLive;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                List list = getAllFavorites();
                CollectionUtils.filter(list, new Predicate() {

                    final _cls2 this$1;

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

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                subscriber.onNext(new AssetList(list));
                subscriber.onCompleted();
            }

            
            {
                this$0 = FavoriteService.this;
                isLive = flag;
                super();
            }
        });
    }

    public boolean isFavorite(String s)
    {
        return s != null && getFavorite(s) != null;
    }

    public void register(FavoriteActionListener favoriteactionlistener)
    {
        this;
        JVM INSTR monitorenter ;
        listeners.add(favoriteactionlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        favoriteactionlistener;
        throw favoriteactionlistener;
    }

    public void toggle(Asset asset)
    {
        if (getFavorite(asset.getCoalescedEventId()) != null)
        {
            deleteFavorite(asset.getCoalescedEventId());
            return;
        } else
        {
            addFavorite(asset);
            return;
        }
    }

    public void unregister(FavoriteActionListener favoriteactionlistener)
    {
        this;
        JVM INSTR monitorenter ;
        listeners.remove(favoriteactionlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        favoriteactionlistener;
        throw favoriteactionlistener;
    }
}
