// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            eb, co, eo

class en
    implements gj.a
{

    final eb a;

    en(eb eb1)
    {
        a = eb1;
        super();
    }

    public void a(int i, String s)
    {
        co co1;
        if (i == -1)
        {
            eb.a(a, true);
            return;
        }
        co1 = new co(a.b, a.d, co.a.a, new eo(this));
        if (i != 0) goto _L2; else goto _L1
_L1:
        co1.setTitle("Error");
        if (s.compareTo("") == 0)
        {
            co1.a("There was an error sending your Tweet.");
        }
_L4:
        if (s.compareTo("") != 0)
        {
            co1.a(s);
        }
        co1.a("OK", "");
        co1.show();
        return;
_L2:
        co1.setTitle("Success");
        if (s.compareTo("") == 0)
        {
            co1.a("Your tweet was sent successfully.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
