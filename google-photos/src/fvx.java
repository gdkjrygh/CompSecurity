// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fvx
    implements fvl
{

    private static final Set a = Collections.singleton("_id");
    private final gbd b;

    fvx(gbd gbd1)
    {
        b = gbd1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        i = ((fvm) (obj)).b.getColumnIndexOrThrow("_id");
        long l = ((fvm) (obj)).b.getLong(i);
        String s = ContentUris.withAppendedId(((fvm) (obj)).a.b, l).toString();
        obj = b.a(s);
        hpm hpm1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((nko) (obj)).b();
        }
        hpm1 = new hpm();
        hpm1.a = ((String) (obj));
        hpm1.b = s;
        return new hpg(Collections.singletonList(hpm1.a()));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hpg;
    }

}
