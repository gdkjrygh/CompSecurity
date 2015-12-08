// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;

// Referenced classes of package bo.app:
//            bo, at, bx, by, 
//            cz

public final class ba
    implements IEventSubscriber
{

    final at a;

    public ba(at at1)
    {
        a = at1;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (bo)obj;
        bx bx1 = at.j(a);
        if (bx1.b(((Throwable) (obj))))
        {
            AppboyLogger.w(bx.a, "Not logging duplicate database exception.");
            return;
        }
        try
        {
            bx1.a(cz.a(((bo) (obj)), bx1.b.c()));
            return;
        }
        catch (JSONException jsonexception)
        {
            try
            {
                AppboyLogger.e(bx.a, String.format("Failed to create database exception event from %s.", new Object[] {
                    obj
                }), jsonexception);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                AppboyLogger.e(at.a(), "Failed to log the database exception.", ((Throwable) (obj)));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        AppboyLogger.e(bx.a, "Failed to log error.", ((Throwable) (obj)));
        return;
    }
}
