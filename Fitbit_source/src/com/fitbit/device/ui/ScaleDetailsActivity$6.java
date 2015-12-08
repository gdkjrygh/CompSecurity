// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity

class b
    implements android.widget.tedListener
{

    final ScaleDetailsActivity a;
    private boolean b;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (!b)
        {
            ScaleDetailsActivity.b(a);
            return;
        } else
        {
            b = false;
            return;
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    tener(ScaleDetailsActivity scaledetailsactivity)
    {
        a = scaledetailsactivity;
        super();
        b = true;
    }
}
