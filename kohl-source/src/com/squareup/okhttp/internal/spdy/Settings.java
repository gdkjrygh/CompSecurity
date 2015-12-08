// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;


final class Settings
{

    static final int CLIENT_CERTIFICATE_VECTOR_SIZE = 8;
    static final int COUNT = 10;
    static final int CURRENT_CWND = 5;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 0x10000;
    static final int DOWNLOAD_BANDWIDTH = 2;
    static final int DOWNLOAD_RETRANS_RATE = 6;
    static final int FLAG_CLEAR_PREVIOUSLY_PERSISTED_SETTINGS = 1;
    static final int FLOW_CONTROL_OPTIONS = 9;
    static final int FLOW_CONTROL_OPTIONS_DISABLED = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int PERSISTED = 2;
    static final int PERSIST_VALUE = 1;
    static final int ROUND_TRIP_TIME = 3;
    static final int UPLOAD_BANDWIDTH = 1;
    private int persistValue;
    private int persisted;
    private int set;
    private final int values[] = new int[10];

    Settings()
    {
    }

    int flags(int i)
    {
        int j = 0;
        if (isPersisted(i))
        {
            j = 0 | 2;
        }
        int k = j;
        if (persistValue(i))
        {
            k = j | 1;
        }
        return k;
    }

    int get(int i)
    {
        return values[i];
    }

    int getClientCertificateVectorSize(int i)
    {
        if ((set & 0x100) != 0)
        {
            i = values[8];
        }
        return i;
    }

    int getCurrentCwnd(int i)
    {
        if ((set & 0x20) != 0)
        {
            i = values[5];
        }
        return i;
    }

    int getDownloadBandwidth(int i)
    {
        if ((set & 4) != 0)
        {
            i = values[2];
        }
        return i;
    }

    int getDownloadRetransRate(int i)
    {
        if ((set & 0x40) != 0)
        {
            i = values[6];
        }
        return i;
    }

    int getInitialWindowSize(int i)
    {
        if ((set & 0x80) != 0)
        {
            i = values[7];
        }
        return i;
    }

    int getMaxConcurrentStreams(int i)
    {
        if ((set & 0x10) != 0)
        {
            i = values[4];
        }
        return i;
    }

    int getRoundTripTime(int i)
    {
        if ((set & 8) != 0)
        {
            i = values[3];
        }
        return i;
    }

    int getUploadBandwidth(int i)
    {
        if ((set & 2) != 0)
        {
            i = values[1];
        }
        return i;
    }

    boolean isFlowControlDisabled()
    {
        boolean flag = false;
        int i;
        if ((set & 0x200) != 0)
        {
            i = values[9];
        } else
        {
            i = 0;
        }
        if ((i & 1) != 0)
        {
            flag = true;
        }
        return flag;
    }

    boolean isPersisted(int i)
    {
        return (persisted & 1 << i) != 0;
    }

    boolean isSet(int i)
    {
        return (set & 1 << i) != 0;
    }

    void merge(Settings settings)
    {
        int i = 0;
        while (i < 10) 
        {
            if (settings.isSet(i))
            {
                set(i, settings.flags(i), settings.get(i));
            }
            i++;
        }
    }

    boolean persistValue(int i)
    {
        return (persistValue & 1 << i) != 0;
    }

    void set(int i, int j, int k)
    {
        if (i >= values.length)
        {
            return;
        }
        int l = 1 << i;
        set = set | l;
        if ((j & 1) != 0)
        {
            persistValue = persistValue | l;
        } else
        {
            persistValue = persistValue & ~l;
        }
        if ((j & 2) != 0)
        {
            persisted = persisted | l;
        } else
        {
            persisted = persisted & ~l;
        }
        values[i] = k;
    }

    int size()
    {
        return Integer.bitCount(set);
    }
}
