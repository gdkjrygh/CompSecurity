// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import java.util.List;

// Referenced classes of package com.facebook.prefs.shared:
//            j

class n
    implements Runnable
{

    final List a;
    final j b;

    n(j j1, List list)
    {
        b = j1;
        a = list;
        super();
    }

    public void run()
    {
        j.b(b, a);
    }
}
