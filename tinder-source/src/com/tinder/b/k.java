// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import com.tinder.enums.SqlDataType;
import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.tinder.b:
//            b, c

public final class k extends b
{

    public String a;
    public String b;
    public String c;
    public SimpleDateFormat d;
    private c e[];

    public k()
    {
        a = "SESSIONS";
        b = "date";
        c = "version";
        e = (new c[] {
            new c(b, SqlDataType.DATETIME, true), new c(c, SqlDataType.TEXT, false)
        });
        d = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    }

    protected final c[] a()
    {
        return e;
    }

    protected final String b()
    {
        return a;
    }
}
