// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.succinct;

import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

public class Quantizer
    implements Serializable
{

    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0xee103ee55001358eL;
    private final int maxUnitValue;
    private final double minValue;
    private final double valPerUnit;

    public Quantizer(double d, double d1, int i)
    {
        minValue = d;
        valPerUnit = d1;
        maxUnitValue = i;
    }

    public static Quantizer readFromByteBuffer(ByteBuffer bytebuffer)
    {
        return new Quantizer(bytebuffer.getDouble(), bytebuffer.getDouble(), bytebuffer.getInt());
    }

    public static Quantizer readFromFile(String s)
    {
        Quantizer quantizer;
        try
        {
            s = new ObjectInputStream(new FileInputStream(s));
            quantizer = (Quantizer)s.readObject();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return quantizer;
    }

    public int getUnit(double d)
    {
        int j = (int)Math.round((d - minValue) / valPerUnit);
        int i = j;
        if (j > maxUnitValue)
        {
            i = maxUnitValue;
        }
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        return j;
    }

    public double getValue(int i)
    {
        if (i > maxUnitValue)
        {
            throw new DecoderRuntimeException("unit is too large!");
        } else
        {
            return minValue + (double)i * valPerUnit;
        }
    }

    public int numBitsRequired()
    {
        int j = maxUnitValue;
        if (j <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder(44)).append("input n is not greater than 0; n=").append(j).toString());
        }
        int i;
        for (i = 1; Math.pow(2D, i) - 1.0D < (double)j; i++) { }
        return i;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putDouble(minValue);
        bytebuffer.putDouble(valPerUnit);
        bytebuffer.putInt(maxUnitValue);
    }

    public void writeToFile(String s)
    {
        try
        {
            s = new ObjectOutputStream(new FileOutputStream(s));
            s.writeObject(this);
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

}
