// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class bud
    implements nnr
{

    private final nff a[];

    public transient bud(nff anff[])
    {
        int j = anff.length;
        for (int i = 0; i < j; i++)
        {
            b.a(anff[i], "Logger", null);
        }

        a = anff;
    }

    private transient void a(bue bue1, int i, Object aobj[])
    {
        i = 0;
        if (bue1 == null)
        {
            bue1 = String.format("(null): (%s) ???", new Object[0]);
        } else
        {
            aobj = String.format(bue1.e, aobj);
            bue1 = String.format("%s: %s", new Object[] {
                bue1.name(), aobj
            });
        }
        aobj = a;
        for (int j = aobj.length; i < j; i++)
        {
            ((nff) (aobj[i])).a(bue1);
        }

    }

    public final void a()
    {
        a(bue.a, -1, new Object[0]);
    }

    public final void a(Uri uri)
    {
        a(bue.c, -1, new Object[] {
            uri
        });
    }

    public final void a(Uri uri, boolean flag)
    {
        a(bue.d, -1, new Object[] {
            uri, Boolean.valueOf(flag)
        });
    }

    public final void a(boolean flag)
    {
        a(bue.b, -1, new Object[] {
            Boolean.valueOf(flag)
        });
    }
}
