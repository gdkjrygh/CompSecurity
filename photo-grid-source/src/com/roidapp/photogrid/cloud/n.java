// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            BaseShareActivity

public final class n extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    private WeakReference a;

    public n()
    {
    }

    public final n a(BaseShareActivity baseshareactivity)
    {
        a = new WeakReference(baseshareactivity);
        return this;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (a == null)
        {
            a = null;
            return;
        }
        dialoginterface = (BaseShareActivity)a.get();
        if (dialoginterface == null || dialoginterface.isFinishing())
        {
            a = null;
            return;
        }
        switch (i)
        {
        default:
            return;

        case -2: 
            af.c(dialoginterface, "FitInstagramDialog/No");
            BaseShareActivity.a(dialoginterface, ((BaseShareActivity) (dialoginterface)).f, ((BaseShareActivity) (dialoginterface)).h);
            return;

        case -1: 
            af.c(dialoginterface, "FitInstagramDialog/Yes");
            break;
        }
        BaseShareActivity.f(dialoginterface);
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        b.a("FitInstagramDialog/onCreate");
        if (a == null)
        {
            a = null;
            setShowsDialog(false);
            return null;
        }
        bundle = (BaseShareActivity)a.get();
        if (bundle == null || bundle.isFinishing())
        {
            a = null;
            setShowsDialog(false);
            return null;
        } else
        {
            android.view.View view = LayoutInflater.from(bundle).inflate(0x7f0300a1, null);
            return (new android.app.AlertDialog.Builder(bundle)).setView(view).setPositiveButton(0x7f070164, this).setNegativeButton(0x7f070163, this).create();
        }
    }
}
