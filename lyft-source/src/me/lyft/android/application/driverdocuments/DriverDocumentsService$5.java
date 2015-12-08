// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driverdocuments;

import me.lyft.android.common.Unit;
import me.lyft.android.domain.driverdocuments.DriverDocumentsMapper;
import me.lyft.android.domain.driverdocuments.Inspection;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.driverdocuments.DriverDocumentsDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.driverdocuments:
//            DriverDocumentsService

class val.inspection
    implements Func1
{

    final DriverDocumentsService this$0;
    final Inspection val$inspection;

    public volatile Object call(Object obj)
    {
        return call((Unit)obj);
    }

    public Observable call(Unit unit)
    {
        unit = new DriverDocumentsDTO(null, null, DriverDocumentsMapper.fromInspection(val$inspection), null);
        return DriverDocumentsService.access$100(DriverDocumentsService.this).updateInsurance(unit);
    }

    O()
    {
        this$0 = final_driverdocumentsservice;
        val$inspection = Inspection.this;
        super();
    }
}
