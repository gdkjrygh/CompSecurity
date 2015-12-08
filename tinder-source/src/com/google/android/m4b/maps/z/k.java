// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;


public abstract class k extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    private static final k f[];

    private k(String s, int i)
    {
        super(s, i);
    }

    k(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/google/android/m4b/maps/z/k, s);
    }

    public static k[] values()
    {
        return (k[])f.clone();
    }

    abstract boolean a();

    static 
    {
        a = new k("EXPLICIT") {

            final boolean a()
            {
                return false;
            }

        };
        b = new k("REPLACED") {

            final boolean a()
            {
                return false;
            }

        };
        c = new k("COLLECTED") {

            final boolean a()
            {
                return true;
            }

        };
        d = new k("EXPIRED") {

            final boolean a()
            {
                return true;
            }

        };
        e = new k("SIZE") {

            final boolean a()
            {
                return true;
            }

        };
        f = (new k[] {
            a, b, c, d, e
        });
    }
}
