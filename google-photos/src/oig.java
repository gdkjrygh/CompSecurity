// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class oig
{

    oie a;

    oig()
    {
    }

    public final oie a()
    {
        oie oie1 = a;
        if (oie1 != null)
        {
            a = oie1.j;
        }
        return oie1;
    }

    public final boolean a(oie oie1)
    {
        oie oie2;
        boolean flag1;
        flag1 = true;
        oie2 = a;
_L8:
        if (oie2 == null) goto _L2; else goto _L1
_L1:
        if (oie2 != oie1) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (flag)
        {
            Log.w("TiledImageRenderer", "Attempting to add a tile already in the queue!");
            return false;
        }
        break; /* Loop/switch isn't completed */
_L4:
        oie2 = oie2.j;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        if (a != null)
        {
            flag1 = false;
        }
        oie1.j = a;
        a = oie1;
        return flag1;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
