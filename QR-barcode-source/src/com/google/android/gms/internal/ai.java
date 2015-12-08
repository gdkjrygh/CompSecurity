// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            aj, ah, gk, gr, 
//            gt

public class ai
{

    public ai()
    {
    }

    protected ah a(Context context, gt gt, gk gk1)
    {
        context = new aj(context, gt);
        context.a(new ah.a(gk1, context) {

            final gk mX;
            final ai mZ;
            final ah na;

            public void aM()
            {
                mX.a(na);
            }

            
            {
                mZ = ai.this;
                mX = gk1;
                na = ah1;
                super();
            }
        });
        return context;
    }

    public Future a(Context context, gt gt, String s)
    {
        gk gk1 = new gk();
        gr.wC.post(new Runnable(context, gt, gk1, s) {

            final Context mV;
            final gt mW;
            final gk mX;
            final String mY;
            final ai mZ;

            public void run()
            {
                mZ.a(mV, mW, mX).f(mY);
            }

            
            {
                mZ = ai.this;
                mV = context;
                mW = gt;
                mX = gk1;
                mY = s;
                super();
            }
        });
        return gk1;
    }
}
