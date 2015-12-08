// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public class brr extends bmb
{

    private static final String e = brr.getSimpleName();
    public final bto a = new bto(this, brt);
    public final bto b = new bto(this, brs);
    private final Set f = new HashSet();

    brr(bmb bmb1)
    {
        super(bmb1);
    }

    public void a(String s, boolean flag)
    {
label0:
        {
            boolean flag2 = false;
            if (f.contains(s) == flag)
            {
                return;
            }
            boolean flag1;
            if (flag)
            {
                f.add(s);
            } else
            {
                f.remove(s);
            }
            if (!f.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s = String.valueOf(f);
            (new StringBuilder(String.valueOf(s).length() + 20)).append("conditions:").append(s).append(" => ").append(flag);
            s = (brt)a.b;
            if (!f.contains("saving"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            s.a(flag, flag1);
            if (!f.isEmpty())
            {
                flag = flag2;
                if (f.size() != 1)
                {
                    break label0;
                }
                flag = flag2;
                if (!f.contains("buffering"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        ((brs)b.b).d_(flag);
    }

}
