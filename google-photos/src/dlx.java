// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.util.Collections;
import java.util.Set;

final class dlx
    implements dkl
{

    private static final Set a = Collections.singleton("content_uri");
    private final Context b;

    dlx(Context context)
    {
        b = context;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("content_uri"));
        if (obj != null)
        {
            if (!b.c(((Uri) (obj = Uri.parse(((String) (obj)))))) && (obj = oql.a(b.getContentResolver(), ((Uri) (obj)))) != null)
            {
                return new fwd(Uri.fromFile(new File(((String) (obj)))));
            }
        }
        return null;
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return fwd;
    }

}
