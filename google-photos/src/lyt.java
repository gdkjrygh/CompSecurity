// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.gcoreclient.cast.remotedisplay.impl.CastRemoteDisplayLocalServiceDelegator;

final class lyt
    implements jvj
{

    private lyn a;

    lyt(lys lys, lyn lyn1)
    {
        a = lyn1;
        super();
    }

    public final void a(Status status)
    {
        if (a != null)
        {
            lyn lyn1 = a;
            new maq(status);
            lyn1.d();
        }
    }

    public final void a(jva jva)
    {
        Object obj = (CastRemoteDisplayLocalServiceDelegator)jva;
        if (a != null)
        {
            jva = a;
            obj = ((CastRemoteDisplayLocalServiceDelegator) (obj)).a;
            jva.c();
        }
    }
}
