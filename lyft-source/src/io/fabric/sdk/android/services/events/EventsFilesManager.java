// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStorage, EventsStorageListener, EventTransform

public abstract class EventsFilesManager
{

    protected final Context a;
    protected final EventTransform b;
    protected final CurrentTimeProvider c;
    protected final EventsStorage d;
    protected volatile long e;
    protected final List f = new CopyOnWriteArrayList();
    private final int g;

    public EventsFilesManager(Context context, EventTransform eventtransform, CurrentTimeProvider currenttimeprovider, EventsStorage eventsstorage, int i)
    {
        a = context.getApplicationContext();
        b = eventtransform;
        d = eventsstorage;
        c = currenttimeprovider;
        e = c.a();
        g = i;
    }

    private void a(int i)
    {
        if (!d.a(i, c()))
        {
            String s = String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[] {
                Integer.valueOf(d.a()), Integer.valueOf(i), Integer.valueOf(c())
            });
            CommonUtils.a(a, 4, "Fabric", s);
            d();
        }
    }

    private void b(String s)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            EventsStorageListener eventsstoragelistener = (EventsStorageListener)iterator.next();
            try
            {
                eventsstoragelistener.a(s);
            }
            catch (Exception exception)
            {
                CommonUtils.a(a, "One of the roll over listeners threw an exception", exception);
            }
        }

    }

    public long a(String s)
    {
        s = s.split("_");
        if (s.length != 3)
        {
            return 0L;
        }
        long l;
        try
        {
            l = Long.valueOf(s[2]).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l;
    }

    protected abstract String a();

    public void a(EventsStorageListener eventsstoragelistener)
    {
        if (eventsstoragelistener != null)
        {
            f.add(eventsstoragelistener);
        }
    }

    public void a(Object obj)
    {
        obj = b.a(obj);
        a(obj.length);
        d.a(((byte []) (obj)));
    }

    public void a(List list)
    {
        d.a(list);
    }

    protected int b()
    {
        return g;
    }

    protected int c()
    {
        return 8000;
    }

    public boolean d()
    {
        boolean flag = true;
        String s = null;
        if (!d.b())
        {
            s = a();
            d.a(s);
            CommonUtils.a(a, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[] {
                s
            }));
            e = c.a();
        } else
        {
            flag = false;
        }
        b(s);
        return flag;
    }

    public List e()
    {
        return d.a(1);
    }

    public void f()
    {
        d.a(d.c());
        d.d();
    }

    public void g()
    {
        Object obj1 = d.c();
        int i = b();
        if (((List) (obj1)).size() <= i)
        {
            return;
        }
        int j = ((List) (obj1)).size() - i;
        CommonUtils.a(a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[] {
            Integer.valueOf(((List) (obj1)).size()), Integer.valueOf(i), Integer.valueOf(j)
        }));
        Object obj = new TreeSet(new Comparator() {

            final EventsFilesManager a;

            public int a(FileWithTimestamp filewithtimestamp, FileWithTimestamp filewithtimestamp1)
            {
                return (int)(filewithtimestamp.b - filewithtimestamp1.b);
            }

            public int compare(Object obj2, Object obj3)
            {
                return a((FileWithTimestamp)obj2, (FileWithTimestamp)obj3);
            }

            
            {
                a = EventsFilesManager.this;
                super();
            }
        });
        File file;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((TreeSet) (obj)).add(new FileWithTimestamp(file, a(file.getName()))))
        {
            file = (File)((Iterator) (obj1)).next();
        }

        obj1 = new ArrayList();
        obj = ((TreeSet) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ((ArrayList) (obj1)).add(((FileWithTimestamp)((Iterator) (obj)).next()).a);
        } while (((ArrayList) (obj1)).size() != j);
        d.a(((List) (obj1)));
    }

    private class FileWithTimestamp
    {

        final File a;
        final long b;

        public FileWithTimestamp(File file, long l)
        {
            a = file;
            b = l;
        }
    }

}
