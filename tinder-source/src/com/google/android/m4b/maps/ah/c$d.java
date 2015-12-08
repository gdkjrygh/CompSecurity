// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.bd;
import com.google.android.m4b.maps.aa.bw;
import com.google.android.m4b.maps.aa.d;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            c

public final class init> extends bw
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    public c a;
    private transient al b;

    protected final Collection a()
    {
        return b();
    }

    protected final Set b()
    {
        al al1 = b;
        Object obj = al1;
        if (al1 == null)
        {
            obj = bd.a(a.a(ae.a(a)));
            b b1 = a;
            obj = al.a(bd.a(com.google.android.m4b.maps.aa.d.a(((bd) (obj)).a, b1)).a);
            b = ((al) (obj));
        }
        return ((Set) (obj));
    }

    protected final Object c()
    {
        return b();
    }

    public (c c1)
    {
        a = c1;
        super();
    }
}
