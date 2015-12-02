// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.c;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;

// Referenced classes of package com.facebook.widget.c:
//            e

class f
    implements com.facebook.prefs.shared.f
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void a(d d, ae ae1)
    {
        if (ae1.toString().equals(a.getKey()))
        {
            e.a(a);
        }
    }
}
