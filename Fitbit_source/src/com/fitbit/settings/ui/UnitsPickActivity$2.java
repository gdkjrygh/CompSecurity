// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;

// Referenced classes of package com.fitbit.settings.ui:
//            UnitsPickActivity

class a
    implements android.widget.lectedListener
{

    final UnitsPickActivity a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = an.a().b();
        view = (com.fitbit.data.domain.tUnits)UnitsPickActivity.b(a).get(i);
        if (!view.equals(adapterview.w()))
        {
            adapterview.a(view);
            an.a().a(adapterview, a);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    tUnits(UnitsPickActivity unitspickactivity)
    {
        a = unitspickactivity;
        super();
    }
}
