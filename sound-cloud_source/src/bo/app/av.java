// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.c.b;
import org.json.JSONException;

// Referenced classes of package bo.app:
//            bi, ao, br, bs, 
//            ct

public final class av
    implements b
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
        Object obj1 = ao.j(a);
        if (((br) (obj1)).b(((Throwable) (obj))))
        {
            obj1 = br.a;
            return;
        }
        try
        {
            ((br) (obj1)).a(ct.a(((bi) (obj)), ((br) (obj1)).b.c()));
            return;
        }
        catch (JSONException jsonexception)
        {
            try
            {
                String s = br.a;
                String.format("Failed to create database exception event from %s.", new Object[] {
                    obj
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ao.a();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        obj = br.a;
        return;
    }
}
