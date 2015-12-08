// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.widget.Toast;

// Referenced classes of package com.flurry.sdk:
//            dd, el, eo, do

class it>
    implements it>
{

    final String a;
    final String b;
    final dd c;

    public volatile void a(el el1, Object obj)
    {
        a(el1, (Void)obj);
    }

    public void a(el el1, Void void1)
    {
        int i = el1.e();
        if (i > 0)
        {
            eo.d(dd.b(), (new StringBuilder("FlurryDataSender: report ")).append(a).append(" sent. HTTP response: ").append(i).toString());
            if (eo.c() <= 3 && eo.d())
            {
                com.flurry.sdk.do.a().a(new Runnable(i) {

                    final int a;
                    final dd._cls1 b;

                    public void run()
                    {
                        Toast.makeText(com.flurry.sdk.do.a().b(), (new StringBuilder("SD HTTP Response Code: ")).append(a).toString(), 0).show();
                    }

            
            {
                b = dd._cls1.this;
                a = i;
                super();
            }
                });
            }
            c.a(a, b, i);
            c.d();
            return;
        } else
        {
            c.b(a, b);
            return;
        }
    }

    it>(dd dd1, String s, String s1)
    {
        c = dd1;
        a = s;
        b = s1;
        super();
    }
}
