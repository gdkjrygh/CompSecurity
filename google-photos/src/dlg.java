// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class dlg
    implements dnf
{

    private static final Set a = Collections.singleton("type");

    dlg()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        i = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("type"));
        boolean flag;
        if (esm.a != esm.a(i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new hkb(flag);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hkb;
    }

}
