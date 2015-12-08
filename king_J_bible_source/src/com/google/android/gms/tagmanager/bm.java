// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            av, aw, bl

class bm
{

    bm()
    {
    }

    int jZ()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public bl kH()
    {
        if (jZ() < 8)
        {
            return new av();
        } else
        {
            return new aw();
        }
    }
}
