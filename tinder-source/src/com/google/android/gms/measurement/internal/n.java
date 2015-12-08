// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ac, w, j, h, 
//            EventParams

public final class n
{

    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final EventParams f;

    n(ac ac1, String s, String s1, String s2, long l, long l1, EventParams eventparams)
    {
        u.a(s1);
        u.a(s2);
        u.a(eventparams);
        a = s1;
        b = s2;
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = null;
        }
        c = s1;
        d = l;
        e = l1;
        if (e != 0L && e > d)
        {
            ac1.e().b.a("Event created with reverse previous/current timestamps");
        }
        f = eventparams;
    }

    n(ac ac1, String s, String s1, String s2, long l, Bundle bundle)
    {
        u.a(s1);
        u.a(s2);
        a = s1;
        b = s2;
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = null;
        }
        c = s1;
        d = l;
        e = 0L;
        if (e != 0L && e > d)
        {
            ac1.e().b.a("Event created with reverse previous/current timestamps");
        }
        if (bundle != null && !bundle.isEmpty())
        {
            s = new Bundle(bundle);
            for (s1 = s.keySet().iterator(); s1.hasNext();)
            {
                s2 = (String)s1.next();
                if (s2 == null)
                {
                    s1.remove();
                } else
                {
                    ac1.g();
                    bundle = ((Bundle) (s.get(s2)));
                    bundle = ((Bundle) (h.a(j.o(), bundle)));
                    if (bundle == null)
                    {
                        s1.remove();
                    } else
                    {
                        ac1.g().a(s, s2, bundle);
                    }
                }
            }

            f = new EventParams(s);
            return;
        } else
        {
            f = new EventParams(new Bundle());
            return;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Event{");
        stringbuilder.append("appId='").append(a).append('\'');
        stringbuilder.append(", name='").append(b).append('\'');
        stringbuilder.append(", params=").append(f);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
