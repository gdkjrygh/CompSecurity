// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.ArrayList;
import java.util.List;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService

class this._cls0
    implements Func2
{

    final GeoService this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((ArrayList)obj, (List)obj1);
    }

    public ArrayList call(ArrayList arraylist, List list)
    {
        arraylist.add(GeoService.access$400(GeoService.this, list));
        return arraylist;
    }

    ()
    {
        this$0 = GeoService.this;
        super();
    }
}
