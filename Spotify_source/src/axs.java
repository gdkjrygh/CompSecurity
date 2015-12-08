// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Enumeration;
import java.util.Vector;

public abstract class axs
{

    public byte h;
    public String i;

    public axs(byte byte0, String s)
    {
        h = byte0;
        i = s;
    }

    public static axs a(Vector vector, byte byte0)
    {
        for (vector = vector.elements(); vector.hasMoreElements();)
        {
            axs axs1 = (axs)vector.nextElement();
            if (axs1.h == byte0)
            {
                return axs1;
            }
        }

        return null;
    }

    public final boolean a(axs axs1)
    {
        return i == axs1.i;
    }
}
