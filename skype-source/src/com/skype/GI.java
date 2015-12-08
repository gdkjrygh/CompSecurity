// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Setup, NativeStringConvert

public interface GI
{
    public static final class CONNSTATUS extends Enum
    {

        private static final CONNSTATUS $VALUES[];
        public static final CONNSTATUS CONNECTING;
        public static final CONNSTATUS OFFLINE;
        public static final CONNSTATUS ONLINE;
        public static final CONNSTATUS PAUSING;
        public static final CONNSTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONNSTATUS fromInt(int i)
        {
            CONNSTATUS connstatus = (CONNSTATUS)intToTypeMap.a(i);
            if (connstatus != null)
            {
                return connstatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONNSTATUS valueOf(String s)
        {
            return (CONNSTATUS)Enum.valueOf(com/skype/GI$CONNSTATUS, s);
        }

        public static CONNSTATUS[] values()
        {
            return (CONNSTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            OFFLINE = new CONNSTATUS("OFFLINE", 0, 0);
            CONNECTING = new CONNSTATUS("CONNECTING", 1, 1);
            PAUSING = new CONNSTATUS("PAUSING", 2, 2);
            ONLINE = new CONNSTATUS("ONLINE", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new CONNSTATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new CONNSTATUS[] {
                OFFLINE, CONNECTING, PAUSING, ONLINE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONNSTATUS aconnstatus[] = values();
            int k = aconnstatus.length;
            for (int i = 0; i < k; i++)
            {
                CONNSTATUS connstatus = aconnstatus[i];
                intToTypeMap.a(connstatus.value, connstatus);
            }

        }

        private CONNSTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class FILEERROR extends Enum
    {

        private static final FILEERROR $VALUES[];
        public static final FILEERROR CREATE_ERROR;
        public static final FILEERROR DISK_FULL;
        public static final FILEERROR NO_FILEERROR;
        public static final FILEERROR OPEN_ERROR;
        public static final FILEERROR READ_ERROR;
        public static final FILEERROR WRAPPER_UNKNOWN_VALUE;
        public static final FILEERROR WRITE_ERROR;
        private static final j intToTypeMap;
        private final int value;

        public static FILEERROR fromInt(int i)
        {
            FILEERROR fileerror = (FILEERROR)intToTypeMap.a(i);
            if (fileerror != null)
            {
                return fileerror;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static FILEERROR valueOf(String s)
        {
            return (FILEERROR)Enum.valueOf(com/skype/GI$FILEERROR, s);
        }

        public static FILEERROR[] values()
        {
            return (FILEERROR[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NO_FILEERROR = new FILEERROR("NO_FILEERROR", 0, 0);
            DISK_FULL = new FILEERROR("DISK_FULL", 1, 1);
            CREATE_ERROR = new FILEERROR("CREATE_ERROR", 2, 2);
            OPEN_ERROR = new FILEERROR("OPEN_ERROR", 3, 3);
            READ_ERROR = new FILEERROR("READ_ERROR", 4, 4);
            WRITE_ERROR = new FILEERROR("WRITE_ERROR", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new FILEERROR("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new FILEERROR[] {
                NO_FILEERROR, DISK_FULL, CREATE_ERROR, OPEN_ERROR, READ_ERROR, WRITE_ERROR, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            FILEERROR afileerror[] = values();
            int k = afileerror.length;
            for (int i = 0; i < k; i++)
            {
                FILEERROR fileerror = afileerror[i];
                intToTypeMap.a(fileerror.value, fileerror);
            }

        }

        private FILEERROR(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface GIIListener
    {

        public abstract void onConnStatusChange(GI gi, CONNSTATUS connstatus);

        public abstract void onFileError(GI gi, FILEERROR fileerror);

        public abstract void onLibStatusChange(GI gi, LIBSTATUS libstatus);

        public abstract void onNodeinfoChange(GI gi, byte abyte0[]);

        public abstract void onProxyAuthenticationFailure(GI gi, PROXYTYPE proxytype);
    }

    public static class GetLastFileError_Result
    {

        public String m_filename;
        public int m_lowlevelCode;
        public FILEERROR m_return;

        public void init(int i, byte abyte0[], FILEERROR fileerror)
        {
            m_lowlevelCode = i;
            m_filename = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = fileerror;
        }

        public GetLastFileError_Result()
        {
        }
    }

    public static final class LIBSTATUS extends Enum
    {

        private static final LIBSTATUS $VALUES[];
        public static final LIBSTATUS CONSTRUCTED;
        public static final LIBSTATUS FATAL_ERROR;
        public static final LIBSTATUS RUNNING;
        public static final LIBSTATUS STARTING;
        public static final LIBSTATUS STOPPED;
        public static final LIBSTATUS STOPPING;
        public static final LIBSTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LIBSTATUS fromInt(int i)
        {
            LIBSTATUS libstatus = (LIBSTATUS)intToTypeMap.a(i);
            if (libstatus != null)
            {
                return libstatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LIBSTATUS valueOf(String s)
        {
            return (LIBSTATUS)Enum.valueOf(com/skype/GI$LIBSTATUS, s);
        }

        public static LIBSTATUS[] values()
        {
            return (LIBSTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CONSTRUCTED = new LIBSTATUS("CONSTRUCTED", 0, 0);
            STARTING = new LIBSTATUS("STARTING", 1, 1);
            RUNNING = new LIBSTATUS("RUNNING", 2, 2);
            STOPPING = new LIBSTATUS("STOPPING", 3, 3);
            STOPPED = new LIBSTATUS("STOPPED", 4, 4);
            FATAL_ERROR = new LIBSTATUS("FATAL_ERROR", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new LIBSTATUS("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new LIBSTATUS[] {
                CONSTRUCTED, STARTING, RUNNING, STOPPING, STOPPED, FATAL_ERROR, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LIBSTATUS alibstatus[] = values();
            int k = alibstatus.length;
            for (int i = 0; i < k; i++)
            {
                LIBSTATUS libstatus = alibstatus[i];
                intToTypeMap.a(libstatus.value, libstatus);
            }

        }

        private LIBSTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class NETWORKACTIVITYLEVEL extends Enum
    {

        private static final NETWORKACTIVITYLEVEL $VALUES[];
        public static final NETWORKACTIVITYLEVEL NAL_FIRST_QUIET_LEVEL;
        public static final NETWORKACTIVITYLEVEL NAL_LAST_LEVEL_DONT_USE;
        public static final NETWORKACTIVITYLEVEL NAL_NORMAL_LEVEL;
        public static final NETWORKACTIVITYLEVEL NAL_QUIET_SUSPENDED_LEVEL;
        public static final NETWORKACTIVITYLEVEL NAL_QUIET_SUSPENDED_OFFLINE_LEVEL;
        public static final NETWORKACTIVITYLEVEL NAL_QUIET_WITH_NETWORK_LEVEL;
        public static final NETWORKACTIVITYLEVEL WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static NETWORKACTIVITYLEVEL fromInt(int i)
        {
            NETWORKACTIVITYLEVEL networkactivitylevel = (NETWORKACTIVITYLEVEL)intToTypeMap.a(i);
            if (networkactivitylevel != null)
            {
                return networkactivitylevel;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static NETWORKACTIVITYLEVEL valueOf(String s)
        {
            return (NETWORKACTIVITYLEVEL)Enum.valueOf(com/skype/GI$NETWORKACTIVITYLEVEL, s);
        }

        public static NETWORKACTIVITYLEVEL[] values()
        {
            return (NETWORKACTIVITYLEVEL[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NAL_NORMAL_LEVEL = new NETWORKACTIVITYLEVEL("NAL_NORMAL_LEVEL", 0, 3);
            NAL_FIRST_QUIET_LEVEL = new NETWORKACTIVITYLEVEL("NAL_FIRST_QUIET_LEVEL", 1, 7);
            NAL_QUIET_WITH_NETWORK_LEVEL = new NETWORKACTIVITYLEVEL("NAL_QUIET_WITH_NETWORK_LEVEL", 2, 7);
            NAL_QUIET_SUSPENDED_LEVEL = new NETWORKACTIVITYLEVEL("NAL_QUIET_SUSPENDED_LEVEL", 3, 8);
            NAL_QUIET_SUSPENDED_OFFLINE_LEVEL = new NETWORKACTIVITYLEVEL("NAL_QUIET_SUSPENDED_OFFLINE_LEVEL", 4, 9);
            NAL_LAST_LEVEL_DONT_USE = new NETWORKACTIVITYLEVEL("NAL_LAST_LEVEL_DONT_USE", 5, 10);
            WRAPPER_UNKNOWN_VALUE = new NETWORKACTIVITYLEVEL("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new NETWORKACTIVITYLEVEL[] {
                NAL_NORMAL_LEVEL, NAL_FIRST_QUIET_LEVEL, NAL_QUIET_WITH_NETWORK_LEVEL, NAL_QUIET_SUSPENDED_LEVEL, NAL_QUIET_SUSPENDED_OFFLINE_LEVEL, NAL_LAST_LEVEL_DONT_USE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            NETWORKACTIVITYLEVEL anetworkactivitylevel[] = values();
            int k = anetworkactivitylevel.length;
            for (int i = 0; i < k; i++)
            {
                NETWORKACTIVITYLEVEL networkactivitylevel = anetworkactivitylevel[i];
                intToTypeMap.a(networkactivitylevel.value, networkactivitylevel);
            }

        }

        private NETWORKACTIVITYLEVEL(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PROXYTYPE extends Enum
    {

        private static final PROXYTYPE $VALUES[];
        public static final PROXYTYPE HTTPS_PROXY;
        public static final PROXYTYPE SOCKS_PROXY;
        public static final PROXYTYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PROXYTYPE fromInt(int i)
        {
            PROXYTYPE proxytype = (PROXYTYPE)intToTypeMap.a(i);
            if (proxytype != null)
            {
                return proxytype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PROXYTYPE valueOf(String s)
        {
            return (PROXYTYPE)Enum.valueOf(com/skype/GI$PROXYTYPE, s);
        }

        public static PROXYTYPE[] values()
        {
            return (PROXYTYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            HTTPS_PROXY = new PROXYTYPE("HTTPS_PROXY", 0, 0);
            SOCKS_PROXY = new PROXYTYPE("SOCKS_PROXY", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new PROXYTYPE("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new PROXYTYPE[] {
                HTTPS_PROXY, SOCKS_PROXY, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PROXYTYPE aproxytype[] = values();
            int k = aproxytype.length;
            for (int i = 0; i < k; i++)
            {
                PROXYTYPE proxytype = aproxytype[i];
                intToTypeMap.a(proxytype.value, proxytype);
            }

        }

        private PROXYTYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract void addListener(GIIListener giilistener);

    public abstract void connect();

    public abstract void disconnect();

    public abstract CONNSTATUS getConnStatus();

    public abstract String getDebugInfo();

    public abstract String getFatalErrorMessage();

    public abstract GetLastFileError_Result getLastFileError();

    public abstract LIBSTATUS getLibStatus();

    public abstract Setup getSetup();

    public abstract int getUsedPort();

    public abstract void log(String s, String s1);

    public abstract void pollEvents();

    public abstract void pollEvents(int i);

    public abstract void removeListener(GIIListener giilistener);

    public abstract void setDefaultPeers(String s);

    public abstract void setSystemID(long l);
}
