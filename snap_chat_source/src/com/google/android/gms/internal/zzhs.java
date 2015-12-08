// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzab, zzho

public class zzhs
{

    private final Context mContext;
    private int mState;
    private final float zztH;
    private String zzzv;
    private float zzzw;
    private float zzzx;
    private float zzzy;

    public zzhs(Context context)
    {
        mState = 0;
        mContext = context;
        zztH = context.getResources().getDisplayMetrics().density;
    }

    public zzhs(Context context, String s)
    {
        this(context);
        zzzv = s;
    }

    private void showDialog()
    {
        if (!(mContext instanceof Activity))
        {
            zzhx.zzaa("Can not create dialog without Activity Context");
            return;
        }
        Object obj;
        if (!TextUtils.isEmpty(zzzv))
        {
            Object obj1 = (new android.net.Uri.Builder()).encodedQuery(zzzv).build();
            obj = new StringBuilder();
            obj1 = zzab.zzaM().zzd(((android.net.Uri) (obj1)));
            String s;
            for (Iterator iterator = ((Map) (obj1)).keySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(s).append(" = ").append((String)((Map) (obj1)).get(s)).append("\n\n"))
            {
                s = (String)iterator.next();
            }

            obj = ((StringBuilder) (obj)).toString().trim();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = "No debug information";
            }
        } else
        {
            obj = "No debug information";
        }
        obj1 = new android.app.AlertDialog.Builder(mContext);
        ((android.app.AlertDialog.Builder) (obj1)).setMessage(((CharSequence) (obj)));
        ((android.app.AlertDialog.Builder) (obj1)).setTitle("Ad Information");
        ((android.app.AlertDialog.Builder) (obj1)).setPositiveButton("Share", new android.content.DialogInterface.OnClickListener(((String) (obj))) {

            final zzhs zzzA;
            final String zzzz;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                zzhs.zza(zzzA).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", zzzz), "Share via"));
            }

            
            {
                zzzA = zzhs.this;
                zzzz = s;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj1)).setNegativeButton("Close", new android.content.DialogInterface.OnClickListener() {

            final zzhs zzzA;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                zzzA = zzhs.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj1)).create().show();
    }

    static Context zza(zzhs zzhs1)
    {
        return zzhs1.mContext;
    }

    public void zzV(String s)
    {
        zzzv = s;
    }

    void zza(int i, float f, float f1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        mState = 0;
        zzzw = f;
        zzzx = f1;
        zzzy = f1;
_L4:
        return;
_L2:
        if (mState == -1) goto _L4; else goto _L3
_L3:
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 <= zzzx) goto _L6; else goto _L5
_L5:
        zzzx = f1;
_L8:
        if (zzzx - zzzy > 30F * zztH)
        {
            mState = -1;
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (f1 < zzzy)
        {
            zzzy = f1;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (mState == 0 || mState == 2)
        {
            if (f - zzzw >= 50F * zztH)
            {
                zzzw = f;
                mState = mState + 1;
            }
        } else
        if ((mState == 1 || mState == 3) && f - zzzw <= -50F * zztH)
        {
            zzzw = f;
            mState = mState + 1;
        }
        if (mState != 1 && mState != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f <= zzzw) goto _L4; else goto _L9
_L9:
        zzzw = f;
        return;
        if (mState != 2 || f >= zzzw) goto _L4; else goto _L10
_L10:
        zzzw = f;
        return;
        if (i != 1 || mState != 4) goto _L4; else goto _L11
_L11:
        showDialog();
        return;
    }

    public void zzc(MotionEvent motionevent)
    {
        int j = motionevent.getHistorySize();
        for (int i = 0; i < j; i++)
        {
            zza(motionevent.getActionMasked(), motionevent.getHistoricalX(0, i), motionevent.getHistoricalY(0, i));
        }

        zza(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
    }
}
