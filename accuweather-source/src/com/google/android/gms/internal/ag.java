// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            af, am, ey, ez, 
//            ep, ew, bd

public class ag
    implements af
{

    private final ey lL;

    public ag(Context context, ew ew)
    {
        lL = ey.a(context, new am(), false, false, null, ew);
    }

    public void a(af.a a1)
    {
        lL.bW().a(new ez.a(a1) {

            final af.a lM;
            final ag lN;

            public void a(ey ey1)
            {
                lM.az();
            }

            
            {
                lN = ag.this;
                lM = a1;
                super();
            }
        });
    }

    public void a(String s, bd bd)
    {
        lL.bW().a(s, bd);
    }

    public void a(String s, JSONObject jsonobject)
    {
        lL.a(s, jsonobject);
    }

    public void d(String s)
    {
        lL.loadUrl(s);
    }

    public void e(String s)
    {
        lL.bW().a(s, null);
    }

    public void pause()
    {
        ep.a(lL);
    }

    public void resume()
    {
        ep.b(lL);
    }
}
