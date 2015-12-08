// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import java.util.HashMap;

// Referenced classes of package p.cx:
//            r

public class s
{

    public static volatile s a = new s();
    private HashMap b;

    private s()
    {
        b = new HashMap();
    }

    public Object a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = ((String) (((r)b.get(s1)).e()));
        this;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        throw s1;
    }

    public void a(HashMap hashmap)
    {
        this;
        JVM INSTR monitorenter ;
        b = hashmap;
        this;
        JVM INSTR monitorexit ;
        return;
        hashmap;
        throw hashmap;
    }

    public boolean a(String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap = b;
        if (hashmap != null) goto _L2; else goto _L1
_L1:
        s1 = null;
_L7:
        if (s1 != null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        s1 = (r)b.get(s1);
        continue; /* Loop/switch isn't completed */
_L4:
        flag = s1.b();
        if (true) goto _L3; else goto _L5
_L5:
        s1;
        throw s1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

}
