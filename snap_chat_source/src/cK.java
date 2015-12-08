// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

public class cK
{

    private static volatile Integer a;

    public cK()
    {
    }

    public static int a(Context context)
    {
        byte byte0;
        char c;
        c = '\u07D8';
        byte0 = -1;
        if (a != null) goto _L2; else goto _L1
_L1:
        cK;
        JVM INSTR monitorenter ;
        if (a != null) goto _L4; else goto _L3
_L3:
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        i = cJ.a();
        long l;
        if (i <= 0)
        {
            i = -1;
        } else
        if (i == 1)
        {
            i = 2008;
        } else
        if (i <= 3)
        {
            i = 2011;
        } else
        {
            i = 2012;
        }
_L9:
        a(arraylist, i);
        l = cJ.b();
        if (l == -1L)
        {
            i = -1;
        } else
        if (l <= 0x80e80L)
        {
            i = 2008;
        } else
        if (l <= 0x975e0L)
        {
            i = 2009;
        } else
        if (l <= 0xf9060L)
        {
            i = 2010;
        } else
        if (l <= 0x129da0L)
        {
            i = 2011;
        } else
        if (l <= 0x173180L)
        {
            i = 2012;
        } else
        if (l <= 0x1ed2a0L)
        {
            i = 2013;
        } else
        {
            i = 2014;
        }
        a(arraylist, i);
        l = cJ.a(context);
        if (l <= 0L)
        {
            i = -1;
        } else
        {
            i = c;
            if (l > 0xc000000L)
            {
                if (l <= 0x12200000L)
                {
                    i = 2009;
                } else
                if (l <= 0x20000000L)
                {
                    i = 2010;
                } else
                if (l <= 0x40000000L)
                {
                    i = 2011;
                } else
                if (l <= 0x60000000L)
                {
                    i = 2012;
                } else
                if (l <= 0x80000000L)
                {
                    i = 2013;
                } else
                {
                    i = 2014;
                }
            }
        }
        a(arraylist, i);
        if (!arraylist.isEmpty()) goto _L6; else goto _L5
_L5:
        i = byte0;
_L7:
        a = Integer.valueOf(i);
_L4:
        cK;
        JVM INSTR monitorexit ;
_L2:
        return a.intValue();
_L6:
label0:
        {
            Collections.sort(arraylist);
            if ((arraylist.size() & 1) != 1)
            {
                break label0;
            }
            i = ((Integer)arraylist.get(arraylist.size() / 2)).intValue();
        }
          goto _L7
        i = arraylist.size() / 2 - 1;
        int j = ((Integer)arraylist.get(i)).intValue();
        i = (((Integer)arraylist.get(i + 1)).intValue() - ((Integer)arraylist.get(i)).intValue()) / 2 + j;
          goto _L7
        context;
        cK;
        JVM INSTR monitorexit ;
        throw context;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static void a(ArrayList arraylist, int i)
    {
        if (i != -1)
        {
            arraylist.add(Integer.valueOf(i));
        }
    }
}
