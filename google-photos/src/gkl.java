// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class gkl extends ContentObserver
{

    private final gkm a;
    private final ehr b;

    public gkl(gkm gkm1, ehr ehr)
    {
        super(new Handler());
        a = gkm1;
        b = ehr;
    }

    public final boolean deliverSelfNotifications()
    {
        return true;
    }

    public final void onChange(boolean flag)
    {
        onChange(flag, null);
    }

    public final void onChange(boolean flag, Uri uri)
    {
        a.a(b);
    }
}
