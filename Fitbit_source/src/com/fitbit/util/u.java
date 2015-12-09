// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;


// Referenced classes of package com.fitbit.util:
//            ah

public class u
    implements ah
{

    public u()
    {
    }

    public String a(String s)
    {
        int i;
label0:
        {
            String s1 = null;
            if (s != null)
            {
                i = s.length();
                if (!s.endsWith("y"))
                {
                    break label0;
                }
                s1 = (new StringBuilder()).append(s.substring(0, i - 1)).append("ies").toString();
            }
            return s1;
        }
        if (s.endsWith("f"))
        {
            return (new StringBuilder()).append(s.substring(0, i - 1)).append("ves").toString();
        }
        if (s.endsWith("sh") || s.endsWith("ch") || s.endsWith("s") || s.endsWith("x") || s.endsWith("z"))
        {
            return (new StringBuilder()).append(s).append("es").toString();
        } else
        {
            return (new StringBuilder()).append(s).append("s").toString();
        }
    }
}
