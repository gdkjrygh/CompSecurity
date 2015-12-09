// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import aoq;
import java.net.URLEncoder;
import java.util.ArrayList;

// Referenced classes of package com.facebook:
//            Request

final class 
    implements aoq
{

    private ArrayList a;

    public final void a(String s, String s1)
    {
        a.add(String.format("%s=%s", new Object[] {
            s, URLEncoder.encode(s1, "UTF-8")
        }));
    }

    (ArrayList arraylist)
    {
        a = arraylist;
        super();
    }
}
