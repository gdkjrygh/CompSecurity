// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class fum
    implements fvl
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Collections.singletonList("composition_type")));
    private static final Class b = eev;

    fum()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        i = ((fvm) (obj)).b.getColumnIndexOrThrow("title");
        obj = b.j(((fvm) (obj)).b.getString(i));
        if (obj != null)
        {
            return new eew(true, ((Integer) (obj)).intValue());
        } else
        {
            return new eew(false, 0);
        }
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return b;
    }

}
