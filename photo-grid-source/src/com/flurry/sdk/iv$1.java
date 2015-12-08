// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            kj, iv, kc, jo

class it>
    implements it>
{

    final String a;
    final String b;
    final iv c;

    public volatile void a(kj kj1, Object obj)
    {
        a(kj1, (Void)obj);
    }

    public void a(kj kj1, Void void1)
    {
        int i = kj1.h();
        if (i > 0)
        {
            kc.e(iv.c(), "Analytics report sent.");
            kc.a(3, iv.c(), (new StringBuilder("FlurryDataSender: report ")).append(a).append(" sent. HTTP response: ").append(i).toString());
            class _cls1
                implements Runnable
            {

                final int a;
                final iv._cls1 b;

                public void run()
                {
                    Toast.makeText(jo.a().c(), (new StringBuilder("SD HTTP Response Code: ")).append(a).toString(), 0).show();
                }

            _cls1(int i)
            {
                b = iv._cls1.this;
                a = i;
                super();
            }
            }

            if (kc.c() <= 3 && kc.d())
            {
                jo.a().a(new _cls1(i));
            }
            c.a(a, b, i);
            iv.a(c);
            return;
        } else
        {
            iv.a(c, a, b);
            return;
        }
    }

    _cls1(iv iv1, String s, String s1)
    {
        c = iv1;
        a = s;
        b = s1;
        super();
    }
}
