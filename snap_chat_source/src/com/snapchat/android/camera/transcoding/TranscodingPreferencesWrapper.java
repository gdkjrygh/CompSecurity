// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.transcoding;

import Bt;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import dq;
import du;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import rv;

public final class TranscodingPreferencesWrapper
{
    public static final class OverwrittenTranscodingState extends Enum
    {

        private static final OverwrittenTranscodingState $VALUES[];
        public static final OverwrittenTranscodingState FORCE_DISABLED;
        public static final OverwrittenTranscodingState FORCE_ENABLED;
        public static final OverwrittenTranscodingState OVERWRITE_OFF;
        private int a;
        private TranscodingEnabled b;

        public static OverwrittenTranscodingState valueOf(String s)
        {
            return (OverwrittenTranscodingState)Enum.valueOf(com/snapchat/android/camera/transcoding/TranscodingPreferencesWrapper$OverwrittenTranscodingState, s);
        }

        public static OverwrittenTranscodingState[] values()
        {
            return (OverwrittenTranscodingState[])$VALUES.clone();
        }

        public final int getIndex()
        {
            return a;
        }

        public final TranscodingEnabled getValue()
        {
            return b;
        }

        static 
        {
            OVERWRITE_OFF = new OverwrittenTranscodingState("OVERWRITE_OFF", 0, 0, TranscodingEnabled.UNKNOWN);
            FORCE_ENABLED = new OverwrittenTranscodingState("FORCE_ENABLED", 1, 1, TranscodingEnabled.ENABLED);
            FORCE_DISABLED = new OverwrittenTranscodingState("FORCE_DISABLED", 2, 2, TranscodingEnabled.DISABLED);
            $VALUES = (new OverwrittenTranscodingState[] {
                OVERWRITE_OFF, FORCE_ENABLED, FORCE_DISABLED
            });
        }

        private OverwrittenTranscodingState(String s, int i, int j, TranscodingEnabled transcodingenabled)
        {
            super(s, i);
            a = j;
            b = transcodingenabled;
        }
    }

    public static final class TranscodingEnabled extends Enum
    {

        private static final TranscodingEnabled $VALUES[];
        public static final TranscodingEnabled BLOCKED;
        public static final TranscodingEnabled DISABLED;
        public static final TranscodingEnabled ENABLED;
        public static final TranscodingEnabled ENABLED_FOR_LOW_QUALITY;
        public static final TranscodingEnabled TRANSCODING_NOT_SUPPORTED;
        public static final TranscodingEnabled UNKNOWN;
        private int a;

        public static TranscodingEnabled valueOf(String s)
        {
            return (TranscodingEnabled)Enum.valueOf(com/snapchat/android/camera/transcoding/TranscodingPreferencesWrapper$TranscodingEnabled, s);
        }

        public static TranscodingEnabled[] values()
        {
            return (TranscodingEnabled[])$VALUES.clone();
        }

        public final int getValue()
        {
            return a;
        }

        static 
        {
            UNKNOWN = new TranscodingEnabled("UNKNOWN", 0, 0);
            BLOCKED = new TranscodingEnabled("BLOCKED", 1, 1);
            TRANSCODING_NOT_SUPPORTED = new TranscodingEnabled("TRANSCODING_NOT_SUPPORTED", 2, 2);
            ENABLED_FOR_LOW_QUALITY = new TranscodingEnabled("ENABLED_FOR_LOW_QUALITY", 3, 3);
            ENABLED = new TranscodingEnabled("ENABLED", 4, 4);
            DISABLED = new TranscodingEnabled("DISABLED", 5, 5);
            $VALUES = (new TranscodingEnabled[] {
                UNKNOWN, BLOCKED, TRANSCODING_NOT_SUPPORTED, ENABLED_FOR_LOW_QUALITY, ENABLED, DISABLED
            });
        }

        private TranscodingEnabled(String s, int i, int j)
        {
            super(s, i);
            a = j;
        }
    }


    private static TranscodingPreferencesWrapper b = null;
    public int a;
    private final rv c;

    private TranscodingPreferencesWrapper()
    {
        this(new rv());
    }

    private TranscodingPreferencesWrapper(rv rv1)
    {
        a = 0;
        c = rv1;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            a(TranscodingEnabled.TRANSCODING_NOT_SUPPORTED);
        }
        b = this;
    }

    public static TranscodingPreferencesWrapper a()
    {
        if (b == null)
        {
            b = new TranscodingPreferencesWrapper();
        }
        return b;
    }

    public static void a(OverwrittenTranscodingState overwrittentranscodingstate)
    {
        Bt.t(overwrittentranscodingstate.name());
    }

    public static void a(boolean flag)
    {
        Bt.t(flag);
    }

    public static TranscodingEnabled b()
    {
        TranscodingEnabled transcodingenabled = e();
        Timber.a("TranscodingPreferencesWrapper", (new StringBuilder("ShouldUseTranscoding ")).append(transcodingenabled).toString(), new Object[0]);
        return transcodingenabled;
    }

    public static void b(boolean flag)
    {
        Bt.s(flag);
    }

    public static void c(boolean flag)
    {
        Bt.r(flag);
    }

    public static boolean c()
    {
        TranscodingEnabled transcodingenabled = b();
        return transcodingenabled == TranscodingEnabled.ENABLED || transcodingenabled == TranscodingEnabled.ENABLED_FOR_LOW_QUALITY;
    }

    public static boolean d()
    {
        return Bt.br();
    }

    public static TranscodingEnabled e()
    {
        OverwrittenTranscodingState overwrittentranscodingstate = g();
        if (!overwrittentranscodingstate.equals(OverwrittenTranscodingState.OVERWRITE_OFF))
        {
            return overwrittentranscodingstate.getValue();
        } else
        {
            return f();
        }
    }

    public static TranscodingEnabled f()
    {
        String s = Bt.bn();
        Timber.a("TranscodingPreferencesWrapper", (new StringBuilder("loadTranscodingState ")).append(s).toString(), new Object[0]);
        return (TranscodingEnabled)dq.a(com/snapchat/android/camera/transcoding/TranscodingPreferencesWrapper$TranscodingEnabled, s).a(TranscodingEnabled.UNKNOWN);
    }

    public static OverwrittenTranscodingState g()
    {
        String s = Bt.bq();
        Timber.a("TranscodingPreferencesWrapper", (new StringBuilder("load transcoding overwritten state ")).append(s).toString(), new Object[0]);
        return (OverwrittenTranscodingState)dq.a(com/snapchat/android/camera/transcoding/TranscodingPreferencesWrapper$OverwrittenTranscodingState, s).a(OverwrittenTranscodingState.OVERWRITE_OFF);
    }

    public final void a(TranscodingEnabled transcodingenabled)
    {
        Timber.a("TranscodingPreferencesWrapper", (new StringBuilder("storeTranscodingState ")).append(transcodingenabled.name()).toString(), new Object[0]);
        Bt.r(transcodingenabled.name());
        (new EasyMetric("STORE_TRANSCODING_STATE")).a("transcoding_status", transcodingenabled.name()).a("transcoding_history", c.toString()).b(false);
    }

    public final void a(String s, boolean flag, String s1)
    {
label0:
        {
            c.a(s, flag, s1);
            s = c.b.entrySet().iterator();
            int i = 0;
            do
            {
                if (!s.hasNext())
                {
                    break;
                }
                if (!((rv.a)((java.util.Map.Entry)s.next()).getValue()).a)
                {
                    i++;
                }
            } while (true);
            if (i >= 5)
            {
                Timber.e("TranscodingPreferencesWrapper", "Transcoding has failed too many times disabling for phone", new Object[0]);
                (new EasyMetric("TRANSCODING_DISABLED")).a("transcoding_history", c.toString()).b(false);
                a(TranscodingEnabled.DISABLED);
            }
            if (e() == TranscodingEnabled.ENABLED_FOR_LOW_QUALITY)
            {
                if (!flag)
                {
                    break label0;
                }
                a(TranscodingEnabled.ENABLED);
            }
            return;
        }
        a(TranscodingEnabled.DISABLED);
    }

}
