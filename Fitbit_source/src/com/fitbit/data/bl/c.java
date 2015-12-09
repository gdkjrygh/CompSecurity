// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.a.a;
import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs

public abstract class c extends e
{

    protected List a;
    protected boolean b;

    public c(bs bs, boolean flag)
    {
        super(bs, flag);
        a = new ArrayList();
        b = false;
    }

    protected java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock a()
    {
        return null;
    }

    public void a(a a1)
    {
        a.add(a1);
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        Object obj = null;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_165;
            }
            a a2 = (a)iterator.next();
            if (a1.a())
            {
                if (obj != null)
                {
                    break MISSING_BLOCK_LABEL_165;
                }
                for (a1 = new CancellationException(); a1 != null; a1 = ((h.a) (obj)))
                {
                    Object obj1;
                    if (a1 instanceof ServerCommunicationException)
                    {
                        throw (ServerCommunicationException)a1;
                    }
                    if (a1 instanceof JSONException)
                    {
                        throw (JSONException)a1;
                    }
                    if (a1 instanceof CancellationException)
                    {
                        throw (CancellationException)a1;
                    } else
                    {
                        throw new RuntimeException(a1);
                    }
                }

                return;
            }
            try
            {
                a2.b(a1);
                b(a2);
            }
            // Misplaced declaration of an exception variable
            catch (h.a a1)
            {
                throw a1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                if (b)
                {
                    throw obj1;
                }
                if (obj == null)
                {
                    obj = obj1;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                if (b)
                {
                    throw obj1;
                }
                if (obj == null)
                {
                    obj = obj1;
                }
            }
        } while (true);
    }

    protected void b(a a1)
        throws ServerCommunicationException, JSONException
    {
    }

    protected void c(a a1)
        throws ServerCommunicationException, JSONException
    {
    }
}
