// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;

// Referenced classes of package com.squareup.a:
//            p, bc, aq, ax

class z extends p
{

    z(Context context)
    {
        super(context);
    }

    static int a(Uri uri)
    {
        switch ((new ExifInterface(uri.getPath())).getAttributeInt("Orientation", 1))
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 6: // '\006'
            return 90;

        case 3: // '\003'
            return 180;

        case 8: // '\b'
            return 270;
        }
    }

    public bc a(ax ax1, int i)
    {
        return new bc(null, b(ax1), aq.b, a(ax1.d));
    }

    public boolean a(ax ax1)
    {
        return "file".equals(ax1.d.getScheme());
    }
}
