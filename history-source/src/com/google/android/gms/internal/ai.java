// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            aj, ah, gj, gq, 
//            gs

public class ai
{

    public ai()
    {
    }

    protected ah a(Context context, gs gs, gj gj1)
    {
        context = new aj(context, gs);
        context.a(new ah.a(gj1, context) {

            final gj nh;
            final ai nj;
            final ah nk;

            public void aR()
            {
                nh.a(nk);
            }

            
            {
                nj = ai.this;
                nh = gj1;
                nk = ah1;
                super();
            }
        });
        return context;
    }

    public Future a(Context context, gs gs, String s)
    {
        gj gj1 = new gj();
        gq.wR.post(new Runnable(context, gs, gj1, s) {

            final Context nf;
            final gs ng;
            final gj nh;
            final String ni;
            final ai nj;

            public void run()
            {
                nj.a(nf, ng, nh).f(ni);
            }

            
            {
                nj = ai.this;
                nf = context;
                ng = gs;
                nh = gj1;
                ni = s;
                super();
            }
        });
        return gj1;
    }
}
