// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;

import android.content.Context;

// Referenced classes of package com.qihoo.security.engine.cloudscan:
//            b, CloudHttpClient, ICloudHttpClient, QueryItem

public class CacheQuery
{

    public static int CQERR_DB_NOT_OPEN = 0;
    public static int CQERR_ERRNO = 0;
    public static int CQERR_INVALID_ARGS = 0;
    public static int CQERR_OK = 0;
    public static int CQERR_OPEN_PRIVACY_FILE = 0;
    public static int CQERR_PRVDATA_IMPORT_BASE = 0;
    public static int CQERR_PRVDATA_IMPORT_INC = 0;
    public static int CQERR_PRVDATA_UPTODATE = 0;
    public static int CQERR_PRVDATA_VER_LOG = 0;
    public static int CQERR_QUERY_FAIL = 0;
    public static final int ERR_LOAD_JNI_FAIL = -110;
    public static final String G_OPTION_ANDROID_ID = "3";
    public static final String G_OPTION_ANDROID_SERIAL = "2";
    public static final String G_OPTION_CPUID = "1";
    public static final String G_OPTION_IMEI = "0";
    public static final String G_OPTION_IMSI = "5";
    public static final String G_OPTION_MAC = "4";
    public static final String OPTION_CLOUD_CONF_EXPIRED = "2";
    public static final String OPTION_CLOUD_PLAN = "1";
    public static final String OPTION_CLOUD_SCAN = "0";
    public static final String OPTION_PRIVACY_DATA_VER = "3";
    private static final String TAG = "CacheQuery";
    private final Context mContext;
    private ICloudHttpClient mHttpClient;
    private int m_queryHandle;

    public CacheQuery(Context context)
    {
        mHttpClient = null;
        m_queryHandle = 0;
        mContext = context;
    }

    public static int SetGlobalOption(String s, Object obj)
    {
        int i;
        try
        {
            i = nt9(s, obj);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -110;
        }
        return i;
    }

    private native int nt1(String s, long l);

    private native int nt2(int i);

    private native int nt3(int i, String s, Object obj);

    private native int nt4(int i, byte abyte0[][]);

    private native String nt5(int i, String s);

    private native int nt6(int i, String s);

    private native int nt7(int i, String s, int j);

    private native int nt8(int i, String as[], long al[], long al1[]);

    private static native int nt9(String s, Object obj);

    public boolean Create(String s, long l)
    {
        if (m_queryHandle == 0)
        {
            int i;
            try
            {
                m_queryHandle = nt1(s, l);
                i = m_queryHandle;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            if (i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public boolean Destroy()
    {
        while (m_queryHandle == 0 || nt2(m_queryHandle) != 0) 
        {
            return false;
        }
        return true;
    }

    public String GetOption(String s)
    {
        if (m_queryHandle == 0)
        {
            return null;
        } else
        {
            return nt5(m_queryHandle, s);
        }
    }

    public int ImportPrivacyData(String s, int i)
    {
        if (m_queryHandle == 0)
        {
            return -1;
        } else
        {
            return nt7(m_queryHandle, s, i);
        }
    }

    public int Query(QueryItem aqueryitem[])
    {
        byte abyte0[][];
        int i;
        if (m_queryHandle != 0)
        {
            if ((abyte0 = b.a(aqueryitem, true)) != null && (i = nt4(m_queryHandle, abyte0)) > 0)
            {
                if (!b.a(aqueryitem, abyte0))
                {
                    i = -1;
                }
                return i;
            }
        }
        return -1;
    }

    public int QueryPrivacy(String as[], long al[], long al1[])
    {
        if (m_queryHandle == 0)
        {
            return CQERR_INVALID_ARGS;
        }
        if (as.length != al.length || as.length != al1.length)
        {
            return CQERR_INVALID_ARGS;
        } else
        {
            return nt8(m_queryHandle, as, al, al1);
        }
    }

    public byte[] RequestCallback(String s, String s1, byte abyte0[], int i, int ai[])
    {
        if (mHttpClient == null)
        {
            mHttpClient = new CloudHttpClient(mContext);
        }
        return mHttpClient.RequestCallback(s, s1, abyte0, i, ai);
    }

    public int Revoke(String s)
    {
        if (m_queryHandle == 0)
        {
            return -1;
        } else
        {
            return nt6(m_queryHandle, s);
        }
    }

    public boolean SetOption(String s, Object obj)
    {
        while (m_queryHandle == 0 || nt3(m_queryHandle, s, obj) != 0) 
        {
            return false;
        }
        return true;
    }

    static 
    {
        CQERR_OK = 0;
        CQERR_DB_NOT_OPEN = -1;
        CQERR_ERRNO = -2;
        CQERR_OPEN_PRIVACY_FILE = -3;
        CQERR_PRVDATA_UPTODATE = -4;
        CQERR_PRVDATA_VER_LOG = -5;
        CQERR_PRVDATA_IMPORT_BASE = -6;
        CQERR_PRVDATA_IMPORT_INC = -7;
        CQERR_INVALID_ARGS = -8;
        CQERR_QUERY_FAIL = -9;
    }
}
