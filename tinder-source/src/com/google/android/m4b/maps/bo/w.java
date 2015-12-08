// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.util.ArrayList;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ae, am, v, u, 
//            t, x

public final class w
{

    final t a;
    final String b;
    final int c;

    public w(t t1, String s, int i)
    {
        a = t1;
        b = s;
        c = i;
    }

    public static w a(DataInput datainput, ae ae1)
    {
        t t1;
        Object obj;
        t1 = null;
        obj = null;
        if (ae1.a != 11) goto _L2; else goto _L1
_L1:
        int i;
        i = am.a(datainput);
        datainput = ae1.e;
        if (i >= ((v) (datainput)).a.size())
        {
            datainput = obj;
        } else
        {
            datainput = (u)((v) (datainput)).a.get(i);
        }
        if (datainput != null)
        {
            t1 = ((u) (datainput)).b;
            datainput = ((u) (datainput)).a;
        } else
        {
            t1 = t.a();
            datainput = "";
        }
_L4:
        return new w(t1, datainput, i);
_L2:
        i = am.a(datainput);
        t t2 = ae1.c.a(i);
        int j = am.a(datainput);
        datainput = ae1.d;
        boolean flag;
        if (datainput != null && j >= 0 && j < datainput.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        datainput = t1;
        t1 = t2;
        i = j;
        if (flag)
        {
            datainput = ae1.d[j];
            t1 = t2;
            i = j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
