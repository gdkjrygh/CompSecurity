// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.quantcast.measurement.service:
//            QCDatabaseDAO, QCDataUploader, QCPolicy, QCEvent, 
//            QCLog, QCMeasurement

class QCDataManager
{

    static final int DEFAULT_UPLOAD_EVENT_COUNT = 25;
    private static final int MAX_UPLOAD_SIZE = 200;
    private static final int MIN_UPLOAD_SIZE = 3;
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCDataManager);
    private final QCDatabaseDAO m_database;
    private long m_eventCount;
    private boolean m_isUploading;
    private int m_maxUploadCount;
    private int m_uploadCount;
    private final QCDataUploader m_uploader = new QCDataUploader();

    QCDataManager(Context context)
    {
        m_database = new QCDatabaseDAO(context);
        m_uploadCount = 25;
        m_maxUploadCount = 200;
        m_eventCount = m_database.numberOfEvents();
        m_isUploading = false;
    }

    QCDatabaseDAO getDataBase()
    {
        return m_database;
    }

    long getEventCount()
    {
        return m_eventCount;
    }

    void postEvent(QCEvent qcevent, QCPolicy qcpolicy)
    {
        if (qcpolicy == null || !qcpolicy.isBlackedOut()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        boolean flag;
        flag = qcevent.shouldForceUpload();
        i = 0;
        int j = m_database.writeEvents(Arrays.asList(new QCEvent[] {
            qcevent
        }));
        i = j;
_L4:
        if (i > 0)
        {
            m_eventCount = m_eventCount + (long)i;
            QCLog.i(TAG, (new StringBuilder()).append("Successfully wrote ").append(i).append(" events! total: ").append(m_eventCount).toString());
            if (qcpolicy != null && QCMeasurement.INSTANCE.isConnected() && (flag || m_eventCount >= (long)m_uploadCount))
            {
                uploadEvents(qcpolicy);
                return;
            }
        } else
        {
            QCLog.w(TAG, "DB Write canceled or nothing written");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        qcevent;
        QCLog.e(TAG, "DB Write error", qcevent);
        m_database.deleteDB(QCMeasurement.INSTANCE.getAppContext());
          goto _L4
        qcevent;
        QCLog.e(TAG, "DB Write error", qcevent);
        System.gc();
          goto _L4
    }

    void setMaxUploadCount(int i)
    {
        m_maxUploadCount = Math.max(3, i);
    }

    void setUploadCount(int i)
    {
        m_uploadCount = Math.max(3, Math.min(m_maxUploadCount, i));
    }

    void uploadEvents(QCPolicy qcpolicy)
    {
        if (!qcpolicy.policyIsLoaded() || qcpolicy.isBlackedOut() || m_isUploading) goto _L2; else goto _L1
_L1:
        QCPolicy qcpolicy1;
        QCPolicy qcpolicy2;
        QCPolicy qcpolicy3;
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        boolean flag1;
        boolean flag2;
        long l1;
        m_isUploading = true;
        QCLog.i(TAG, "Starting upload...");
        l1 = System.currentTimeMillis();
        flag = false;
        flag1 = false;
        flag2 = false;
        i = 0;
        obj1 = null;
        obj2 = null;
        obj = null;
        j = ((flag) ? 1 : 0);
        qcpolicy1 = obj;
        k = ((flag1) ? 1 : 0);
        qcpolicy2 = obj1;
        l = ((flag2) ? 1 : 0);
        qcpolicy3 = obj2;
        android.database.sqlite.SQLiteDatabase sqlitedatabase = m_database.getWritableDatabase();
        j = ((flag) ? 1 : 0);
        qcpolicy1 = obj;
        k = ((flag1) ? 1 : 0);
        qcpolicy2 = obj1;
        l = ((flag2) ? 1 : 0);
        qcpolicy3 = obj2;
        List list = m_database.getEvents(sqlitedatabase, m_maxUploadCount, qcpolicy);
        j = ((flag) ? 1 : 0);
        qcpolicy1 = obj;
        k = ((flag1) ? 1 : 0);
        qcpolicy2 = obj1;
        l = ((flag2) ? 1 : 0);
        qcpolicy3 = obj2;
        qcpolicy = m_uploader.synchronousUploadEvents(list);
        if (qcpolicy == null) goto _L4; else goto _L3
_L3:
        j = ((flag) ? 1 : 0);
        qcpolicy1 = qcpolicy;
        k = ((flag1) ? 1 : 0);
        qcpolicy2 = qcpolicy;
        l = ((flag2) ? 1 : 0);
        qcpolicy3 = qcpolicy;
        if (!m_database.removeEvents(sqlitedatabase, list)) goto _L6; else goto _L5
_L5:
        j = ((flag) ? 1 : 0);
        qcpolicy1 = qcpolicy;
        k = ((flag1) ? 1 : 0);
        qcpolicy2 = qcpolicy;
        l = ((flag2) ? 1 : 0);
        qcpolicy3 = qcpolicy;
        i = list.size();
        j = i;
        qcpolicy1 = qcpolicy;
        k = i;
        qcpolicy2 = qcpolicy;
        l = i;
        qcpolicy3 = qcpolicy;
        QCLog.i(TAG, (new StringBuilder()).append("Successfully upload ").append(i).append(" events!").toString());
_L9:
        m_database.close();
_L7:
        if (i > 0)
        {
            m_eventCount = Math.max(0L, m_eventCount - (long)i);
            QCMeasurement.INSTANCE.logLatency(qcpolicy, System.currentTimeMillis() - l1);
        } else
        {
            QCLog.w(TAG, "DB upload canceled or nothing removed");
        }
        m_isUploading = false;
_L2:
        return;
_L6:
        j = ((flag) ? 1 : 0);
        qcpolicy1 = qcpolicy;
        k = ((flag1) ? 1 : 0);
        qcpolicy2 = qcpolicy;
        l = ((flag2) ? 1 : 0);
        qcpolicy3 = qcpolicy;
        QCLog.e(TAG, (new StringBuilder()).append("Failed to remove ").append(list.size()).append(" events").toString());
        continue; /* Loop/switch isn't completed */
        qcpolicy;
        m_database.deleteDB(QCMeasurement.INSTANCE.getAppContext());
        QCLog.e(TAG, "DB upload error", qcpolicy);
        m_database.close();
        i = j;
        qcpolicy = qcpolicy1;
          goto _L7
_L4:
        j = ((flag) ? 1 : 0);
        qcpolicy1 = qcpolicy;
        k = ((flag1) ? 1 : 0);
        qcpolicy2 = qcpolicy;
        l = ((flag2) ? 1 : 0);
        qcpolicy3 = qcpolicy;
        QCLog.e(TAG, (new StringBuilder()).append("Failed to upload ").append(list.size()).append(" events").toString());
        continue; /* Loop/switch isn't completed */
        qcpolicy;
        QCLog.e(TAG, "DB upload error", qcpolicy);
        System.gc();
        m_database.close();
        i = k;
        qcpolicy = qcpolicy2;
          goto _L7
        qcpolicy;
        QCLog.e(TAG, "DB upload error", qcpolicy);
        m_database.close();
        i = l;
        qcpolicy = qcpolicy3;
          goto _L7
        qcpolicy;
        m_database.close();
        throw qcpolicy;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
