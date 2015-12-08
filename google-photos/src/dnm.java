// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dnm
    implements dnf
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "collection_media_key", "collection_album_id"
    })));

    dnm()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        String s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("collection_media_key"));
        i = ((Cursor) (obj)).getColumnIndexOrThrow("collection_album_id");
        long l;
        if (((Cursor) (obj)).isNull(i))
        {
            l = 0L;
        } else
        {
            l = ((Cursor) (obj)).getLong(i);
        }
        return new hpe(new hpc(s, Long.valueOf(l)));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hpe;
    }

}
