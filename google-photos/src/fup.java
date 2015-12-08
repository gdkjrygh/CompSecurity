// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fup
    implements fvl
{

    private static final Set a = Collections.singleton("_id");
    private final gur b;
    private final gtp c;
    private final gbd d;

    fup(Context context, gbd gbd1)
    {
        b = (gur)olm.a(context, gur);
        c = (gtp)olm.a(context, gtp);
        d = gbd1;
    }

    public final ekf a(int i, Object obj)
    {
        Object obj1 = null;
        obj = (fvm)obj;
        if (!c.a(i, euv.a(((fvm) (obj)).a.c)))
        {
            return null;
        }
        int j = ((fvm) (obj)).b.getColumnIndexOrThrow("_id");
        long l = ((fvm) (obj)).b.getLong(j);
        Uri uri = ContentUris.withAppendedId(((fvm) (obj)).a.b, l);
        obj = uri.toString();
        obj = d.a(((String) (obj)));
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((nko) (obj)).b();
        }
        l = b.a(i, uri);
        if (l != -1L)
        {
            obj = b.a(i, l);
        } else
        {
            long l1 = gtj.a(b, i, uri, ((String) (obj)));
            obj = b.a(i, l1);
        }
        return new gtk(((gum) (obj)));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return gtk;
    }

}
