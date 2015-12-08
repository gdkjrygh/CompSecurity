// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class nhx extends omp
    implements nfv
{

    private nga a;
    private mmv b;
    private ngc c;

    public nhx()
    {
    }

    public final void a(ngg ngg)
    {
        boolean flag2 = false;
        boolean flag = false;
        Object obj = super.q;
        nfr nfr1;
        ArrayList arraylist;
        Iterator iterator;
        if (obj != null)
        {
            nfr1 = (nfr)((Bundle) (obj)).getParcelable("account_filter");
        } else
        {
            nfr1 = null;
        }
        arraylist = new ArrayList();
        iterator = b.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int j = ((Integer)iterator.next()).intValue();
            b.a(j);
            if (c.a(ngg, j) && (nfr1 == null || nfr1.a()))
            {
                arraylist.add(Integer.valueOf(j));
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            ngg = b.a().iterator();
            do
            {
                if (!ngg.hasNext())
                {
                    break;
                }
                int k = ((Integer)ngg.next()).intValue();
                mmx mmx1 = b.a(k);
                if ((nfr1 == null || nfr1.a()) && !mmx1.c("is_managed_account"))
                {
                    arraylist.add(Integer.valueOf(k));
                }
            } while (true);
        }
        if (arraylist.isEmpty())
        {
            if (obj == null || ((Bundle) (obj)).getBoolean("add_account"))
            {
                flag = true;
            }
            if (flag)
            {
                a.a();
                return;
            } else
            {
                a.b();
                return;
            }
        }
        if (arraylist.size() == 1)
        {
            ngg = (Integer)arraylist.get(0);
            ngg = b.a(ngg.intValue());
            if (!ngg.c("logged_out") || obj == null || ((Bundle) (obj)).getBoolean("auto_select_single_logged_out_account"))
            {
                a.a(ngg.b("account_name"), ngg.b("effective_gaia_id"));
                return;
            }
        }
        int ai[] = new int[arraylist.size()];
        for (int i = 0; i < arraylist.size(); i++)
        {
            ai[i] = ((Integer)arraylist.get(i)).intValue();
        }

        boolean flag1;
        if (obj != null)
        {
            ngg = ((Bundle) (obj)).getString("dialog_title");
        } else
        {
            ngg = null;
        }
        flag1 = flag2;
        if (obj != null)
        {
            flag1 = flag2;
            if (((Bundle) (obj)).getBoolean("add_account_button_shown"))
            {
                flag1 = true;
            }
        }
        obj = h();
        if (ngg == null)
        {
            ngg = ad.getString(b.Gk);
        }
        ngv.a(((ay) (obj)), ngg, ai, flag1);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (nga)ae.a(nga);
        b = (mmv)ae.a(mmv);
        c = (ngc)ae.a(ngc);
    }
}
