// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.htc.lib2.opensense.internal:
//            SystemWrapper

public static class mNeedSimReady
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
        SystemWrapper.access$000(((Throwable) (obj2)));
        obj3 = null;
        class1 = ((Class) (obj1));
          goto _L5
        obj2;
        obj1 = null;
_L11:
        SystemWrapper.access$000(((Throwable) (obj2)));
        obj3 = null;
        class1 = ((Class) (obj1));
          goto _L5
        obj2;
        obj1 = null;
_L10:
        SystemWrapper.access$000(((Throwable) (obj2)));
        obj3 = null;
        class1 = ((Class) (obj1));
          goto _L5
        obj2;
        obj1 = null;
_L9:
        SystemWrapper.access$000(((Throwable) (obj2)));
        obj3 = null;
        class1 = ((Class) (obj1));
          goto _L5
        obj2;
        obj1 = null;
_L8:
        SystemWrapper.access$000(((Throwable) (obj2)));
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
            SystemWrapper.access$000(((Throwable) (obj1)));
            obj1 = method;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            SystemWrapper.access$000(((Throwable) (obj1)));
            obj1 = obj4;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            SystemWrapper.access$000(((Throwable) (obj1)));
            obj1 = obj5;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            SystemWrapper.access$000(((Throwable) (obj1)));
            obj1 = obj6;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            SystemWrapper.access$000(((Throwable) (obj1)));
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
            SystemWrapper.access$000(((Throwable) (obj1)));
            method = ((Method) (obj4));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            SystemWrapper.access$000(((Throwable) (obj1)));
            method = ((Method) (obj5));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            SystemWrapper.access$000(((Throwable) (obj1)));
            method = ((Method) (obj6));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            SystemWrapper.access$000(((Throwable) (obj1)));
            method = ((Method) (obj7));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            SystemWrapper.access$000(method);
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
            SystemWrapper.access$000(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            SystemWrapper.access$000(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            SystemWrapper.access$000(s);
            return obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            SystemWrapper.access$000(s);
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

    public (String s, int i)
    {
        this(s, i, false);
    }

    public <init>(String s, int i, boolean flag)
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
