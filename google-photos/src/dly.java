// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class dly
    implements dkl
{

    private static final Set a = new HashSet(Arrays.asList(new String[] {
        "caption", "remote_state", "remote_url"
    }));

    dly()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        String s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("remote_url"));
        if (eun.a(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("remote_state"))) == eun.a && !TextUtils.isEmpty(s))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            return new fzz(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("caption")));
        } else
        {
            return null;
        }
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return fzz;
    }

}
