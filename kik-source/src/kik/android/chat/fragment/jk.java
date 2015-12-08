// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;
import kik.a.e.r;
import kik.a.f.q;
import kik.android.util.cq;
import kik.android.util.cy;

// Referenced classes of package kik.android.chat.fragment:
//            KikContactsListFragment

final class jk extends i
{

    final KikContactsListFragment a;

    jk(KikContactsListFragment kikcontactslistfragment)
    {
        a = kikcontactslistfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        int j;
label0:
        {
            a.a(null);
            if (obj1 instanceof q)
            {
                obj = (Throwable)obj1;
                j = q.a(((Throwable) (obj)));
                obj = q.b(((Throwable) (obj)));
                switch (j)
                {
                default:
                    a.d(j);
                    break;

                case 104: // 'h'
                    break;

                case 4001: 
                    break label0;
                }
            }
            return;
        }
        if (cq.c(((String) (obj))))
        {
            a.a(KikContactsListFragment.b(0x7f0902ba), cy.a(j));
            return;
        } else
        {
            a.Q = KikContactsListFragment.a(0x7f09034a, new Object[] {
                cq.a(a.H.a(((String) (obj)), true))
            });
            a.a(KikContactsListFragment.b(0x7f0902ba), a.Q);
            return;
        }
    }
}
