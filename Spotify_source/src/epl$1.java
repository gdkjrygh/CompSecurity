// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;

final class ang.Object
    implements an
{

    private epl a;

    public final da a(Bundle bundle)
    {
        return new cu(a.b, dtw.a, epl.a, null, null);
    }

    public final void a()
    {
        a.a(epn.c);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (obj != null && ((Cursor) (obj)).moveToFirst())
        {
            epl epl1 = a;
            boolean flag = gcw.a(((Cursor) (obj)), "logged_in");
            String s = gcw.a(((Cursor) (obj)), "current_user", null);
            String s1 = gcw.a(((Cursor) (obj)), "product_type", null);
            String s2 = gcw.a(((Cursor) (obj)), "country_code", null);
            gcw.a(((Cursor) (obj)), "connected");
            epl1.a(new epm(flag, s, s1, s2));
        }
    }

    (epl epl1)
    {
        a = epl1;
        super();
    }
}
