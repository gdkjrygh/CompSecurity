// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// Referenced classes of package com.cleanmaster.util:
//            h, j, d

final class e
    implements h
{

    final d a;

    e(d d)
    {
        a = d;
        super();
    }

    public final void a(InputStream inputstream)
    {
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        boolean flag = j.a;
_L5:
        return;
_L2:
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
_L3:
        String s = inputstream.readLine();
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        stringbuilder.append(s);
        stringbuilder.append('\n');
          goto _L3
        inputstream;
        inputstream.printStackTrace();
        if (!j.a) goto _L5; else goto _L4
_L4:
        (new StringBuilder("onResult ")).append(stringbuilder.toString());
        return;
    }
}
