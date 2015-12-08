// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;


// Referenced classes of package com.fitbit.serverinteraction:
//            PublicAPI

public static final class parameter extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    private final String parameter;

    public static parameter valueOf(String s)
    {
        return (parameter)Enum.valueOf(com/fitbit/serverinteraction/PublicAPI$InviteSource, s);
    }

    public static parameter[] values()
    {
        return (parameter[])e.clone();
    }

    public String toString()
    {
        return parameter;
    }

    static 
    {
        a = new <init>("Facebook", 0, "FACEBOOK_INVITATION");
        b = new <init>("Contacts", 1, "CONTACT_INVITATION");
        c = new <init>("Profile", 2, "PROFILE_INVITATION");
        d = new <init>("Email", 3, "EMAIL_INVITATION");
        e = (new e[] {
            a, b, c, d
        });
    }

    private _cls9(String s, int i, String s1)
    {
        super(s, i);
        parameter = s1;
    }
}
