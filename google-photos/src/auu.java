// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;

public final class auu
    implements atm
{

    private final Context a;

    auu(Context context)
    {
        a = context.getApplicationContext();
    }

    public final atn a(Object obj, int i, int j, ani ani1)
    {
        obj = (Uri)obj;
        if (b.b(i, j))
        {
            ani1 = (Long)ani1.a(awd.a);
            if (ani1 != null && ani1.longValue() == -1L)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                return new atn(new azw(obj), aof.a(a, ((Uri) (obj)), new aoh()));
            }
        }
        return null;
    }

    public final boolean a(Object obj)
    {
        obj = (Uri)obj;
        return b.a(((Uri) (obj))) && b.b(((Uri) (obj)));
    }
}
