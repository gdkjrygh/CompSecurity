// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.shortcuts.Shortcut;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

class this._cls0
    implements Func1
{

    final RideMap this$0;

    public volatile Object call(Object obj)
    {
        return call((Shortcut)obj);
    }

    public Location call(Shortcut shortcut)
    {
        return shortcut.getLocation();
    }

    ation()
    {
        this$0 = RideMap.this;
        super();
    }
}
