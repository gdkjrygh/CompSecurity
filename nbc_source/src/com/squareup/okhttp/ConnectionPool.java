// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp:
//            Connection, Route, Address

public final class ConnectionPool
{

    private static final long DEFAULT_KEEP_ALIVE_DURATION_MS = 0x493e0L;
    private static final ConnectionPool systemDefault;
    private final LinkedList connections = new LinkedList();
    private final Runnable connectionsCleanupRunnable = new Runnable() {

        final ConnectionPool this$0;

        public void run()
        {
            runCleanupUntilPoolIsEmpty();
        }

            
            {
                this$0 = ConnectionPool.this;
                super();
            }
    };
    private Executor executor;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    public ConnectionPool(int i, long l)
    {
        executor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
        maxIdleConnections = i;
        keepAliveDurationNs = l * 1000L * 1000L;
    }

    private void addConnection(Connection connection)
    {
        boolean flag = connections.isEmpty();
        connections.addFirst(connection);
        if (flag)
        {
            executor.execute(connectionsCleanupRunnable);
            return;
        } else
        {
            notifyAll();
            return;
        }
    }

    public static ConnectionPool getDefault()
    {
        return systemDefault;
    }

    private void runCleanupUntilPoolIsEmpty()
    {
        while (performCleanup()) ;
    }

    public void evictAll()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList(connections);
        connections.clear();
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            Util.closeQuietly(((Connection)arraylist.get(i)).getSocket());
        }

        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Connection get(Address address)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        ListIterator listiterator = connections.listIterator(connections.size());
_L2:
        Connection connection = obj;
        boolean flag;
        if (!listiterator.hasPrevious())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connection = (Connection)listiterator.previous();
        if (!connection.getRoute().getAddress().equals(address) || !connection.isAlive() || System.nanoTime() - connection.getIdleStartTimeNs() >= keepAliveDurationNs)
        {
            continue; /* Loop/switch isn't completed */
        }
        listiterator.remove();
        flag = connection.isSpdy();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        Platform.get().tagSocket(connection.getSocket());
        if (connection == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        if (connection.isSpdy())
        {
            connections.addFirst(connection);
        }
        this;
        JVM INSTR monitorexit ;
        return connection;
        SocketException socketexception;
        socketexception;
        Util.closeQuietly(connection.getSocket());
        Platform.get().logW((new StringBuilder()).append("Unable to tagSocket(): ").append(socketexception).toString());
        if (true) goto _L2; else goto _L1
_L1:
        address;
        throw address;
    }

    public int getConnectionCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = connections.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    List getConnections()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList(connections);
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        throw exception;
    }

    public int getHttpConnectionCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = connections.size();
        j = getMultiplexedConnectionCount();
        this;
        JVM INSTR monitorexit ;
        return i - j;
        Exception exception;
        exception;
        throw exception;
    }

    public int getMultiplexedConnectionCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = 0;
        Iterator iterator = connections.iterator();
_L1:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        flag = ((Connection)iterator.next()).isSpdy();
        if (flag)
        {
            i++;
        }
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int getSpdyConnectionCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = getMultiplexedConnectionCount();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    boolean performCleanup()
    {
        this;
        JVM INSTR monitorenter ;
        if (!connections.isEmpty())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        Object obj = new ArrayList();
        int i = 0;
        ListIterator listiterator;
        long l;
        long l1;
        l1 = System.nanoTime();
        l = keepAliveDurationNs;
        listiterator = connections.listIterator(connections.size());
_L4:
        Connection connection;
        long l3;
        if (!listiterator.hasPrevious())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        connection = (Connection)listiterator.previous();
        l3 = (connection.getIdleStartTimeNs() + keepAliveDurationNs) - l1;
        if (l3 <= 0L) goto _L2; else goto _L1
_L1:
        if (connection.isAlive()) goto _L3; else goto _L2
_L2:
        listiterator.remove();
        ((List) (obj)).add(connection);
          goto _L4
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        if (!connection.isIdle()) goto _L4; else goto _L5
_L5:
        i++;
        l = Math.min(l, l3);
          goto _L4
        listiterator = connections.listIterator(connections.size());
_L6:
        Connection connection1;
        do
        {
            if (!listiterator.hasPrevious() || i <= maxIdleConnections)
            {
                break MISSING_BLOCK_LABEL_220;
            }
            connection1 = (Connection)listiterator.previous();
        } while (!connection1.isIdle());
        ((List) (obj)).add(connection1);
        listiterator.remove();
        i--;
          goto _L6
        boolean flag = ((List) (obj)).isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        long l2 = l / 0xf4240L;
        wait(l2, (int)(l - 0xf4240L * l2));
        this;
        JVM INSTR monitorexit ;
        return true;
_L8:
        this;
        JVM INSTR monitorexit ;
        int j = 0;
        for (int k = ((List) (obj)).size(); j < k; j++)
        {
            Util.closeQuietly(((Connection)((List) (obj)).get(j)).getSocket());
        }

        return true;
        InterruptedException interruptedexception;
        interruptedexception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    void recycle(Connection connection)
    {
        while (connection.isSpdy() || !connection.clearOwner()) 
        {
            return;
        }
        if (!connection.isAlive())
        {
            Util.closeQuietly(connection.getSocket());
            return;
        }
        try
        {
            Platform.get().untagSocket(connection.getSocket());
        }
        catch (SocketException socketexception)
        {
            Platform.get().logW((new StringBuilder()).append("Unable to untagSocket(): ").append(socketexception).toString());
            Util.closeQuietly(connection.getSocket());
            return;
        }
        this;
        JVM INSTR monitorenter ;
        addConnection(connection);
        connection.incrementRecycleCount();
        connection.resetIdleStartTime();
        this;
        JVM INSTR monitorexit ;
        return;
        connection;
        this;
        JVM INSTR monitorexit ;
        throw connection;
    }

    void replaceCleanupExecutorForTests(Executor executor1)
    {
        executor = executor1;
    }

    void share(Connection connection)
    {
        if (!connection.isSpdy())
        {
            throw new IllegalArgumentException();
        }
        if (!connection.isAlive())
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        addConnection(connection);
        this;
        JVM INSTR monitorexit ;
        return;
        connection;
        this;
        JVM INSTR monitorexit ;
        throw connection;
    }

    static 
    {
        String s = System.getProperty("http.keepAlive");
        String s1 = System.getProperty("http.keepAliveDuration");
        String s2 = System.getProperty("http.maxConnections");
        long l;
        if (s1 != null)
        {
            l = Long.parseLong(s1);
        } else
        {
            l = 0x493e0L;
        }
        if (s != null && !Boolean.parseBoolean(s))
        {
            systemDefault = new ConnectionPool(0, l);
        } else
        if (s2 != null)
        {
            systemDefault = new ConnectionPool(Integer.parseInt(s2), l);
        } else
        {
            systemDefault = new ConnectionPool(5, l);
        }
    }

}
