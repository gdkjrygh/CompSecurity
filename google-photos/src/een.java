// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class een extends ContentObserver
{

    private eem a;

    public een(eem eem1, Handler handler)
    {
        a = eem1;
        super(handler);
    }

    public final void onChange(boolean flag)
    {
        onChange(flag, null);
    }

    public final void onChange(boolean flag, Uri uri)
    {
        a.b();
    }
}
