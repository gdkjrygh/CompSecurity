// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cc;


// Referenced classes of package p.cc:
//            b

public class c
{

    int a;
    String b;

    public c(int i, String s)
    {
        a = i;
        if (s == null || s.trim().length() == 0)
        {
            b = p.cc.b.a(i);
            return;
        } else
        {
            b = (new StringBuilder()).append(s).append(" (response: ").append(p.cc.b.a(i)).append(")").toString();
            return;
        }
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public boolean c()
    {
        return a == 0;
    }

    public boolean d()
    {
        return !c();
    }

    public String toString()
    {
        return (new StringBuilder()).append("IabResult: ").append(b()).toString();
    }
}
