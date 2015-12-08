// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class jvg
    implements jyx
{

    private jva a;

    jvg(jva jva1)
    {
        a = jva1;
        super();
    }

    public final void a(jyw jyw)
    {
        if (!((juy)jyw).a_().b())
        {
            jva.a(a, "Unable to stop the remote display, result unsuccessful");
        } else
        {
            jva.a(a, "remote display stopped");
        }
        jva.b(a, null);
    }
}
