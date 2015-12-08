// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bg;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.be.b;
import com.google.android.m4b.maps.cq.ae;
import java.io.DataInput;
import java.io.DataOutput;

// Referenced classes of package com.google.android.m4b.maps.bg:
//            c, a

final class <init> extends n
{

    com.google.android.m4b.maps.bg.a a;
    private a b;
    private com.google.android.m4b.maps.bg.c c;

    public final void a(DataOutput dataoutput)
    {
        byte abyte0[] = b.c();
        dataoutput.writeInt(abyte0.length);
        dataoutput.write(abyte0);
    }

    public final boolean a(DataInput datainput)
    {
        datainput = com.google.android.m4b.maps.ac.c.a(ae.b, datainput);
        if (datainput.j(1) == 0)
        {
            return false;
        }
        datainput = datainput.c(1, 0);
        boolean flag = a.a(datainput);
        if (com.google.android.m4b.maps.bg.c.a(c) != null && flag && a.c)
        {
            com.google.android.m4b.maps.bg.c.a(c).a(datainput);
        }
        return true;
    }

    public final int g()
    {
        return 39;
    }

    private (com.google.android.m4b.maps.bg.c c1, a a1, com.google.android.m4b.maps.bg.a a2)
    {
        c = c1;
        super();
        b = a1;
        a = a2;
    }

    a(com.google.android.m4b.maps.bg.c c1, a a1, com.google.android.m4b.maps.bg.a a2, byte byte0)
    {
        this(c1, a1, a2);
    }
}
