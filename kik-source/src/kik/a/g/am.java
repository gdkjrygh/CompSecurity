// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.i;
import kik.a.e.v;

// Referenced classes of package kik.a.g:
//            v

final class am extends i
{

    final kik.a.g.v a;

    am(kik.a.g.v v1)
    {
        a = v1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        if (((Integer)obj1).intValue() < 79)
        {
            v.l(a);
            v.n(a).c("ProfileManager.rosterTimeStamp", Long.toString(v.m(a)));
        }
    }
}
