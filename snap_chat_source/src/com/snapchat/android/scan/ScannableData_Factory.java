// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.scan;

import DK;
import DL;
import DM;
import DN;
import org.json.JSONObject;

public final class ScannableData_Factory extends Enum
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/snapchat/android/scan/ScannableData_Factory$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("ADD_FRIEND", 0);
            b = new a("DEEP_LINK", 1);
            c = new a("MESSAGE", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final ScannableData_Factory $VALUES[];
    public static final ScannableData_Factory INSTANCE;

    private ScannableData_Factory(String s)
    {
        super(s, 0);
    }

    public static ScannableData_Factory valueOf(String s)
    {
        return (ScannableData_Factory)Enum.valueOf(com/snapchat/android/scan/ScannableData_Factory, s);
    }

    public static ScannableData_Factory[] values()
    {
        return (ScannableData_Factory[])$VALUES.clone();
    }

    public final DK create(String s, JSONObject jsonobject)
    {
        s = a.valueOf(s.toUpperCase());
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[s.ordinal()])
        {
        default:
            return new DK();

        case 1: // '\001'
            return new DL(jsonobject);

        case 2: // '\002'
            return new DM(jsonobject);

        case 3: // '\003'
            return new DN(jsonobject);
        }
    }

    static 
    {
        INSTANCE = new ScannableData_Factory("INSTANCE");
        $VALUES = (new ScannableData_Factory[] {
            INSTANCE
        });
    }
}
