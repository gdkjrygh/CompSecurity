// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            z

public abstract class y
{

    public final Set a = new HashSet();
    public long b;
    public int c;

    protected y()
    {
    }

    public final boolean a(z z1)
    {
        return a.add(z1);
    }

    public abstract float[] a();

    protected final void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((z)iterator.next()).a(this)) { }
    }
}
