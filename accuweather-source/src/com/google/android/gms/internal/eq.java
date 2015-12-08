// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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
//            ep

public final class eq
{

    private final Context mContext;
    private int mState;
    private String sl;
    private final float sm;
    private float sn;
    private float so;
    private float sp;

    public eq(Context context)
    {
        mState = 0;
        mContext = context;
        sm = context.getResources().getDisplayMetrics().density;
    }

    public eq(Context context, String s)
    {
        this(context);
        sl = s;
    }

    static Context a(eq eq1)
    {
        return eq1.mContext;
    }

    private void a(int i, float f, float f1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        mState = 0;
        sn = f;
        so = f1;
        sp = f1;
_L4:
        return;
_L2:
        if (mState == -1) goto _L4; else goto _L3
_L3:
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 <= so) goto _L6; else goto _L5
_L5:
        so = f1;
_L8:
        if (so - sp > 30F * sm)
        {
            mState = -1;
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (f1 < sp)
        {
            sp = f1;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (mState == 0 || mState == 2)
        {
            if (f - sn >= 50F * sm)
            {
                sn = f;
                mState = mState + 1;
            }
        } else
        if ((mState == 1 || mState == 3) && f - sn <= -50F * sm)
        {
            sn = f;
            mState = mState + 1;
        }
        if (mState != 1 && mState != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f <= sn) goto _L4; else goto _L9
_L9:
        sn = f;
        return;
        if (mState != 2 || f >= sn) goto _L4; else goto _L10
_L10:
        sn = f;
        return;
        if (i != 1 || mState != 4) goto _L4; else goto _L11
_L11:
        showDialog();
        return;
    }

    private void showDialog()
    {
        Object obj;
        if (!TextUtils.isEmpty(sl))
        {
            Object obj1 = (new android.net.Uri.Builder()).encodedQuery(sl).build();
            obj = new StringBuilder();
            obj1 = ep.b(((android.net.Uri) (obj1)));
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

            final String sq;
            final eq sr;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                eq.a(sr).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", sq), "Share via"));
            }

            
            {
                sr = eq.this;
                sq = s;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj1)).setNegativeButton("Close", new android.content.DialogInterface.OnClickListener() {

            final eq sr;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                sr = eq.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj1)).create().show();
    }

    public void c(MotionEvent motionevent)
    {
        int j = motionevent.getHistorySize();
        for (int i = 0; i < j; i++)
        {
            a(motionevent.getActionMasked(), motionevent.getHistoricalX(0, i), motionevent.getHistoricalY(0, i));
        }

        a(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
    }

    public void x(String s)
    {
        sl = s;
    }
}
