// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            b, DataHolder, e

public abstract class a
    implements b
{

    public final DataHolder a;

    public a(DataHolder dataholder)
    {
        a = dataholder;
        if (a != null)
        {
            a.j = this;
        }
    }

    public final void b()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public int c()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.h;
        }
    }

    public Iterator iterator()
    {
        return new e(this);
    }
}
