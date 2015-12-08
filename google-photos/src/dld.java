// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dld
    implements dnf
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "collection_media_key", "cover_url", "type", "duration"
    })));
    private final nnw b;

    dld(Context context)
    {
        b = (nnw)olm.b(context, nnw);
    }

    public final ekf a(int i, Object obj)
    {
        Object obj2 = (Cursor)obj;
        String s = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndexOrThrow("cover_url"));
        esm esm1 = esm.a(((Cursor) (obj2)).getInt(((Cursor) (obj2)).getColumnIndexOrThrow("type")));
        long l1 = ((Cursor) (obj2)).getLong(((Cursor) (obj2)).getColumnIndexOrThrow("duration"));
        Object obj1 = null;
        obj = obj1;
        long l = l1;
        if (b != null)
        {
            obj = obj1;
            l = l1;
            if (esm1 == esm.d)
            {
                obj = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndexOrThrow("collection_media_key"));
                obj2 = b.a(((String) (obj)));
                obj = obj1;
                l = l1;
                if (obj2 != null)
                {
                    l = ((nnx) (obj2)).b;
                    obj = ((nnx) (obj2)).a;
                }
            }
        }
        return new hjt(s, ((android.net.Uri) (obj)), l);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjt;
    }

}
