// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.database.table.DbTable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class Bs
{

    private static final String ENABLE_LATE_LOADING = "ENABLE_LATE_LOADING";
    private static final String LATE_LOADING_TEST = "LATE_LOADING";
    private static final String TAG = "UserDatabaseLoader";
    private final PB mClock;
    public final boolean mLateLoading;
    private final ll mLifecycleAnalytics;

    public Bs()
    {
        this(ll.a(), (new PC()).mClock, Bm.a());
    }

    private Bs(ll ll1, PB pb, Bm bm)
    {
        mLifecycleAnalytics = ll1;
        mClock = pb;
        mLateLoading = bm.a("LATE_LOADING", "ENABLE_LATE_LOADING", false);
    }

    static void a(ExecutorService executorservice)
    {
        executorservice.shutdown();
        try
        {
            if (!executorservice.awaitTermination(0x7fffffffffffffffL, TimeUnit.NANOSECONDS))
            {
                executorservice.shutdownNow();
                if (!executorservice.awaitTermination(0x7fffffffffffffffL, TimeUnit.NANOSECONDS))
                {
                    Timber.e("UserDatabaseLoader", "executorService did not terminate", new Object[0]);
                }
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Timber.a("UserDatabaseLoader", interruptedexception);
        }
        executorservice.shutdownNow();
        Thread.currentThread().interrupt();
    }

    public final void a(com.snapchat.android.database.table.DbTable.DatabaseTableGroup databasetablegroup, Br br)
    {
        for (databasetablegroup = databasetablegroup.getDatabaseTables().iterator(); databasetablegroup.hasNext();)
        {
            Object obj = (com.snapchat.android.database.table.DbTable.DatabaseTable)databasetablegroup.next();
            long l = SystemClock.elapsedRealtime();
            Timber.c("UserDatabaseLoader", "Populating from %s table", new Object[] {
                ((com.snapchat.android.database.table.DbTable.DatabaseTable) (obj)).name()
            });
            ((com.snapchat.android.database.table.DbTable.DatabaseTable) (obj)).getTable().d(br);
            ll ll1 = mLifecycleAnalytics;
            obj = ((com.snapchat.android.database.table.DbTable.DatabaseTable) (obj)).name();
            l = SystemClock.elapsedRealtime() - l;
            if (ll1.mUserLoadMetric != null && l > 0L)
            {
                ll1.mUserLoadMetric.a(((String) (obj)), Long.valueOf(l));
            }
            ll1.mDidLoadFromDatabase = true;
        }

    }

    // Unreferenced inner class Bs$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        final Bs this$0;
        final com.snapchat.android.database.table.DbTable.DatabaseTableGroup val$group;
        final Br val$user;

        public final void run()
        {
            a(group, user);
        }

            
            {
                this$0 = Bs.this;
                group = databasetablegroup;
                user = br;
                super();
            }
    }

}
