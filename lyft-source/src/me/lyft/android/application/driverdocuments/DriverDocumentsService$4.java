// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driverdocuments;

import me.lyft.android.infrastructure.lyft.driverdocuments.DriverDocumentsDTO;
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.driverdocuments:
//            DriverDocumentsService

class this._cls0
    implements Action1
{

    final DriverDocumentsService this$0;

    public volatile void call(Object obj)
    {
        call((DriverDocumentsDTO)obj);
    }

    public void call(DriverDocumentsDTO driverdocumentsdto)
    {
        DriverDocumentsService.access$000(DriverDocumentsService.this).setDriverDocuments(driverdocumentsdto);
    }

    O()
    {
        this$0 = DriverDocumentsService.this;
        super();
    }
}
