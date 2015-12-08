// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class ijc
    implements ikf
{

    private static final Set a = Collections.singleton("is_collaborative");

    ijc()
    {
    }

    public final ekf a(int i, Object obj)
    {
        boolean flag = true;
        obj = (Cursor)obj;
        if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("is_collaborative")) != 1)
        {
            flag = false;
        }
        return new hjl(Boolean.valueOf(flag));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjl;
    }

}
