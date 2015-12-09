// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bp;


// Referenced classes of package p.bp:
//            a

public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    private final String e;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/bp/a$a, s);
    }

    public static .String[] values()
    {
        return (.String[])f.clone();
    }

    public String toString()
    {
        return e;
    }

    static 
    {
        a = new <init>("INVALID_REQUEST", 0, "Invalid Ad request.");
        b = new <init>("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
        c = new <init>("NETWORK_ERROR", 2, "A network error occurred.");
        d = new <init>("INTERNAL_ERROR", 3, "There was an internal error.");
        f = (new f[] {
            a, b, c, d
        });
    }

    private .String(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }
}
