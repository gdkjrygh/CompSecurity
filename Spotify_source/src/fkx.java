// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class fkx
    implements fky
{

    fks a;
    private dzs b;
    private HashMap c;

    public fkx(fks fks1, dzs dzs1)
    {
        c = new HashMap();
        a = fks1;
        b = dzs1;
    }

    public final void a()
    {
        b.a();
        fks fks1 = a;
        fks1.a.clear();
        fks1.a = null;
        b = null;
        a = null;
        c.clear();
        c = null;
    }

    public final void a(Uri uri, String as[], fkz fkz)
    {
        uri = new an(uri, as, fkz) {

            private Uri a;
            private String b[];
            private fkz c;
            private fkx d;

            public final da a(Bundle bundle)
            {
                Object obj = d.a;
                bundle = a;
                String as1[] = b;
                obj = (Context)((fks) (obj)).a.get();
                if (obj == null)
                {
                    return null;
                } else
                {
                    return new cu(((Context) (obj)), bundle, as1, null, null);
                }
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst() && c != null)
                {
                    c.a(((Cursor) (obj)));
                }
            }

            
            {
                d = fkx.this;
                a = uri;
                b = as;
                c = fkz1;
                super();
            }
        };
        b.a(uri);
        c.put(fkz, uri);
    }

    public final void a(fkz fkz)
    {
        if (c.containsKey(fkz))
        {
            an an1 = (an)c.get(fkz);
            c.remove(fkz);
            b.b(an1);
        }
    }
}
