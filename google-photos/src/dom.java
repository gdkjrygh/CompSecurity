// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dom
    implements dkl
{

    static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "duration", "media_key"
    })));
    private final nnw b;

    dom(Context context)
    {
        b = (nnw)olm.b(context, nnw);
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((Cursor)obj);
    }

    public final ekf a(Cursor cursor)
    {
        long l1 = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
        long l = l1;
        if (l1 == 0L)
        {
            l = l1;
            if (b != null)
            {
                cursor = cursor.getString(cursor.getColumnIndex("media_key"));
                cursor = b.a(cursor);
                l = l1;
                if (cursor != null)
                {
                    l = ((nnx) (cursor)).b;
                }
            }
        }
        return new jdw(l);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return jdv;
    }

}
