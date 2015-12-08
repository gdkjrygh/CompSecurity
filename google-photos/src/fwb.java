// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class fwb
    implements fvl
{

    private static final Set a = Collections.singleton("_id");
    private final Context b;

    fwb(Context context)
    {
        b = context;
    }

    private ekf a(fvm fvm1)
    {
        jdw jdw1 = null;
        if (fvm1.a.c == njx.b) goto _L2; else goto _L1
_L1:
        fvm1 = jdw1;
_L4:
        return fvm1;
_L2:
        Object obj;
        long l;
        l = fvm1.b.getLong(fvm1.b.getColumnIndexOrThrow("_id"));
        obj = fvm1.a.b;
        fvm1 = jdw1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        fvm1 = ContentUris.withAppendedId(((android.net.Uri) (obj)), l);
        obj = android.provider.MediaStore.Video.query(b.getContentResolver(), fvm1, new String[] {
            "duration"
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        boolean flag = ((Cursor) (obj)).moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        fvm1 = jdw1;
        if (obj == null) goto _L4; else goto _L5
_L5:
        ((Cursor) (obj)).close();
        return null;
        jdw1 = new jdw(((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("duration")));
        fvm1 = jdw1;
        if (obj == null) goto _L4; else goto _L6
_L6:
        ((Cursor) (obj)).close();
        return jdw1;
        fvm1;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw fvm1;
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a((fvm)obj);
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
