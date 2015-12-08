// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.m4b.maps.g.a;

// Referenced classes of package com.google.android.m4b.maps.j:
//            l

abstract class b extends b
{

    private int a;
    private Bundle b;
    private l c;

    protected abstract void a(a a1);

    protected final void a(Object obj)
    {
        Object obj1 = null;
        if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.j.l.a(c, 1);
_L4:
        return;
_L2:
        switch (a)
        {
        default:
            com.google.android.m4b.maps.j.l.a(c, 1);
            obj = obj1;
            if (b != null)
            {
                obj = (PendingIntent)b.getParcelable("pendingIntent");
            }
            a(new a(a, ((PendingIntent) (obj))));
            return;

        case 0: // '\0'
            if (!a())
            {
                com.google.android.m4b.maps.j.l.a(c, 1);
                a(new a(8, null));
                return;
            }
            break;

        case 10: // '\n'
            com.google.android.m4b.maps.j.l.a(c, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract boolean a();

    protected (l l1, int i, Bundle bundle)
    {
        c = l1;
        super(l1, Boolean.valueOf(true));
        a = i;
        b = bundle;
    }
}
