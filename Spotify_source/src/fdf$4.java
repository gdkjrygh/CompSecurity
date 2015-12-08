// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;

final class ang.Object
    implements an
{

    private fdf a;

    public final da a(Bundle bundle)
    {
        bundle = dtl.a(fdf.b(a));
        return new cu(a.k(), bundle, fdf.H(), null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            fdf.b(a, ((Cursor) (obj)).getString(0));
            fdf.c(a, ((Cursor) (obj)).getString(1));
            a.g().putString("title", fdf.d(a));
            fdf.e(a);
        }
    }

    (fdf fdf1)
    {
        a = fdf1;
        super();
    }
}
