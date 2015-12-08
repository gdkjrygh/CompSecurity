// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import com.netflix.mediaclient.Log;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            SocialOptInDialogFrag

class tInResponseHandler
    implements android.view.lOptInDialogFrag._cls1
{

    final SocialOptInDialogFrag this$0;
    final tInResponseHandler val$handler;

    public void onClick(View view)
    {
label0:
        {
            Log.d("social", "User opted In!");
            synchronized (SocialOptInDialogFrag.access$000(SocialOptInDialogFrag.this))
            {
                if (!SocialOptInDialogFrag.access$000(SocialOptInDialogFrag.this).get())
                {
                    break label0;
                }
                Log.w("social", "Already clicked!");
            }
            return;
        }
        SocialOptInDialogFrag.access$000(SocialOptInDialogFrag.this).set(true);
        view;
        JVM INSTR monitorexit ;
        dismiss();
        getFragmentManager().beginTransaction().remove(SocialOptInDialogFrag.this).commit();
        val$handler.onAccept();
        return;
        exception;
        view;
        JVM INSTR monitorexit ;
        throw exception;
    }

    tInResponseHandler()
    {
        this$0 = final_socialoptindialogfrag;
        val$handler = tInResponseHandler.this;
        super();
    }
}
