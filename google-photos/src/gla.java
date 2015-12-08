// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

final class gla
{

    private static final onh c = new onh("photos.debug.page_cache_dogfood");
    final jp a;
    final gld b;
    private final jp d;
    private final gkk e;
    private final noz f;

    private gla(Context context, gld gld1, gkk gkk1)
    {
        b = gld1;
        e = gkk1;
        f = noz.a(context, 5, "MediaPage", new String[0]);
        d = new glb(this, gld1.c);
        a = new glc(this, gld1.c);
    }

    public gla(Context context, gld gld1, gkm gkm)
    {
        this(context, gld1, new gkk(context, gkm));
    }

    static jp a(gla gla1)
    {
        return gla1.a;
    }

    static gkk b(gla gla1)
    {
        return gla1.e;
    }

    static jp c(gla gla1)
    {
        return gla1.d;
    }

    jp a(ehr ehr)
    {
        jp jp2 = (jp)d.a(ehr);
        jp jp1 = jp2;
        if (jp2 == null)
        {
            jp1 = new jp(b.b);
            d.a(ehr, jp1);
        }
        return jp1;
    }

    final void a(ehr ehr, int i)
    {
        b.u();
        e.a(ehr);
        a.a(ehr, Integer.valueOf(i));
    }

    final void a(ehr ehr, gkz gkz1)
    {
        b.u();
        e.a(ehr);
        a(ehr).a(Integer.valueOf(gkz1.a), gkz1);
        if (gkz1.a() < b.a)
        {
            Integer integer = (Integer)a.a(ehr);
            if (integer != null)
            {
                int i = gkz1.a;
                int j = b.a;
                i = gkz1.a() + i * j;
                if (integer.intValue() != i)
                {
                    boolean flag;
                    if (integer.intValue() / b.a - 1 == gkz1.a)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        a.a(ehr, Integer.valueOf(i));
                    }
                    if (f.a())
                    {
                        noy.a("current count", integer);
                        noy.a("count from page", Integer.valueOf(i));
                        noy.a("page number", Integer.valueOf(gkz1.a));
                        noy.a("media in page", Integer.valueOf(gkz1.a()));
                        noy.a("reset size", Boolean.valueOf(flag));
                        return;
                    }
                }
            }
        }
    }

    final Object b(ehr ehr, int i)
    {
        b.u();
        int j = i / b.a;
        ehr = (gkz)a(ehr).a(Integer.valueOf(j));
        if (ehr != null)
        {
            gld gld1 = b;
            int k = i / gld1.a;
            i -= gld1.a * k;
            if (i >= ((gkz) (ehr)).b.size())
            {
                return null;
            }
            try
            {
                ehr = ((ehr) (((gkz) (ehr)).b.get(i)));
            }
            // Misplaced declaration of an exception variable
            catch (ehr ehr)
            {
                return null;
            }
            return ehr;
        } else
        {
            return null;
        }
    }

}
