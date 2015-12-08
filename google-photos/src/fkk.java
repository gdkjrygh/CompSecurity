// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class fkk
    implements fjw
{

    private final Context a;

    fkk(Context context)
    {
        a = context;
    }

    private ekf a(fjz fjz1)
    {
        jdw jdw1;
        jdw1 = null;
        fjz1 = fjz1.a;
        if (oql.c(fjz1)) goto _L2; else goto _L1
_L1:
        fjz1 = jdw1;
_L4:
        return fjz1;
_L2:
        Cursor cursor;
        cursor = android.provider.MediaStore.Video.query(a.getContentResolver(), fjz1, new String[] {
            "duration"
        });
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        boolean flag = cursor.moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        fjz1 = jdw1;
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return null;
        jdw1 = new jdw(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
        fjz1 = jdw1;
        if (cursor == null) goto _L4; else goto _L5
_L5:
        cursor.close();
        return jdw1;
        fjz1;
        if (cursor != null)
        {
            cursor.close();
        }
        throw fjz1;
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((fjz)obj);
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return jdv;
    }
}
