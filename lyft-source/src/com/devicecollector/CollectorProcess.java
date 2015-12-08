// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import android.app.Activity;
import android.os.AsyncTask;
import com.devicecollector.collectors.AbstractAsyncCollectorTask;
import com.devicecollector.collectors.CollectorEnum;
import com.devicecollector.collectors.CollectorStatusListener;
import com.devicecollector.collectors.LocalCollector;
import com.devicecollector.collectors.LocationCollectorTask;
import com.devicecollector.collectors.SoftErrorCode;
import com.devicecollector.collectors.WebCollectorTask;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.devicecollector:
//            AbstractCollectorProcess, DataCollection, AsyncTransmissionTask

public class CollectorProcess extends AbstractCollectorProcess
    implements CollectorStatusListener
{

    private DataCollection e;
    private DeviceCollector.ErrorCode f;
    private Exception g;
    private ArrayList h;

    public CollectorProcess(Activity activity, DeviceCollector.StatusListener statuslistener, EnumSet enumset)
    {
        super(activity, statuslistener, enumset);
    }

    private void a(DeviceCollector.ErrorCode errorcode, Exception exception)
    {
        c = true;
        if (errorcode != null)
        {
            f = errorcode;
            g = exception;
        }
        if (a == null) goto _L2; else goto _L1
_L1:
        if (f == null)
        {
            a("Telling the listener we succeeded...", new Object[0]);
            a.b();
        } else
        {
            a("Telling the listener we had a bad error...", new Object[0]);
            a.a(f, g);
        }
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
_L4:
        c = true;
        return;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
_L2:
        a("No listener to notify", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c(CollectorEnum collectorenum)
    {
        if (h == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = h.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        AbstractAsyncCollectorTask abstractasynccollectortask = (AbstractAsyncCollectorTask)iterator.next();
        if (!abstractasynccollectortask.b().equals(collectorenum)) goto _L6; else goto _L5
_L5:
        if (abstractasynccollectortask != null)
        {
            a("Removing collector [%s]", new Object[] {
                abstractasynccollectortask.b()
            });
            h.remove(abstractasynccollectortask);
            return;
        } else
        {
            a("Collector not found [%s]", new Object[] {
                collectorenum
            });
            return;
        }
_L2:
        a("No collectors being held", new Object[0]);
        return;
_L4:
        abstractasynccollectortask = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    private void d()
    {
        a("checking if we are done...", new Object[0]);
        if (h != null && h.size() > 0)
        {
            Object obj = new ArrayList();
            Iterator iterator = h.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AbstractAsyncCollectorTask abstractasynccollectortask1 = (AbstractAsyncCollectorTask)iterator.next();
                if (abstractasynccollectortask1.c())
                {
                    ((ArrayList) (obj)).add(abstractasynccollectortask1);
                }
            } while (true);
            AbstractAsyncCollectorTask abstractasynccollectortask;
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); h.remove(abstractasynccollectortask))
            {
                abstractasynccollectortask = (AbstractAsyncCollectorTask)((Iterator) (obj)).next();
            }

        }
        if (e != null && e.c() != null && (h == null || h.size() == 0))
        {
            a("All done, sending data...", new Object[0]);
            e();
            a(null, null);
            return;
        } else
        {
            a("[%s] collectors left", new Object[] {
                (new StringBuilder()).append("").append(h.size()).toString()
            });
            return;
        }
    }

    private boolean d(CollectorEnum collectorenum)
    {
        if (d != null && d.contains(collectorenum))
        {
            e.a(collectorenum, SoftErrorCode.b);
            return true;
        } else
        {
            return false;
        }
    }

    private void e()
    {
        Object obj = new AsyncTransmissionTask();
        Object obj1 = new DataCollection[1];
        obj1[0] = e;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            ((AsyncTransmissionTask) (obj)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (obj1)));
        } else
        {
            ((AsyncTransmissionTask) (obj)).execute(((Object []) (obj1)));
        }
        a("Final Collection:", new Object[0]);
        for (obj = e.e().keySet().iterator(); ((Iterator) (obj)).hasNext(); a("key:[%s] value:[%s]", new Object[] {
    obj1, e.e().get(obj1)
}))
        {
            obj1 = (String)((Iterator) (obj)).next();
        }

    }

    protected transient Void a(String as[])
    {
        h = new ArrayList();
        e = new DataCollection(as[0], as[1], as[2]);
        long l;
        if (c())
        {
            l = b();
        } else
        {
            l = 5000L;
        }
        as = new WebCollectorTask(b, this, e, l);
        h.add(as);
        if (!d(CollectorEnum.e))
        {
            as = new LocationCollectorTask(b, this, e, l);
            h.add(as);
        }
        for (as = h.iterator(); as.hasNext();)
        {
            AbstractAsyncCollectorTask abstractasynccollectortask = (AbstractAsyncCollectorTask)as.next();
            a((new StringBuilder()).append("Starting off ").append(abstractasynccollectortask.getClass().getName()).toString(), new Object[0]);
            if (android.os.Build.VERSION.SDK_INT > 10)
            {
                abstractasynccollectortask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else
            {
                abstractasynccollectortask.execute(new Void[0]);
            }
        }

        a("Getting the quick data...", new Object[0]);
        as = new LocalCollector(b, e);
        as.a();
        a("Got Required Info", new Object[0]);
        as.b();
        a("Got optional info...", new Object[0]);
        as.c();
        a("Got Device Cookie Info", new Object[0]);
        a("Done with quick data", new Object[0]);
        d();
        return null;
    }

    public void a(CollectorEnum collectorenum)
    {
        a((new StringBuilder()).append("Long Collector starting:").append(collectorenum).toString(), new Object[0]);
    }

    public void a(CollectorEnum collectorenum, SoftErrorCode softerrorcode, Exception exception)
    {
        a("Removing collector[%s] due to error [%s]", new Object[] {
            collectorenum, softerrorcode
        });
        c(collectorenum);
        if (!CollectorEnum.b.equals(collectorenum))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        c = true;
        f = DeviceCollector.ErrorCode.f;
        g = exception;
        if (a != null)
        {
            a.a(f, g);
        }
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        collectorenum;
        this;
        JVM INSTR monitorexit ;
        throw collectorenum;
        d();
        return;
    }

    public void b(CollectorEnum collectorenum)
    {
        a("Collector success [%s]", new Object[] {
            collectorenum
        });
        c(collectorenum);
        d();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    public void onCancelled()
    {
        a("Called cancel..", new Object[0]);
        if (!c && e != null && e.c() != null)
        {
            a("Cancelling each collector", new Object[0]);
            Iterator iterator = h.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AbstractAsyncCollectorTask abstractasynccollectortask = (AbstractAsyncCollectorTask)iterator.next();
                if (!abstractasynccollectortask.c() && !abstractasynccollectortask.isCancelled())
                {
                    e.a(abstractasynccollectortask.b(), SoftErrorCode.a);
                    a((new StringBuilder()).append("Cancelling [").append(abstractasynccollectortask.b()).append("] collector...").toString(), new Object[0]);
                    abstractasynccollectortask.cancel(true);
                    a((new StringBuilder()).append("Cancelled [").append(abstractasynccollectortask.b()).append("] collector.").toString(), new Object[0]);
                }
            } while (true);
            e();
            a(null, null);
        } else
        if (!c)
        {
            a(DeviceCollector.ErrorCode.e, new CancellationException("Merchant Cancelled"));
            return;
        }
    }
}
