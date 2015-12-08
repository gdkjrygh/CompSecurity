// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.restrictions;

import android.content.Context;
import com.fitbit.savedstate.ServerSavedState;

// Referenced classes of package com.fitbit.serverinteraction.restrictions:
//            RestrictionsController, RestrictionInfo

public static interface OfflineReason
{
    public static final class OfflineReason extends Enum
    {

        public static final OfflineReason a;
        public static final OfflineReason b;
        public static final OfflineReason c;
        public static final OfflineReason d;
        public static final OfflineReason e;
        private static final OfflineReason f[];

        public static OfflineReason valueOf(String s)
        {
            return (OfflineReason)Enum.valueOf(com/fitbit/serverinteraction/restrictions/RestrictionsController$PresenceListener$OfflineReason, s);
        }

        public static OfflineReason[] values()
        {
            return (OfflineReason[])f.clone();
        }

        public String a(Context context, RestrictionsController restrictionscontroller)
        {
            int i = 0x7f08018e;
            RestrictionsController._cls1.a[ordinal()];
            JVM INSTR tableswitch 1 3: default 36
        //                       1 42
        //                       2 48
        //                       3 66;
               goto _L1 _L2 _L3 _L4
_L1:
            return context.getString(i);
_L2:
            i = 0x7f08053d;
            continue; /* Loop/switch isn't completed */
_L3:
            if (!ServerSavedState.l().equals(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a))
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
            a = new OfflineReason("NO_NETWORK_CONNECTION", 0);
            b = new OfflineReason("SERVER_UNAVAILABLE", 1);
            c = new OfflineReason("INTERNAL_SERVER_ERROR", 2);
            d = new OfflineReason("BLOCKED_BY_RESTRICTION", 3);
            e = new OfflineReason("BACKOFF", 4);
            f = (new OfflineReason[] {
                a, b, c, d, e
            });
        }

        private OfflineReason(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a();

    public abstract void a(OfflineReason offlinereason);
}
