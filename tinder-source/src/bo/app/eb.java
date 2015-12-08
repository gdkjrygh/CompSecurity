// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package bo.app:
//            ee, bi, az, cm, 
//            ci

public class eb
    implements ee
{

    private static final String a;
    private final ee b;
    private final az c;

    public eb(ee ee1, az az1)
    {
        b = ee1;
        c = az1;
    }

    private static void a(az az1, Throwable throwable)
    {
        try
        {
            az1.a(new bi("A database exception has occurred. Please view the stack trace for more details.", throwable), bo/app/bi);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            AppboyLogger.e(a, "Failed to log throwable.", az1);
        }
    }

    public final cm a()
    {
        cm cm;
        try
        {
            cm = b.a();
        }
        catch (Exception exception)
        {
            AppboyLogger.e(a, "Failed to get the active session from the storage.", exception);
            a(c, ((Throwable) (exception)));
            return null;
        }
        return cm;
    }

    public final void a(cm cm)
    {
        try
        {
            b.a(cm);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cm cm)
        {
            AppboyLogger.e(a, "Failed to upsert active session in the storage.", cm);
        }
        a(c, ((Throwable) (cm)));
    }

    public final void a(cm cm, ci ci)
    {
        try
        {
            b.a(cm, ci);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cm cm)
        {
            AppboyLogger.e(a, "Failed to add single event to session due to unexpected exception.", cm);
        }
        a(c, ((Throwable) (cm)));
    }

    public final cm b()
    {
        cm cm;
        try
        {
            cm = b.b();
        }
        catch (Exception exception)
        {
            AppboyLogger.e(a, "Failed to get the closed session from the storage.", exception);
            a(c, exception);
            return null;
        }
        return cm;
    }

    public final void b(cm cm)
    {
        try
        {
            b.b(cm);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cm cm)
        {
            AppboyLogger.e(a, "Failed to delete the sealed session from the storage.", cm);
        }
        a(c, cm);
    }

    public final Collection c()
    {
        Collection collection;
        try
        {
            collection = b.c();
        }
        catch (Exception exception)
        {
            AppboyLogger.e(a, "Failed to fetch all sealed sessions from the storage.", exception);
            a(c, exception);
            return Collections.EMPTY_LIST;
        }
        return collection;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/eb.getName()
        });
    }
}
