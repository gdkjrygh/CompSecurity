// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ah, ay, gu, gq, 
//            gv, v, gi, gs, 
//            t, ds, cb, dv, 
//            ce, cd

public class aj
    implements ah
{

    private final gu mo;

    public aj(Context context, gs gs)
    {
        mo = gu.a(context, new ay(), false, false, null, gs);
    }

    static gu a(aj aj1)
    {
        return aj1.mo;
    }

    private void runOnUiThread(Runnable runnable)
    {
        if (gq.dB())
        {
            runnable.run();
            return;
        } else
        {
            gq.wR.post(runnable);
            return;
        }
    }

    public void a(ah.a a1)
    {
        mo.dD().a(new gv.a(a1) {

            final aj nn;
            final ah.a no;

            public void a(gu gu1)
            {
                no.aR();
            }

            
            {
                nn = aj.this;
                no = a1;
                super();
            }
        });
    }

    public void a(t t, ds ds, cb cb, dv dv, boolean flag, ce ce)
    {
        mo.dD().a(t, ds, cb, dv, flag, ce, new v(false));
    }

    public void a(String s, cd cd)
    {
        mo.dD().a(s, cd);
    }

    public void a(String s, JSONObject jsonobject)
    {
        runOnUiThread(new Runnable(s, jsonobject) {

            final String nl;
            final JSONObject nm;
            final aj nn;

            public void run()
            {
                aj.a(nn).a(nl, nm);
            }

            
            {
                nn = aj.this;
                nl = s;
                nm = jsonobject;
                super();
            }
        });
    }

    public void destroy()
    {
        mo.destroy();
    }

    public void f(String s)
    {
        runOnUiThread(new Runnable(s) {

            final String ni;
            final aj nn;

            public void run()
            {
                aj.a(nn).loadUrl(ni);
            }

            
            {
                nn = aj.this;
                ni = s;
                super();
            }
        });
    }

    public void g(String s)
    {
        mo.dD().a(s, null);
    }

    public void pause()
    {
        gi.a(mo);
    }

    public void resume()
    {
        gi.b(mo);
    }
}
