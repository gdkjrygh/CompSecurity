// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import com.google.android.m4b.maps.y.g;
import java.util.Calendar;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            a

final class a
    implements com.google.android.m4b.maps.a.
{

    private a a;

    public final void a(Object obj)
    {
        String s = (String)obj;
        obj = a;
        Object obj1 = com.google.android.m4b.maps.bt.a.c(a);
        String as[] = s.replace("[", "").replace("]", "").replace("\"", "").split(",");
        int i = ((Calendar) (obj1)).get(1);
        obj1 = String.valueOf(g.a(", ").a(as));
        com.google.android.m4b.maps.bt.a.a(((a) (obj)), (new StringBuilder(String.valueOf(obj1).length() + 13)).append("\251").append(i).append(" ").append(((String) (obj1))).toString().trim());
        com.google.android.m4b.maps.bt.a.b(a);
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
