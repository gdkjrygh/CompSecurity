// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public class glg
    implements dmx
{

    public final Map a = new HashMap();

    public glg()
    {
        ggb.a();
    }

    public final boolean a(String s)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        if (!a.containsKey(s)) goto _L2; else goto _L1
_L1:
        glh glh1 = (glh)a.get(s);
        boolean flag;
        boolean flag1;
        if (glh1.a != null && glh1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        s = (glh)a.get(s);
        break MISSING_BLOCK_LABEL_70;
_L5:
        map;
        JVM INSTR monitorexit ;
        return flag1;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        if (gcf.a() > ((glh) (s)).c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final bat b(String s)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        if (!a(s))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        s = ((glh)a.get(s)).b;
        return s;
        map;
        JVM INSTR monitorexit ;
        return null;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }
}
