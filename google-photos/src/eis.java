// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public class eis
{

    private static final String a[] = {
        "_display_name", "_size", "mime_type", "orientation", "datetaken", "latitude", "longitude"
    };

    eis()
    {
    }

    public static Cursor a(String as[], eja eja1)
    {
        String as1[] = as;
        if (as == null)
        {
            as1 = a;
        }
        as = new eix(as1);
        eiy eiy1 = as.a();
        eiy1.a("_display_name", eja1.a).a("_size", Long.valueOf(eja1.b)).a("mime_type", eja1.c).a("_data", eja1.d).a("orientation", Integer.valueOf(eja1.e)).a("datetaken", Long.valueOf(eja1.f)).a("latitude", eja1.g).a("longitude", eja1.h);
        as.a(eiy1);
        return ((eix) (as)).a;
    }

}
