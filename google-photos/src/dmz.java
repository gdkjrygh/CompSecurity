// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class dmz
    implements dnf
{

    private static final Set a = Collections.singleton("collection_media_key");
    private final erz b;

    dmz(Context context)
    {
        b = (erz)olm.a(context, erz);
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("collection_media_key"));
        obj = b.d(i, ((String) (obj)));
        if (obj != null && ((qfz) (obj)).d != null)
        {
            esm esm1 = erz.a(((qfz) (obj)));
            i = ((qfz) (obj)).d.a;
            boolean flag;
            if (esm1 == esm.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return new gsn(i, flag);
        } else
        {
            return null;
        }
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return gsn;
    }

}
