// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            DestinyService, IDestinySession

class val.destination
    implements Action1
{

    final DestinyService this$0;
    final Location val$destination;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        DestinyService.access$000(DestinyService.this).setLocation(val$destination);
        DestinyService.access$000(DestinyService.this).setInDestinyEditMode(false);
    }

    ()
    {
        this$0 = final_destinyservice;
        val$destination = Location.this;
        super();
    }
}
