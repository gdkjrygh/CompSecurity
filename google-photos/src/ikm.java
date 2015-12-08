// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

final class ikm
    implements ikf
{

    private static final Set a = Collections.singleton("short_url");

    ikm()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("short_url"));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return null;
        } else
        {
            return new ile(((String) (obj)));
        }
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return ile;
    }

}
