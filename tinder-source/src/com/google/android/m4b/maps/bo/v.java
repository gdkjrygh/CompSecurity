// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.util.ArrayList;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            am, u, x

public final class v
{

    final ArrayList a = new ArrayList();

    public v()
    {
    }

    public static v a(DataInput datainput, x x1)
    {
        v v1 = new v();
        int j = am.a(datainput);
        for (int i = 0; i < j; i++)
        {
            v1.a.add(new u(datainput.readUTF().intern(), x1.a(am.a(datainput))));
        }

        return v1;
    }
}
