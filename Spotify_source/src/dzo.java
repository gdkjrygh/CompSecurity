// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.concurrent.TimeUnit;

public abstract class dzo
{

    public static final long a;
    private static final dzo b = new dzp((byte)0);

    public dzo()
    {
    }

    public static dzo b()
    {
        return b;
    }

    public abstract String a();

    public abstract boolean a(Flags flags);

    static 
    {
        a = TimeUnit.HOURS.toMillis(24L);
    }
}
