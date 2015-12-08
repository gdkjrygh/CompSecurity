// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.facebook.Request;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class aou extends AbstractList
{

    private static AtomicInteger f = new AtomicInteger();
    public Handler a;
    public List b;
    public final String c;
    public List d;
    public String e;

    public aou()
    {
        b = new ArrayList();
        c = Integer.valueOf(f.incrementAndGet()).toString();
        d = new ArrayList();
        b = new ArrayList();
    }

    public aou(Collection collection)
    {
        b = new ArrayList();
        c = Integer.valueOf(f.incrementAndGet()).toString();
        d = new ArrayList();
        b = new ArrayList(collection);
    }

    public transient aou(Request arequest[])
    {
        b = new ArrayList();
        c = Integer.valueOf(f.incrementAndGet()).toString();
        d = new ArrayList();
        b = Arrays.asList(arequest);
    }

    public final Request a(int i)
    {
        return (Request)b.get(i);
    }

    public final void a(aov aov)
    {
        if (!d.contains(aov))
        {
            d.add(aov);
        }
    }

    public final boolean a(Request request)
    {
        return b.add(request);
    }

    public volatile void add(int i, Object obj)
    {
        obj = (Request)obj;
        b.add(i, obj);
    }

    public boolean add(Object obj)
    {
        return a((Request)obj);
    }

    public final void clear()
    {
        b.clear();
    }

    public Object get(int i)
    {
        return a(i);
    }

    public volatile Object remove(int i)
    {
        return (Request)b.remove(i);
    }

    public volatile Object set(int i, Object obj)
    {
        obj = (Request)obj;
        return (Request)b.set(i, obj);
    }

    public final int size()
    {
        return b.size();
    }

}
