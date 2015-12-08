// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless;


public abstract class com.aviary.android.feather.headless.b extends Exception
{
    public static final class a extends com.aviary.android.feather.headless.b
    {

        public a()
        {
            super("Invalid API-KEY");
        }
    }

    public static final class b extends com.aviary.android.feather.headless.b
    {

        public b()
        {
            super("Invalid Context");
        }
    }


    com.aviary.android.feather.headless.b(String s)
    {
        super(s);
    }

    public static com.aviary.android.feather.headless.b a(int i)
    {
        switch (i)
        {
        case 0: // '\0'
        default:
            return null;

        case 1: // '\001'
            return new b();

        case 2: // '\002'
            return new a();
        }
    }
}
