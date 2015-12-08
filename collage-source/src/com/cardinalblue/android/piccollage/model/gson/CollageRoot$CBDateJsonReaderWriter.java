// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.p;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import java.lang.reflect.Type;
import java.util.Date;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            CollageRoot

private static class <init>
    implements k, s
{

    public volatile Object deserialize(l l1, Type type, j j)
        throws p
    {
        return deserialize(l1, type, j);
    }

    public Date deserialize(l l1, Type type, j j)
        throws p
    {
        return com.cardinalblue.android.b.k.d(l1.c());
    }

    public volatile l serialize(Object obj, Type type, r r)
    {
        return serialize((Date)obj, type, r);
    }

    public l serialize(Date date, Type type, r r)
    {
        if (date != null)
        {
            return new q(com.cardinalblue.android.b.k.a(date));
        } else
        {
            return null;
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
