// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;

public class Matrix
{

    public static final Matrix ROTATE_0 = new Matrix(1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
    public static final Matrix ROTATE_180 = new Matrix(-1D, 0.0D, 0.0D, -1D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
    public static final Matrix ROTATE_270 = new Matrix(0.0D, -1D, 1.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
    public static final Matrix ROTATE_90 = new Matrix(0.0D, 1.0D, -1D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
    double a;
    double b;
    double c;
    double d;
    double tx;
    double ty;
    double u;
    double v;
    double w;

    public Matrix(double d1, double d2, double d3, double d4, double d5, double d6, double d7, 
            double d8, double d9)
    {
        u = d5;
        v = d6;
        w = d7;
        a = d1;
        b = d2;
        c = d3;
        d = d4;
        tx = d8;
        ty = d9;
    }

    public static Matrix fromByteBuffer(ByteBuffer bytebuffer)
    {
        return fromFileOrder(IsoTypeReader.readFixedPoint1616(bytebuffer), IsoTypeReader.readFixedPoint1616(bytebuffer), IsoTypeReader.readFixedPoint0230(bytebuffer), IsoTypeReader.readFixedPoint1616(bytebuffer), IsoTypeReader.readFixedPoint1616(bytebuffer), IsoTypeReader.readFixedPoint0230(bytebuffer), IsoTypeReader.readFixedPoint1616(bytebuffer), IsoTypeReader.readFixedPoint1616(bytebuffer), IsoTypeReader.readFixedPoint0230(bytebuffer));
    }

    public static Matrix fromFileOrder(double d1, double d2, double d3, double d4, 
            double d5, double d6, double d7, double d8, double d9)
    {
        return new Matrix(d1, d2, d4, d5, d3, d6, d9, d7, d8);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Matrix)obj;
            if (Double.compare(((Matrix) (obj)).a, a) != 0)
            {
                return false;
            }
            if (Double.compare(((Matrix) (obj)).b, b) != 0)
            {
                return false;
            }
            if (Double.compare(((Matrix) (obj)).c, c) != 0)
            {
                return false;
            }
            if (Double.compare(((Matrix) (obj)).d, d) != 0)
            {
                return false;
            }
            if (Double.compare(((Matrix) (obj)).tx, tx) != 0)
            {
                return false;
            }
            if (Double.compare(((Matrix) (obj)).ty, ty) != 0)
            {
                return false;
            }
            if (Double.compare(((Matrix) (obj)).u, u) != 0)
            {
                return false;
            }
            if (Double.compare(((Matrix) (obj)).v, v) != 0)
            {
                return false;
            }
            if (Double.compare(((Matrix) (obj)).w, w) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, a);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, b);
        IsoTypeWriter.writeFixedPoint0230(bytebuffer, u);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, c);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, d);
        IsoTypeWriter.writeFixedPoint0230(bytebuffer, v);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, tx);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, ty);
        IsoTypeWriter.writeFixedPoint0230(bytebuffer, w);
    }

    public int hashCode()
    {
        long l2 = Double.doubleToLongBits(u);
        int i = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(v);
        int j = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(w);
        int k = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(a);
        int l = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(b);
        int i1 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(c);
        int j1 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(d);
        int k1 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(tx);
        int l1 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(ty);
        return (((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + (int)(l2 ^ l2 >>> 32);
    }

    public String toString()
    {
        if (equals(ROTATE_0))
        {
            return "Rotate 0\260";
        }
        if (equals(ROTATE_90))
        {
            return "Rotate 90\260";
        }
        if (equals(ROTATE_180))
        {
            return "Rotate 180\260";
        }
        if (equals(ROTATE_270))
        {
            return "Rotate 270\260";
        } else
        {
            return (new StringBuilder("Matrix{u=")).append(u).append(", v=").append(v).append(", w=").append(w).append(", a=").append(a).append(", b=").append(b).append(", c=").append(c).append(", d=").append(d).append(", tx=").append(tx).append(", ty=").append(ty).append('}').toString();
        }
    }

}
