// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            b, d, bI, bE, 
//            cg, bG, ci, bK

public final class bD
{

    private static boolean c;
    private b a;
    private String b;

    public bD(b b1, String s)
    {
        if (!c && b1 == null)
        {
            throw new AssertionError();
        } else
        {
            a = b1;
            b = (new StringBuilder("com.paypal.android.sdk.encr.")).append(s).append(".").toString();
            return;
        }
    }

    public final bI a(String s)
    {
        Object obj = a.a((new StringBuilder()).append(b).append("tokenizedRedactedCardNumber").toString());
        String s1 = a.a((new StringBuilder()).append(b).append("token").toString());
        String s2 = a.a((new StringBuilder()).append(b).append("tokenPayerID").toString());
        String s3 = a.a((new StringBuilder()).append(b).append("tokenValidUntil").toString());
        String s4 = a.a((new StringBuilder()).append(b).append("tokenizedCardType").toString());
        String s5 = a.a((new StringBuilder()).append(b).append("tokenizedCardExpiryMonth").toString());
        int i;
        int j;
        if (s5 != null)
        {
            i = Integer.parseInt(s5);
        } else
        {
            i = 0;
        }
        s5 = a.a((new StringBuilder()).append(b).append("tokenizedCardExpiryYear").toString());
        if (s5 != null)
        {
            j = Integer.parseInt(s5);
        } else
        {
            j = 0;
        }
        s5 = a.c(a.a((new StringBuilder()).append(b).append("tokenClientId").toString()));
        if (d.b(s5) || !s5.equals(s))
        {
            s = null;
        } else
        {
            obj = new bI(s1, s2, s3, ((String) (obj)), s4, i, j);
            s = ((String) (obj));
            if (!((bI) (obj)).b())
            {
                return null;
            }
        }
        return s;
    }

    public final void a()
    {
        Object obj = null;
        bE be = new bE();
        String s;
        if (be.a() != null)
        {
            s = be.a().b();
        } else
        {
            s = null;
        }
        a.a((new StringBuilder()).append(b).append("loginPhoneNumber").toString(), s);
        a.a((new StringBuilder()).append(b).append("loginEmail").toString(), be.b());
        s = obj;
        if (be.c() != null)
        {
            s = be.c().toString();
        }
        a.a((new StringBuilder()).append(b).append("loginTypePrevious").toString(), s);
    }

    public final void a(bI bi, String s)
    {
        Object obj = null;
        a.a((new StringBuilder()).append(b).append("token").toString(), bi.e());
        a.a((new StringBuilder()).append(b).append("tokenPayerID").toString(), bi.a());
        String s1;
        if (bi.c() != null)
        {
            s1 = (new ci()).format(bi.c());
        } else
        {
            s1 = null;
        }
        a.a((new StringBuilder()).append(b).append("tokenValidUntil").toString(), s1);
        a.a((new StringBuilder()).append(b).append("tokenizedRedactedCardNumber").toString(), bi.d());
        s1 = obj;
        if (bi.h() != null)
        {
            s1 = bi.h().toString();
        }
        a.a((new StringBuilder()).append(b).append("tokenizedCardType").toString(), s1);
        a.a((new StringBuilder()).append(b).append("tokenizedCardExpiryMonth").toString(), String.valueOf(bi.f()));
        a.a((new StringBuilder()).append(b).append("tokenizedCardExpiryYear").toString(), String.valueOf(bi.g()));
        a.a((new StringBuilder()).append(b).append("tokenClientId").toString(), a.b(s));
    }

    public final void b()
    {
        a(new bI(), null);
    }

    static 
    {
        boolean flag;
        if (!com/paypal/android/sdk/bD.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
