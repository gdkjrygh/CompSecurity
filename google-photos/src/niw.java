// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class niw
{

    public static final String a = ngo.getName();
    public static final String b = nid.getName();
    public static final String c = nic.getName();
    private static niv d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new niv();
        }
        olm1.a(ngo, new ngo[] {
            new nir(context)
        });
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new niv();
        }
        olm1.a(nid, new njd());
    }

    public static void b(olm olm1)
    {
        if (d == null)
        {
            d = new niv();
        }
        olm1.a(nic, new nii());
    }

}
