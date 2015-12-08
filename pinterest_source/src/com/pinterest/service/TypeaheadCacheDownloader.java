// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.ByteApiResponseHandler;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.SearchTypeahead;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.FileUtils;
import com.pinterest.kit.utils.SearchTypeaheadUtils;
import com.pinterest.reporting.CrashReporting;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.service:
//            PinterestWorkerService

public class TypeaheadCacheDownloader
{

    private static final int CHUNK_DB_TRANSACTION_DELAY = 250;
    private static final int INITAL_DELAY = 8000;
    private static final int MAX_CHUNKS = 100;
    private static final String TYPEAHEAD_CACHE_TEMP_FILE_NAME = "typeahead_temp_cache";
    private static int _currentPartition = 0;
    private boolean _downloadInProgress;
    private PinterestWorkerService _hostService;
    private final Object _lock = new Object();
    private List _partitions;
    private ByteApiResponseHandler onPartitionDownload;

    public TypeaheadCacheDownloader(PinterestWorkerService pinterestworkerservice)
    {
        _downloadInProgress = false;
        onPartitionDownload = new _cls2();
        _hostService = pinterestworkerservice;
    }

    private boolean downloadCacheFile(String s, ByteApiResponseHandler byteapiresponsehandler)
    {
        ApiHttpClient.getBinaryData(s, byteapiresponsehandler, false, true, null);
        getNextPartition();
        return true;
        s;
        CrashReporting.a(s);
        getNextPartition();
        return false;
        s;
        getNextPartition();
        throw s;
    }

    private void getNextPartition()
    {
        synchronized (_lock)
        {
            _downloadInProgress = false;
            _lock.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void insertToDB(File file)
    {
        int i = 0;
        Object obj1 = new BufferedInputStream(new FileInputStream(file));
        Object obj = obj1;
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(((java.io.InputStream) (obj1)), "UTF-8"));
        obj = obj1;
        ArrayList arraylist = new ArrayList();
_L2:
        obj = obj1;
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        SearchTypeahead searchtypeahead = new SearchTypeahead();
        obj = obj1;
        String as[] = s.split("\t");
        obj = obj1;
        searchtypeahead.setQuery(as[0]);
        obj = obj1;
        searchtypeahead.setScore(Float.valueOf(as[1]));
        obj = obj1;
        arraylist.add(searchtypeahead);
        if (true) goto _L2; else goto _L1
        Exception exception3;
        exception3;
_L8:
        obj = obj1;
        PLog.error(exception3, "Inserting to DB exception", new Object[0]);
        obj = obj1;
        CrashReporting.a(exception3);
        Exception exception;
        int j;
        if (obj1 != null)
        {
            try
            {
                ((BufferedInputStream) (obj1)).close();
            }
            catch (Exception exception1) { }
        }
        FileUtils.deleteFile(file);
        getNextPartition();
        return;
_L1:
        obj = obj1;
        j = arraylist.size() / 100;
_L4:
        if (i >= 100)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ModelHelper.setSearchTypeaheads(arraylist.subList(j * i, (i + 1) * j));
        obj = obj1;
        Thread.sleep(250L);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            ((BufferedInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception) { }
        FileUtils.deleteFile(file);
        getNextPartition();
        return;
        obj1;
        obj = null;
_L6:
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            catch (Exception exception2) { }
        }
        FileUtils.deleteFile(file);
        getNextPartition();
        throw obj1;
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        exception3;
        obj1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private Runnable newDownloadTask()
    {
        return new _cls1();
    }

    public Runnable downloadAllPartitions()
    {
        _partitions = SearchTypeaheadUtils.getPartitionsToFetch();
        return newDownloadTask();
    }





/*
    static boolean access$102(TypeaheadCacheDownloader typeaheadcachedownloader, boolean flag)
    {
        typeaheadcachedownloader._downloadInProgress = flag;
        return flag;
    }

*/






/*
    static int access$502(int i)
    {
        _currentPartition = i;
        return i;
    }

*/




/*
    static PinterestWorkerService access$702(TypeaheadCacheDownloader typeaheadcachedownloader, PinterestWorkerService pinterestworkerservice)
    {
        typeaheadcachedownloader._hostService = pinterestworkerservice;
        return pinterestworkerservice;
    }

*/


    private class _cls2 extends ByteApiResponseHandler
    {

        final TypeaheadCacheDownloader this$0;

        public volatile void onResponse(Object obj)
        {
            onResponse((byte[])obj);
        }

        public void onResponse(byte abyte0[])
        {
            (new PopulatePartitionIntoDBTask(abyte0)).execute();
        }

        _cls2()
        {
            this$0 = TypeaheadCacheDownloader.this;
            super();
        }

        private class PopulatePartitionIntoDBTask extends BackgroundTask
        {

            private byte _partitionData[];
            final TypeaheadCacheDownloader this$0;

            public void run()
            {
                File file;
                file = new File(Application.context().getCacheDir(), "typeahead_temp_cache");
                file.delete();
                FileUtils.writeByteArrayToFile(file, _partitionData);
                if (file.exists())
                {
                    insertToDB(file);
                }
                getNextPartition();
                return;
                Object obj;
                obj;
                PLog.error(((Throwable) (obj)), "File IO exception", new Object[0]);
                CrashReporting.a(((Throwable) (obj)));
                getNextPartition();
                return;
                obj;
                getNextPartition();
                throw obj;
            }

            public PopulatePartitionIntoDBTask(byte abyte0[])
            {
                this$0 = TypeaheadCacheDownloader.this;
                super();
                _partitionData = abyte0;
            }
        }

    }


    private class _cls1
        implements Runnable
    {

        final TypeaheadCacheDownloader this$0;

        public void run()
        {
            Object obj;
            if (_partitions == null || _partitions.size() == 0 || _downloadInProgress)
            {
                return;
            }
            Iterator iterator;
            Exception exception;
            String s;
            boolean flag;
            try
            {
                Thread.sleep(8000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                CrashReporting.a(((Throwable) (obj)));
            }
            obj = _lock;
            obj;
            JVM INSTR monitorenter ;
            ModelHelper.deleteAllSearchTypeahead();
            iterator = _partitions.iterator();
_L9:
            if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
            s = (String)iterator.next();
            if (_downloadInProgress) goto _L4; else goto _L3
_L3:
            if (!downloadCacheFile(s, onPartitionDownload)) goto _L6; else goto _L5
_L5:
            _downloadInProgress = true;
_L4:
            flag = _downloadInProgress;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_164;
            }
            PLog.log("Download in progress, waiting...", new Object[0]);
            _lock.wait();
            getNextPartition();
_L7:
            TypeaheadCacheDownloader._currentPartition = Preferences.persisted().getInt("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", 0);
            TypeaheadCacheDownloader._currentPartition++;
            JVM INSTR pop ;
            Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", TypeaheadCacheDownloader._currentPartition);
            continue; /* Loop/switch isn't completed */
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
_L6:
            PLog.log((new StringBuilder("Cache downlaod failed partition: ")).append(TypeaheadCacheDownloader._currentPartition).toString(), new Object[0]);
              goto _L4
            Exception exception2;
            exception2;
            getNextPartition();
              goto _L7
            Exception exception1;
            exception1;
            getNextPartition();
            throw exception1;
_L2:
            PLog.log("Download task exiting and closing service! No more downloads!", new Object[0]);
            Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", 0);
            Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_READY", true);
            if (_hostService != null)
            {
                _hostService.onWorkerComplete();
                _hostService = null;
            }
            obj;
            JVM INSTR monitorexit ;
            return;
            if (true) goto _L9; else goto _L8
_L8:
        }

        _cls1()
        {
            this$0 = TypeaheadCacheDownloader.this;
            super();
        }
    }

}
