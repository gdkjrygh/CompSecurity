// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fvw
    implements fvl
{

    private static final Set a = Collections.singleton("_id");
    private final gbh b;

    fvw(Context context)
    {
        b = (gbh)olm.a(context, gbh);
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        long l = ((fvm) (obj)).b.getLong(((fvm) (obj)).b.getColumnIndexOrThrow("_id"));
        Uri uri = ((fvm) (obj)).a.b;
        if (uri != null && ((fvm) (obj)).a.c == njx.a)
        {
            obj = ContentUris.withAppendedId(uri, l);
            return new hdw(b.a(((Uri) (obj)).toString()));
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
        return hdv;
    }

}
