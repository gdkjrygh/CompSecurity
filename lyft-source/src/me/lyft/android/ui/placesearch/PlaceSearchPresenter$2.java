// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchPresenter

class val.query
    implements Func1
{

    final PlaceSearchPresenter this$0;
    final String val$query;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public Observable call(final List places)
    {
        if (places.size() > PlaceSearchPresenter.access$100(PlaceSearchPresenter.this).getConstants().getSearchFallbackThreshold())
        {
            return Observable.just(places);
        } else
        {
            return PlaceSearchPresenter.access$200(PlaceSearchPresenter.this, val$query).flatMap(new Func1() {

                final PlaceSearchPresenter._cls2 this$1;
                final List val$places;

                public volatile Object call(Object obj)
                {
                    return call((List)obj);
                }

                public Observable call(List list)
                {
                    ArrayList arraylist = new ArrayList(places);
                    arraylist.addAll(list);
                    return Observable.just(arraylist);
                }

            
            {
                this$1 = PlaceSearchPresenter._cls2.this;
                places = list;
                super();
            }
            }).startWith(places);
        }
    }

    _cls1.val.places()
    {
        this$0 = final_placesearchpresenter;
        val$query = String.this;
        super();
    }
}
