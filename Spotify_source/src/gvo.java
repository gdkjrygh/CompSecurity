// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;

public final class gvo extends gvg
{

    public gvo(Context context)
    {
        super(context);
    }

    public final boolean a(gvz gvz1)
    {
        return "file".equals(gvz1.d.getScheme());
    }

    public final gwd b(gvz gvz1)
    {
        java.io.InputStream inputstream;
        com.squareup.picasso.Picasso.LoadedFrom loadedfrom;
        inputstream = c(gvz1);
        loadedfrom = com.squareup.picasso.Picasso.LoadedFrom.b;
        (new ExifInterface(gvz1.d.getPath())).getAttributeInt("Orientation", 1);
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
        return new gwd(null, inputstream, loadedfrom, i);
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
