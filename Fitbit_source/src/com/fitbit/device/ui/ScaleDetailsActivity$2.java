// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.DialogInterface;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity

class a
    implements android.content.lListener
{

    final ScaleDetailsActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        a.getSupportLoaderManager().getLoader(210).stopLoading();
        a.finish();
    }

    ener(ScaleDetailsActivity scaledetailsactivity)
    {
        a = scaledetailsactivity;
        super();
    }
}
