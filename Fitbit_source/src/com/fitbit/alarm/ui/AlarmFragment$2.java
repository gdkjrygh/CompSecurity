// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Intent;
import android.support.v4.app.LoaderManager;
import com.fitbit.data.domain.device.Device;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;
import java.util.Set;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmFragment

class a extends c
{

    final AlarmFragment a;

    public void a(Intent intent)
    {
        boolean flag1;
        boolean flag2;
        flag1 = true;
        intent = intent.getAction();
        flag2 = AlarmFragment.b(a);
        if (!"com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED".equals(intent) || !flag2) goto _L2; else goto _L1
_L1:
        if (a.d.c() != com.fitbit.galileo.service.tateListener.GalileoState.a) goto _L4; else goto _L3
_L3:
        Set set;
        intent = p.c(a.f);
        set = a.d.i();
        if (intent == null || !set.contains(intent.c())) goto _L6; else goto _L5
_L5:
        boolean flag = flag1;
        if (TrackerSyncPreferencesSavedState.D())
        {
            if (!TrackerSyncPreferencesSavedState.x())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        intent = a.d.a(intent.c());
        if (!flag && intent != com.fitbit.galileo.protocol.commands.ailureType.e) goto _L8; else goto _L7
_L7:
        com.fitbit.alarm.ui.AlarmFragment.c(a);
_L6:
        if (a.getActivity() != null)
        {
            a.getLoaderManager().restartLoader(190, null, a);
        }
        AlarmFragment.a(a, false);
_L2:
        return;
_L8:
        if (intent != null && intent != com.fitbit.galileo.protocol.commands.ailureType.b && intent != com.fitbit.galileo.protocol.commands.ailureType.e)
        {
            AlarmFragment.d(a);
        }
        if (true) goto _L6; else goto _L4
_L4:
        AlarmFragment.a(a, true);
        return;
    }

    (AlarmFragment alarmfragment)
    {
        a = alarmfragment;
        super();
    }
}
