// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

final class nsh extends nzc
{

    private final long a;
    private Context b;

    nsh(Context context, int i, long l)
    {
        super(context, new nyg(context, i), "notificationsupdatelastviewedversion", new pcf(), new pcg());
        a = l;
        b = context;
    }

    protected final void a(qlw qlw)
    {
        pih pih1;
        ntl ntl1;
        Object obj;
        pic pic1;
        qlw = (pcf)qlw;
        pih1 = new pih();
        ntl1 = ntl.a(b);
        obj = new pif();
        pic1 = new pic();
        if (ntl.a < 0)
        {
            ntl.a = ntl1.b.getResources().getDisplayMetrics().densityDpi;
        }
        ntl.a;
        JVM INSTR lookupswitch 6: default 124
    //                   120: 232
    //                   160: 232
    //                   240: 238
    //                   320: 244
    //                   480: 250
    //                   640: 250;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L5
_L1:
        int i = 0;
_L7:
        pic1.a = i;
        pic1.b = ntl1.b.getResources().getConfiguration().locale.toString();
        obj.b = pic1;
        obj.a = ((nqz)olm.a(ntl1.b, nqz)).b();
        pih1.a = ((pif) (obj));
        obj = new pig();
        obj.b = Long.valueOf(a);
        obj.a = ntl1.a();
        pih1.b = ((pig) (obj));
        qlw.a = pih1;
        return;
_L2:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 4;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 5;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 9;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
