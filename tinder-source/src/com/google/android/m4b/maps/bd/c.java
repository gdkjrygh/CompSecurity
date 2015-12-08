// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bd;

import android.util.Log;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.cq.t;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bd:
//            b

public final class c extends n
{

    public final com.google.android.m4b.maps.ak.a.c a;
    public final List b = new LinkedList();
    public a c;
    public boolean d;

    public c(com.google.android.m4b.maps.ak.a.c c1)
    {
        a = c1;
    }

    public final void a(bh bh)
    {
        int i = h();
        if (bh == null && i == 0)
        {
            if (ab.a("IndoorBuildingRequest", 3))
            {
                Log.d("IndoorBuildingRequest", "Unexpected OK status");
            }
            i = 1;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b)iterator.next()).a(a, i, bh)) { }
    }

    public final void a(DataOutput dataoutput)
    {
        a a1 = new a(t.a);
        a1.b(1, a.toString());
        com.google.android.m4b.maps.ac.c.a(dataoutput, a1);
    }

    public final boolean a(DataInput datainput)
    {
        c = com.google.android.m4b.maps.ac.c.a(t.b, datainput);
        return true;
    }

    public final int g()
    {
        return 118;
    }

    public final int h()
    {
        if (c == null)
        {
            return 1;
        }
        switch (c.d(1))
        {
        case 1: // '\001'
        default:
            return 1;

        case 0: // '\0'
            return 0;

        case 2: // '\002'
            return 2;
        }
    }
}
