// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class epa extends mtf
{

    private final int a;
    private final List b;
    private final List c;
    private final String j;

    public epa(int i, String s, List list, List list1)
    {
        super("EditAlbumPhotosTask");
        a = i;
        c = list;
        b = list1;
        j = s;
    }

    protected final mue a(Context context)
    {
        if (c.isEmpty() && b.isEmpty())
        {
            return new mue(true);
        }
        Object obj;
        if (c.isEmpty())
        {
            obj = null;
        } else
        {
            obj = new nuk(context, a);
            obj.a = j;
            obj.c = c;
            obj.d = nuh.b;
            obj = ((nuk) (obj)).a();
            ((nuj) (obj)).d();
        }
        if (obj != null && ((nxx) (obj)).l())
        {
            return new mue(((nxx) (obj)).l, ((nxx) (obj)).n, null);
        }
        if (b.isEmpty())
        {
            obj = null;
        } else
        {
            obj = new hky(context, a, b);
            ((hky) (obj)).d();
            if (!((hky) (obj)).l())
            {
                ((eto)olm.a(context, eto)).a(a, ((hky) (obj)).a.a, b, ((hky) (obj)).a(), true);
            }
        }
        if (obj != null && ((nxx) (obj)).l())
        {
            return new mue(((nxx) (obj)).l, ((nxx) (obj)).n, null);
        } else
        {
            hgg hgg1 = new hgg();
            hgg1.b = context;
            hgg1.a = a;
            hgg1.c = j;
            return mtj.b(context, hgg1.a());
        }
    }
}
