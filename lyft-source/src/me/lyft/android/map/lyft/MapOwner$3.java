// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft;

import me.lyft.android.map.core.IMap;
import me.lyft.android.map.core.camera.MapBound;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.map.lyft:
//            MapOwner

class this._cls0
    implements Func1
{

    final MapOwner this$0;

    public volatile Object call(Object obj)
    {
        return call((MapBound)obj);
    }

    public Observable call(MapBound mapbound)
    {
        return MapOwner.access$100(MapOwner.this).animateCamera(mapbound);
    }

    ound()
    {
        this$0 = MapOwner.this;
        super();
    }
}
