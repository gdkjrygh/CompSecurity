// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Date;

public abstract class apj
{

    public apj()
    {
    }

    public static Date a(Bundle bundle, String s)
    {
        long l;
        if (bundle != null)
        {
            if ((l = bundle.getLong(s, 0x8000000000000000L)) != 0x8000000000000000L)
            {
                return new Date(l);
            }
        }
        return null;
    }

    public static void a(Bundle bundle, String s, Date date)
    {
        bundle.putLong(s, date.getTime());
    }

    public abstract Bundle a();

    public abstract void a(Bundle bundle);

    public abstract void b();
}
