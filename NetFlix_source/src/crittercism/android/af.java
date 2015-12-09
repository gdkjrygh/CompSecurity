// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            l, s

public final class af
{
    static final class a
        implements Runnable
    {

        private af a;
        private int b;

        public final void run()
        {
            JSONObject jsonobject = a.a(b);
            a.a.a(jsonobject);
        }

        public a(af af1)
        {
            a = null;
            a = af1;
            b = 2500;
        }
    }


    s a;
    private boolean b;

    public af(s s)
    {
        a = null;
        b = false;
        a = s;
    }

    public af(s s, boolean flag)
    {
        a = null;
        b = false;
        a = s;
        b = flag;
    }

    final JSONObject a(int i)
    {
        Object obj = new JSONObject();
        FutureTask futuretask = new FutureTask(new Callable() {

            final af a;

            public final Object call()
            {
                return a.a.d();
            }

            
            {
                a = af.this;
                super();
            }
        });
        java.util.concurrent.ExecutorService executorservice = l.i().l;
        try
        {
            executorservice.execute(futuretask);
            while (!futuretask.isDone()) 
            {
                obj = (JSONObject)futuretask.get(i, TimeUnit.MILLISECONDS);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = new HashMap();
            ((Map) (obj)).put("success", Integer.valueOf(1));
            obj = new JSONObject(((Map) (obj)));
        }
        catch (Exception exception)
        {
            (new StringBuilder("Exception in sendToNetwork!: ")).append(exception.getClass().getName());
            HashMap hashmap = new HashMap();
            hashmap.put("success", Integer.valueOf(0));
            return new JSONObject(hashmap);
        }
        return ((JSONObject) (obj));
    }

    public final void a()
    {
        Thread thread;
        thread = new Thread(new a(this));
        thread.start();
        if (!b)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        thread.join();
        return;
        Object obj;
        obj;
        (new StringBuilder("Exception in NetworkIO$send(): ")).append(obj.getClass().getName());
        return;
        obj;
    }
}
