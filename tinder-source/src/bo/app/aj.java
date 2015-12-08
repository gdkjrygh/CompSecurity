// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.models.IPutIntoJson;
import java.util.Locale;

public final class aj extends Enum
    implements IPutIntoJson
{

    public static final aj a;
    public static final aj b;
    public static final aj c;
    private static final aj d[];

    private aj(String s, int i)
    {
        super(s, i);
    }

    public static aj valueOf(String s)
    {
        return (aj)Enum.valueOf(bo/app/aj, s);
    }

    public static aj[] values()
    {
        return (aj[])d.clone();
    }

    public final Object forJsonPut()
    {
        return toString().toLowerCase(Locale.US);
    }

    static 
    {
        a = new aj("FEED", 0);
        b = new aj("INAPP", 1);
        c = new aj("CONFIG", 2);
        d = (new aj[] {
            a, b, c
        });
    }
}
