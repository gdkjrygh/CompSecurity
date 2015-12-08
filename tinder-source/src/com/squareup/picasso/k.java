// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            g, r

final class k extends g
{

    k(Context context)
    {
        super(context);
    }

    public final boolean a(r r1)
    {
        return "file".equals(r1.d.getScheme());
    }

    public final t.a b(r r1)
        throws IOException
    {
        java.io.InputStream inputstream;
        Picasso.LoadedFrom loadedfrom;
        inputstream = c(r1);
        loadedfrom = Picasso.LoadedFrom.b;
        (new ExifInterface(r1.d.getPath())).getAttributeInt("Orientation", 1);
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
        return new t.a(null, inputstream, loadedfrom, i);
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
