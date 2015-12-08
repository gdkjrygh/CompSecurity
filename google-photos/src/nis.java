// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class nis
    implements ngp
{

    private pbi a;
    private Set b;
    private nir c;

    nis(nir nir1)
    {
        c = nir1;
        super();
    }

    public final int a(mmz mmz1)
    {
        boolean flag5 = true;
        boolean flag = false;
        pmp pmp1 = a.a;
        pmr pmr1 = pmp1.b;
        mmz mmz2 = mmz1.b("gaia_id", pmr1.c.a).b("is_plus_page", b.a(pmr1.b, false)).b("display_name", pmr1.c.c).b("given_name", pmr1.c.g).b("family_name", pmr1.c.h).b("domain_name", pmr1.c.f);
        int l;
        boolean flag1;
        if (!TextUtils.isEmpty(pmr1.c.f))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mmz2 = mmz2.b("is_dasher_account", flag1).b("is_child", b.a(pmr1.a, false));
        if (pmp1.c == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mmz2.b("is_default_restricted", flag1).b("email_gaia_id", pmr1.c.b);
        if (b.a(pmr1.c.e, false))
        {
            mmz1.e("profile_photo_url");
        } else
        {
            mmz1.b("profile_photo_url", b.B(pmr1.c.d));
        }
        l = mmz1.a("page_count", 0);
        for (int i = 0; i < l; i++)
        {
            mmz1.f("page").f(Integer.toString(i)).e("gaia_id").e("display_name").e("avatar_url").e("email_gaia_id");
        }

        int j;
        if (pmr1.d == null)
        {
            j = 0;
        } else
        {
            j = pmr1.d.length;
        }
        for (l = 0; l < j; l++)
        {
            pms pms1 = pmr1.d[l];
            mmz1.f("page").f(Integer.toString(l)).b("gaia_id", pms1.a).b("display_name", pms1.c).b("avatar_url", b.B(pms1.d)).b("email_gaia_id", pms1.b);
        }

        mmz1.b("page_count", j);
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (!b.a(pmr1.e, false))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (pmp1.a == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag1 && j > 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag1 && !flag2)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        mmz1.b("is_google_plus", flag4);
        if (flag1 && flag2)
        {
            flag4 = flag5;
        } else
        {
            flag4 = false;
        }
        mmz1.b("gplus_no_mobile_tos", flag4);
        mmz1.b("gplus_skinny_page", flag3);
        mmz1.b("PlusiAccountUpdateExtension.oob_required", flag2);
        mmz1.b("PlusiAccountUpdateExtension.wants_full_update", flag1);
        l = nir.b(c).size();
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            mmz1 = (nie)nir.b(c).get(k);
            b.contains(mmz1);
        }

        return ngq.a;
    }

    public final void a(mmx mmx, nyg nyg, List list)
    {
        mmx = new pbh();
        mmx.a = new pmn();
        ((pbh) (mmx)).a.a = Boolean.valueOf(true);
        ((pbh) (mmx)).a.b = Boolean.valueOf(true);
        b = new HashSet();
        int j = nir.b(c).size();
        for (int i = 0; i < j; i++)
        {
            nie nie1 = (nie)nir.b(c).get(i);
            if (nie1.a())
            {
                b.add(nie1);
            }
        }

        a = new pbi();
        list.add(new nit(this, nir.a(c), nyg, "getmobilesettings", mmx, a));
    }
}
