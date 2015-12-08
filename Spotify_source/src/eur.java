// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;

final class eur
    implements an
{

    private final String a;
    private euq b;

    public eur(euq euq1, String s)
    {
        b = euq1;
        super();
        a = (String)ctz.a(s);
    }

    public final da a(Bundle bundle)
    {
        bundle = dtt.a(a);
        return new cu(b.c, bundle, new String[] {
            "uri", "is_own", "is_subscribed"
        }, null, null);
    }

    public final void a()
    {
        b.b.remove(a);
        b.d.remove(a);
        b.e.put(Integer.valueOf(a.hashCode()), Boolean.valueOf(false));
        b.c(a);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (duc.a(((Cursor) (obj))))
        {
            ((Cursor) (obj)).moveToFirst();
            while (!((Cursor) (obj)).isAfterLast()) 
            {
                String s = ((Cursor) (obj)).getString(0);
                boolean flag = gcw.a(((Cursor) (obj)), 1);
                if (gcw.a(((Cursor) (obj)), 2))
                {
                    if (flag)
                    {
                        b.d.add(s);
                    } else
                    {
                        b.b.add(s);
                    }
                } else
                {
                    b.b.remove(s);
                    b.d.remove(s);
                }
                b.e.put(Integer.valueOf(s.hashCode()), Boolean.valueOf(true));
                b.c(s);
                ((Cursor) (obj)).moveToNext();
            }
        }
    }
}
