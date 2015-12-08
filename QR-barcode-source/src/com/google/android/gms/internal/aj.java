// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ah, ay, gv, gr, 
//            gw, v, gj, gt, 
//            t, dn, bw, dq, 
//            bz, by

public class aj
    implements ah
{

    private final gv md;

    public aj(Context context, gt gt)
    {
        md = gv.a(context, new ay(), false, false, null, gt);
    }

    static gv a(aj aj1)
    {
        return aj1.md;
    }

    private void runOnUiThread(Runnable runnable)
    {
        if (gr.ds())
        {
            runnable.run();
            return;
        } else
        {
            gr.wC.post(runnable);
            return;
        }
    }

    public void a(ah.a a1)
    {
        md.du().a(new gw.a(a1) {

            final aj nd;
            final ah.a ne;

            public void a(gv gv1)
            {
                ne.aM();
            }

            
            {
                nd = aj.this;
                ne = a1;
                super();
            }
        });
    }

    public void a(t t, dn dn, bw bw, dq dq, boolean flag, bz bz)
    {
        md.du().a(t, dn, bw, dq, flag, bz, new v(false));
    }

    public void a(String s, by by)
    {
        md.du().a(s, by);
    }

    public void a(String s, JSONObject jsonobject)
    {
        runOnUiThread(new Runnable(s, jsonobject) {

            final String nb;
            final JSONObject nc;
            final aj nd;

            public void run()
            {
                aj.a(nd).a(nb, nc);
            }

            
            {
                nd = aj.this;
                nb = s;
                nc = jsonobject;
                super();
            }
        });
    }

    public void destroy()
    {
        md.destroy();
    }

    public void f(String s)
    {
        runOnUiThread(new Runnable(s) {

            final String mY;
            final aj nd;

            public void run()
            {
                aj.a(nd).loadUrl(mY);
            }

            
            {
                nd = aj.this;
                mY = s;
                super();
            }
        });
    }

    public void g(String s)
    {
        md.du().a(s, null);
    }

    public void pause()
    {
        gj.a(md);
    }

    public void resume()
    {
        gj.b(md);
    }
}
