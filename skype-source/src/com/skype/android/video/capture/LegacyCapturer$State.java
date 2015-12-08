// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;


// Referenced classes of package com.skype.android.video.capture:
//            LegacyCapturer

private static class <init>
{
    public static final class Flags extends Enum
    {

        private static final Flags $VALUES[];
        public static final Flags CallbackEnabled;
        public static final Flags StartRequested;
        public static final Flags SurfaceProvided;

        public static Flags valueOf(String s)
        {
            return (Flags)Enum.valueOf(com/skype/android/video/capture/LegacyCapturer$State$Flags, s);
        }

        public static Flags[] values()
        {
            return (Flags[])$VALUES.clone();
        }

        static 
        {
            StartRequested = new Flags("StartRequested", 0);
            CallbackEnabled = new Flags("CallbackEnabled", 1);
            SurfaceProvided = new Flags("SurfaceProvided", 2);
            $VALUES = (new Flags[] {
                StartRequested, CallbackEnabled, SurfaceProvided
            });
        }

        private Flags(String s, int i)
        {
            super(s, i);
        }
    }


    private int flags;

    public boolean areSet(Flags flags1, Flags flags2)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = 1 << flags1.ordinal() | 1 << flags2.ordinal();
        j = flags;
        if ((j & i) != i)
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        flags1;
        throw flags1;
    }

    public boolean isSet(Flags flags1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = 1 << flags1.ordinal();
        j = flags;
        if ((j & i) != i)
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        flags1;
        throw flags1;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        flags = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void set(Flags flags1)
    {
        this;
        JVM INSTR monitorenter ;
        flags = flags | 1 << flags1.ordinal();
        this;
        JVM INSTR monitorexit ;
        return;
        flags1;
        throw flags1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(getClass().getSimpleName()).append(" [StartRequested=");
        String s;
        if (isSet(Flags.StartRequested))
        {
            s = "true";
        } else
        {
            s = "false";
        }
        stringbuilder = stringbuilder.append(s).append(", CallbackEnabled=");
        if (isSet(Flags.CallbackEnabled))
        {
            s = "true";
        } else
        {
            s = "false";
        }
        stringbuilder = stringbuilder.append(s).append(", SurfaceProvided=");
        if (isSet(Flags.SurfaceProvided))
        {
            s = "true";
        } else
        {
            s = "false";
        }
        return stringbuilder.append(s).append("]").toString();
    }

    public void unset(Flags flags1)
    {
        this;
        JVM INSTR monitorenter ;
        flags = flags & ~(1 << flags1.ordinal());
        this;
        JVM INSTR monitorexit ;
        return;
        flags1;
        throw flags1;
    }

    private Flags()
    {
    }

    Flags(Flags flags1)
    {
        this();
    }
}
