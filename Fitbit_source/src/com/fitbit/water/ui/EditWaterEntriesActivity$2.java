// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import com.fitbit.data.bl.gc;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.r;
import com.fitbit.water.Water;
import java.util.List;

// Referenced classes of package com.fitbit.water.ui:
//            EditWaterEntriesActivity

class a extends gc
{

    final EditWaterEntriesActivity a;

    protected void c()
    {
        if (EditWaterEntriesActivity.c(a).b().isEmpty())
        {
            a.finish();
        } else
        {
            int i;
            if (EditWaterEntriesActivity.c(a).d().b() == 0.0D)
            {
                EditWaterEntriesActivity.d(a).setVisibility(0);
            } else
            {
                EditWaterEntriesActivity.d(a).setVisibility(8);
            }
            EditWaterEntriesActivity.a(a, EditWaterEntriesActivity.c(a).b());
            EditWaterEntriesActivity.e(a).notifyDataSetChanged();
            EditWaterEntriesActivity.a(a, r.e());
            i = 0;
            while (i < EditWaterEntriesActivity.a(a).size()) 
            {
                WaterLogEntry waterlogentry = (WaterLogEntry)EditWaterEntriesActivity.a(a).get(i);
                waterlogentry.a(waterlogentry.e().a(EditWaterEntriesActivity.b(a)));
                i++;
            }
        }
    }

    (EditWaterEntriesActivity editwaterentriesactivity, Context context)
    {
        a = editwaterentriesactivity;
        super(context);
    }
}
