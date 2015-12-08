// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class hgf extends mtf
{

    private final int a;
    private final hgh b;
    private final hgk c;

    hgf(hgg hgg1)
    {
        super("ReadMediaCollectionById");
        a = hgg1.a;
        Object obj;
        if (hgg1.g)
        {
            obj = new hgi(hgg1.b, hgg1.a, hgg1.c, hgg1.d);
        } else
        {
            obj = new hgj(hgg1.b, hgg1.a, hgg1.c, hgg1.d, hgg1.f);
        }
        b = ((hgh) (obj));
        c = hgg1.e;
    }

    private static List a(Object aobj[])
    {
        if (b.a(aobj))
        {
            return Collections.emptyList();
        } else
        {
            return Arrays.asList(aobj);
        }
    }

    protected final mue a(Context context)
    {
        noz noz1 = noz.a(context, "ReadMediaCollectionById", new String[0]);
        noz noz2 = noz.a(context, 3, "ReadMediaCollectionById", new String[] {
            "perf"
        });
        hgn hgn1 = b.a(c);
        if (hgn1 == null)
        {
            return new mue(true);
        }
        long l = noy.a();
        ((hpz)olm.a(context, hpz)).b(a, hgn1);
        if (!hgn1.j())
        {
            if (noz1.a())
            {
                noy.a("tag", "ReadMediaCollectionById");
            }
            return new mue(false);
        }
        if (noz2.a())
        {
            mue mue1;
            int i;
            if (hgn1.b.c != null)
            {
                i = hgn1.b.c.length;
            } else
            {
                i = 0;
            }
            noy.a("total", Integer.valueOf(i));
            noy.a("resume data", hgn1.c);
            noy.a("duration", l);
        }
        context = hgn1.c;
        b.a(((hgk) (context)).a, a(((Object []) (hgn1.b.d))), a(((Object []) (hgn1.b.c))), a(((Object []) (hgn1.b.b))));
        mue1 = new mue(true);
        mue1.a().putParcelable("resume_data", context);
        mue1.a().putString("media_key", hgn1.a);
        return mue1;
    }
}
