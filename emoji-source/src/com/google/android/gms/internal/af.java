// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ae, al, ex, ey, 
//            eo, ev, bc

public class af
    implements ae
{

    private final ex lN;

    public af(Context context, ev ev)
    {
        lN = ex.a(context, new al(), false, false, null, ev);
    }

    public void a(ae.a a1)
    {
        lN.cb().a(new ey.a(a1) {

            final ae.a lO;
            final af lP;

            public void a(ex ex1)
            {
                lO.aE();
            }

            
            {
                lP = af.this;
                lO = a1;
                super();
            }
        });
    }

    public void a(String s, bc bc)
    {
        lN.cb().a(s, bc);
    }

    public void a(String s, JSONObject jsonobject)
    {
        lN.a(s, jsonobject);
    }

    public void d(String s)
    {
        lN.loadUrl(s);
    }

    public void e(String s)
    {
        lN.cb().a(s, null);
    }

    public void pause()
    {
        eo.a(lN);
    }

    public void resume()
    {
        eo.b(lN);
    }
}
