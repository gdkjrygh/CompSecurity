// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dlq
    implements dkl
{

    private static final dlr a = new dlr();
    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "content_uri", "media_key", "timezone_offset"
    })));
    private final Context c;
    private final dlr d;

    dlq(Context context)
    {
        this(context, a);
    }

    private dlq(Context context, dlr dlr1)
    {
        c = context;
        d = dlr1;
    }

    public final ekf a(int i, Object obj)
    {
        Cursor cursor = (Cursor)obj;
        obj = cursor.getString(cursor.getColumnIndexOrThrow("media_key"));
        long l;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = new fzi(null, cursor.getString(cursor.getColumnIndexOrThrow("content_uri")));
        } else
        {
            obj = new fzi(((String) (obj)), null);
        }
        obj = (new fzk(c, i)).a(((fzi) (obj))).a;
        l = cursor.getLong(cursor.getColumnIndexOrThrow("timezone_offset"));
        obj = new fzy(((fzw) (obj)));
        obj.s = Long.valueOf(l);
        return new fzu(((fzy) (obj)).a());
    }

    public final Set a()
    {
        return b;
    }

    public final Class b()
    {
        return fzu;
    }

}
