// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class jgg
{

    public final Map a = new HashMap();
    public float b;
    public int c;
    public int d;

    public jgg()
    {
        b = 1.0F;
        a.put(Integer.valueOf(1), Float.valueOf(0.03F));
        a.put(Integer.valueOf(2), Float.valueOf(0.06F));
        a.put(Integer.valueOf(3), Float.valueOf(0.17F));
        a.put(Integer.valueOf(4), Float.valueOf(0.39F));
        a.put(Integer.valueOf(5), Float.valueOf(0.52F));
        a.put(Integer.valueOf(6), Float.valueOf(0.69F));
        a.put(Integer.valueOf(7), Float.valueOf(0.8F));
        a.put(Integer.valueOf(8), Float.valueOf(0.87F));
        a.put(Integer.valueOf(9), Float.valueOf(0.93F));
        a.put(Integer.valueOf(10), Float.valueOf(1.0F));
    }
}
