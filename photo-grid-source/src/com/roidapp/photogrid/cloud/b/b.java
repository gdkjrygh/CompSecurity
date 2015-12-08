// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.b;

import android.text.TextUtils;
import com.roidapp.photogrid.MainPage;

// Referenced classes of package com.roidapp.photogrid.cloud.b:
//            f, a, d

final class b
    implements f
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void a(d d1)
    {
        if (d1 == null || com.roidapp.photogrid.cloud.b.a.a(a) || com.roidapp.photogrid.cloud.b.a.b(a) == null)
        {
            return;
        }
        if (d1.i == -1 && !TextUtils.isEmpty(d1.h))
        {
            String s = (new StringBuilder("market://details?id=")).append(d1.h).toString();
            String s1 = (new StringBuilder("https://play.google.com/store/apps/details?id=")).append(d1.h).toString();
            com.roidapp.cloudlib.ads.b.a(com.roidapp.photogrid.cloud.b.a.b(a), d1.h, s, s1, false);
            return;
        }
        switch (d1.i)
        {
        default:
            return;

        case 0: // '\0'
            com.roidapp.photogrid.cloud.b.a.b(a).r();
            return;

        case 1: // '\001'
            com.roidapp.photogrid.cloud.b.a.b(a).v();
            return;

        case 2: // '\002'
        case 3: // '\003'
            com.roidapp.photogrid.cloud.b.a.b(a).u();
            return;

        case 4: // '\004'
            com.roidapp.photogrid.cloud.b.a.b(a).w();
            return;

        case 5: // '\005'
            com.roidapp.photogrid.cloud.b.a.b(a).q();
            return;

        case 6: // '\006'
            com.roidapp.photogrid.cloud.b.a.b(a).s();
            break;
        }
    }
}
