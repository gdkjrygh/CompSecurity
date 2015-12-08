// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.au;

import java.io.File;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;

public final class com.google.android.m4b.maps.au.a
{
    public static final class a
    {

        private File a;

        public final com.google.android.m4b.maps.au.a a(String s)
        {
            File file = a;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "cache_".concat(s);
            } else
            {
                s = new String("cache_");
            }
            return new com.google.android.m4b.maps.au.a(new File(file, s), "rw");
        }

        public final void b(String s)
        {
            File file = a;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "cache_".concat(s);
            } else
            {
                s = new String("cache_");
            }
            s = new File(file, s);
            if (s.exists())
            {
                s.delete();
            }
        }

        public a(File file)
        {
            a = file;
        }
    }


    public RandomAccessFile a;

    public com.google.android.m4b.maps.au.a(File file, String s)
    {
        a = new RandomAccessFile(file, s);
    }

    public final void a()
    {
        a.getFD().sync();
    }

    public final void a(long l)
    {
        a.seek(l);
    }

    public final void a(byte abyte0[])
    {
        a.write(abyte0);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        a.write(abyte0, i, j);
    }

    public final void b(byte abyte0[])
    {
        a.readFully(abyte0);
    }
}
