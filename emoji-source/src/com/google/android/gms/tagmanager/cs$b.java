// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cs, by

private static class agY
{

    private com.google.android.gms.internal.b.agY agY;
    private by ahD;

    public int getSize()
    {
        int j = ((com.google.android.gms.internal.b)ahD.getObject()).Z();
        int i;
        if (agY == null)
        {
            i = 0;
        } else
        {
            i = agY.Z();
        }
        return i + j;
    }

    public by mJ()
    {
        return ahD;
    }

    public com.google.android.gms.internal.b mp()
    {
        return agY;
    }

    public (by by1, com.google.android.gms.internal.b b1)
    {
        ahD = by1;
        agY = b1;
    }
}
