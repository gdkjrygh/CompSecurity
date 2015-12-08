// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzfu, zzid, zzha

public class zzfv extends zzfu
{

    private Object zzBx;
    private PopupWindow zzBy;
    private boolean zzBz;

    zzfv(Context context, zzha.zza zza, zzid zzid1, zzft.zza zza1)
    {
        super(context, zza, zzid1, zza1);
        zzBx = new Object();
        zzBz = false;
    }

    private void zzfo()
    {
        synchronized (zzBx)
        {
            zzBz = true;
            if ((mContext instanceof Activity) && ((Activity)mContext).isDestroyed())
            {
                zzBy = null;
            }
            if (zzBy != null)
            {
                if (zzBy.isShowing())
                {
                    zzBy.dismiss();
                }
                zzBy = null;
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
        zzfo();
        super.onStop();
    }

    protected void zzfn()
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
        framelayout.addView(zzoA.getWebView(), -1, -1);
        synchronized (zzBx)
        {
            if (!zzBz)
            {
                break MISSING_BLOCK_LABEL_108;
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzBy = new PopupWindow(framelayout, 1, 1, false);
        zzBy.setOutsideTouchable(true);
        zzBy.setClippingEnabled(false);
        zzb.zzay("Displaying the 1x1 popup off the screen.");
        zzBy.showAtLocation(((Window) (obj)).getDecorView(), 0, -1, -1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        zzBy = null;
          goto _L1
    }

    protected void zzk(zzha zzha)
    {
        zzfo();
        super.zzk(zzha);
    }
}
