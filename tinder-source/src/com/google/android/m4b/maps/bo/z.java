// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;

public final class z
{

    private static z g = new z(0, 0, 12, 0.0F, 0.0F, 0);
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    private final float f;

    public z(int i, int j, int k, float f1, float f2, int l)
    {
        a = i;
        b = j;
        c = k;
        d = f1;
        f = f2;
        e = l;
    }

    public static z a()
    {
        return g;
    }

    public static z a(DataInput datainput)
    {
        return new z(datainput.readInt(), datainput.readInt(), datainput.readUnsignedByte(), (float)datainput.readUnsignedShort() / 100F, (float)datainput.readUnsignedShort() / 100F, datainput.readUnsignedByte());
    }

    public final boolean equals(Object obj)
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
            obj = (z)obj;
            if (e != ((z) (obj)).e)
            {
                return false;
            }
            if (a != ((z) (obj)).a)
            {
                return false;
            }
            if (d != ((z) (obj)).d)
            {
                return false;
            }
            if (b != ((z) (obj)).b)
            {
                return false;
            }
            if (c != ((z) (obj)).c)
            {
                return false;
            }
            if (f != ((z) (obj)).f)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (((((e + 31) * 31 + a) * 31 + Float.floatToIntBits(d)) * 31 + b) * 31 + c) * 31 + Float.floatToIntBits(f);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("TextStyle{color=").append(Integer.toHexString(a)).append(", outlineColor=").append(Integer.toHexString(b)).append(", size=").append(c).append(", leadingRatio=").append(d).append(", trackingRatio=").append(f).append(", attributes=").append(e).append('}');
        return stringbuilder.toString();
    }

}
