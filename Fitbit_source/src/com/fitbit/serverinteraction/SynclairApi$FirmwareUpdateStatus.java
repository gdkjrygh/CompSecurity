// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.data.domain.s;
import com.fitbit.e.a;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.serverinteraction:
//            SynclairApi

public static final class serializableName extends Enum
    implements s
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    private final String serializableName;

    public static serializableName a(String s1)
    {
        serializableName serializablename = d;
        try
        {
            s1 = (d)w.a(s1, com/fitbit/serverinteraction/SynclairApi$FirmwareUpdateStatus);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.fitbit.e.a.e(com.fitbit.serverinteraction.SynclairApi.a(), com.fitbit.e.a.a(s1), new Object[0]);
            return serializablename;
        }
        return s1;
    }

    public static d valueOf(String s1)
    {
        return (d)Enum.valueOf(com/fitbit/serverinteraction/SynclairApi$FirmwareUpdateStatus, s1);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        a = new <init>("REQUIRED", 0, "REQUIRED");
        b = new <init>("OPTIONAL", 1, "OPTIONAL");
        c = new <init>("LANG", 2, "LANG");
        d = new <init>("NONE", 3, "NONE");
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
