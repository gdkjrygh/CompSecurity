// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft;

import me.lyft.android.map.core.IMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.map.lyft:
//            MapOwner

class this._cls0
    implements Action1
{

    final MapOwner this$0;

    public volatile void call(Object obj)
    {
        call((IMap)obj);
    }

    public void call(IMap imap)
    {
        MapOwner.access$000(MapOwner.this, imap);
    }

    ()
    {
        this$0 = MapOwner.this;
        super();
    }
}
