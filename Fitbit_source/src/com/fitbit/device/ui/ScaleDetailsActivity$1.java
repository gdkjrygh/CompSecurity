// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.support.v4.app.LoaderManager;
import com.fitbit.home.ui.l;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity

class a
    implements com.fitbit.home.ui._cls1
{

    final ScaleDetailsActivity a;

    public void a(l l1)
    {
        l1.c();
        a.getSupportLoaderManager().restartLoader(210, null, a);
    }

    (ScaleDetailsActivity scaledetailsactivity)
    {
        a = scaledetailsactivity;
        super();
    }
}
