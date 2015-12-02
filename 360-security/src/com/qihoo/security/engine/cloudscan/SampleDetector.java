// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;


// Referenced classes of package com.qihoo.security.engine.cloudscan:
//            ICloudHttpClient

public class SampleDetector
{

    public static final int E_DETECTION_CANCELLED = -3;
    public static final int E_DETECTION_OK = 0;
    public static final int E_DETECTION_UNINITTED = -2;
    public static final int E_DETECTION_UNKNOWN = -1;
    public static final int E_LOAD_JNI = -110;
    public static final int E_UPLOAD_TOKEN_REJECT = -19;
    public static final String OPT_DETECTION_CLINET_ID = "806";
    public static final String OPT_DETECTION_FILE_TYPE = "804";
    public static final String OPT_DETECTION_SERVER = "800";
    public static final String OPT_DETECTION_TIMEOUT = "802";
    public static final String OPT_DETECTION_TMP_PATH = "805";
    public static final String OPT_DETECTION_TOKEN_SERVER = "801";
    public static final String OPT_DETECTION_TOKEN_TIMEOUT = "803";
    public static final String OPT_LIMIT = "701";
    public static final String OPT_SYSTEM = "702";
    public static final String OPT_UPLOAD_APP_FLAGS = "813";
    public static final String OPT_UPLOAD_APP_LABEL = "811";
    public static final String OPT_UPLOAD_EVAL_MODE = "807";
    public static final String OPT_UPLOAD_EVAL_THRESHOLD = "808";
    public static final String OPT_UPLOAD_LOG_SERVER = "814";
    public static final String OPT_UPLOAD_PKG_NAME = "810";
    public static final String OPT_UPLOAD_SIGN_CORP = "812";
    public static final String OPT_UPLOAD_VERSION_CODE = "809";
    private int mDetectorHandle;
    private ICloudHttpClient mHttpClient;

    public SampleDetector()
    {
        mHttpClient = null;
        mDetectorHandle = 0;
    }

    public static void CloseMappingHandle(long l)
    {
        try
        {
            ntCloseMappingHandle(l);
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    public static long[] CreateCodeMapping(String s, String s1, long l)
    {
        try
        {
            s = ntCreateCodeMapping(s, s1, l);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static int OpenDatabase(String s, String s1, String s2)
    {
        int i;
        try
        {
            i = ntOpenDatabase(s, s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -110;
        }
        return i;
    }

    private native int ntCancel(int i);

    private static native void ntCloseMappingHandle(long l);

    private native int ntCreate(String s);

    private static native long[] ntCreateCodeMapping(String s, String s1, long l);

    private native void ntDestroy(int i);

    private native int ntDoDetection(int i);

    private static native int ntOpenDatabase(String s, String s1, String s2);

    private native int ntSetHttpClient(int i, Object obj);

    private native int ntSetOption(int i, String s, String s1);

    public int Cancel()
    {
        if (mDetectorHandle == 0)
        {
            return -2;
        }
        if (mHttpClient != null)
        {
            mHttpClient.Cancel();
        }
        return ntCancel(mDetectorHandle);
    }

    public int Create(String s)
    {
        int i;
        try
        {
            i = ntCreate(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mDetectorHandle = 0;
            return -110;
        }
        if (i == 0)
        {
            return -1;
        } else
        {
            mDetectorHandle = i;
            return 0;
        }
    }

    public void Destroy()
    {
        if (mDetectorHandle != 0)
        {
            ntDestroy(mDetectorHandle);
        }
    }

    public int DoDetection()
    {
        if (mDetectorHandle == 0)
        {
            return -2;
        } else
        {
            return ntDoDetection(mDetectorHandle);
        }
    }

    public int SetHttpClient(ICloudHttpClient icloudhttpclient)
    {
        int i;
        if (mDetectorHandle == 0)
        {
            i = -2;
        } else
        {
            int j = ntSetHttpClient(mDetectorHandle, icloudhttpclient);
            i = j;
            if (j == 0)
            {
                mHttpClient = icloudhttpclient;
                return j;
            }
        }
        return i;
    }

    public int SetOption(String s, String s1)
    {
        if (mDetectorHandle == 0)
        {
            return -2;
        } else
        {
            return ntSetOption(mDetectorHandle, s, s1);
        }
    }
}
