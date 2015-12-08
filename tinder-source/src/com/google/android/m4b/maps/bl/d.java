// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;


// Referenced classes of package com.google.android.m4b.maps.bl:
//            p, i

public final class d extends p
{

    private final i a;

    public d(int j, i k)
    {
        super(j);
        a = k;
    }

    public final float a()
    {
        i j = a;
        if (!i.a(j.f))
        {
            return 0.0F;
        }
        if (!j.A)
        {
            j.s = -(j.q - j.p) * 0.25F;
            j.A = true;
        }
        return j.s;
    }
}
