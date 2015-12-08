// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;


public class Tinteg
{

    public static String ali;
    public static String alt;

    public Tinteg()
    {
    }

    public static native boolean tintegH(Object obj);

    public static native String tintegS(Class class1, Object obj);

    static 
    {
        System.loadLibrary("tinteg");
    }
}
