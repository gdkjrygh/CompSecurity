// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class ACache
{
    public static interface IConsumer
    {
    }


    private static final String LOG_TAG = "ACache";
    private HashMap mCacheTable;
    private HashMap mConsumerTable;

    protected ACache()
    {
        mCacheTable = new HashMap();
        mConsumerTable = new HashMap();
    }

    protected Object getCachedValue(Object obj)
    {
        return mCacheTable.get(obj);
    }

    protected abstract void onError(Exception exception, IConsumer iconsumer);

    protected void onError(Object obj, Exception exception)
    {
        obj = (ArrayList)mConsumerTable.remove(obj);
        if (obj != null)
        {
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                IConsumer iconsumer = (IConsumer)((Iterator) (obj)).next();
                if (iconsumer != null)
                {
                    onError(exception, iconsumer);
                }
            } while (true);
        }
    }

    protected void onValueAvailable(Object obj, Object obj1)
    {
        mCacheTable.put(obj, obj1);
        obj = (ArrayList)mConsumerTable.remove(obj);
        if (obj != null)
        {
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                IConsumer iconsumer = (IConsumer)((Iterator) (obj)).next();
                if (iconsumer != null)
                {
                    onValueAvailable(obj1, iconsumer);
                }
            } while (true);
        }
    }

    protected abstract void onValueAvailable(Object obj, IConsumer iconsumer);

    protected boolean requestAlreadyStarted(Object obj, IConsumer iconsumer)
    {
        ArrayList arraylist = (ArrayList)mConsumerTable.get(obj);
        if (arraylist == null)
        {
            arraylist = new ArrayList();
            arraylist.add(iconsumer);
            mConsumerTable.put(obj, arraylist);
            return false;
        }
        if (!arraylist.contains(iconsumer))
        {
            arraylist.add(iconsumer);
        }
        return true;
    }
}
