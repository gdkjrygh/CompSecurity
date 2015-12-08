// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Map;

final class lua extends lqd
{

    private static final String b;
    private final Context c;

    public lua(Context context)
    {
        super(b, new String[0]);
        c = context;
    }

    public final ksp a(Map map)
    {
        return ltw.a(c.getPackageName());
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.c.toString();
    }
}
