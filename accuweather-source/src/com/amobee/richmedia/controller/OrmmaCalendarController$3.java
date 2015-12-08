// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.DialogInterface;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaCalendarController

class val.entries
    implements android.content.tener
{

    final OrmmaCalendarController this$0;
    private final List val$entries;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Map map = (Map)val$entries.get(i);
        OrmmaCalendarController.access$11(OrmmaCalendarController.this, Integer.parseInt((String)map.get("ID")), OrmmaCalendarController.access$2(OrmmaCalendarController.this), OrmmaCalendarController.access$3(OrmmaCalendarController.this), OrmmaCalendarController.access$4(OrmmaCalendarController.this), OrmmaCalendarController.access$5(OrmmaCalendarController.this), OrmmaCalendarController.access$6(OrmmaCalendarController.this), OrmmaCalendarController.access$7(OrmmaCalendarController.this), OrmmaCalendarController.access$8(OrmmaCalendarController.this), OrmmaCalendarController.access$9(OrmmaCalendarController.this), OrmmaCalendarController.access$10(OrmmaCalendarController.this));
        dialoginterface.cancel();
    }

    ()
    {
        this$0 = final_ormmacalendarcontroller;
        val$entries = List.this;
        super();
    }
}
