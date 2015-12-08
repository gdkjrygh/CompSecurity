// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ej;

final class ak
{

    public static ej a(ej ej1)
    {
        ej ej2 = new ej();
        ej2.a = ej1.a;
        ej2.k = (int[])ej1.k.clone();
        if (ej1.l)
        {
            ej2.l = ej1.l;
        }
        return ej2;
    }
}
