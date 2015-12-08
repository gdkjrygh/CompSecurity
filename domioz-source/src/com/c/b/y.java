// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;

// Referenced classes of package com.c.b:
//            o, aw, ap, ba

final class y extends o
{

    y(Context context)
    {
        super(context);
    }

    public final boolean a(aw aw1)
    {
        return "file".equals(aw1.d.getScheme());
    }

    public final ba b(aw aw1)
    {
        java.io.InputStream inputstream;
        ap ap1;
        inputstream = c(aw1);
        ap1 = ap.b;
        (new ExifInterface(aw1.d.getPath())).getAttributeInt("Orientation", 1);
        JVM INSTR tableswitch 3 8: default 68
    //                   3 91
    //                   4 68
    //                   5 68
    //                   6 84
    //                   7 68
    //                   8 99;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L4
_L1:
        int i = 0;
_L6:
        return new ba(null, inputstream, ap1, i);
_L3:
        i = 90;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 180;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 270;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
