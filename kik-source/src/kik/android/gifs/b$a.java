// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs;


// Referenced classes of package kik.android.gifs:
//            b

private static final class <init>
{

    private String a;
    private String b;

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof <init>)
            {
                obj = (<init>)obj;
                flag = flag1;
                if (a != null)
                {
                    flag = flag1;
                    if (b != null)
                    {
                        flag = flag1;
                        if (((b) (obj)).a != null)
                        {
                            flag = flag1;
                            if (((a) (obj)).b != null)
                            {
                                flag = flag1;
                                if (a.equals(((ls) (obj)).a))
                                {
                                    flag = flag1;
                                    if (b.equals(((ls) (obj)).b))
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (new StringBuilder()).append(a).append(b).toString().hashCode();
    }

    private er(String s, String s1)
    {
        a = s;
        b = s1;
    }

    b(String s, String s1, byte byte0)
    {
        this(s, s1);
    }
}
