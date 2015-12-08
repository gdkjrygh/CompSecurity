// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fvq
    implements fvt
{

    private final gvs a;

    fvq(Context context)
    {
        a = (gvs)olm.a(context, gvs);
    }

    public final ekk a()
    {
        return (new ekm()).a(hpg).a();
    }

    public final elb a(gue gue)
    {
        try
        {
            gue = b.b(a.b(gue));
        }
        // Misplaced declaration of an exception variable
        catch (gue gue)
        {
            return b.a(gue);
        }
        return gue;
    }
}
