// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ec;


// Referenced classes of package p.ec:
//            g, b

public class d extends g
    implements b
{

    private String a;

    public d()
    {
        a = "*";
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
        throws IllegalArgumentException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        } else
        {
            a = s;
            return;
        }
    }
}
