// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.graphics.PointF;
import com.google.b.i;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.p;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import java.lang.reflect.Type;

public class PointFReaderWriter
    implements k, s
{

    public PointFReaderWriter()
    {
    }

    public PointF deserialize(l l1, Type type, j j)
        throws p
    {
        if (l1.i())
        {
            l1 = l1.n();
            int i1 = l1.a();
            if (i1 != 2)
            {
                throw new IllegalStateException((new StringBuilder()).append("Invalid point size => ").append(i1).toString());
            } else
            {
                return new PointF(l1.a(0).e(), l1.a(1).e());
            }
        } else
        {
            throw new IllegalStateException("Expect json array for Point");
        }
    }

    public volatile Object deserialize(l l1, Type type, j j)
        throws p
    {
        return deserialize(l1, type, j);
    }

    public l serialize(PointF pointf, Type type, r r)
    {
        type = new i();
        type.a(new q(Float.valueOf(pointf.x)));
        type.a(new q(Float.valueOf(pointf.y)));
        return type;
    }

    public volatile l serialize(Object obj, Type type, r r)
    {
        return serialize((PointF)obj, type, r);
    }
}
