// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import com.google.android.libraries.translate.f;

public class OfflineTranslationException extends Exception
{

    public static final String CAUSE_FILE_TYPE_C2C = "c2c";
    public static final String CAUSE_FILE_TYPE_CONFIG = "config";
    public static final String CAUSE_NOT_MOUNTED = "notMounted";
    public static final String CAUSE_NULL = "";
    public static final String CAUSE_NULL_PATH = "nullPath";
    public static final int ERROR_DECODER_FATAL = -5002;
    public static final int ERROR_DECODER_WARNING = -5003;
    public static final int ERROR_IO = -5001;
    public static final int ERROR_STORAGE_INACCESSIBLE = -5004;
    private final String mCauseCode;
    private final int mErrorCode;
    private final int mMajorVersion;
    private final int mRevision;

    public OfflineTranslationException(int i, String s)
    {
        mErrorCode = i;
        mCauseCode = s;
        mMajorVersion = -1;
        mRevision = -1;
    }

    public OfflineTranslationException(String s, String s1, int i, String s2, int j, int k)
    {
        mErrorCode = i;
        mCauseCode = s2;
        mMajorVersion = j;
        mRevision = k;
    }

    public OfflineTranslationException(String s, String s1, int i, String s2, int j, int k, Exception exception)
    {
        super(exception);
        mErrorCode = i;
        mCauseCode = s2;
        mMajorVersion = j;
        mRevision = k;
    }

    public static String getCauseForLangPair(String s, String s1, String s2)
    {
        return (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append("-").append(s1).append("-").append(s2).toString();
    }

    public String getCauseCode()
    {
        return mCauseCode;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public String getErrorMessage(Context context)
    {
        mErrorCode;
        JVM INSTR tableswitch -5004 -5004: default 24
    //                   -5004 34;
           goto _L1 _L2
_L1:
        int i = f.msg_translation_error;
_L4:
        return context.getString(i);
_L2:
        i = f.msg_external_storage_inaccessible;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getMajorVersion()
    {
        return mMajorVersion;
    }

    public int getRevision()
    {
        return mRevision;
    }
}
