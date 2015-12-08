// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.art;

import java.security.InvalidParameterException;
import p.ah.a;
import p.ah.d;

// Referenced classes of package com.pandora.radio.art:
//            a

public class b
{

    public static d a(int i)
    {
        switch (i)
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("Unknown art format: ").append(i).append(", canceled art request.").toString());

        case 1: // '\001'
            return new a(android.graphics.Bitmap.CompressFormat.JPEG, 75);

        case 2: // '\002'
            return new a(android.graphics.Bitmap.CompressFormat.PNG, 100);

        case 3: // '\003'
            return new com.pandora.radio.art.a();

        case 0: // '\0'
            throw new InvalidParameterException("Asking for a transcoder with an album art type of PNDR_IMAGE_NONE.");
        }
    }
}
