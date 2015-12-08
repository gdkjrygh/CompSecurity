// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.DialogInterface;
import com.amobee.richmedia.view.AmobeeView;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaCalendarController

class this._cls0
    implements android.content.tener
{

    final OrmmaCalendarController this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        OrmmaCalendarController.access$1(OrmmaCalendarController.this).raiseError("Create calendar event canceled by the user.", "createCalendarEvent");
    }

    ()
    {
        this$0 = OrmmaCalendarController.this;
        super();
    }
}
