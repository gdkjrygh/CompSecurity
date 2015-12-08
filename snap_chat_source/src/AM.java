// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.res.Resources;
import com.snapchat.android.SnapchatApplication;

public final class AM extends AQ
{

    private static AM sInstance;

    private AM()
    {
        super("my_story_ads79sdf", SnapchatApplication.get().getResources().getString(0x7f08018e));
    }

    public static AM c()
    {
        AM;
        JVM INSTR monitorenter ;
        AM am;
        if (sInstance == null)
        {
            sInstance = new AM();
        }
        am = sInstance;
        AM;
        JVM INSTR monitorexit ;
        return am;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        return false;
    }
}
