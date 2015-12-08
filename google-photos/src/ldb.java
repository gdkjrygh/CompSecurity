// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.gms.common.api.Status;

class ldb
    implements lmg
{

    private final Status a;
    private final Intent b;

    public ldb(Status status, Intent intent)
    {
        a = (Status)b.d(status);
        b = intent;
    }

    public Status a_()
    {
        return a;
    }

    public Intent c()
    {
        return b;
    }
}
