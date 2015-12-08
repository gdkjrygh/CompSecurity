// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nnn
{

    public static final String a = ngo.getName();
    public static final String b = nnj.getName();
    private static nnm c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new nnm();
        }
        olm1.a(ngo, new ngo[] {
            new nnk(context), new nnp(context)
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new nnm();
        }
        olm1.a(nnj, new nno(context));
    }

}
