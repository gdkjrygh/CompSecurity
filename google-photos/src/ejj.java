// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;

public final class ejj
    implements atm
{

    private final ejn a;
    private final eiu b;
    private final atm c;

    ejj(Context context, atm atm1)
    {
        c = atm1;
        a = (ejn)olm.a(context, ejn);
        b = (eiu)olm.a(context, eiu);
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = eiz.a((Uri)obj);
        int k = b.a(((eiz) (obj)).e);
        obj = b.b(((eiz) (obj)));
        if (obj == null)
        {
            return null;
        }
        if (k != 0x80000000)
        {
            j = k;
        } else
        {
            k = i;
        }
        if (!c.a(obj))
        {
            return null;
        } else
        {
            return c.a(obj, k, j, ani);
        }
    }

    public final boolean a(Object obj)
    {
        obj = (Uri)obj;
        return a.b(((Uri) (obj)));
    }
}
