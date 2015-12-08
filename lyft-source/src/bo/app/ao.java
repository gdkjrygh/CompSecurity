// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.models.IPutIntoJson;
import java.util.Locale;

public final class ao extends Enum
    implements IPutIntoJson
{

    public static final ao a;
    public static final ao b;
    public static final ao c;
    private static final ao d[];

    private ao(String s, int i)
    {
        super(s, i);
    }

    public static ao valueOf(String s)
    {
        return (ao)Enum.valueOf(bo/app/ao, s);
    }

    public static ao[] values()
    {
        return (ao[])d.clone();
    }

    public final Object forJsonPut()
    {
        return toString().toLowerCase(Locale.US);
    }

    static 
    {
        a = new ao("FEED", 0);
        b = new ao("INAPP", 1);
        c = new ao("CONFIG", 2);
        d = (new ao[] {
            a, b, c
        });
    }
}
