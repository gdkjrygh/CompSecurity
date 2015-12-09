// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.restrictions;

import android.content.Context;
import com.fitbit.savedstate.ServerSavedState;

// Referenced classes of package com.fitbit.serverinteraction.restrictions:
//            RestrictionsController, RestrictionInfo

public static final class  extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/serverinteraction/restrictions/RestrictionsController$PresenceListener$OfflineReason, s);
    }

    public static [] values()
    {
        return ([])f.clone();
    }

    public String a(Context context, RestrictionsController restrictionscontroller)
    {
        int i = 0x7f08018e;
        n_3B_.clone[ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 42
    //                   2 48
    //                   3 66;
           goto _L1 _L2 _L3 _L4
_L1:
        return context.getString(i);
_L2:
        i = 0x7f08053d;
        continue; /* Loop/switch isn't completed */
_L3:
        if (!ServerSavedState.l().ordinal(com.fitbit.savedstate.tener.OfflineReason.ordinal))
        {
            i = 0x7f08018d;
        }
        if (true) goto _L1; else goto _L4
_L4:
        restrictionscontroller = restrictionscontroller.c();
        if (restrictionscontroller != null)
        {
            return restrictionscontroller.d();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static 
    {
        a = new <init>("NO_NETWORK_CONNECTION", 0);
        b = new <init>("SERVER_UNAVAILABLE", 1);
        c = new <init>("INTERNAL_SERVER_ERROR", 2);
        d = new <init>("BLOCKED_BY_RESTRICTION", 3);
        e = new <init>("BACKOFF", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
