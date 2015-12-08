// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package timber.log;

import java.util.List;

// Referenced classes of package timber.log:
//            Timber

static final class rror extends ee
{

    public transient void d(String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).d(s, aobj);
        }

    }

    public transient void d(Throwable throwable, String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).d(throwable, s, aobj);
        }

    }

    public transient void e(String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).e(s, aobj);
        }

    }

    public transient void e(Throwable throwable, String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).e(throwable, s, aobj);
        }

    }

    public transient void i(String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).i(s, aobj);
        }

    }

    public transient void i(Throwable throwable, String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).i(throwable, s, aobj);
        }

    }

    protected void log(int j, String s, String s1, Throwable throwable)
    {
        throw new AssertionError("Missing override for log method.");
    }

    public transient void v(String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).v(s, aobj);
        }

    }

    public transient void v(Throwable throwable, String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).v(throwable, s, aobj);
        }

    }

    public transient void w(String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).w(s, aobj);
        }

    }

    public transient void w(Throwable throwable, String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).w(throwable, s, aobj);
        }

    }

    public transient void wtf(String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).wtf(s, aobj);
        }

    }

    public transient void wtf(Throwable throwable, String s, Object aobj[])
    {
        List list = Timber.access$100();
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((ee)list.get(j)).wtf(throwable, s, aobj);
        }

    }

    rror()
    {
    }
}
