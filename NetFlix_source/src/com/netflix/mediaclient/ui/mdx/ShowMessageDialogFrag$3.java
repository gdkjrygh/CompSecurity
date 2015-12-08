// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import com.netflix.mediaclient.Log;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            ShowMessageDialogFrag

class val.codes
    implements android.content.istener
{

    final ShowMessageDialogFrag this$0;
    final String val$codes[];

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
            synchronized (ShowMessageDialogFrag.access$000(ShowMessageDialogFrag.this))
            {
                if (!ShowMessageDialogFrag.access$000(ShowMessageDialogFrag.this).get())
                {
                    break label0;
                }
                Log.w("mdxui", "Already clicked!");
            }
            return;
        }
        ShowMessageDialogFrag.access$000(ShowMessageDialogFrag.this).set(true);
        dialoginterface;
        JVM INSTR monitorexit ;
        dismissAllowingStateLoss();
        getFragmentManager().beginTransaction().remove(ShowMessageDialogFrag.this).commit();
        dialoginterface = getActivity();
        if (dialoginterface instanceof ssageResponseProvider)
        {
            ((ssageResponseProvider)dialoginterface).onResponse(val$codes[2]);
            return;
        } else
        {
            return;
        }
        exception;
        dialoginterface;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ssageResponseProvider()
    {
        this$0 = final_showmessagedialogfrag;
        val$codes = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
