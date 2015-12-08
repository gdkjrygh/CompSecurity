// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nqq extends Enum
{

    public static final nqq a;
    public static final nqq b;
    public static final nqq c;
    private static nqq d;
    private static final nqq e[];

    private nqq(String s, int i, int j)
    {
        super(s, i);
    }

    public static nqq valueOf(String s)
    {
        return (nqq)Enum.valueOf(nqq, s);
    }

    public static nqq[] values()
    {
        return (nqq[])e.clone();
    }

    static 
    {
        a = new nqq("GCM_UNREAD_RECEIVED", 0, 0);
        b = new nqq("TAP_SYSTEM_TRAY", 1, 1);
        c = new nqq("DISMISS_SYSTEM_TRAY", 2, 2);
        d = new nqq("DISMISS_ALL", 3, 3);
        e = (new nqq[] {
            a, b, c, d
        });
    }
}
