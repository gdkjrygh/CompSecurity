// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aqt
    implements aqy
{

    int a;
    Class b;
    private final aqu c;

    aqt(aqu aqu1)
    {
        c = aqu1;
    }

    public final void a()
    {
        c.a(this);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof aqt)
        {
            obj = (aqt)obj;
            flag = flag1;
            if (a == ((aqt) (obj)).a)
            {
                flag = flag1;
                if (b == ((aqt) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int j = a;
        int i;
        if (b != null)
        {
            i = b.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }

    public final String toString()
    {
        String s = String.valueOf("Key{size=");
        int i = a;
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length())).append(s).append(i).append("array=").append(s1).append("}").toString();
    }
}
