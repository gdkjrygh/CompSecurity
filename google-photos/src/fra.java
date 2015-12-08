// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fra
    implements fqy, omb, opv
{

    static final int a;
    static final int b;
    fqx c;
    fqz d;
    final Set e = new HashSet();

    public fra(opd opd1)
    {
        opd1.a(this);
    }

    static int a()
    {
        return b;
    }

    static fqx a(fra fra1)
    {
        return fra1.c;
    }

    static int b()
    {
        return a;
    }

    static fqz b(fra fra1)
    {
        return fra1.d;
    }

    public final void a(long l)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fqy)iterator.next()).a(l)) { }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (fqx)olm1.b(fqx);
        d = (fqz)olm1.b(fqz);
    }

    public final void b(long l)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((fqy)iterator.next()).b(l)) { }
    }

    static 
    {
        a = c.dz;
        b = c.dy;
    }
}
