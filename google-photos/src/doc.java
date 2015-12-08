// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class doc
    implements dnf
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "collection_media_key", "title", "type", "start", "end"
    })));
    private final nnw b;

    doc(Context context)
    {
        b = (nnw)olm.b(context, nnw);
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        String s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("collection_media_key"));
        String s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("title"));
        esm esm1 = esm.a(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("type")));
        long l = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("start"));
        long l1 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("end"));
        obj = s;
        if (b != null)
        {
            obj = s;
            if (esm1 == esm.d)
            {
                nnx nnx1 = b.a(s1);
                obj = s;
                if (nnx1 != null)
                {
                    obj = nnx1.c;
                }
            }
        }
        return new hkj(l, l1, ((String) (obj)), s1);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hkj;
    }

}
