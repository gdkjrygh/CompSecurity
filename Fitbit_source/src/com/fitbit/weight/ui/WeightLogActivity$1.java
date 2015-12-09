// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.content.Context;
import android.util.Pair;
import com.fitbit.data.bl.f;
import com.fitbit.data.bl.fs;
import com.fitbit.data.bl.gd;
import com.fitbit.data.domain.BodyFat;
import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.util.bf;
import com.fitbit.weight.Fat;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.weight.ui:
//            WeightLogActivity

class a extends bf
{

    final Date a;
    final WeightLogActivity b;

    protected Pair a()
    {
        List list = gd.a().b(a);
        Object obj = null;
        if (list.size() != 0)
        {
            BodyFatLogEntry bodyfatlogentry = f.a().b(((WeightLogEntry)list.get(list.size() - 1)).getLogDate());
            if (bodyfatlogentry != null)
            {
                obj = new BodyFat();
                ((BodyFat) (obj)).a(bodyfatlogentry.getLogDate());
                ((BodyFat) (obj)).a(bodyfatlogentry.a().b());
            } else
            {
                obj = (BodyFat)fs.a().a(com.fitbit.data.domain.eSeriesResourceType.BODY_FAT, ((WeightLogEntry)list.get(list.size() - 1)).getLogDate());
            }
            obj = new Pair(list.get(list.size() - 1), obj);
        }
        return ((Pair) (obj));
    }

    protected Object f_()
    {
        return a();
    }

    imeSeriesResourceType(WeightLogActivity weightlogactivity, Context context, Date date)
    {
        b = weightlogactivity;
        a = date;
        super(context);
    }
}
