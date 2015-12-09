// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class HardcodedSynclairSavedState extends a
{
    public static final class SynclairDebugConfigType extends Enum
    {

        public static final SynclairDebugConfigType a;
        public static final SynclairDebugConfigType b;
        public static final SynclairDebugConfigType c;
        private static final SynclairDebugConfigType d[];
        private final int code;

        static int a(SynclairDebugConfigType synclairdebugconfigtype)
        {
            return synclairdebugconfigtype.code;
        }

        public static SynclairDebugConfigType a(int i)
        {
            SynclairDebugConfigType asynclairdebugconfigtype[] = values();
            int k = asynclairdebugconfigtype.length;
            for (int j = 0; j < k; j++)
            {
                SynclairDebugConfigType synclairdebugconfigtype = asynclairdebugconfigtype[j];
                if (synclairdebugconfigtype.a() == i)
                {
                    return synclairdebugconfigtype;
                }
            }

            throw new IllegalArgumentException();
        }

        public static SynclairDebugConfigType valueOf(String s)
        {
            return (SynclairDebugConfigType)Enum.valueOf(com/fitbit/savedstate/HardcodedSynclairSavedState$SynclairDebugConfigType, s);
        }

        public static SynclairDebugConfigType[] values()
        {
            return (SynclairDebugConfigType[])d.clone();
        }

        public int a()
        {
            return code;
        }

        static 
        {
            a = new SynclairDebugConfigType("UNCHANGED", 0, 0);
            b = new SynclairDebugConfigType("SURGE", 1, 1);
            c = new SynclairDebugConfigType("CHARGE_HR", 2, 2);
            d = (new SynclairDebugConfigType[] {
                a, b, c
            });
        }

        private SynclairDebugConfigType(String s, int i, int j)
        {
            super(s, i);
            code = j;
        }
    }


    private static final HardcodedSynclairSavedState b = new HardcodedSynclairSavedState();
    private static final String c = "CURRENT_SYNCLAIR_CONFIG_TYPE";

    HardcodedSynclairSavedState()
    {
        super("HardcodedSynclairConfigsSavedState");
    }

    public static void a(SynclairDebugConfigType synclairdebugconfigtype)
    {
        com/fitbit/savedstate/HardcodedSynclairSavedState;
        JVM INSTR monitorenter ;
        if (synclairdebugconfigtype == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("CURRENT_SYNCLAIR_CONFIG_TYPE", SynclairDebugConfigType.a(synclairdebugconfigtype));
        editor.apply();
        com/fitbit/savedstate/HardcodedSynclairSavedState;
        JVM INSTR monitorexit ;
        return;
        synclairdebugconfigtype;
        throw synclairdebugconfigtype;
    }

    protected static a g()
    {
        return b;
    }

    public static SynclairDebugConfigType h()
    {
        com/fitbit/savedstate/HardcodedSynclairSavedState;
        JVM INSTR monitorenter ;
        Object obj;
        obj = b.b();
        int i = SynclairDebugConfigType.a(SynclairDebugConfigType.a);
        if (BuildType.e == b.a)
        {
            i = ((SharedPreferences) (obj)).getInt("CURRENT_SYNCLAIR_CONFIG_TYPE", SynclairDebugConfigType.a(SynclairDebugConfigType.a));
        }
        obj = SynclairDebugConfigType.a(i);
        com/fitbit/savedstate/HardcodedSynclairSavedState;
        JVM INSTR monitorexit ;
        return ((SynclairDebugConfigType) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i, j, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.HardcodedSynclairConfigs.CURRENT_SYNCLAIR_CONFIG_TYPE"))
        {
            editor.putInt("CURRENT_SYNCLAIR_CONFIG_TYPE", context.getInt("SavedState.HardcodedSynclairConfigs.CURRENT_SYNCLAIR_CONFIG_TYPE", 0));
            editor1.remove("SavedState.HardcodedSynclairConfigs.CURRENT_SYNCLAIR_CONFIG_TYPE");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

}
