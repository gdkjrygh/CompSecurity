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

class val.places
    implements Func1
{

    final val.places this$1;
    final List val$places;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public Observable call(List list)
    {
        ArrayList arraylist = new ArrayList(val$places);
        arraylist.addAll(list);
        return Observable.just(arraylist);
    }

    l.query()
    {
        this$1 = final_query;
        val$places = List.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/placesearch/PlaceSearchPresenter$2

/* anonymous class */
    class PlaceSearchPresenter._cls2
        implements Func1
    {

        final PlaceSearchPresenter this$0;
        final String val$query;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public Observable call(List list)
        {
            if (list.size() > PlaceSearchPresenter.access$100(PlaceSearchPresenter.this).getConstants().getSearchFallbackThreshold())
            {
                return Observable.just(list);
            } else
            {
                return PlaceSearchPresenter.access$200(PlaceSearchPresenter.this, query).flatMap(list. new PlaceSearchPresenter._cls2._cls1()).startWith(list);
            }
        }

            
            {
                this$0 = final_placesearchpresenter;
                query = String.this;
                super();
            }
    }

}
