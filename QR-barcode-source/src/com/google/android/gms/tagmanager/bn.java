// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            av, aw, bm

class bn
{

    bn()
    {
    }

    int nP()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public bm ox()
    {
        if (nP() < 8)
        {
            return new av();
        } else
        {
            return new aw();
        }
    }
}
