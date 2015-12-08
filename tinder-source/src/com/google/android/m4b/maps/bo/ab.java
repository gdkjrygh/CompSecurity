// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;

public class ab
{
    public static final class a extends ab
    {

        public static final a c = new a();

        public static a b(DataInput datainput)
        {
            return new a(datainput.readUnsignedByte());
        }

        public final int d()
        {
            return a >> 4 & 0xf;
        }


        private a()
        {
            super(80);
        }

        private a(int i)
        {
            super(i);
        }
    }


    public static final ab b = new ab(5);
    protected final int a;

    public ab(int i)
    {
        a = i;
    }

    public static ab a(DataInput datainput)
    {
        return new ab(datainput.readUnsignedByte());
    }

    public static int c()
    {
        return 16;
    }

    public final int a()
    {
        return a & 3;
    }

    public final int b()
    {
        return a >> 2 & 3;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ab)obj;
            if (a != ((ab) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a + 31;
    }

}
