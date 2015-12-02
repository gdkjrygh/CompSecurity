// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;

final class cfv extends cfm
{

    cfv(Context context)
    {
        super(context);
    }

    private static int a(Uri uri)
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

    public final boolean a(cgr cgr1)
    {
        return "file".equals(cgr1.d.getScheme());
    }

    public final cgv b(cgr cgr1)
    {
        return new cgv(null, c(cgr1), cgl.b, a(cgr1.d));
    }
}
