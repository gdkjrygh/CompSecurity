// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fuq
    implements fvl
{

    private static final Set a = Collections.singleton("_id");
    private final Context b;

    fuq(Context context)
    {
        b = context;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        long l = ((fvm) (obj)).b.getLong(((fvm) (obj)).b.getColumnIndexOrThrow("_id"));
        obj = new fzi(null, ContentUris.withAppendedId(((fvm) (obj)).a.b, l).toString());
        return new fzu((new fzk(b, i)).a(((fzi) (obj))).a);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return fzu;
    }

}
