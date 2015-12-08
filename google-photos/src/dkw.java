// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class dkw
    implements dkl
{

    static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "composition_type", "protobuf"
    })));

    public dkw()
    {
    }

    public static ekf a(Cursor cursor)
    {
        pye pye = null;
        boolean flag1 = false;
        boolean flag;
        if (8 == cursor.getInt(cursor.getColumnIndexOrThrow("composition_type")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return new gfo(false, null, null);
        }
        cursor = cursor.getBlob(cursor.getColumnIndexOrThrow("protobuf"));
        cursor = (qgg)mve.a(new qgg(), cursor);
        if (cursor != null && ((qgg) (cursor)).e != null && ((qgg) (cursor)).e.b != null && ((qgg) (cursor)).e.b.c != null && ((qgg) (cursor)).g != null)
        {
            pye = ((qgg) (cursor)).e.b.c.a;
            cursor = ((qgg) (cursor)).g.a;
            if (pye != null && cursor != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        {
            cursor = null;
        }
        return new gfo(flag1, pye, cursor);
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((Cursor)obj);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return gfn;
    }

}
