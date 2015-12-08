// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.as;

import com.comscore.utils.InstallReferrerReceiver;
import com.comscore.utils.m;
import com.comscore.utils.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p.at.a;

// Referenced classes of package p.as:
//            c, d

public class b extends c
{

    protected b(p.aq.b b1, d d, String s, boolean flag)
    {
        super(b1, d, s, flag, true, true);
        b(new a("ns_ap_gs", String.valueOf(b1.J()), Boolean.valueOf(false)));
        b(new a("ns_ap_install", String.valueOf(b1.I()), Boolean.valueOf(false)));
        b(new a("ns_ap_runs", String.valueOf(b1.H()), Boolean.valueOf(false)));
        if (flag)
        {
            b(new a("ns_ap_csf", "1", Boolean.valueOf(false)));
        }
        d = "0";
        if (m.a())
        {
            d = "1";
        }
        b(new a("ns_ap_jb", d, Boolean.valueOf(false)));
        b(new a("ns_ap_lastrun", String.valueOf(b1.aa()), Boolean.valueOf(false)));
        d = b1.N();
        if (d != null && d.length() > 0)
        {
            b(new a("ns_ap_updated", d, Boolean.valueOf(false)));
        }
        d = b1.r().b("exception_ocurrences");
        if (d != null && d.length() > 0 && !d.equals("0"))
        {
            b(new a("ns_ap_er", d, Boolean.valueOf(false)));
            b1.r().c("exception_ocurrences");
        }
        if (flag)
        {
            b1 = InstallReferrerReceiver.a(b1.P());
            if (b1 != null)
            {
                for (d = b1.keySet().iterator(); d.hasNext(); a(s, (String)b1.get(s)))
                {
                    s = (String)d.next();
                }

            }
        }
    }
}
