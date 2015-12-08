// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.a:
//            k, o, g, l, 
//            d, f

public final class ad extends k
{

    public ad()
    {
        super(b(-1, -1));
    }

    public ad(int i, int j)
    {
        super(b(i, j));
    }

    private static List b(int i, int j)
    {
        float f1;
        ArrayList arraylist;
        f1 = 1.0F;
        arraylist = new ArrayList(4);
        arraylist.add(new o());
        arraylist.add(new g());
        arraylist.add(new l(2.0F));
        if (i != -1 && j != -1) goto _L2; else goto _L1
_L1:
        f1 = 2.0F;
_L4:
        arraylist.add(new d(f1));
        arraylist.add(new f((byte)0));
        return arraylist;
_L2:
        float f2 = (2.0F * (float)Math.min(i, j)) / 640F;
        if (f2 >= 1.0F)
        {
            f1 = f2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
