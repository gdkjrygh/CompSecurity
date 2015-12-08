// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class dlp
    implements dkl
{

    private static final Set a = Collections.singleton("_id");
    private final gur b;
    private final gtp c;
    private final gwr d;

    dlp(Context context)
    {
        b = (gur)olm.a(context, gur);
        c = (gtp)olm.a(context, gtp);
        d = (gwr)olm.a(context, gwr);
    }

    public final ekf a(int i, Object obj)
    {
        Object obj1 = (Cursor)obj;
        int j = ((Cursor) (obj1)).getInt(((Cursor) (obj1)).getColumnIndexOrThrow("type"));
        if (!c.a(i, euv.a(j)))
        {
            return null;
        }
        obj = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("dedup_key"));
        long l1 = b.a(i, ((String) (obj)));
        long l = l1;
        if (l1 == -1L)
        {
            String s = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("content_uri"));
            if (s != null)
            {
                l = gtj.a(b, i, Uri.parse(s), ((String) (obj)));
            } else
            {
                gwq gwq1 = gwr.a(((Cursor) (obj1)).getBlob(((Cursor) (obj1)).getColumnIndexOrThrow("protobuf")));
                obj1 = gwq1.a;
                byte abyte0[] = gwq1.b;
                l = gtj.a(b, i, ((Uri) (obj1)), ((String) (obj)), abyte0);
            }
        }
        return new gtk(b.a(i, l));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return gtk;
    }

}
