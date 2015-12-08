// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.internal;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;

public class SystemWrapper
{
    public static class Build
    {

        public static float getHDKBaseVersion()
        {
            return ((Float)SystemWrapper.invokePublicStaticMethod("android.os.Build", "getHDKBaseVersion", Float.valueOf(0.0F), null, null)).floatValue();
        }

        public Build()
        {
        }
    }

    public static class Environment
    {

        private static final File DEFAULT_PHONE_STORAGE_FILE = new File("/storage/emmc");
        private static final File DEFAULT_REMOVABLE_STORAGE_FILE = new File("/storage/ext_sd");
        public static final String MEDIA_MOUNTED = "mounted";
        public static final String MEDIA_REMOVED = "removed";

        public static File getExternalStorageDirectory()
        {
            return android.os.Environment.getExternalStorageDirectory();
        }

        public static String getExternalStorageState()
        {
            return android.os.Environment.getExternalStorageState();
        }

        public static File getPhoneStorageDirectory()
        {
            return (File)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "getPhoneStorageDirectory", DEFAULT_PHONE_STORAGE_FILE, null, null);
        }

        public static String getPhoneStorageState()
        {
            return (String)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "getPhoneStorageState", "removed", null, null);
        }

        public static File getRemovableStorageDirectory()
        {
            return (File)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "getRemovableStorageDirectory", DEFAULT_REMOVABLE_STORAGE_FILE, null, null);
        }

        public static String getRemovableStorageState()
        {
            return (String)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "getRemovableStorageState", "removed", null, null);
        }

        public static boolean hasPhoneStorage()
        {
            return ((Boolean)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "hasPhoneStorage", Boolean.valueOf(false), null, null)).booleanValue();
        }

        public static boolean hasRemovableStorageSlot()
        {
            return ((Boolean)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "hasRemovableStorageSlot", Boolean.valueOf(false), null, null)).booleanValue();
        }

        public static boolean isExternalStorageEmulated()
        {
            return android.os.Environment.isExternalStorageEmulated();
        }


        public Environment()
        {
        }
    }

    public static class HtcBuildFlag
    {

        public static final boolean Htc_DEBUG_flag = getHtcDebugFlag();
        private static boolean sIsDebug = false;
        private static boolean sIsSet = false;

        private static boolean getHtcDebugFlag()
        {
            if (!sIsSet)
            {
                sIsDebug = ((Boolean)SystemWrapper.getPublicStaticField("com.htc.htcjavaflag.HtcBuildFlag", "Htc_DEBUG_flag", Boolean.valueOf(false))).booleanValue();
                sIsSet = true;
            }
            return sIsDebug;
        }


        public HtcBuildFlag()
        {
        }
    }

    public static class HtcCustomizationManager
    {

        public static final int READER_TYPE_BINARY = 2;
        public static final int READER_TYPE_XML = 1;

        public HtcCustomizationReader getCustomizationReader(String s, int i, boolean flag)
        {
            return new HtcCustomizationReader(s, i, flag);
        }

        public HtcCustomizationManager()
        {
        }
    }

    public static class HtcCustomizationReader
    {

        private static final String CUSTOMIZATION_MANAGER_CLASSNAME = "com.htc.customization.HtcCustomizationManager";
        private static final String CUSTOMIZATION_MANAGER_METHOD_GETINSTANCE = "getInstance";
        private static final String CUSTOMIZATION_MANAGER_METHOD_GETREADER = "getCustomizationReader";
        private static final String CUSTOMIZATION_READER_CLASSNAME = "com.htc.customization.HtcCustomizationReader";
        private String mName;
        private boolean mNeedSimReady;
        private Class mReaderClazz;
        private Object mReaderInstance;
        private int mType;

        private Object invokeHtcCustomizationReaderMethod(String s, Object obj, Class aclass[], Object aobj[])
        {
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            obj4 = null;
            obj5 = null;
            obj6 = null;
            obj7 = null;
            obj8 = null;
            if (mReaderInstance != null && mReaderClazz != null) goto _L2; else goto _L1
_L1:
            Object obj1 = Class.forName("com.htc.customization.HtcCustomizationManager");
            Object obj3 = ((Class) (obj1)).getMethod("getInstance", (Class[])null).invoke(null, (Object[])null);
            Class class1 = ((Class) (obj1));
_L5:
            if (class1 != null && obj3 != null) goto _L4; else goto _L3
_L3:
            return obj;
            Object obj2;
            obj2;
            obj1 = null;
_L12:
            SystemWrapper.printStackTrace(((Throwable) (obj2)));
            obj3 = null;
            class1 = ((Class) (obj1));
              goto _L5
            obj2;
            obj1 = null;
_L11:
            SystemWrapper.printStackTrace(((Throwable) (obj2)));
            obj3 = null;
            class1 = ((Class) (obj1));
              goto _L5
            obj2;
            obj1 = null;
_L10:
            SystemWrapper.printStackTrace(((Throwable) (obj2)));
            obj3 = null;
            class1 = ((Class) (obj1));
              goto _L5
            obj2;
            obj1 = null;
_L9:
            SystemWrapper.printStackTrace(((Throwable) (obj2)));
            obj3 = null;
            class1 = ((Class) (obj1));
              goto _L5
            obj2;
            obj1 = null;
_L8:
            SystemWrapper.printStackTrace(((Throwable) (obj2)));
            obj3 = null;
            class1 = ((Class) (obj1));
              goto _L5
_L4:
            Method method = obj8;
            obj1 = class1.getMethod("getCustomizationReader", new Class[] {
                java/lang/String, Integer.TYPE, Boolean.TYPE
            });
            method = ((Method) (obj1));
            obj4 = obj1;
            obj5 = obj1;
            obj6 = obj1;
            obj7 = obj1;
            mReaderClazz = Class.forName("com.htc.customization.HtcCustomizationReader");
            method = ((Method) (obj1));
            obj4 = obj1;
            obj5 = obj1;
            obj6 = obj1;
            obj7 = obj1;
            try
            {
                mReaderInstance = ((Method) (obj1)).invoke(obj3, new Object[] {
                    mName, Integer.valueOf(mType), Boolean.valueOf(mNeedSimReady)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                obj1 = method;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                obj1 = obj4;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                obj1 = obj5;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                obj1 = obj6;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                obj1 = obj7;
            }
            method = ((Method) (obj1));
            if (obj1 != null) goto _L7; else goto _L6
_L6:
            obj4 = obj1;
            obj5 = obj1;
            obj6 = obj1;
            obj7 = obj1;
            method = class1.getMethod("getCustomizationReader", new Class[] {
                java/lang/String, Integer.TYPE
            });
            obj4 = method;
            obj5 = method;
            obj6 = method;
            obj7 = method;
            obj1 = method;
            mReaderClazz = Class.forName("com.htc.customization.HtcCustomizationReader");
            obj4 = method;
            obj5 = method;
            obj6 = method;
            obj7 = method;
            obj1 = method;
            try
            {
                mReaderInstance = method.invoke(obj3, new Object[] {
                    mName, Integer.valueOf(mType)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                method = ((Method) (obj4));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                method = ((Method) (obj5));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                method = ((Method) (obj6));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                SystemWrapper.printStackTrace(((Throwable) (obj1)));
                method = ((Method) (obj7));
            }
            // Misplaced declaration of an exception variable
            catch (Method method)
            {
                SystemWrapper.printStackTrace(method);
                method = ((Method) (obj1));
            }
_L7:
            if (method == null) goto _L3; else goto _L2
_L2:
            try
            {
                s = ((String) (mReaderClazz.getMethod(s, aclass).invoke(mReaderInstance, aobj)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                SystemWrapper.printStackTrace(s);
                return obj;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                SystemWrapper.printStackTrace(s);
                return obj;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                SystemWrapper.printStackTrace(s);
                return obj;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                SystemWrapper.printStackTrace(s);
                return obj;
            }
            return s;
            method;
              goto _L8
            method;
              goto _L9
            method;
              goto _L10
            method;
              goto _L11
            method;
              goto _L12
        }

        public boolean readBoolean(String s, boolean flag)
        {
            return ((Boolean)invokeHtcCustomizationReaderMethod("readBoolean", Boolean.valueOf(flag), new Class[] {
                java/lang/String, Boolean.TYPE
            }, new Object[] {
                s, Boolean.valueOf(flag)
            })).booleanValue();
        }

        public byte readByte(String s, byte byte0)
        {
            return ((Byte)invokeHtcCustomizationReaderMethod("readByte", Byte.valueOf(byte0), new Class[] {
                java/lang/String, Byte.TYPE
            }, new Object[] {
                s, Byte.valueOf(byte0)
            })).byteValue();
        }

        public int[] readIntArray(String s, int ai[])
        {
            return (int[])invokeHtcCustomizationReaderMethod("readIntArray", ai, new Class[] {
                java/lang/String, [I
            }, new Object[] {
                s, ai
            });
        }

        public int readInteger(String s, int i)
        {
            return ((Integer)invokeHtcCustomizationReaderMethod("readInteger", Integer.valueOf(i), new Class[] {
                java/lang/String, Integer.TYPE
            }, new Object[] {
                s, Integer.valueOf(i)
            })).intValue();
        }

        public String readString(String s, String s1)
        {
            return (String)invokeHtcCustomizationReaderMethod("readString", s1, new Class[] {
                java/lang/String, java/lang/String
            }, new Object[] {
                s, s1
            });
        }

        public String[] readStringArray(String s, String as[])
        {
            return (String[])invokeHtcCustomizationReaderMethod("readStringArray", as, new Class[] {
                java/lang/String, [Ljava/lang/String;
            }, new Object[] {
                s, as
            });
        }

        public HtcCustomizationReader(String s, int i)
        {
            this(s, i, false);
        }

        public HtcCustomizationReader(String s, int i, boolean flag)
        {
            mNeedSimReady = false;
            mType = 0;
            mName = null;
            mReaderClazz = null;
            mReaderInstance = null;
            mName = s;
            mType = i;
            mNeedSimReady = flag;
        }
    }

    public static class HttpLinkConverter
    {

        public static String getAsciiLink(String s)
        {
            if (TextUtils.isEmpty(s))
            {
                return null;
            }
            try
            {
                s = URLDecoder.decode(s, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                SystemWrapper.printStackTrace(s);
                s = null;
            }
            try
            {
                s = new URL(s);
                s = (new URI(s.getProtocol(), s.getUserInfo(), IDN.toASCII(s.getHost()), s.getPort(), s.getPath(), s.getQuery(), s.getRef())).toASCIIString();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                SystemWrapper.printStackTrace(s);
                return null;
            }
            return s;
        }

        public HttpLinkConverter()
        {
        }
    }

    public static class SWLog
    {

        private static final boolean LOG_ENABLED;

        public static int d(String s, String s1)
        {
            if (LOG_ENABLED)
            {
                return Log.d(s, s1);
            } else
            {
                return 0;
            }
        }

        public static int d(String s, String s1, Throwable throwable)
        {
            if (LOG_ENABLED)
            {
                return Log.d(s, s1, throwable);
            } else
            {
                return 0;
            }
        }

        public static int e(String s, String s1)
        {
            if (LOG_ENABLED)
            {
                return Log.e(s, s1);
            } else
            {
                return 0;
            }
        }

        public static int e(String s, String s1, Throwable throwable)
        {
            if (LOG_ENABLED)
            {
                return Log.e(s, s1, throwable);
            } else
            {
                return 0;
            }
        }

        public static int i(String s, String s1)
        {
            if (LOG_ENABLED)
            {
                return Log.i(s, s1);
            } else
            {
                return 0;
            }
        }

        public static int i(String s, String s1, Throwable throwable)
        {
            if (LOG_ENABLED)
            {
                return Log.i(s, s1, throwable);
            } else
            {
                return 0;
            }
        }

        public static int v(String s, String s1)
        {
            if (LOG_ENABLED)
            {
                return Log.v(s, s1);
            } else
            {
                return 0;
            }
        }

        public static int v(String s, String s1, Throwable throwable)
        {
            if (LOG_ENABLED)
            {
                return Log.v(s, s1, throwable);
            } else
            {
                return 0;
            }
        }

        public static int w(String s, String s1)
        {
            if (LOG_ENABLED)
            {
                return Log.w(s, s1);
            } else
            {
                return 0;
            }
        }

        public static int w(String s, String s1, Throwable throwable)
        {
            if (LOG_ENABLED)
            {
                return Log.w(s, s1, throwable);
            } else
            {
                return 0;
            }
        }

        public static int w(String s, Throwable throwable)
        {
            if (LOG_ENABLED)
            {
                return Log.w(s, throwable);
            } else
            {
                return 0;
            }
        }

        static 
        {
            LOG_ENABLED = HtcBuildFlag.Htc_DEBUG_flag;
        }

        public SWLog()
        {
        }
    }

    public static class SystemProperties
    {

        public static String get(String s)
        {
            return (String)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "get", "", new Class[] {
                java/lang/String
            }, new Object[] {
                s
            });
        }

        public static String get(String s, String s1)
        {
            return (String)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "get", s1, new Class[] {
                java/lang/String, java/lang/String
            }, new Object[] {
                s, s1
            });
        }

        public static boolean getBoolean(String s, boolean flag)
        {
            return ((Boolean)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "getBoolean", Boolean.valueOf(flag), new Class[] {
                java/lang/String, Boolean.TYPE
            }, new Object[] {
                s, Boolean.valueOf(flag)
            })).booleanValue();
        }

        public static int getInt(String s, int i)
        {
            return ((Integer)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "getInt", Integer.valueOf(i), new Class[] {
                java/lang/String, Integer.TYPE
            }, new Object[] {
                s, Integer.valueOf(i)
            })).intValue();
        }

        public static long getLong(String s, long l)
        {
            return ((Long)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "getLong", Long.valueOf(l), new Class[] {
                java/lang/String, Long.TYPE
            }, new Object[] {
                s, Long.valueOf(l)
            })).longValue();
        }

        public SystemProperties()
        {
        }
    }


    private static final String DEFAULT_CACHEMANAGER_AUTHORITY = "com.htc.sense.hsp.opensense.cachemanager";
    private static final String DEFAULT_HDK_API_PREFIX = "hdkapi_";
    private static final String DEFAULT_HSP_API_PREFIX = "hdkapi_";
    private static final String DEFAULT_HSP_PACKAGE_NAME = "com.htc.sense.hsp";
    private static final String DEFAULT_PLUGINMANAGER_AUTHORITY = "com.htc.sense.hsp.opensense.plugin";
    private static final String DEFAULT_SOCIALMANAGER_AUTHORITY = "com.htc.sense.hsp.opensense.social";
    private static final String DEFAULT_SOCIALMANAGER_PACKAGE_NAME = "com.htc.sense.hsp.opensense.social";
    private static final boolean INTERNAL_DEBUG_FLAG;
    private static String sCacheManagerAuthority = null;
    private static String sHdkApiPrefix = null;
    private static String sHspApiPrefix = null;
    private static String sHspPackageName = null;
    private static boolean sIgnoreHdkSupportCheck = false;
    private static String sPluginManagerAuthority = null;
    private static String sSocialManagerAuthority = null;
    private static String sSocialManagerPackageName = null;

    public SystemWrapper()
    {
    }

    public static String getCacheManagerAuthority()
    {
        if (sCacheManagerAuthority == null)
        {
            sCacheManagerAuthority = "com.htc.sense.hsp.opensense.cachemanager";
        }
        return sCacheManagerAuthority;
    }

    public static String getHdkApiPrefix()
    {
        if (sHdkApiPrefix == null)
        {
            sHdkApiPrefix = "hdkapi_";
        }
        return sHdkApiPrefix;
    }

    public static String getHspApiPrefix()
    {
        if (sHspApiPrefix == null)
        {
            sHspApiPrefix = "hdkapi_";
        }
        return sHspApiPrefix;
    }

    public static String getHspPackageName()
    {
        if (sHspPackageName == null)
        {
            sHspPackageName = "com.htc.sense.hsp";
        }
        return sHspPackageName;
    }

    public static boolean getIgnoreHdkSupportCheck()
    {
        return sIgnoreHdkSupportCheck;
    }

    public static String getPluginManagerAuthority()
    {
        if (sPluginManagerAuthority == null)
        {
            sPluginManagerAuthority = "com.htc.sense.hsp.opensense.plugin";
        }
        return sPluginManagerAuthority;
    }

    private static Object getPublicStaticField(String s, String s1, Object obj)
    {
        if (s == null || s1 == null)
        {
            return obj;
        }
        try
        {
            s = ((String) (Class.forName(s).getField(s1).get(null)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        return s;
    }

    public static String getSocialManagerAuthority()
    {
        if (sSocialManagerAuthority == null)
        {
            sSocialManagerAuthority = "com.htc.sense.hsp.opensense.social";
        }
        return sSocialManagerAuthority;
    }

    public static String getSocialManagerPackageName()
    {
        if (sSocialManagerPackageName == null)
        {
            sSocialManagerPackageName = "com.htc.sense.hsp.opensense.social";
        }
        return sSocialManagerPackageName;
    }

    public static Object invokePublicStaticMethod(String s, String s1, Object obj, Class aclass[], Object aobj[])
    {
        if (s == null || s1 == null)
        {
            return obj;
        }
        try
        {
            s = ((String) (Class.forName(s).getMethod(s1, aclass).invoke(null, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printStackTrace(s);
            return obj;
        }
        return s;
    }

    private static void printStackTrace(Throwable throwable)
    {
        if (INTERNAL_DEBUG_FLAG)
        {
            throwable.printStackTrace();
        }
    }

    public static void setCacheManagerAuthority(String s)
    {
        sCacheManagerAuthority = s;
    }

    public static void setHdkApiPrefix(String s)
    {
        sHdkApiPrefix = s;
    }

    public static void setHspApiPrefix(String s)
    {
        sHspApiPrefix = s;
    }

    public static void setHspPackageName(String s)
    {
        sHspPackageName = s;
    }

    public static void setIgnoreHdkSupportCheck(boolean flag)
    {
        sIgnoreHdkSupportCheck = flag;
    }

    public static void setPluginManagerAuthority(String s)
    {
        sPluginManagerAuthority = s;
    }

    public static void setSocialManagerAuthority(String s)
    {
        sSocialManagerAuthority = s;
    }

    public static void setSocialManagerPackageName(String s)
    {
        sSocialManagerPackageName = s;
    }

    static 
    {
        boolean flag;
        if ("userdebug".equals(android.os.Build.TYPE) || "eng".equals(android.os.Build.TYPE))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        INTERNAL_DEBUG_FLAG = flag;
    }


}
