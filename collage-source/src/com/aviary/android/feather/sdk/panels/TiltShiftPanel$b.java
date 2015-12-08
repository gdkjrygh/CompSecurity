// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import com.aviary.android.feather.common.utils.os.a;
import com.aviary.android.feather.headless.filters.NativeToolFilter;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.library.services.IAviaryController;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            TiltShiftPanel

class roller.a extends a
{

    ProgressDialog a;
    final TiltShiftPanel b;

    protected transient Void a(Void avoid[])
    {
        if (TiltShiftPanel.e(b) != null)
        {
            while (TiltShiftPanel.e(b) != null && !TiltShiftPanel.e(b).d()) 
            {
                b.q.q((new StringBuilder()).append("waiting.... ").append(TiltShiftPanel.e(b).e()).toString());
                try
                {
                    Thread.sleep(50L);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                }
            }
        }
        b.t.a(TiltShiftPanel.c(b).a().a(0));
        return null;
    }

    protected void a()
    {
        a.setTitle(b.B().a().getString(com.aviary.android.feather.sdk.loading_title));
        a.setMessage(b.B().a().getString(com.aviary.android.feather.sdk.effect_loading_message));
        a.setIndeterminate(true);
        a.setCancelable(false);
        a.show();
    }

    protected volatile void a(Object obj)
    {
        a((Void)obj);
    }

    protected void a(Void void1)
    {
        if (b.B().b().isFinishing())
        {
            return;
        }
        if (a.isShowing())
        {
            try
            {
                a.dismiss();
            }
            // Misplaced declaration of an exception variable
            catch (Void void1) { }
        }
        b.a(b.f, b.t);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    ilter(TiltShiftPanel tiltshiftpanel)
    {
        b = tiltshiftpanel;
        super();
        a = new ProgressDialog(b.B().a());
    }
}
