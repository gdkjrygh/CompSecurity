// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

// Referenced classes of package com.google.android.gms.internal:
//            zzgd, zzic, zzhx, zzhe

public class zzge extends zzgd
{

    private Object zzvT;
    private PopupWindow zzvU;
    private boolean zzvV;

    zzge(Context context, zzhe.zza zza, zzic zzic1, zzgc.zza zza1)
    {
        super(context, zza, zzic1, zza1);
        zzvT = new Object();
        zzvV = false;
    }

    private void zzdH()
    {
        synchronized (zzvT)
        {
            zzvV = true;
            if ((mContext instanceof Activity) && ((Activity)mContext).isDestroyed())
            {
                zzvU = null;
            }
            if (zzvU != null)
            {
                if (zzvU.isShowing())
                {
                    zzvU.dismiss();
                }
                zzvU = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onStop()
    {
        zzdH();
        super.onStop();
    }

    protected void zzdG()
    {
        FrameLayout framelayout;
        if (mContext instanceof Activity)
        {
            obj = ((Activity)mContext).getWindow();
        } else
        {
            obj = null;
        }
        while (obj == null || ((Window) (obj)).getDecorView() == null || ((Activity)mContext).isDestroyed()) 
        {
            return;
        }
        framelayout = new FrameLayout(mContext);
        framelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        framelayout.addView(zzmu.getWebView(), -1, -1);
        synchronized (zzvT)
        {
            if (!zzvV)
            {
                break MISSING_BLOCK_LABEL_108;
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzvU = new PopupWindow(framelayout, 1, 1, false);
        zzvU.setOutsideTouchable(true);
        zzvU.setClippingEnabled(false);
        zzhx.zzY("Displaying the 1x1 popup off the screen.");
        zzvU.showAtLocation(((Window) (obj)).getDecorView(), 0, -1, -1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        zzvU = null;
          goto _L1
    }

    protected void zzh(zzhe zzhe)
    {
        zzdH();
        super.zzh(zzhe);
    }
}
