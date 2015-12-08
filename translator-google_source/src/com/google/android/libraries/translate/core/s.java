// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import com.google.android.libraries.translate.e.k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.libraries.translate.core:
//            TwsResponseException, m

abstract class s extends k
{

    private TwsResponseException a;

    s()
    {
        a = null;
    }

    private transient m b(String as[])
    {
        try
        {
            as = a(as);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            a = as;
            return null;
        }
        return as;
    }

    public final m a(long l)
    {
        Object obj;
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        try
        {
            obj = (m)get(l, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        if (obj == null && a != null)
        {
            throw a;
        } else
        {
            return ((m) (obj));
        }
        obj = (m)get();
        break MISSING_BLOCK_LABEL_18;
    }

    public transient abstract m a(String as[]);

    protected Object doInBackground(Object aobj[])
    {
        return b((String[])aobj);
    }
}
