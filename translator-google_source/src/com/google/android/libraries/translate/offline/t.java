// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import com.google.android.libraries.translate.e.l;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            OfflineTranslationException, o, ac, PackageType, 
//            LocationProfile

final class t
    implements l
{

    final PackageType a;
    final ac b;
    final LocationProfile c;
    final l d;
    final o e;

    t(o o1, PackageType packagetype, ac ac1, LocationProfile locationprofile, l l1)
    {
        e = o1;
        a = packagetype;
        b = ac1;
        c = locationprofile;
        d = l1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Boolean)obj;
        o.b(e).put(a, b);
        if (o.b(e).get(a) != null)
        {
            o.c(e).put(((ac)o.b(e).get(a)).a(), o.b(e).get(a));
        }
        try
        {
            o.a(e, c);
            o o1 = e;
            o1.e = o1.b();
            d.a(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d.a(Boolean.valueOf(false));
        }
    }
}
