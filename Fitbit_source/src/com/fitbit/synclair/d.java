// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import com.fitbit.data.bl.exceptions.SynclairBackOffException;
import com.fitbit.e.a;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionInfo;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import java.util.Iterator;
import java.util.List;

public class d
{
    private static class a
    {

        public static d a = new d();


        private a()
        {
        }
    }


    private static final int a[] = {
        300, 1260, 2400
    };
    private static final int b[] = {
        1260, 2400, 3600
    };
    private static final int c = -1;
    private final com.fitbit.serverinteraction.restrictions.RestrictionsController.a d;

    private d()
    {
        d = new com.fitbit.serverinteraction.restrictions.RestrictionsController.a() {

            final d a;

            public void a(RestrictionInfo restrictioninfo)
            {
            }

            public void a(List list)
            {
                this;
                JVM INSTR monitorenter ;
                boolean flag;
                flag = false;
                if (list == null)
                {
                    break MISSING_BLOCK_LABEL_109;
                }
                list = list.iterator();
_L3:
                RestrictionInfo restrictioninfo;
                if (!list.hasNext())
                {
                    break MISSING_BLOCK_LABEL_109;
                }
                restrictioninfo = (RestrictionInfo)list.next();
                if (!restrictioninfo.e().equals("warning_device_sync_backed_off")) goto _L2; else goto _L1
_L1:
                com.fitbit.synclair.d.a(a, -1, com.fitbit.savedstate.TrackerSyncPreferencesSavedState.SynclairBackOffReason.a);
                  goto _L3
_L2:
                if (!restrictioninfo.e().equals("warning_device_pairing_backed_off") && !restrictioninfo.e().equals("warning_device_firmware_updates_backed_off") || flag) goto _L3; else goto _L4
_L4:
                flag = true;
                d.b(a, -1, com.fitbit.savedstate.TrackerSyncPreferencesSavedState.SynclairBackOffReason.a);
                  goto _L3
                list;
                throw list;
                this;
                JVM INSTR monitorexit ;
            }

            public void b(RestrictionInfo restrictioninfo)
            {
            }

            
            {
                a = d.this;
                super();
            }
        };
        ServerGateway.a().b().b(d);
    }


    private long a(int i)
    {
        return System.currentTimeMillis() + (long)i * 1000L;
    }

    public static d a()
    {
        return com.fitbit.synclair.a.a;
    }

    private void a(int i, com.fitbit.savedstate.TrackerSyncPreferencesSavedState.SynclairBackOffReason synclairbackoffreason)
    {
        if (TrackerSyncPreferencesSavedState.x())
        {
            int j = i;
            if (i <= 0)
            {
                int k = TrackerSyncPreferencesSavedState.z();
                j = i;
                if (k < a.length)
                {
                    i = a[k];
                    j = b[k];
                    double d1 = i;
                    double d2 = Math.random();
                    i = (int)((double)(j - i) * d2 + d1);
                    j = i;
                    if (k < a.length - 1)
                    {
                        TrackerSyncPreferencesSavedState.B();
                        j = i;
                    }
                }
            }
            com.fitbit.e.a.a("SYNCLAIR BACKOFF", "SYNCLAIR BACKOFF: Sync back off retry interval set to %s sec", new Object[] {
                Integer.valueOf(j)
            });
            TrackerSyncPreferencesSavedState.a(a(j), synclairbackoffreason);
        }
    }

    static void a(d d1, int i, com.fitbit.savedstate.TrackerSyncPreferencesSavedState.SynclairBackOffReason synclairbackoffreason)
    {
        d1.a(i, synclairbackoffreason);
    }

    private void b(int i, com.fitbit.savedstate.TrackerSyncPreferencesSavedState.SynclairBackOffReason synclairbackoffreason)
    {
        if (TrackerSyncPreferencesSavedState.D())
        {
            int j = i;
            if (i <= 0)
            {
                int k = TrackerSyncPreferencesSavedState.E();
                j = i;
                if (k < a.length)
                {
                    i = a[k];
                    j = b[k];
                    double d1 = i;
                    double d2 = Math.random();
                    i = (int)((double)(j - i) * d2 + d1);
                    j = i;
                    if (k < a.length - 1)
                    {
                        TrackerSyncPreferencesSavedState.G();
                        j = i;
                    }
                }
            }
            com.fitbit.e.a.a("SYNCLAIR BACKOFF", "SYNCLAIR BACKOFF: All back off retry interval set to %s sec", new Object[] {
                Integer.valueOf(j)
            });
            TrackerSyncPreferencesSavedState.b(a(j), synclairbackoffreason);
        }
    }

    static void b(d d1, int i, com.fitbit.savedstate.TrackerSyncPreferencesSavedState.SynclairBackOffReason synclairbackoffreason)
    {
        d1.b(i, synclairbackoffreason);
    }

    public void a(SynclairBackOffException synclairbackoffexception)
    {
        if (synclairbackoffexception != null)
        {
            a(synclairbackoffexception.g(), com.fitbit.savedstate.TrackerSyncPreferencesSavedState.SynclairBackOffReason.b);
        }
    }

    public void b(SynclairBackOffException synclairbackoffexception)
    {
        if (synclairbackoffexception != null)
        {
            b(synclairbackoffexception.g(), com.fitbit.savedstate.TrackerSyncPreferencesSavedState.SynclairBackOffReason.b);
        }
    }

}
