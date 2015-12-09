// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            c, e, bs

public abstract class ag extends c
{

    public static final ExecutorService d;
    public static final int e = 0x80000000;
    private static final String f = "MultithreadedCollectionOperation";
    private static int g;
    private Map h;

    public ag(bs bs, boolean flag)
    {
        super(bs, flag);
        h = new TreeMap();
        com.fitbit.e.a.b("MultithreadedCollectionOperation", "Number of threads : %d", new Object[] {
            Integer.valueOf(g)
        });
    }

    public static ExecutorService b()
    {
        return d;
    }

    public void a(com.fitbit.data.bl.a.a a1)
    {
        a(a1, 0x80000000);
    }

    protected void a(com.fitbit.data.bl.a.a a1, int i)
    {
        super.a(a1);
        List list = (List)h.get(Integer.valueOf(i));
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            h.put(Integer.valueOf(i), obj);
        }
        ((List) (obj)).add(a1);
    }

    protected void a(e e1, int i)
    {
        e1.a(true);
        a(((com.fitbit.data.bl.a.a) (e1)), i);
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        Object obj;
        Iterator iterator1;
        Object obj1;
        boolean flag;
        obj1 = new ArrayList();
        com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s started with groups : %s", new Object[] {
            this, h.keySet()
        });
        List list;
        boolean flag1;
        for (Iterator iterator = h.keySet().iterator(); iterator.hasNext(); ((List) (obj1)).add(d.submit(new Callable(list, a1, flag1) {

        final List a;
        final h.a b;
        final boolean c;
        final ag d;

        public Void a()
            throws Exception
        {
label0:
            {
                Iterator iterator2 = a.iterator();
                Object obj2 = null;
label1:
                do
                {
                    com.fitbit.data.bl.a.a a2;
label2:
                    {
                        if (iterator2.hasNext())
                        {
                            a2 = (com.fitbit.data.bl.a.a)iterator2.next();
                            if (!b.a())
                            {
                                break label2;
                            }
                        }
                        if (obj2 == null)
                        {
                            break label0;
                        }
                        if (obj2 instanceof ServerCommunicationException)
                        {
                            throw (ServerCommunicationException)obj2;
                        }
                        break label1;
                    }
                    try
                    {
                        com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s executing operation : %s", new Object[] {
                            d, a2
                        });
                        a2.b(b);
                        com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s executed operation : %s", new Object[] {
                            d, a2
                        });
                        d.b(a2);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj2)
                    {
                        throw obj2;
                    }
                    catch (ServerCommunicationException servercommunicationexception)
                    {
                        if (c)
                        {
                            throw servercommunicationexception;
                        }
                        if (obj2 == null)
                        {
                            obj2 = servercommunicationexception;
                        }
                    }
                    catch (JSONException jsonexception)
                    {
                        if (c)
                        {
                            throw jsonexception;
                        }
                        if (obj2 == null)
                        {
                            obj2 = jsonexception;
                        }
                    }
                } while (true);
                if (obj2 instanceof JSONException)
                {
                    throw (JSONException)obj2;
                }
                if (obj2 instanceof RuntimeException)
                {
                    throw (RuntimeException)obj2;
                } else
                {
                    throw new RuntimeException(((Throwable) (obj2)));
                }
            }
            return null;
        }

        public Object call()
            throws Exception
        {
            return a();
        }

            
            {
                d = ag.this;
                a = list;
                b = a1;
                c = flag;
                super();
            }
    })))
        {
            Integer integer = (Integer)iterator.next();
            list = (List)h.get(integer);
            flag1 = b;
            com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s submitting group to executor : %s", new Object[] {
                this, integer
            });
        }

        obj = null;
        flag = false;
        iterator1 = h.keySet().iterator();
        obj1 = ((List) (obj1)).iterator();
_L2:
        Future future;
        int i;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        future = (Future)((Iterator) (obj1)).next();
        i = ((Integer)iterator1.next()).intValue();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        if (!a1.a())
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (future.cancel(false))
        {
            com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s group has been canceled : %s", new Object[] {
                this, Integer.valueOf(i)
            });
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s waiting for group : %s", new Object[] {
                this, Integer.valueOf(i)
            });
            future.get();
        }
        catch (InterruptedException interruptedexception)
        {
            com.fitbit.e.a.e("MultithreadedCollectionOperation", toString(), interruptedexception, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = ((ExecutionException) (obj)).getCause();
            if (obj != null);
            if (b)
            {
                com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s group has thrown exception %s, attempting to cancel all groups : %s", new Object[] {
                    this, com.fitbit.e.a.a(((Throwable) (obj))), Integer.valueOf(i)
                });
                flag = true;
            } else
            {
                com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s group has thrown exception %s: %s", new Object[] {
                    this, com.fitbit.e.a.a(((Throwable) (obj))), Integer.valueOf(i)
                });
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (obj != null)
        {
            com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s on of the groups threw exception %s", new Object[] {
                this, com.fitbit.e.a.a(((Throwable) (obj)))
            });
            if (obj instanceof ServerCommunicationException)
            {
                throw (ServerCommunicationException)obj;
            }
            if (obj instanceof JSONException)
            {
                throw (JSONException)obj;
            } else
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
        } else
        {
            com.fitbit.e.a.a("MultithreadedCollectionOperation", "%s all groups successfully invoked %s", new Object[] {
                this, com.fitbit.e.a.a(((Throwable) (obj)))
            });
            return;
        }
    }

    static 
    {
        int i = 3;
        if (Runtime.getRuntime().availableProcessors() > 3)
        {
            i = Runtime.getRuntime().availableProcessors() - 1;
        }
        g = i;
        d = Executors.newFixedThreadPool(g);
    }
}
