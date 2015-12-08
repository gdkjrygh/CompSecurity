// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.adapter;

import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.api.ApiResponse;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.application.Resources;
import com.pinterest.reporting.CrashReporting;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.activity.sendapin.adapter:
//            PeopleSearchAdapter

class val.response extends BackgroundTask
{

    final this._cls1 this$1;
    final ApiResponse val$response;

    public void run()
    {
        try
        {
            cess._mth100(this._cls1.this, val$response);
            return;
        }
        catch (SecurityException securityexception)
        {
            CrashReporting.a(securityexception);
        }
        TypeAheadItem typeaheaditem = new TypeAheadItem();
        typeaheaditem.setItemType(com.pinterest.activity.search.model.ERMISSION);
        typeaheaditem.setTitle(Resources.string(0x7f07017b));
        ArrayList arraylist = new ArrayList();
        arraylist.add(typeaheaditem);
        addToDataSet(cess._mth200(this._cls1.this), arraylist);
    }

    ()
    {
        this$1 = final_;
        val$response = ApiResponse.this;
        super();
    }
}
