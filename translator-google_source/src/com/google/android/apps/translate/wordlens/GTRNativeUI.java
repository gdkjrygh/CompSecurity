// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.wordlens;

import com.google.android.libraries.wordlens.WordLensSystem;

// Referenced classes of package com.google.android.apps.translate.wordlens:
//            a

public class GTRNativeUI
{

    private static GTRNativeUI a;

    private GTRNativeUI()
    {
    }

    public static GTRNativeUI a()
    {
        if (a == null)
        {
            a = new GTRNativeUI();
        }
        return a;
    }

    private native void autoSmudgeAllNative();

    private static native boolean isAvailableNative();

    private native void setScanBarActiveNative(boolean flag);

    private native void switchToPhotoNative(int i, int j, byte abyte0[]);

    public final void a(int i, int j, byte abyte0[])
    {
        synchronized (WordLensSystem.c())
        {
            switchToPhotoNative(i, j, abyte0);
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public final void a(GTRUIMode gtruimode)
    {
        WordLensSystem.b().d();
        synchronized (WordLensSystem.c())
        {
            setUIModeNative(gtruimode.qvValue);
        }
        WordLensSystem.b().e();
        return;
        gtruimode;
        obj;
        JVM INSTR monitorexit ;
        throw gtruimode;
    }

    public final void a(boolean flag)
    {
        synchronized (WordLensSystem.c())
        {
            setScanBarActiveNative(flag);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (WordLensSystem.c())
        {
            autoSmudgeAllNative();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    native int getUIModeNative();

    public native void setCloudhanceResultsNative(com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word aword[]);

    public native void setSmudgeListener(a a1);

    native void setUIModeNative(int i);

    private class GTRUIMode extends Enum
    {

        public static final GTRUIMode CLOUDHANCE;
        public static final GTRUIMode IDLE;
        public static final GTRUIMode SNAPSHOT;
        public static final GTRUIMode VIDEO;
        private static final GTRUIMode a[];
        public int qvValue;

        public static GTRUIMode byQVVal(int i)
        {
            switch (i)
            {
            default:
                return IDLE;

            case 3: // '\003'
                return CLOUDHANCE;

            case 2: // '\002'
                return SNAPSHOT;

            case 1: // '\001'
                return VIDEO;
            }
        }

        public static GTRUIMode valueOf(String s)
        {
            return (GTRUIMode)Enum.valueOf(com/google/android/apps/translate/wordlens/GTRNativeUI$GTRUIMode, s);
        }

        public static GTRUIMode[] values()
        {
            return (GTRUIMode[])a.clone();
        }

        static 
        {
            IDLE = new GTRUIMode("IDLE", 0, 0);
            VIDEO = new GTRUIMode("VIDEO", 1, 1);
            SNAPSHOT = new GTRUIMode("SNAPSHOT", 2, 2);
            CLOUDHANCE = new GTRUIMode("CLOUDHANCE", 3, 3);
            a = (new GTRUIMode[] {
                IDLE, VIDEO, SNAPSHOT, CLOUDHANCE
            });
        }

        private GTRUIMode(String s, int i, int j)
        {
            super(s, i);
            qvValue = j;
        }
    }

}
