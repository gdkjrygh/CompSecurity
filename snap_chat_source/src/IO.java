// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class IO
{
    static final class a
        implements ThreadFactory
    {

        private static final AtomicInteger sGlobalCount = new AtomicInteger(0);
        private final AtomicInteger mCount = new AtomicInteger(0);
        private final String mName;
        private final int mPriority;

        public final Thread newThread(Runnable runnable)
        {
            int i = mCount.incrementAndGet();
            int j = sGlobalCount.incrementAndGet();
            Timber.b("ScExecutors", "Creating new thread in %s pool, local count:%d, global count:%d", new Object[] {
                mName, Integer.valueOf(i), Integer.valueOf(j)
            });
            return new Thread(new PK(runnable, mPriority), String.format("%s-Pool-%d", new Object[] {
                mName, Integer.valueOf(i)
            }));
        }


        public a(String s, int i)
        {
            mName = s;
            mPriority = i;
        }
    }


    private static final int CORE_POOL_SIZE = 3;
    public static final ExecutorService DOWNLOAD_REQUEST_SUBMISSION;
    public static final ExecutorService FILE_OPS_EXECUTOR;
    public static final ExecutorService HIGH_PRIORITY_EXECUTOR;
    private static final int KEEP_ALIVE = 10;
    private static final int MAXIMUM_POOL_SIZE = 64;
    public static final ExecutorService MEDIA_PLAYER_SERIAL_EXECUTOR;
    public static final ExecutorService MISCELLANEOUS_EXECUTOR;
    public static final ExecutorService NETWORK_EXECUTOR;
    public static final ScheduledThreadPoolExecutor SCHEDULING_EXECUTOR = new ScheduledThreadPoolExecutor(1);
    public static final ExecutorService SERIAL_BACKGROUND_EXECUTOR;
    public static final ExecutorService SERIAL_EXECUTOR_FOR_DEBUGGING;
    public static final ExecutorService SERIAL_EXECUTOR_FOR_LOGGING;
    public static final ExecutorService SERIAL_EXECUTOR_FOR_SQL_WRITE_OPS;
    private static final String TAG = "ScExecutors";
    public static final ExecutorService THUMBNAIL_EXECUTOR;

    private static BlockingQueue a()
    {
        return new LinkedBlockingQueue(0x7fffffff);
    }

    static 
    {
        THUMBNAIL_EXECUTOR = new ThreadPoolExecutor(3, 3, 10L, TimeUnit.SECONDS, a(), new a("Thumbnail", 10));
        NETWORK_EXECUTOR = new ThreadPoolExecutor(3, 64, 10L, TimeUnit.SECONDS, a(), new a("Network", 0));
        MISCELLANEOUS_EXECUTOR = new ThreadPoolExecutor(6, 64, 10L, TimeUnit.SECONDS, a(), new a("Misc", 10));
        HIGH_PRIORITY_EXECUTOR = new ThreadPoolExecutor(3, 64, 10L, TimeUnit.SECONDS, a(), new a("HighPriority", -2));
        SERIAL_BACKGROUND_EXECUTOR = new ThreadPoolExecutor(1, 0x7fffffff, 30L, TimeUnit.SECONDS, a(), new a("Serial", 0));
        MEDIA_PLAYER_SERIAL_EXECUTOR = new ThreadPoolExecutor(1, 0x7fffffff, 30L, TimeUnit.SECONDS, a(), new a("MediaPlayer", -2));
        SERIAL_EXECUTOR_FOR_LOGGING = new ThreadPoolExecutor(1, 0x7fffffff, 2L, TimeUnit.SECONDS, a(), new a("Logging", 10));
        SERIAL_EXECUTOR_FOR_DEBUGGING = new ThreadPoolExecutor(1, 0x7fffffff, 10L, TimeUnit.SECONDS, a(), new a("Debugging", -2));
        SERIAL_EXECUTOR_FOR_SQL_WRITE_OPS = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, a(), new a("SqlWriteOps", 10));
        DOWNLOAD_REQUEST_SUBMISSION = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, a(), new a("DownloadRequestSubmission", 0));
        FILE_OPS_EXECUTOR = new ThreadPoolExecutor(3, 64, 10L, TimeUnit.SECONDS, a(), new a("FileOps", 10));
    }
}
