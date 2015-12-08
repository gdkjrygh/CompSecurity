// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import java.io.File;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            v, s, d

static final class nit> extends v
{

    public final void a(nit> nit>)
    {
        nit> nit>1 = (nit>)b(nit>.b);
        if (nit>1 != null)
        {
            nit>1.d = false;
        }
        a(nit>.b, nit>);
    }

    protected final void a(Object obj)
    {
        obj = (b)obj;
        if (((b) (obj)).d && !((d) (obj)).a.delete())
        {
            obj = String.valueOf(((a) (obj)).a);
            d.a((new StringBuilder(String.valueOf(obj).length() + 28)).append("Failed to delete cache file ").append(((String) (obj))).toString());
        }
    }

    public ()
    {
        super(100);
    }
}
