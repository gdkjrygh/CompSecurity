// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

final class ija
    implements ikf
{

    private static final Set a = Collections.singleton("auth_key");

    ija()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("auth_key"));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return null;
        } else
        {
            return new iks(((String) (obj)));
        }
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return iks;
    }

}
