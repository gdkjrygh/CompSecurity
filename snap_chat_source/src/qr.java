// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class qr
{

    private static final List a = ea.a("com.snapchat.snaps.replay", "com.snapchat.snaps.replay1", "com.snapchat.snaps.replay2");

    public static int a(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   328999526: 106
    //                   328999527: 120
    //                   703349547: 92;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_120;
_L5:
        switch (byte0)
        {
        default:
            throw new RuntimeException((new StringBuilder("REPLAY-LOG: could not find credits for replay product: ")).append(s).toString());

        case 0: // '\0'
            return 3;

        case 1: // '\001'
            return 10;

        case 2: // '\002'
            return 20;
        }
_L4:
        if (s.equals("com.snapchat.snaps.replay"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("com.snapchat.snaps.replay1"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("com.snapchat.snaps.replay2"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public static List a()
    {
        return a;
    }

    public static aoh b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(a);
        Bt.a();
        Object obj = Bt.cd();
        if (obj != null)
        {
            arraylist.addAll(((java.util.Collection) (obj)));
        }
        obj = new aoh();
        anR.a(((aoh) (obj)).a.get("inapp"), "Products can't be changed");
        ((aoh) (obj)).a.put("inapp", Collections.unmodifiableList(new ArrayList(arraylist)));
        return ((aoh) (obj));
    }

}
