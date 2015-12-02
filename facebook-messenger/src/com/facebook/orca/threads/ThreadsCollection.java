// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.kl;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.threads:
//            y, ThreadSummary

public class ThreadsCollection
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new y();
    private static final Class a = com/facebook/orca/threads/ThreadsCollection;
    private static final l b = new l();
    private static final ThreadsCollection c = new ThreadsCollection(es.d(), true);
    private final es d;
    private final boolean e;

    private ThreadsCollection(Parcel parcel)
    {
        d = es.a(parcel.readArrayList(com/facebook/orca/threads/ThreadSummary.getClassLoader()));
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }

    ThreadsCollection(Parcel parcel, y y1)
    {
        this(parcel);
    }

    public ThreadsCollection(es es1, boolean flag)
    {
        d = es1;
        e = flag;
        a(es1);
    }

    public static ThreadsCollection a()
    {
        return c;
    }

    public static ThreadsCollection a(ThreadsCollection threadscollection, ThreadsCollection threadscollection1)
    {
        if (!threadscollection.d() || !threadscollection1.d())
        {
            if (threadscollection.d())
            {
                return threadscollection1;
            }
            if (!threadscollection1.d())
            {
                java.util.HashSet hashset = kl.a();
                et et1 = es.e();
                ThreadSummary threadsummary;
                for (threadscollection = threadscollection.b().iterator(); threadscollection.hasNext(); hashset.add(threadsummary.a()))
                {
                    threadsummary = (ThreadSummary)threadscollection.next();
                    et1.b(threadsummary);
                }

                threadscollection = threadscollection1.b().iterator();
                do
                {
                    if (!threadscollection.hasNext())
                    {
                        break;
                    }
                    ThreadSummary threadsummary1 = (ThreadSummary)threadscollection.next();
                    if (!hashset.contains(threadsummary1.a()))
                    {
                        et1.b(threadsummary1);
                    }
                } while (true);
                return new ThreadsCollection(et1.b(), threadscollection1.c());
            }
        }
        return threadscollection;
    }

    private static void a(es es1)
    {
        es1 = es1.iterator();
        long l1 = 0x7fffffffffffffffL;
        do
        {
            ThreadSummary threadsummary;
label0:
            {
                if (es1.hasNext())
                {
                    threadsummary = (ThreadSummary)es1.next();
                    if (threadsummary.l() <= l1)
                    {
                        break label0;
                    }
                    com.facebook.debug.log.b.a(b, a, "Threads were not in order");
                }
                return;
            }
            l1 = threadsummary.l();
        } while (true);
    }

    public ThreadSummary a(int i)
    {
        return (ThreadSummary)d.get(i);
    }

    public es b()
    {
        return d;
    }

    public boolean c()
    {
        return e;
    }

    public boolean d()
    {
        return d.isEmpty();
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return d.size();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(d);
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
