// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class ijf
    implements ikf
{

    private static final Set a = Collections.singleton("media_key");
    private final est b;

    ijf(est est1)
    {
        b = est1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_key"));
        return new hjr(b.a(i, ((String) (obj))));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjr;
    }

}
