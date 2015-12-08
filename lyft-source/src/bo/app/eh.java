// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package bo.app:
//            ek, bo, be, cs, 
//            co

public class eh
    implements ek
{

    private static final String a;
    private final ek b;
    private final be c;

    public eh(ek ek1, be be1)
    {
        b = ek1;
        c = be1;
    }

    private static void a(be be1, Throwable throwable)
    {
        try
        {
            be1.a(new bo("A database exception has occurred. Please view the stack trace for more details.", throwable), bo/app/bo);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (be be1)
        {
            AppboyLogger.e(a, "Failed to log throwable.", be1);
        }
    }

    public final cs a()
    {
        cs cs;
        try
        {
            cs = b.a();
        }
        catch (Exception exception)
        {
            AppboyLogger.e(a, "Failed to get the active session from the storage.", exception);
            a(c, ((Throwable) (exception)));
            return null;
        }
        return cs;
    }

    public final void a(cs cs)
    {
        try
        {
            b.a(cs);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cs cs)
        {
            AppboyLogger.e(a, "Failed to upsert active session in the storage.", cs);
        }
        a(c, ((Throwable) (cs)));
    }

    public final void a(cs cs, co co)
    {
        try
        {
            b.a(cs, co);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cs cs)
        {
            AppboyLogger.e(a, "Failed to add single event to session due to unexpected exception.", cs);
        }
        a(c, ((Throwable) (cs)));
    }

    public final cs b()
    {
        cs cs;
        try
        {
            cs = b.b();
        }
        catch (Exception exception)
        {
            AppboyLogger.e(a, "Failed to get the closed session from the storage.", exception);
            a(c, exception);
            return null;
        }
        return cs;
    }

    public final void b(cs cs)
    {
        try
        {
            b.b(cs);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cs cs)
        {
            AppboyLogger.e(a, "Failed to delete the sealed session from the storage.", cs);
        }
        a(c, cs);
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/eh.getName()
        });
    }
}
