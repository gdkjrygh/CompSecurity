// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class ijq
    implements ikf
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "title", "total_item_count"
    })));
    private final Context b;

    public ijq(Context context)
    {
        b = context;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        String s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("title"));
        i = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("total_item_count"));
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = b.getResources().getQuantityString(b.zZ, i, new Object[] {
                Integer.valueOf(i)
            });
        }
        return new elj(((String) (obj)));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return elj;
    }

}
