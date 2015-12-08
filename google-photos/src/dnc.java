// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dnc
    implements dnf
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "collection_media_key", "title", "type"
    })));
    private final nnw b;

    dnc(Context context)
    {
        b = (nnw)olm.b(context, nnw);
    }

    public final ekf a(int i, Object obj)
    {
        Object obj1 = (Cursor)obj;
        String s = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("title"));
        esm esm1 = esm.a(((Cursor) (obj1)).getInt(((Cursor) (obj1)).getColumnIndexOrThrow("type")));
        obj = s;
        if (b != null)
        {
            obj = s;
            if (esm1 == esm.d)
            {
                obj = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("collection_media_key"));
                obj1 = b.a(((String) (obj)));
                obj = s;
                if (obj1 != null)
                {
                    obj = ((nnx) (obj1)).c;
                }
            }
        }
        return new elj(((String) (obj)));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return elj;
    }

}
