// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;

// Referenced classes of package bo.app:
//            bi, ao, br, bs, 
//            ct

public final class av
    implements IEventSubscriber
{

    final ao a;

    public av(ao ao1)
    {
        a = ao1;
        super();
    }

    public final void trigger(Object obj)
    {
        obj = (bi)obj;
        br br1 = ao.j(a);
        if (br1.b(((Throwable) (obj))))
        {
            AppboyLogger.w(br.a, "Not logging duplicate database exception.");
            return;
        }
        try
        {
            br1.a(ct.a(((bi) (obj)), br1.b.c()));
            return;
        }
        catch (JSONException jsonexception)
        {
            try
            {
                AppboyLogger.e(br.a, String.format("Failed to create database exception event from %s.", new Object[] {
                    obj
                }), jsonexception);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                AppboyLogger.e(ao.a(), "Failed to log the database exception.", ((Throwable) (obj)));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        AppboyLogger.e(br.a, "Failed to log error.", ((Throwable) (obj)));
        return;
    }
}
