// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.util.Log;
import bolts.i;
import bolts.j;
import com.google.b.f;
import com.google.b.l;
import com.google.b.o;
import com.google.b.t;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            u

class a
    implements i
{

    final u a;

    public Object then(j j1)
        throws Exception
    {
        j1 = (String)j1.e();
        try
        {
            o o1 = ((l)(new f()).a(j1, com/google/b/l)).m();
            if (o1.b("avplayer_url"))
            {
                Log.v("[VideoScrapController]", (new StringBuilder()).append("avplayer_url").append(o1.c("avplayer_url").c()).toString());
                u.a(a, o1.c("avplayer_url").c());
            }
        }
        catch (t t1)
        {
            Log.v("[VideoScrapController]", (new StringBuilder()).append("Video Web Html: ").append(j1).toString());
            u.a(a, null);
            u.b(a, j1);
            return null;
        }
        return null;
    }

    (u u1)
    {
        a = u1;
        super();
    }
}
