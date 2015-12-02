// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a.b;

import org.a.a.b.f;
import org.a.a.b.h;
import org.a.a.b.l;

// Referenced classes of package android_src.mms.a.b:
//            g, e

public class n extends g
    implements l
{

    n(e e1, String s)
    {
        super(e1, s);
    }

    private int a(String s, boolean flag)
    {
        if (s.endsWith("px"))
        {
            return Integer.parseInt(s.substring(0, s.indexOf("px")));
        }
        if (s.endsWith("%"))
        {
            double d1 = 0.01D * (double)Integer.parseInt(s.substring(0, s.length() - 1));
            if (flag)
            {
                d1 *= ((f)getOwnerDocument()).d().b().e();
            } else
            {
                d1 *= ((f)getOwnerDocument()).d().b().d();
            }
            return (int)Math.round(d1);
        } else
        {
            return Integer.parseInt(s);
        }
    }

    public String a()
    {
        return getAttribute("id");
    }

    public void a(int i)
    {
        setAttribute("height", (new StringBuilder()).append(String.valueOf(i)).append("px").toString());
    }

    public int b()
    {
        int i;
        try
        {
            i = a(getAttribute("left"), true);
        }
        catch (NumberFormatException numberformatexception)
        {
            int j;
            int k;
            int i1;
            try
            {
                j = ((f)getOwnerDocument()).d().b().e();
                k = a(getAttribute("right"), true);
                i1 = a(getAttribute("width"), true);
            }
            catch (NumberFormatException numberformatexception1)
            {
                return 0;
            }
            return j - k - i1;
        }
        return i;
    }

    public void b(int i)
    {
        setAttribute("width", (new StringBuilder()).append(String.valueOf(i)).append("px").toString());
    }

    public int c()
    {
        int i;
        try
        {
            i = a(getAttribute("top"), false);
        }
        catch (NumberFormatException numberformatexception)
        {
            int j;
            int k;
            int i1;
            try
            {
                j = ((f)getOwnerDocument()).d().b().d();
                k = a(getAttribute("bottom"), false);
                i1 = a(getAttribute("height"), false);
            }
            catch (NumberFormatException numberformatexception1)
            {
                return 0;
            }
            return j - k - i1;
        }
        return i;
    }

    public int d()
    {
        int j = a(getAttribute("height"), false);
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        i = ((f)getOwnerDocument()).d().b().d();
        return i;
        NumberFormatException numberformatexception;
        numberformatexception;
        i = ((f)getOwnerDocument()).d().b().d();
        j = a(getAttribute("top"), false);
        i -= j;
_L2:
        int k;
        try
        {
            k = a(getAttribute("bottom"), false);
        }
        // Misplaced declaration of an exception variable
        catch (NumberFormatException numberformatexception)
        {
            return i;
        }
        return i - k;
        numberformatexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int e()
    {
        int j = a(getAttribute("width"), true);
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        i = ((f)getOwnerDocument()).d().b().e();
        return i;
        NumberFormatException numberformatexception;
        numberformatexception;
        i = ((f)getOwnerDocument()).d().b().e();
        j = a(getAttribute("left"), true);
        i -= j;
_L2:
        int k;
        try
        {
            k = a(getAttribute("right"), true);
        }
        // Misplaced declaration of an exception variable
        catch (NumberFormatException numberformatexception)
        {
            return i;
        }
        return i - k;
        numberformatexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(": id=").append(a()).append(", width=").append(e()).append(", height=").append(d()).append(", left=").append(b()).append(", top=").append(c()).toString();
    }
}
