// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.util.ArrayList;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            am, t

public final class x
{

    private final ArrayList a = new ArrayList();

    public x()
    {
    }

    public static x a(DataInput datainput, int i)
    {
        x x1 = new x();
        int k = am.a(datainput);
        for (int j = 0; j < k; j++)
        {
            x1.a.add(t.a(j, datainput, i));
        }

        return x1;
    }

    public final t a(int i)
    {
        if (i >= a.size() || i < 0)
        {
            return t.a();
        } else
        {
            return (t)a.get(i);
        }
    }
}
