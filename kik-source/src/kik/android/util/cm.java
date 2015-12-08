// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import org.json.JSONArray;

// Referenced classes of package kik.android.util:
//            ck

final class cm
    implements com.android.volley.r.b
{

    final ck.b a;
    final ck b;

    cm(ck ck1, ck.b b1)
    {
        b = ck1;
        a = b1;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (JSONArray)obj;
        ck.a(b, ((JSONArray) (obj)), a);
    }
}
