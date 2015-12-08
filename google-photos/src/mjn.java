// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mjn
{

    private static final mjw d = new mjw();
    final String a;
    final mjw b;
    public final int c;

    public mjn(String s)
    {
        this(s, d);
    }

    private mjn(String s, mjw mjw1)
    {
        this(s, mjw1, -1);
    }

    public mjn(String s, mjw mjw1, int i)
    {
        a = s;
        b = mjw1;
        c = i;
        if (!nkj.a(s))
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "baseUrl is not a fife Url: ".concat(s);
            } else
            {
                s = new String("baseUrl is not a fife Url: ");
            }
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof mjn)
        {
            obj = (mjn)obj;
            flag = flag1;
            if (b.equals(((mjn) (obj)).b))
            {
                flag = flag1;
                if (a.equals(((mjn) (obj)).a))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b.hashCode() * 31 + a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("FifeModel{baseUrl='");
        String s1 = a;
        String s2 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 19 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append("', fifeUrlOptions=").append(s2).append("}").toString();
    }

}
