// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.ave.dejavu;

import java.io.IOException;

// Referenced classes of package com.qihoo.security.engine.ave.dejavu:
//            DalvikClass

public class Dalvik
{

    public static final int MODE_CONTAIN = 2;
    public static final int MODE_MATCH = 0;
    public static final int MODE_REGULAR_EXPRESSION = 1;
    private final boolean f;
    private long h;

    public Dalvik(long l, long l1)
        throws IOException
    {
        long l2 = open(l, l1);
        h = l2;
        if (l2 == 0L)
        {
            throw new IOException(String.format("Parse memory 0x%08X (%d bytes) failed ", new Object[] {
                Long.valueOf(l), Long.valueOf(l1)
            }));
        } else
        {
            f = false;
            return;
        }
    }

    public Dalvik(String s)
        throws IOException
    {
        long l = open(s);
        h = l;
        if (l == 0L)
        {
            throw new IOException((new StringBuilder("Can not open ")).append(s).toString());
        } else
        {
            f = true;
            return;
        }
    }

    private native void closeFile();

    private native void closeMem();

    public void close()
    {
        if (f)
        {
            closeFile();
            return;
        } else
        {
            closeMem();
            return;
        }
    }

    public int find(String s, int i)
    {
        if (s.charAt(0) == '/' && s.charAt(s.length() - 1) == '/')
        {
            return find(s, i, 1);
        } else
        {
            return find(s, i, 0);
        }
    }

    public native int find(String s, int i, int j);

    public native int findAll(String as[], int i);

    public native int findClass(String s, String s1, int i);

    public native int getCount(char c);

    public native String load(char c, int i);

    public native DalvikClass loadClass(int i);

    protected native long open(long l, long l1);

    protected native long open(String s);
}
