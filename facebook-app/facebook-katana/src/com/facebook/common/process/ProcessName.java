// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.process;


// Referenced classes of package com.facebook.common.process:
//            PrivateProcessName

public class ProcessName
{

    public static final ProcessName a = new ProcessName(null, null);
    private final String b;
    private final PrivateProcessName c;

    private ProcessName(String s, PrivateProcessName privateprocessname)
    {
        b = s;
        c = privateprocessname;
    }

    public static ProcessName a(String s)
    {
        if (s == null)
        {
            return a;
        }
        String as[] = s.split(":");
        String s1;
        if (as.length > 1)
        {
            s1 = as[1];
        } else
        {
            s1 = "";
        }
        return new ProcessName(s, PrivateProcessName.a(s1));
    }

    public final boolean a()
    {
        return b == null;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        if (c != null)
        {
            return c.a();
        } else
        {
            return null;
        }
    }

    public final PrivateProcessName d()
    {
        return c;
    }

    public final boolean e()
    {
        return PrivateProcessName.a.equals(c);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ProcessName)obj;
            if (b == null)
            {
                if (((ProcessName) (obj)).b != null)
                {
                    return false;
                }
            } else
            {
                return b.equals(((ProcessName) (obj)).b);
            }
        }
        return true;
    }

    public final String f()
    {
        if (a())
        {
            return "<unknown>";
        }
        if (e())
        {
            return "<default>";
        }
        if (c != null)
        {
            return c.a();
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        if (b != null)
        {
            return b.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        if (b == null)
        {
            return "<unknown>";
        } else
        {
            return b;
        }
    }

}
