// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a.b;

import org.a.a.b.n;

// Referenced classes of package android_src.mms.a.b:
//            g, e

public class p extends g
    implements n
{

    p(e e1, String s)
    {
        super(e1, s);
    }

    private int a(String s)
    {
        String s1 = s;
        if (s.endsWith("px"))
        {
            s1 = s.substring(0, s.indexOf("px"));
        }
        int i;
        try
        {
            i = Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return i;
    }

    public void a(int i)
    {
        setAttribute("height", (new StringBuilder()).append(String.valueOf(i)).append("px").toString());
    }

    public void b(int i)
    {
        setAttribute("width", (new StringBuilder()).append(String.valueOf(i)).append("px").toString());
    }

    public int d()
    {
        return a(getAttribute("height"));
    }

    public int e()
    {
        return a(getAttribute("width"));
    }
}
