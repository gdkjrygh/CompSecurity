// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;

final class ang.Object
    implements an
{

    private eno a;

    public final da a(Bundle bundle)
    {
        bundle = dti.a(eno.b(a), eno.c(a), eno.d(a));
        return new cu(eno.e(a), bundle, dnw.a, null, eno.f(a).a());
    }

    public final void a()
    {
        eno.a(a).a(null);
    }

    public final volatile void a(Object obj)
    {
        obj = (Cursor)obj;
        eno.a(a).a(((Cursor) (obj)));
    }

    (eno eno1)
    {
        a = eno1;
        super();
    }
}
