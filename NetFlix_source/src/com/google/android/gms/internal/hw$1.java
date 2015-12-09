// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hw, hx

class <init> extends <init>
{

    final hw TA;
    final Uri Tz;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((hx));
    }

    protected void a(hx hx1)
    {
        hx1.a(this, Tz, false);
    }

    .a(hw hw1, Uri uri)
    {
        TA = hw1;
        Tz = uri;
        super();
    }
}
