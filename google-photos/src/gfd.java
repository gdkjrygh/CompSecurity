// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.Set;

public final class gfd
    implements nns
{

    private static final nom a;
    private final Context b;
    private final ekp c;
    private final ejn d;

    public gfd(Context context, ekp ekp1)
    {
        b = context;
        c = ekp1;
        d = (ejn)olm.a(context, ejn);
    }

    public final nod a()
    {
        if (c.c() == euv.c)
        {
            return nod.b;
        } else
        {
            return nod.a;
        }
    }

    public final nom b()
    {
        if (c == null)
        {
            return null;
        }
        Object obj = (gfn)c.a(gfn);
        pye pye = ((gfn) (obj)).h();
        obj = ((gfn) (obj)).i();
        if (pye == null)
        {
            return a;
        } else
        {
            return new nom(noo.a, 200, pye, ((String) (obj)));
        }
    }

    public final nob c()
    {
        if (c == null)
        {
            return null;
        }
        nod nod1 = a();
        ejm ejm1;
        if (nod.a.equals(nod1))
        {
            ejm1 = ejm.a;
        } else
        {
            ejm1 = ejm.c;
        }
        return new nob(d.a(c, ejm1), nod1);
    }

    public final Uri d()
    {
        if (c == null)
        {
            return null;
        }
        Object obj = (jdy)c.b(jdy);
        if (obj == null)
        {
            return null;
        }
        if (((jdy) (obj)).a())
        {
            Uri uri = ((jdy) (obj)).a.a;
            return Uri.fromFile(new File(oql.a(b.getContentResolver(), uri)));
        }
        jea jea1 = ((jdy) (obj)).b;
        if (jea1 == null)
        {
            obj = ((jdy) (obj)).c;
            jea1 = ((jea) (obj));
            if (obj == null)
            {
                return null;
            }
        }
        return jea1.a;
    }

    public final boolean e()
    {
        if (c == null)
        {
            return false;
        }
        jdy jdy1 = (jdy)c.b(jdy);
        if (jdy1 == null)
        {
            return false;
        } else
        {
            return jdy1.a();
        }
    }

    public final boolean f()
    {
        return ((gax)c.a(gax)).q().contains(gav.a);
    }

    static 
    {
        a = new nom(noo.b, 0, null, null);
    }
}
