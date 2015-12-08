// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class ijt
    implements ikf
{

    ijt()
    {
    }

    private ekf a(Cursor cursor)
    {
        cursor = cursor.getBlob(cursor.getColumnIndexOrThrow("protobuf"));
        Object obj;
        int i;
        int j;
        try
        {
            cursor = ((qfz)qlw.a(new qfz(), cursor)).b.f;
            j = cursor.length;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw new eke(cursor);
        }
        i = 0;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        obj = cursor[i];
        if (((pzy) (obj)).c == null || ((pzy) (obj)).c.a == null) goto _L2; else goto _L1
_L1:
        cursor = ((pzy) (obj)).c.a.a;
_L3:
        cursor = new iky(cursor);
        return cursor;
_L2:
        i++;
        break MISSING_BLOCK_LABEL_42;
        cursor = null;
          goto _L3
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((Cursor)obj);
    }

    public final Set a()
    {
        return Collections.singleton("protobuf");
    }

    public final Class b()
    {
        return iky;
    }
}
