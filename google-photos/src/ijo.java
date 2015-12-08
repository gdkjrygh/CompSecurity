// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class ijo
    implements ikf
{

    private static final Set a = Collections.unmodifiableSet(Collections.singleton("protobuf"));

    ijo()
    {
    }

    private static ekf a(Cursor cursor)
    {
        int i;
        cursor = cursor.getBlob(cursor.getColumnIndexOrThrow("protobuf"));
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
_L6:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        ((pzy) (cursor[i])).a;
        JVM INSTR lookupswitch 2: default 117
    //                   6: 80
    //                   11: 93;
           goto _L1 _L2 _L3
_L1:
        break MISSING_BLOCK_LABEL_117;
_L2:
        cursor = esm.c;
_L4:
        return new hkf(cursor);
_L3:
        cursor = esm.d;
          goto _L4
        cursor = esm.b;
          goto _L4
        i++;
        if (true) goto _L6; else goto _L5
_L5:
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
        return hkf;
    }

}
