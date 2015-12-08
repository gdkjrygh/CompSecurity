// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            b, h, R, bu, 
//            bq, bS, bs, bU, 
//            bw

public final class bp
{

    private static boolean d;
    private b a;
    private String b;
    private h c;

    public bp(b b1, String s, h h1)
    {
        if (!d && b1 == null)
        {
            throw new AssertionError();
        } else
        {
            a = b1;
            b = (new StringBuilder("com.paypal.android.sdk.")).append(s).append(".").toString();
            c = h1;
            return;
        }
    }

    public final bu a(String s)
    {
        Object obj = a.a((new StringBuilder()).append(b).append("tokenizedRedactedCardNumber").toString(), null);
        String s1 = a.a((new StringBuilder()).append(b).append("token").toString(), null);
        String s2 = a.a((new StringBuilder()).append(b).append("tokenPayerID").toString(), null);
        String s3 = a.a((new StringBuilder()).append(b).append("tokenValidUntil").toString(), null);
        String s4 = a.a((new StringBuilder()).append(b).append("tokenizedCardType").toString(), null);
        int i = Integer.parseInt(a.a((new StringBuilder()).append(b).append("tokenizedCardExpiryMonth").toString(), "1"));
        int j = Integer.parseInt(a.a((new StringBuilder()).append(b).append("tokenizedCardExpiryYear").toString(), "0"));
        String s5 = c.b(a.a((new StringBuilder()).append(b).append("tokenClientId").toString(), null));
        if (R.b(s5) || !s5.equals(s))
        {
            s = null;
        } else
        {
            obj = new bu(s1, s2, s3, ((String) (obj)), s4, i, j);
            s = ((String) (obj));
            if (!((bu) (obj)).b())
            {
                return null;
            }
        }
        return s;
    }

    public final void a(bq bq1)
    {
        Object obj = null;
        String s;
        if (bq1.a() != null)
        {
            s = bq1.a().b();
        } else
        {
            s = null;
        }
        a.b((new StringBuilder()).append(b).append("loginPhoneNumber").toString(), s);
        a.b((new StringBuilder()).append(b).append("loginEmail").toString(), bq1.b());
        s = obj;
        if (bq1.c() != null)
        {
            s = bq1.c().toString();
        }
        a.b((new StringBuilder()).append(b).append("loginTypePrevious").toString(), s);
    }

    public final void a(bu bu1, String s)
    {
        Object obj = null;
        a.b((new StringBuilder()).append(b).append("token").toString(), bu1.e());
        a.b((new StringBuilder()).append(b).append("tokenPayerID").toString(), bu1.a());
        String s1;
        if (bu1.c() != null)
        {
            s1 = (new bU()).format(bu1.c());
        } else
        {
            s1 = null;
        }
        a.b((new StringBuilder()).append(b).append("tokenValidUntil").toString(), s1);
        a.b((new StringBuilder()).append(b).append("tokenizedRedactedCardNumber").toString(), bu1.d());
        s1 = obj;
        if (bu1.h() != null)
        {
            s1 = bu1.h().toString();
        }
        a.b((new StringBuilder()).append(b).append("tokenizedCardType").toString(), s1);
        a.b((new StringBuilder()).append(b).append("tokenizedCardExpiryMonth").toString(), String.valueOf(bu1.f()));
        a.b((new StringBuilder()).append(b).append("tokenizedCardExpiryYear").toString(), String.valueOf(bu1.g()));
        a.b((new StringBuilder()).append(b).append("tokenClientId").toString(), c.a(s));
    }

    static 
    {
        boolean flag;
        if (!com/paypal/android/sdk/bp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
