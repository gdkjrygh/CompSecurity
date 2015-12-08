// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.Collections;

final class ejs
    implements ejr
{

    private final Context a;
    private final ContentResolver b;
    private final gss c;
    private final noz d;

    ejs(Context context)
    {
        a = context;
        c = (gss)olm.a(context, gss);
        b = context.getContentResolver();
        d = noz.a(context, 4, "ContentResolverWrapper", new String[0]);
    }

    public final Cursor a(Uri uri, String as[], String s, String as1[], String s1)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT <= 16 || oql.b(uri) && c.a(a, Collections.singleton("android.permission.READ_EXTERNAL_STORAGE")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (d.a())
            {
                uri = String.valueOf(uri);
                (new StringBuilder(String.valueOf(uri).length() + 38)).append("cannot query without read permission: ").append(uri);
            }
            return new MatrixCursor(as);
        } else
        {
            return b.query(uri, as, s, as1, s1);
        }
    }
}
