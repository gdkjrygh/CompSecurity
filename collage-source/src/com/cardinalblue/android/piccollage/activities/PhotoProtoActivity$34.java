// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements i
{

    final PhotoProtoActivity a;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d() || j1.c())
        {
            k.a(a, 0x7f070134, 0);
            j1 = j1.f();
            if (j1 != null)
            {
                f.a(j1);
            }
        } else
        {
            b.bl();
            a.setResult(-1);
            a.finish();
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PhotoProtoActivity photoprotoactivity)
    {
        a = photoprotoactivity;
        super();
    }
}
