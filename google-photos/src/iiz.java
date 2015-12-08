// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class iiz
    implements ikf
{

    private static final Set a = Collections.singleton("media_key");

    iiz()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        return new hjj(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_key")));
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjj;
    }

}
