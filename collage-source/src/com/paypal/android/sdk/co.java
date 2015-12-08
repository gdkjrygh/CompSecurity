// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            dh, cn, ea, ce, 
//            gd, bB, cq, bF, 
//            fk, ct

public final class co
{

    private static boolean c;
    private cn a;
    private String b;

    public co(cn cn1, String s)
    {
        if (!c && cn1 == null)
        {
            throw new AssertionError();
        } else
        {
            a = cn1;
            b = (new StringBuilder("com.paypal.android.sdk.encr.")).append(s).append(".").toString();
            return;
        }
    }

    public final bB a()
    {
        Object obj;
        Object obj2;
        obj2 = null;
        obj = a.a((new StringBuilder()).append(b).append("loginPhoneNumber").toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        obj = ce.a(ea.a(), ((String) (obj)));
_L1:
        String s = a.a((new StringBuilder()).append(b).append("loginEmail").toString());
        Object obj1 = a.a((new StringBuilder()).append(b).append("loginTypePrevious").toString());
        if (gd.a(((CharSequence) (obj1))))
        {
            obj1 = null;
        } else
        {
            obj1 = cq.valueOf(((String) (obj1)));
        }
        obj1 = new bB(s, ((ce) (obj)), ((cq) (obj1)));
        obj = obj2;
        if (((bB) (obj1)).d())
        {
            obj = obj1;
        }
        return ((bB) (obj));
        obj;
        obj = null;
          goto _L1
    }

    public final bF a(String s)
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
        if (gd.c(s5) || !s5.equals(s))
        {
            s = null;
        } else
        {
            obj = new bF(s1, s2, s3, ((String) (obj)), s4, i, j);
            s = ((String) (obj));
            if (!((bF) (obj)).b())
            {
                return null;
            }
        }
        return s;
    }

    public final void a(bB bb)
    {
        Object obj = null;
        String s;
        if (bb.a() != null)
        {
            s = bb.a().b();
        } else
        {
            s = null;
        }
        a.a((new StringBuilder()).append(b).append("loginPhoneNumber").toString(), s);
        a.a((new StringBuilder()).append(b).append("loginEmail").toString(), bb.b());
        s = obj;
        if (bb.c() != null)
        {
            s = bb.c().toString();
        }
        a.a((new StringBuilder()).append(b).append("loginTypePrevious").toString(), s);
    }

    public final void a(bF bf, String s)
    {
        Object obj = null;
        a.a((new StringBuilder()).append(b).append("token").toString(), bf.e());
        a.a((new StringBuilder()).append(b).append("tokenPayerID").toString(), bf.a());
        String s1;
        if (bf.c() != null)
        {
            s1 = (new fk()).format(bf.c());
        } else
        {
            s1 = null;
        }
        a.a((new StringBuilder()).append(b).append("tokenValidUntil").toString(), s1);
        a.a((new StringBuilder()).append(b).append("tokenizedRedactedCardNumber").toString(), bf.d());
        s1 = obj;
        if (bf.h() != null)
        {
            s1 = bf.h().toString();
        }
        a.a((new StringBuilder()).append(b).append("tokenizedCardType").toString(), s1);
        a.a((new StringBuilder()).append(b).append("tokenizedCardExpiryMonth").toString(), String.valueOf(bf.f()));
        a.a((new StringBuilder()).append(b).append("tokenizedCardExpiryYear").toString(), String.valueOf(bf.g()));
        a.a((new StringBuilder()).append(b).append("tokenClientId").toString(), a.b(s));
    }

    public final void b()
    {
        a(new bB());
    }

    public final void c()
    {
        a(new bF(), null);
    }

    static 
    {
        boolean flag;
        if (!com/paypal/android/sdk/co.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
