// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.ac;
import com.google.android.libraries.translate.offline.j;
import com.google.android.libraries.translate.offline.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            d, f

public final class g extends TimerTask
{

    final d a;
    private final PackageType b;

    public g(d d1, PackageType packagetype)
    {
        a = d1;
        super();
        b = packagetype;
    }

    public final void run()
    {
        boolean flag1 = true;
        if (a.a.a(b)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int i;
        int k;
        obj = new ArrayList();
        ((List) (obj)).addAll(a.a.c());
        a.c = false;
        a.d = null;
        obj = ((List) (obj)).iterator();
        k = 0;
        i = 0;
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj1;
        com.google.android.libraries.translate.offline.OfflinePackage.Status status;
        obj1 = (OfflinePackage)((Iterator) (obj)).next();
        status = ((OfflinePackage) (obj1)).c;
        f.a[status.ordinal()];
        JVM INSTR tableswitch 1 2: default 128
    //                   1 75
    //                   2 75;
           goto _L5 _L6 _L6
_L5:
        j j1;
        boolean flag2;
        try
        {
            a.a.f(((OfflinePackage) (obj1)));
        }
        catch (OfflineTranslationException offlinetranslationexception1)
        {
            offlinetranslationexception1.getErrorCode();
        }
        k = i;
        if (!((OfflinePackage) (obj1)).f()) goto _L8; else goto _L7
_L7:
        i++;
        k = i;
        if (a.c) goto _L8; else goto _L9
_L9:
        obj1 = ((OfflinePackage) (obj1)).d.iterator();
_L12:
        k = i;
        if (!((Iterator) (obj1)).hasNext()) goto _L8; else goto _L10
_L10:
        j1 = (j)((Iterator) (obj1)).next();
        if (!j1.a.c(j1)) goto _L12; else goto _L11
_L11:
        a.d = j1.e;
        f.a[j1.e.ordinal()];
        JVM INSTR tableswitch 3 6: default 268
    //                   3 305
    //                   4 305
    //                   5 305
    //                   6 305;
           goto _L13 _L14 _L14 _L14 _L14
_L13:
        if (!a.c) goto _L12; else goto _L15
_L15:
        k = i;
_L8:
        flag2 = true;
        i = k;
        k = ((flag2) ? 1 : 0);
          goto _L6
_L14:
        a.c = true;
          goto _L13
_L4:
        boolean flag;
        if (k != 0)
        {
            try
            {
                a.a.b();
            }
            catch (OfflineTranslationException offlinetranslationexception)
            {
                offlinetranslationexception.getErrorCode();
            }
            a.b();
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (i == 0)
        {
            if (!flag)
            {
                a.b();
            }
            a.a();
            return;
        }
        if (true) goto _L1; else goto _L16
_L16:
    }
}
