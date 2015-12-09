// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.data.domain.s;
import com.fitbit.e.a;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.serverinteraction:
//            PublicAPI

public static final class serializableName extends Enum
    implements s
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final String d = "EmailStatus";
    private static final c e[];
    private final String serializableName;

    public static serializableName a(String s1)
    {
        serializableName serializablename = c;
        if (s1 == null)
        {
            return serializablename;
        }
        try
        {
            s1 = (c)w.a(s1, com/fitbit/serverinteraction/PublicAPI$EmailStatus);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.fitbit.e.a.e("EmailStatus", com.fitbit.e.a.a(s1), new Object[0]);
            s1 = serializablename;
        }
        return s1;
    }

    public static c valueOf(String s1)
    {
        return (c)Enum.valueOf(com/fitbit/serverinteraction/PublicAPI$EmailStatus, s1);
    }

    public static c[] values()
    {
        return (c[])e.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        a = new <init>("FACEBOOK", 0, "FACEBOOK");
        b = new <init>("EMAIL", 1, "EMAIL");
        c = new <init>("NONE", 2, "NONE");
        e = (new e[] {
            a, b, c
        });
    }

    private (String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
