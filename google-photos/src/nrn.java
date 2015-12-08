// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Set;

public final class nrn
    implements nql
{

    private static final String a = ntn.a(nrn);
    private Context b;
    private nse c;

    public nrn(Context context)
    {
        b = context;
        c = new nse();
    }

    private static nqv a()
    {
        return new nqv(nqw.c, new IllegalArgumentException("Account not found."));
    }

    public final nqv a(int i)
    {
        if (i == -1)
        {
            return a();
        } else
        {
            return ((nsg)olm.a(b, nsg)).a(i);
        }
    }

    public final nqv a(int i, nqk nqk1, nqx nqx)
    {
        if (i == -1)
        {
            return a();
        } else
        {
            return ((nsa)olm.a(b, nsa)).a(i, nqk1, nqx);
        }
    }

    public final nqv a(int i, String as[], int j)
    {
        if (i == -1)
        {
            return a();
        }
        nrx nrx1 = (nrx)olm.a(b, nrx);
        b.v();
        if (i == -1)
        {
            throw new IllegalArgumentException("Invalid account ID");
        } else
        {
            return nry.a(nrx1.a, i, as, j);
        }
    }

    public final void a(int i, boolean flag)
    {
        nsx nsx1;
        nsx nsx2;
        Object obj;
        Object obj1;
        nra nra1;
label0:
        {
            obj1 = c;
            obj = b;
            if (i != -1)
            {
                nra1 = ((nqz)olm.a(((Context) (obj)), nqz)).d();
                if (nra1.h())
                {
                    break label0;
                }
                ((nse) (obj1)).a(((Context) (obj)), i);
            }
            return;
        }
        nsx1 = b.a(((Context) (obj)), i, "priority IN (3,4) AND read_state = 1 AND push_enabled != 0", null);
        nsx2 = b.a(((Context) (obj)), i, "system_tray_version > 0", null);
        Object obj2;
        obj2 = ((nqn)olm.a(((Context) (obj)), nqn)).c(i);
        if (nsx1.getCount() <= 0 || !nse.a(((nqu) (obj2))))
        {
            break MISSING_BLOCK_LABEL_323;
        }
        obj2 = new HashMap();
        if (!nsx1.moveToFirst()) goto _L2; else goto _L1
_L1:
        String s = nsx1.a();
        if (nsx1.c() != nsx1.b()) goto _L4; else goto _L3
_L3:
        ((HashMap) (obj2)).put(s, null);
_L6:
        if (nsx1.moveToNext()) goto _L1; else goto _L2
_L2:
        obj1 = ((nse) (obj1)).a(((Context) (obj)), i, nsx1, nsx2, ((HashMap) (obj2)), nra1);
        nte.a(((Context) (obj)), i, (String[])((Set) (obj1)).toArray(new String[((Set) (obj1)).size()]));
_L8:
        nsx1.close();
        nsx2.close();
        return;
_L4:
        Object obj3 = nse.a(nsx1);
        if (nrd.b != nse.a(((Context) (obj)), i, ((nqs) (obj3)))) goto _L6; else goto _L5
_L5:
        obj3 = nsx1.d();
        oyv oyv = nsx1.e();
        obj3 = ((nse) (obj1)).a(((Context) (obj)), i, nsx1, nra1, ((nse) (obj1)).a(((Context) (obj)), ((ozd) (obj3)).c, oyv), false, null);
        nse.a(((Context) (obj)), i, ((cn) (obj3)), nre.b, new nqs[] {
            nse.a(nsx1)
        });
        if (obj3 == null) goto _L6; else goto _L7
_L7:
        ((HashMap) (obj2)).put(s, obj3);
          goto _L6
        obj;
        nsx1.close();
        nsx2.close();
        throw obj;
        ((nse) (obj1)).a(((Context) (obj)), i);
        obj1 = ((nse) (obj1)).a;
        nte.a(((Context) (obj)), i, new String[0]);
          goto _L8
    }

    public final boolean a(int i, nqk nqk1)
    {
        if (i == -1)
        {
            ntn.b(a, "Account not found.", new IllegalArgumentException());
        } else
        if (ntf.b(b, i, nqk1) != null)
        {
            return true;
        }
        return false;
    }

    public final nqv b(int i)
    {
        if (i == -1)
        {
            return a();
        }
        Object obj = (nrl)olm.a(b, nrl);
        if (i == -1)
        {
            return new nqv(nqw.c, new IllegalArgumentException("Invalid account ID."));
        }
        ((nqm)olm.a(((nrl) (obj)).a, nqm)).a(i);
        if (ntf.a(((nrl) (obj)).a, i))
        {
            obj = nqw.a;
        } else
        {
            obj = nqw.c;
        }
        return new nqv(((nqw) (obj)));
    }

    public final nqv b(int i, nqk nqk1, nqx nqx)
    {
        if (i == -1)
        {
            return a();
        }
        nrv nrv1 = (nrv)olm.a(b, nrv);
        b.v();
        byte abyte0[] = ntf.b(nrv1.b, i, nqk1);
        if (abyte0 == null || abyte0.length == 0)
        {
            ntn.b(nrv.a, String.format("Initiated paging fetch without paging token, doing a sync  fetch instead. AccountId [%d], fetchCategory [%s], trigger [%s]", new Object[] {
                Integer.valueOf(i), nqk1, nqx
            }));
            return ((nsa)olm.a(nrv1.b, nsa)).a(i, nqk1, nqx);
        }
        Object obj = nrv.a(nrv1.b, nqk1, abyte0);
        obj = new nrm(nrv1.b, i, ((qqj) (obj)));
        (new Bundle()).putInt("fetch_category", nqk1.ordinal());
        olm.a(nrv1.b, nti);
        obj = (nrm)nti.a(((nzc) (obj)), nrv1.b);
        if (!((nrm) (obj)).l())
        {
            obj = ((nrm) (obj)).c();
            ntn.a(nrv.a, String.format("Completed paging fetch notifications for accountId [%d], fetchCategory [%s], trigger [%s] and received [%d] notifications.", new Object[] {
                Integer.valueOf(i), nqk1, nqx, Integer.valueOf(((qqk) (obj)).b.length)
            }));
            ntf.b(nrv1.b, i, nqk1, nqx, ((qqk) (obj)));
            return new nqv(nqw.a);
        }
        ntn.d(nrv.a, String.format("Failed to do paging fetch notifications for accountId [%d], fetchCategory [%s], trigger [%s]", new Object[] {
            Integer.valueOf(i), nqk1, nqx
        }));
        if (nxx.b(((nxx) (obj)).n))
        {
            nqk1 = nqw.b;
        } else
        {
            nqk1 = nqw.c;
        }
        return new nqv(nqk1, ((nxx) (obj)).n);
    }

}
