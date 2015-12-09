// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.graphics.Bitmap;
import com.squareup.a.bi;

// Referenced classes of package com.jcp.util:
//            ac

public class f
    implements bi
{

    public f()
    {
    }

    public Bitmap a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            Bitmap bitmap1 = ac.a(bitmap.copy(bitmap.getConfig(), true));
            bitmap.recycle();
            return bitmap1;
        }
    }

    public String a()
    {
        return "CircleTransformation()";
    }
}
