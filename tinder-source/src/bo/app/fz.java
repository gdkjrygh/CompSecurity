// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;

// Referenced classes of package bo.app:
//            fj

class fz extends fj
    implements Serializable
{

    final Object a;
    final Object b;

    fz(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    public final Object getKey()
    {
        return a;
    }

    public final Object getValue()
    {
        return b;
    }

    public final Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
