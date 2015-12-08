// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.j;

import com.android.slyce.a.c.bs;
import com.android.slyce.d.b;

// Referenced classes of package com.android.slyce.j:
//            o, a

class l
    implements o
{

    final String a;
    final a b;

    l(a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }

    public void a(int i)
    {
        if (i == 200)
        {
            if (com.android.slyce.j.a.d(b).i())
            {
                com.android.slyce.j.a.a(b).a(b.c);
            }
            com.android.slyce.j.a.d(b).a(a);
            com.android.slyce.j.a.d(b).a(new byte[10]);
            return;
        } else
        {
            com.android.slyce.j.a.a(b).b("Error on uploading bitmap");
            return;
        }
    }
}
