// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;

final class nsg
{

    private final Context a;

    nsg(Context context)
    {
        a = context;
    }

    final nqv a(int i)
    {
        Object obj;
        obj = ntf.c(a, i);
        if (obj == null)
        {
            return new nqv(nqw.a);
        }
        Long long1;
        long l;
        ((Cursor) (obj)).moveToFirst();
        long1 = Long.valueOf(((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("sync_version")));
        l = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("viewed_sync_version"));
        ((Cursor) (obj)).close();
        ntf.b(a, i);
        if (long1.longValue() <= Long.valueOf(l).longValue())
        {
            break MISSING_BLOCK_LABEL_197;
        }
        nsh nsh1 = new nsh(a, i, long1.longValue());
        olm.a(a, nti);
        nti.a(nsh1, a);
        if (nsh1.l())
        {
            Exception exception;
            if (nxx.b(((nxx) (nsh1)).n))
            {
                obj = nqw.b;
            } else
            {
                obj = nqw.c;
            }
            return new nqv(((nqw) (obj)), ((nxx) (nsh1)).n);
        }
        break MISSING_BLOCK_LABEL_184;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
        ntf.a(a, i, long1.longValue());
        return new nqv(nqw.a);
    }
}
