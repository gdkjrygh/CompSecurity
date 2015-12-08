// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.google.b.i;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.p;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import java.lang.reflect.Type;

public class CollageSizeReaderWriter
    implements k, s
{

    public CollageSizeReaderWriter()
    {
    }

    public WebPhoto.CollageSize deserialize(l l1, Type type, j j)
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
                return new WebPhoto.CollageSize(l1.a(0).g(), l1.a(1).g());
            }
        }
        if (l1.j())
        {
            return new WebPhoto.CollageSize(-1, -1);
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

    public l serialize(WebPhoto.CollageSize collagesize, Type type, r r)
    {
        type = new i();
        type.a(new q(Integer.valueOf(collagesize.getWidth())));
        type.a(new q(Integer.valueOf(collagesize.getHeight())));
        return type;
    }

    public volatile l serialize(Object obj, Type type, r r)
    {
        return serialize((WebPhoto.CollageSize)obj, type, r);
    }
}
