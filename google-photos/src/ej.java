// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.os.Handler;

public final class ej extends ContentObserver
{

    private ei a;

    public ej(ei ei1)
    {
        a = ei1;
        super(new Handler());
    }

    public final boolean deliverSelfNotifications()
    {
        return true;
    }

    public final void onChange(boolean flag)
    {
        a.p();
    }
}
