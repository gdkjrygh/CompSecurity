// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import com.google.android.libraries.translate.e.l;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            h, OfflineTranslationException, LocationProfile, o, 
//            s, PackageType

public final class r extends h
{

    final o b;

    public r(o o1)
    {
        b = o1;
        super(false);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (LocationProfile)obj;
        if (obj == null)
        {
            b.a(null, false);
        } else
        {
            o.a(b, ((LocationProfile) (obj)));
            obj = new s(this);
            PackageType apackagetype[] = PackageType.values();
            int j = apackagetype.length;
            int i = 0;
            while (i < j) 
            {
                PackageType packagetype = apackagetype[i];
                try
                {
                    o.a(b, o.a(b), false, ((l) (obj)), packagetype);
                }
                catch (OfflineTranslationException offlinetranslationexception)
                {
                    ((l) (obj)).a(Boolean.valueOf(false));
                }
                i++;
            }
        }
    }
}
