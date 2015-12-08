// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            gs, ez, hi, em

final class ey
    implements com.github.nkzawa.b.a.a
{

    final em a;

    ey(em em)
    {
        a = em;
        super();
    }

    public final transient void a(Object aobj[])
    {
        try
        {
            if (gs.b())
            {
                gs.a("Client hide experiment");
            }
            hi.a(new ez(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            gs.b("clientHideExperiment error", ((Exception) (aobj)));
        }
    }
}
