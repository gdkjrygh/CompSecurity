// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            DestinyService, IDestinySession

class this._cls0
    implements Action1
{

    final DestinyService this$0;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        DestinyService.access$000(DestinyService.this).setLocation(NullLocation.getInstance());
        DestinyService.access$000(DestinyService.this).setInDestinyEditMode(false);
    }

    ()
    {
        this$0 = DestinyService.this;
        super();
    }
}
