// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            fy, fu, fr

class <init> extends <init>
{

    final String yw;
    final fr yx[];
    final fy yy;

    protected void a(fu fu1)
        throws RemoteException
    {
        fu1.a(new <init>(this), yw, yx);
    }

    (fy fy1, String s, fr afr[])
    {
        yy = fy1;
        yw = s;
        yx = afr;
        super(null);
    }
}
