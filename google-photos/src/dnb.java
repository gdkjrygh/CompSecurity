// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.Set;

final class dnb
    implements dkl
{

    static final Set a = Collections.singleton("photosphere");

    dnb()
    {
    }

    public static ekf a(Cursor cursor)
    {
        return hdw.a(cursor, "photosphere");
    }

    public final ekf a(int i, Object obj)
    {
        return hdw.a((Cursor)obj, "photosphere");
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hdv;
    }

}
