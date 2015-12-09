// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.drawer;


public class NavigationItem
{
    public static final class RunAs extends Enum
    {

        public static final RunAs a;
        public static final RunAs b;
        private static final RunAs c[];

        public static RunAs valueOf(String s)
        {
            return (RunAs)Enum.valueOf(com/fitbit/ui/drawer/NavigationItem$RunAs, s);
        }

        public static RunAs[] values()
        {
            return (RunAs[])c.clone();
        }

        static 
        {
            a = new RunAs("FRAGMENT", 0);
            b = new RunAs("ACTIVITY", 1);
            c = (new RunAs[] {
                a, b
            });
        }

        private RunAs(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        private static final Type d[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/fitbit/ui/drawer/NavigationItem$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])d.clone();
        }

        static 
        {
            a = new Type("PRIMARY", 0);
            b = new Type("SECONDARY", 1);
            c = new Type("DIVIDER", 2);
            d = (new Type[] {
                a, b, c
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private final Type a;
    private final Object b;
    private final RunAs c;
    private int d;
    private int e;

    public NavigationItem(Type type, Object obj, RunAs runas)
    {
        a = type;
        b = obj;
        c = runas;
    }

    public final Type a()
    {
        return a;
    }

    public final void a(int i)
    {
        d = i;
    }

    public final Object b()
    {
        return b;
    }

    public final void b(int i)
    {
        e = i;
    }

    public final int c()
    {
        return d;
    }

    public final RunAs d()
    {
        return c;
    }

    public final int e()
    {
        return e;
    }
}
