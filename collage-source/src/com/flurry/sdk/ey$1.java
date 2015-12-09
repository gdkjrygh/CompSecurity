// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.widget.Toast;

// Referenced classes of package com.flurry.sdk:
//            ey, gk, gd, fp

class it>
    implements it>
{

    final String a;
    final String b;
    final ey c;

    public volatile void a(gk gk1, Object obj)
    {
        a(gk1, (Void)obj);
    }

    public void a(gk gk1, Void void1)
    {
        int i = gk1.e();
        if (i > 0)
        {
            gd.e(ey.c(), "Analytics report sent.");
            gd.a(3, ey.c(), (new StringBuilder()).append("FlurryDataSender: report ").append(a).append(" sent. HTTP response: ").append(i).toString());
            if (gd.c() <= 3 && gd.d())
            {
                fp.a().a(new Runnable(i) {

                    final int a;
                    final ey._cls1 b;

                    public void run()
                    {
                        Toast.makeText(fp.a().c(), (new StringBuilder()).append("SD HTTP Response Code: ").append(a).toString(), 0).show();
                    }

            
            {
                b = ey._cls1.this;
                a = i;
                super();
            }
                });
            }
            c.a(a, b, i);
            ey.a(c);
            return;
        } else
        {
            ey.a(c, a, b);
            return;
        }
    }

    it>(ey ey1, String s, String s1)
    {
        c = ey1;
        a = s;
        b = s1;
        super();
    }
}
