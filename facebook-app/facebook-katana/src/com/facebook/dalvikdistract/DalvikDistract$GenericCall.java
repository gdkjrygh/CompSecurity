// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvikdistract;

import java.util.Arrays;

public final class 
{

    private static Object gcSave[];

    private static void enlargeGcSave()
    {
        if (gcSave != null)
        {
            gcSave = Arrays.copyOf(gcSave, gcSave.length * 2);
            return;
        } else
        {
            gcSave = new Object[16];
            return;
        }
    }

    public static native boolean getBoolean(int i, int j);

    public static native byte getByte(int i, int j);

    public static native char getChar(int i, int j);

    public static native double getDouble(int i, int j);

    public static native float getFloat(int i, int j);

    public static native int getInt(int i, int j);

    public static native long getLong(int i, int j);

    public static native Object getObject(int i, int j);

    public static native short getShort(int i, int j);

    public static native void invokeOriginal(int i);

    private static void saveReturnValue(int i, Object obj)
    {
        setObject(i, -1, obj);
    }

    public static native void setBoolean(int i, int j, boolean flag);

    public static native void setByte(int i, int j, byte byte0);

    public static native void setChar(int i, int j, char c);

    public static native void setDouble(int i, int j, double d);

    public static native void setFloat(int i, int j, float f);

    public static native void setInt(int i, int j, int k);

    public static native void setLong(int i, int j, long l);

    public static native void setObject(int i, int j, Object obj);

    public static native void setShort(int i, int j, short word0);

    public ()
    {
    }
}
