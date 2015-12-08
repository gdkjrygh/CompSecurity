// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class ghi
{

    private final mmv a;
    private final noz b;

    public ghi(mmv mmv1, noz noz)
    {
        a = mmv1;
        b = noz;
    }

    private static void a(StringBuilder stringbuilder, String s)
    {
        stringbuilder.append('\t').append(s).append(" = ");
    }

    private void a(StringBuilder stringbuilder, mmx mmx1, String s)
    {
        a(stringbuilder, s);
        stringbuilder.append(mmx1.b(s)).append('\n');
    }

    private void b(StringBuilder stringbuilder, mmx mmx1, String s)
    {
        a(stringbuilder, s);
        stringbuilder.append(mmx1.c(s)).append('\n');
    }

    public final void a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        mmx mmx1;
        for (Iterator iterator = a.a().iterator(); iterator.hasNext(); b(stringbuilder, mmx1, "has_irrecoverable_error"))
        {
            int i = ((Integer)iterator.next()).intValue();
            mmx1 = a.a(i);
            stringbuilder.append("Account ").append(i).append(":\n");
            a(stringbuilder, mmx1, "gaia_id");
            a(stringbuilder, mmx1, "email_gaia_id");
            b(stringbuilder, mmx1, "is_google_plus");
            b(stringbuilder, mmx1, "gplus_no_mobile_tos");
            b(stringbuilder, mmx1, "gplus_skinny_page");
            b(stringbuilder, mmx1, "logged_in");
            b(stringbuilder, mmx1, "logged_out");
            b(stringbuilder, mmx1, "is_bad");
            a(stringbuilder, mmx1, "effective_gaia_id");
            b(stringbuilder, mmx1, "is_plus_page");
            a(stringbuilder, mmx1, "profile_photo_url");
            a(stringbuilder, mmx1, "domain_name");
            b(stringbuilder, mmx1, "is_child");
            b(stringbuilder, mmx1, "is_dasher_account");
            b(stringbuilder, mmx1, "is_default_restricted");
            b(stringbuilder, mmx1, "is_managed_account");
            a(stringbuilder, "page_count");
            stringbuilder.append(mmx1.a("page_count", -1)).append('\n');
            a(stringbuilder, mmx1, "page");
            a(stringbuilder, mmx1, "gaia_id");
            a(stringbuilder, mmx1, "avatar_url");
            a(stringbuilder, mmx1, "email_gaia_id");
        }

    }
}
