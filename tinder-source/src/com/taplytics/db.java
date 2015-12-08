// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.taplytics:
//            ci, cv, hk, turkey, 
//            gs

final class db
    implements Runnable
{

    final String a;
    final cv b;

    db(cv cv1, String s)
    {
        b = cv1;
        a = s;
        super();
    }

    public final void run()
    {
        try
        {
            if (ci.b().g && ci.b().l && hk.a(cv.d(b)) && cv.h(b) == turkey.a && cv.s(b))
            {
                TextView textview = (TextView)cv.d(b).findViewById(0x17ccbc34);
                if (textview.getText().toString().contains(a) && textview.getText().toString().contains("(updated)"))
                {
                    textview.setText(a);
                }
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("inner error updating border text error", exception);
        }
    }
}
