// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fjm
    implements fjw
{

    private final gur a;
    private final gtp b;
    private final gbd c;

    fjm(Context context, gbd gbd1)
    {
        a = (gur)olm.a(context, gur);
        b = (gtp)olm.a(context, gtp);
        c = gbd1;
    }

    public final ekf a(int i, Object obj)
    {
        Object obj1 = null;
        obj = (fjz)obj;
        Uri uri;
        if (b.a(i, ((fjz) (obj)).b))
        {
            if (!b.c(uri = ((fjz) (obj)).a))
            {
                obj = uri.toString();
                obj = c.a(((String) (obj)));
                long l;
                if (obj == null)
                {
                    obj = obj1;
                } else
                {
                    obj = ((nko) (obj)).b();
                }
                l = a.a(i, uri);
                if (l != -1L)
                {
                    obj = a.a(i, l);
                } else
                {
                    long l1 = gtj.a(a, i, uri, ((String) (obj)));
                    obj = a.a(i, l1);
                }
                return new gtk(((gum) (obj)));
            }
        }
        return null;
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return gtk;
    }
}
