// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

final class nit> extends gwv
{

    private Uri a;
    private String b[];
    private gwr c;

    public final Cursor a()
    {
        return c.b.query(a, b, null, null, null);
    }

    (gwr gwr1, Uri uri, String as[])
    {
        c = gwr1;
        a = uri;
        b = as;
        super();
    }
}
