// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.f;
import java.io.ObjectInputStream;
import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g, c

static final class <init> extends <init>
    implements f, Serializable
{

    private static final long serialVersionUID = 1L;
    private transient f b;

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        b = b().a(a);
    }

    private Object readResolve()
    {
        return b;
    }

    public final Object a(Object obj)
    {
        return b.a(obj);
    }

    (g g1)
    {
        super(g1);
    }
}
