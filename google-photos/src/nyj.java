// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class nyj
{

    public static final String a = nxv.getName();
    public static final String b = nxw.getName();
    public static final String c = onc.getName();
    private static nyi d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new nyi();
        }
        olm1.a(nxv, new nxt(context));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new nyi();
        }
        olm1.a(onc, new onc[0]);
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new nyi();
        }
        ArrayList arraylist = new ArrayList(2);
        context = (npw)olm.b(context, npw);
        if (context != null)
        {
            arraylist.add(new nyd(context));
        }
        olm1.a(nxw, (nxw[])arraylist.toArray(new nxw[arraylist.size()]));
    }

}
