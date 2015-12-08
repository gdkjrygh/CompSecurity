// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.List;

public class gfw
{

    private final gfq a;

    public gfw(Context context)
    {
        a = (gfq)olm.a(context, gfq);
    }

    public static String a(Uri uri, int i)
    {
        if (uri != null && Uri.EMPTY != uri)
        {
            if ((uri = uri.getPathSegments()).size() == 2)
            {
                return (String)uri.get(i);
            }
        }
        return null;
    }

    public static boolean a(Uri uri)
    {
        return !b.c(uri) && "aam".equals(uri.getScheme());
    }

    public final Uri a(ekp ekp1)
    {
        p.b(ekp1, "media must not be null");
        ekp1 = (hpg)ekp1.b(hpg);
        if (ekp1 != null)
        {
            ekp1 = ekp1.b();
            if (ekp1 != null && ekp1.a())
            {
                ekp1 = a.a(((hpk) (ekp1)).c);
                if (a(((Uri) (ekp1))))
                {
                    return ekp1;
                }
            }
        }
        return Uri.EMPTY;
    }
}
