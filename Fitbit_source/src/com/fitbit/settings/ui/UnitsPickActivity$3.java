// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import com.fitbit.data.domain.r;

// Referenced classes of package com.fitbit.settings.ui:
//            UnitsPickActivity

class a
    implements android.widget.lectedListener
{

    final UnitsPickActivity a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = r.e();
        view = (com.fitbit.data.domain.nits)UnitsPickActivity.c(a).get(i);
        if (!view.equals(adapterview))
        {
            r.a(view);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    nits(UnitsPickActivity unitspickactivity)
    {
        a = unitspickactivity;
        super();
    }
}
