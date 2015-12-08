// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;


public class CorruptedApplicationStateException extends RuntimeException
{

    private final Remedy mRemedy;

    public final Remedy a()
    {
        return mRemedy;
    }

    public String getMessage()
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("Application is in corrupt state. ");
        _cls1.a[mRemedy.ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 72
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        stringbuilder.append("[ mRemedy = ").append(mRemedy).append(" ]");
        return stringbuilder.toString();
_L2:
        stringbuilder.append("Reboot device. ");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append("Reinstall application.");
        if (true) goto _L1; else goto _L4
_L4:
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[Remedy.values().length];
            try
            {
                a[Remedy.REBOOT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Remedy.REINSTALL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class Remedy extends Enum
    {

        private static final Remedy $VALUES[];
        public static final Remedy REBOOT;
        public static final Remedy REINSTALL;
        public static final Remedy UNKNOWN;

        public static Remedy valueOf(String s)
        {
            return (Remedy)Enum.valueOf(com/facebook/common/dextricks/CorruptedApplicationStateException$Remedy, s);
        }

        public static Remedy[] values()
        {
            return (Remedy[])$VALUES.clone();
        }

        static 
        {
            REINSTALL = new Remedy("REINSTALL", 0);
            REBOOT = new Remedy("REBOOT", 1);
            UNKNOWN = new Remedy("UNKNOWN", 2);
            $VALUES = (new Remedy[] {
                REINSTALL, REBOOT, UNKNOWN
            });
        }

        private Remedy(String s, int i)
        {
            super(s, i);
        }
    }

}
