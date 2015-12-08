// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class fhg
{

    private final List a;
    private final List b;
    private final List c;

    fhg(fhh fhh1)
    {
        a = Collections.unmodifiableList(new ArrayList(fhh1.a));
        b = Collections.unmodifiableList(new ArrayList(fhh1.b));
        c = Collections.unmodifiableList(new ArrayList(fhh1.c));
    }

    final boolean a(Uri uri)
    {
        String s = uri.getScheme();
        if (s == null || !a.contains(s))
        {
            return false;
        }
        s = uri.getHost();
        if (s == null || !b.contains(s))
        {
            return false;
        }
        if (uri.getPort() != -1)
        {
            return false;
        }
        uri = uri.getPath();
        if (uri == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = c.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!uri.startsWith((String)iterator.next())) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return false;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        return true;
    }
}
