// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class nsq
    implements nqn
{

    private static final String a = ntn.a(nsq);
    private final Context b;
    private final mmv c;
    private final nsr d;

    public nsq(Context context)
    {
        b = context;
        c = (mmv)olm.a(context, mmv);
        d = (nsr)olm.a(context, nsr);
    }

    private static nqv a(nqv nqv1, nqv nqv2)
    {
        if (nqv2.a.compareTo(nqv1.a) > 0)
        {
            return nqv2;
        } else
        {
            return nqv1;
        }
    }

    private void d(int i)
    {
        c.b(i).g("com.google.android.libraries.social.notifications.REGISTER_REQUEST_FINGERPRINT").d();
    }

    public final nqv a(int i)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        b.v();
        if (c.c(i)) goto _L2; else goto _L1
_L1:
        Object obj = new nqv(nqw.c);
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((nqv) (obj));
_L2:
        boolean flag1;
        obj = new nsp(b);
        flag1 = (new nsp(b)).a(false);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        d.a(nqu.f, nqu.d);
        obj = ((nsp) (obj)).a();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        ntn.d(a, (new StringBuilder(72)).append("Registration failed due to invalid gcm token for account ID: ").append(i).toString());
        obj = new nqv(nqw.b);
          goto _L3
        obj;
        throw obj;
        int j;
        obj = nss.a(b, ((String) (obj)));
        j = nss.a(((qql) (obj)));
        if (flag1) goto _L5; else goto _L4
_L4:
        int k;
        k = c.a(i).a("com.google.android.libraries.social.notifications.REGISTER_REQUEST_FINGERPRINT", 0);
        ntn.a(a, String.format("Checking register device request fingerprint, old [%d], new [%d]", new Object[] {
            Integer.valueOf(k), Integer.valueOf(j)
        }));
        Object obj1;
        if (k == j)
        {
            flag = false;
        }
          goto _L6
_L5:
        c.b(i).c("com.google.android.libraries.social.notifications.REGISTER_REQUEST_FINGERPRINT", j).d();
        d.a(i, nqu.d);
        ((nql)olm.a(b, nql)).a(i, false);
        obj1 = new nyg(b, i);
        obj1 = new nss(b, ((nyg) (obj1)), ((qql) (obj)));
        olm.a(b, nti);
        nti.a(((nzc) (obj1)), b);
        if (!((nss) (obj1)).l())
        {
            break MISSING_BLOCK_LABEL_419;
        }
        ntn.d(a, (new StringBuilder(42)).append("Failed to register account ID: ").append(i).toString());
        d(i);
        flag1 = nxx.b(((nxx) (obj1)).n);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        d.a(i, nqu.b);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        obj = nqw.b;
_L7:
        obj = new nqv(((nqw) (obj)), ((nxx) (obj1)).n);
          goto _L3
        obj = nqw.c;
          goto _L7
_L8:
        ntn.a(a, (new StringBuilder(47)).append("Successfully registered account ID: ").append(i).toString());
        d.a(i, nqu.f);
        obj = new nqv(nqw.a);
          goto _L3
_L6:
        if (!flag) goto _L8; else goto _L5
    }

    public final nqv a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        nqv nqv1;
        Object obj;
        ntn.a(a, (new StringBuilder(41)).append("Syncing registration status, force: ").append(flag).toString());
        b.v();
        obj = new nsp(b);
        nqv1 = new nqv(nqw.a);
        if (((nsp) (obj)).a(flag))
        {
            ntn.a(a, "gcmManager register is success");
            d.a(nqu.f, nqu.d);
        }
        obj = c.a(new String[] {
            "logged_in"
        }).iterator();
_L3:
        nqu nqu1;
        int i;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        i = ((Integer)((Iterator) (obj)).next()).intValue();
        nqu1 = d.a(i);
        if (nqu1 != nqu.d) goto _L2; else goto _L1
_L1:
        nqv1 = a(a(i), nqv1);
          goto _L3
_L2:
        if (nqu1 != nqu.e) goto _L3; else goto _L4
_L4:
        nqv1 = a(b(i), nqv1);
          goto _L3
        this;
        JVM INSTR monitorexit ;
        return nqv1;
        Exception exception;
        exception;
        throw exception;
    }

    public final nqv b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        b.v();
        if (c.c(i)) goto _L2; else goto _L1
_L1:
        Object obj = new nqv(nqw.c);
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((nqv) (obj));
_L2:
        Object obj1;
        d.a(i, nqu.e);
        ((nql)olm.a(b, nql)).a(i, false);
        obj = new nyg(b, i);
        obj1 = (new nsp(b)).a();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        ntn.d(a, (new StringBuilder(74)).append("Unregistration failed due to invalid gcm token for account ID: ").append(i).toString());
        obj = new nqv(nqw.b);
          goto _L3
        obj;
        throw obj;
        boolean flag;
        d(i);
        obj1 = new nst(b, ((nyg) (obj)), ((String) (obj1)));
        olm.a(b, nti);
        nti.a(((nzc) (obj1)), b);
        if (!((nst) (obj1)).l())
        {
            break MISSING_BLOCK_LABEL_272;
        }
        ntn.d(a, (new StringBuilder(44)).append("Failed to unregister account ID: ").append(i).toString());
        flag = nxx.b(((nxx) (obj1)).n);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        d.a(i, nqu.c);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        obj = nqw.b;
_L4:
        obj = new nqv(((nqw) (obj)), ((nxx) (obj1)).n);
          goto _L3
        obj = nqw.c;
          goto _L4
        ntn.a(a, (new StringBuilder(49)).append("Successfully unregistered account ID: ").append(i).toString());
        d.a(i, nqu.a);
        obj = new nqv(nqw.a);
          goto _L3
    }

    public final nqu c(int i)
    {
        this;
        JVM INSTR monitorenter ;
        nqu nqu1 = d.a(i);
        this;
        JVM INSTR monitorexit ;
        return nqu1;
        Exception exception;
        exception;
        throw exception;
    }

}
