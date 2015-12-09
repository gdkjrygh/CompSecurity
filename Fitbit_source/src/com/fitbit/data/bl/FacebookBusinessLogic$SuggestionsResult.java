// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.s;
import com.fitbit.e.a;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.bl:
//            FacebookBusinessLogic

public static final class serializableName extends Enum
    implements s
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final String f = "SuggestionsResult";
    private static final e g[];
    private final String serializableName;

    public static serializableName a(String s1)
    {
        serializableName serializablename = e;
        if (s1 == null)
        {
            return serializablename;
        }
        try
        {
            s1 = (e)w.a(s1, com/fitbit/data/bl/FacebookBusinessLogic$SuggestionsResult);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.fitbit.e.a.e("SuggestionsResult", com.fitbit.e.a.a(s1), new Object[0]);
            s1 = serializablename;
        }
        return s1;
    }

    public static e valueOf(String s1)
    {
        return (e)Enum.valueOf(com/fitbit/data/bl/FacebookBusinessLogic$SuggestionsResult, s1);
    }

    public static e[] values()
    {
        return (e[])g.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        a = new <init>("FETCHING", 0, "FETCHING");
        b = new <init>("FETCHED", 1, "FETCHED");
        c = new <init>("UNLINKED", 2, "UNLINKED");
        d = new <init>("EXPIRED", 3, "EXPIRED");
        e = new <init>("FAILED", 4, "FAILED");
        g = (new g[] {
            a, b, c, d, e
        });
    }

    private (String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
