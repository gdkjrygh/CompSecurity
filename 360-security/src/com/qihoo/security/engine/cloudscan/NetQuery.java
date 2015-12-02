// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;

import android.content.Context;

// Referenced classes of package com.qihoo.security.engine.cloudscan:
//            ICloudHttpClient, b, CloudHttpClient, QueryItem

public class NetQuery
{

    public static final long APKQF_AD = 2L;
    public static final long APKQF_CA = 128L;
    public static final long APKQF_CLEAN = 16L;
    public static final long APKQF_EC = 256L;
    public static final long APKQF_HIPS = 1L;
    public static final long APKQF_PAY = 64L;
    public static final long APKQF_POWER = 8L;
    public static final long APKQF_PREINSTALL = 32L;
    public static final long APKQF_ROOT = 4L;
    public static final String CLOUD_HDR_CHANNEL_ID = "3";
    public static final String CLOUD_HDR_CLIENT_VER = "4";
    public static final String CLOUD_HDR_CONNECT_TYPE = "9";
    public static final String CLOUD_HDR_EXT = "12";
    public static final String CLOUD_HDR_IMEI = "1";
    public static final String CLOUD_HDR_LANG = "10";
    public static final String CLOUD_HDR_MANUFACTURER = "5";
    public static final String CLOUD_HDR_MODEL = "6";
    public static final String CLOUD_HDR_OS_VER = "8";
    public static final String CLOUD_HDR_PRODUCT_ID = "11";
    public static final String CLOUD_HDR_RULE_GROUP_ID = "13";
    public static final String CLOUD_HDR_SDK_VER = "7";
    public static final String CLOUD_HDR_UIVERSION = "2";
    public static final String COMMON_OPTIONS[] = {
        "1", "2", "3", "4", "5", "6", "7", "8", "10", "11", 
        "201", "208", "13", "5000", "200", "300", "12"
    };
    public static int ERR_LOAD_JNI_FAIL = 0;
    private static final int FEATURE_TYPE_MFSHA1 = 1;
    public static final String OPT_CACHE_DB = "202";
    public static final String OPT_CHECK_MASTER_KEY = "205";
    public static final String OPT_CLEAN_URL = "300";
    public static final String OPT_CLOUDENG_TIMEOUT_MS = "5000";
    public static final String OPT_CLOUD_SERVER = "201";
    public static final String OPT_EVAL_MD5 = "209";
    public static final String OPT_MASTKEY_ZIP_ITEMS = "206";
    public static final String OPT_MASTKEY_ZIP_SIZE = "207";
    public static final String OPT_REQUEST_FLAGS = "210";
    public static final String OPT_SECONDARY_URL = "208";
    public static final String OPT_USER_INFO = "204";
    public static final String OPT_V5_SERVER = "200";
    public static final int REGISTER_ACITVED = 1;
    public static final int REGISTER_CONFIG_ERROR = -1;
    public static final int REGISTER_EXPIRED = 2;
    public static final int REGISTER_NOT_ACITVED = 0;
    public static final int REGISTER_UNKNOWN_ERROR = -2;
    private static final String TAG = "NetQuery";
    public static final int V5UPDATE_BAD_ERRCODE = -9;
    public static final int V5UPDATE_BAD_INI_FORMAT = -5;
    public static final int V5UPDATE_BAD_INI_LEN = -6;
    public static final int V5UPDATE_BAD_NEW_V5HDR = -4;
    public static final int V5UPDATE_BAD_PARAMS = -2;
    public static final int V5UPDATE_BAD_UV_VER = -7;
    public static final int V5UPDATE_EMPTY_INI = -8;
    public static final int V5UPDATE_JNI_ERROR = -10;
    public static final int V5UPDATE_NET_ERROR = -3;
    public static final int V5UPDATE_OK = 0;
    public static final int V5UPDATE_UNKNOWN_ERROR = -1;
    final Context mContext;
    private ICloudHttpClient mHttpClient;
    private int m_queryHandle;

    public NetQuery(Context context)
    {
        mHttpClient = null;
        mContext = context;
        try
        {
            m_queryHandle = nt1();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            m_queryHandle = 0;
        }
    }

    public static int GetFgprint(String s, byte abyte0[])
    {
        int i;
        try
        {
            i = nt10(s, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ERR_LOAD_JNI_FAIL;
        }
        return i;
    }

    public static byte[] GetMfsha1(String s)
    {
        Object aobj[] = new Object[1];
        if (nt12(s, 1, aobj) == 0) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        aobj = (byte[])aobj[0];
        if (aobj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (aobj));
        if (aobj.length == 20) goto _L4; else goto _L3
_L3:
        return null;
    }

    private native int nt1();

    private static native int nt10(String s, byte abyte0[]);

    private static native int nt12(String s, int i, Object aobj[]);

    private native int nt2(int i);

    private native int nt3(int i, String s, Object obj);

    private native int nt4(int i, byte abyte0[][], int j);

    private native int nt5(int i);

    private native int nt6(int i, String s, int j, String as[]);

    private native int nt7(int i, String s, int j);

    private native int nt8();

    private native int nt9(int i, String s, int j);

    public int Cancel()
    {
        if (m_queryHandle == 0)
        {
            return -1;
        }
        if (mHttpClient != null)
        {
            mHttpClient.Cancel();
        }
        return nt5(m_queryHandle);
    }

    public boolean Destroy()
    {
        while (m_queryHandle == 0 || nt2(m_queryHandle) != 0) 
        {
            return false;
        }
        return true;
    }

    public int GetCloudConfig(String s, int i)
    {
        if (m_queryHandle == 0)
        {
            return -1;
        } else
        {
            return nt9(m_queryHandle, s, i);
        }
    }

    public int IsRegister()
    {
        if (m_queryHandle == 0)
        {
            return -2;
        } else
        {
            return nt8();
        }
    }

    public int Query(QueryItem aqueryitem[], int i)
    {
        byte abyte0[][];
        if (m_queryHandle != 0)
        {
            if ((abyte0 = b.a(aqueryitem, false)) != null && (i = nt4(m_queryHandle, abyte0, i)) != -1)
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

    public int Register(String s, int i)
    {
        if (m_queryHandle == 0)
        {
            return -2;
        } else
        {
            return nt7(m_queryHandle, s, i);
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

    public boolean SetOption(String s, Object obj)
    {
        while (m_queryHandle == 0 || nt3(m_queryHandle, s, obj) != 0) 
        {
            return false;
        }
        return true;
    }

    public void SetRequestCallback(ICloudHttpClient icloudhttpclient)
    {
        mHttpClient = icloudhttpclient;
    }

    public int V5Update(String s, int i, String as[])
    {
        if (m_queryHandle == 0)
        {
            return -2;
        } else
        {
            return nt6(m_queryHandle, s, i, as);
        }
    }

    static 
    {
        ERR_LOAD_JNI_FAIL = -110;
    }
}
