// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.j;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder, n, i

public abstract class b
    implements j, Iterable
{

    protected final DataHolder a;

    protected b(DataHolder dataholder)
    {
        a = dataholder;
        if (a != null)
        {
            a.a(this);
        }
    }

    public int a()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.g();
        }
    }

    public abstract Object a(int k);

    public void b()
    {
        if (a != null)
        {
            a.i();
        }
    }

    public final void c()
    {
        b();
    }

    public boolean d()
    {
        if (a == null)
        {
            return true;
        } else
        {
            return a.h();
        }
    }

    public int e()
    {
        return 0;
    }

    public Bundle f()
    {
        return a.f();
    }

    public Iterator g()
    {
        return new n(this);
    }

    public Iterator iterator()
    {
        return new i(this);
    }
}
