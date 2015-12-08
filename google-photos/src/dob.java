// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

final class dob
    implements dkl
{

    private static final Set a = Collections.singleton("content_uri");
    private final jgq b;

    dob(Context context)
    {
        b = (jgq)olm.a(context, jgq);
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("content_uri"));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if ((obj = b.a(((String) (obj)))) != null)
            {
                return new jgl(((jgn) (obj)).a.intValue(), ((jgn) (obj)).b.intValue());
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
        return jgl;
    }

}
