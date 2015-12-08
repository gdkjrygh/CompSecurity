// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class fnt
{

    public fnt()
    {
    }

    public static boolean a()
    {
        return false;
    }

    private static fnt b()
    {
        fnt fnt1;
        try
        {
            fnt1 = (fnt)Class.forName("com.spotify.mobile.android.ta.BeanRemoteImpl").newInstance();
        }
        catch (Exception exception)
        {
            Logger.b("Could not create instance of BeanRemoteImpl class: %s", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return fnt1;
    }

    static 
    {
        fnt.getSimpleName();
        b();
        new AtomicLong();
    }
}
