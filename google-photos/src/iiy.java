// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class iiy
    implements ikf
{

    private static final Set b = Collections.singleton("media_key");
    private final erz a;

    public iiy(erz erz1)
    {
        a = erz1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_key"));
        return new ikq(a.e(i, ((String) (obj))));
    }

    public final Set a()
    {
        return b;
    }

    public final Class b()
    {
        return ikq;
    }

}
