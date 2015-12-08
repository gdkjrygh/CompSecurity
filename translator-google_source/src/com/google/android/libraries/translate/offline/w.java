// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.e.l;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            PackageType, OfflineTranslationException, o, LocationProfile

final class w extends k
    implements l
{

    final o a;
    private boolean b;
    private final l c;
    private final CountDownLatch d = new CountDownLatch(PackageType.values().length);

    w(o o1, l l1)
    {
        a = o1;
        super();
        b = true;
        c = l1;
    }

    private transient Void a(LocationProfile alocationprofile[])
    {
        PackageType apackagetype[] = PackageType.values();
        int j = apackagetype.length;
        int i = 0;
        while (i < j) 
        {
            PackageType packagetype = apackagetype[i];
            try
            {
                o.a(a, alocationprofile[0], true, this, packagetype);
            }
            catch (OfflineTranslationException offlinetranslationexception)
            {
                a(Boolean.valueOf(false));
            }
            i++;
        }
        try
        {
            d.await();
        }
        // Misplaced declaration of an exception variable
        catch (LocationProfile alocationprofile[])
        {
            alocationprofile.printStackTrace();
        }
        c.a(Boolean.valueOf(b));
        return null;
    }

    private void a(Boolean boolean1)
    {
        b = b & boolean1.booleanValue();
        d.countDown();
    }

    public final volatile void a(Object obj)
    {
        a((Boolean)obj);
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((LocationProfile[])aobj);
    }
}
