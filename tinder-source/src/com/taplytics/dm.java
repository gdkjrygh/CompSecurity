// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.Handler;
import android.widget.TextView;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            el, dk, dj, cv, 
//            dn, gs, gd, fz

final class dm
    implements el
{

    final dk a;

    dm(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void a(Exception exception)
    {
        cv.b(a.f.a, false);
        a.d.setText("There has been an error uploading your view.");
        a.a.setText("Please try again.");
        exception = new dn(this);
        a.e.postDelayed(exception, 1700L);
    }

    public final void a(JSONObject jsonobject)
    {
        if (gs.b())
        {
            gs.a("Sent view to server.");
        }
        a.d.setText(gd.a(cv.h(a.f.a)));
        a.a.setText(gd.b(cv.h(a.f.a)));
        cv.i(a.f.a).a();
        cv.a(a.f.a, false);
        cv.b(a.f.a, false);
    }
}
