// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import java.util.HashMap;
import me.lyft.android.common.Preconditions;
import me.lyft.android.common.Unit;
import rx.Observable;

// Referenced classes of package me.lyft.android.rx:
//            BusEvent

public class MessageBus
{

    final HashMap eventMap = new HashMap();

    public MessageBus()
    {
    }

    private BusEvent getEvent(Class class1)
    {
        if (eventMap.containsKey(class1))
        {
            return (BusEvent)eventMap.get(class1);
        }
        BusEvent busevent;
        try
        {
            busevent = (BusEvent)class1.newInstance();
            eventMap.put(class1, busevent);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException("Cannot construct event class");
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException("Cannot construct event class");
        }
        return busevent;
    }

    public Observable observe(Class class1)
    {
        return getEvent(class1).observe();
    }

    public void post(Class class1)
    {
        Preconditions.checkNotNull(class1);
        getEvent(class1).post(Unit.create());
    }

    public void post(Class class1, Object obj)
    {
        Preconditions.checkNotNull(class1);
        getEvent(class1).post(obj);
    }
}
