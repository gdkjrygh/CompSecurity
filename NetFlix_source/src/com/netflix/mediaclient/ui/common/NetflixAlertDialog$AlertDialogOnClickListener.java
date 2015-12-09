// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import com.netflix.mediaclient.Log;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            NetflixAlertDialog

private class mActionId
    implements android.view.ialogOnClickListener
{

    private final String mActionId;
    final NetflixAlertDialog this$0;

    public void onClick(View view)
    {
        if (Log.isLoggable("dialog", 3))
        {
            Log.d("dialog", (new StringBuilder()).append("Clicked on ").append(mActionId).toString());
        }
        view = getActivity();
        if (view == null)
        {
            Log.e("dialog", "Activity is NULL, we can update rating!");
            return;
        }
        synchronized (NetflixAlertDialog.access$000(NetflixAlertDialog.this))
        {
            if (!NetflixAlertDialog.access$000(NetflixAlertDialog.this).get())
            {
                break MISSING_BLOCK_LABEL_97;
            }
            Log.w("dialog", "Already clicked!");
        }
        return;
        view;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw view;
        NetflixAlertDialog.access$000(NetflixAlertDialog.this).set(true);
        atomicboolean;
        JVM INSTR monitorexit ;
        Intent intent = new Intent("nflx_button_selected");
        intent.putExtra("nflx_action_selected", mActionId);
        intent.putExtra("nflx_dialog_id", NetflixAlertDialog.access$100(NetflixAlertDialog.this));
        intent.addCategory("LocalIntentNflxUi");
        LocalBroadcastManager.getInstance(getActivity()).sendBroadcast(intent);
        LocalBroadcastManager.getInstance(view).sendBroadcast(intent);
        dismissAllowingStateLoss();
        getFragmentManager().beginTransaction().remove(NetflixAlertDialog.this).commit();
        return;
    }

    public (String s)
    {
        this$0 = NetflixAlertDialog.this;
        super();
        mActionId = s;
    }
}
