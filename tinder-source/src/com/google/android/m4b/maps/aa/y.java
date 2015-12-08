// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ae, aa

abstract class y extends ae
{
    static final class a
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private aa a;

        final Object readResolve()
        {
            return a.b();
        }

        a(aa aa1)
        {
            a = aa1;
        }
    }


    y()
    {
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public boolean contains(Object obj)
    {
        return h().contains(obj);
    }

    final boolean d()
    {
        return h().d();
    }

    abstract aa h();

    public boolean isEmpty()
    {
        return h().isEmpty();
    }

    public int size()
    {
        return h().size();
    }

    Object writeReplace()
    {
        return new a(h());
    }
}
