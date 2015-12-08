// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ad, ak, dz, ea, 
//            dx, bb

public class ae
    implements ad
{

    private final dz lC;

    public ae(Context context, dx dx)
    {
        lC = dz.a(context, new ak(), false, false, null, dx);
    }

    public void a(ad.a a1)
    {
        lC.bI().a(new ea.a(a1) {

            final ad.a lD;
            final ae lE;

            public void a(dz dz1)
            {
                lD.ay();
            }

            
            {
                lE = ae.this;
                lD = a1;
                super();
            }
        });
    }

    public void a(String s, bb bb)
    {
        lC.bI().a(s, bb);
    }

    public void a(String s, JSONObject jsonobject)
    {
        lC.a(s, jsonobject);
    }

    public void d(String s)
    {
        lC.loadUrl(s);
    }

    public void e(String s)
    {
        lC.bI().a(s, null);
    }
}
