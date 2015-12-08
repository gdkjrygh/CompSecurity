// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class dxz
{

    public dya a;

    public dxz(Context context)
    {
        a = (dya)olm.a(context, dya);
    }

    public final void a(Context context, dui dui1)
    {
        dxy dxy1 = (dxy)a.a(dui1.c());
        if (dxy1 == null)
        {
            return;
        } else
        {
            dxy1.a(context, dui1);
            return;
        }
    }

    public final boolean a(dui dui1)
    {
        return (dxy)a.a(dui1.c()) != null;
    }
}
