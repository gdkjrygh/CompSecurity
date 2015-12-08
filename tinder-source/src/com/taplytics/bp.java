// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package com.taplytics:
//            ci, em, cv, turkey, 
//            gb, gs, bq

public final class bp
{

    private static bp d = null;
    AlertDialog a;
    AlertDialog b;
    AlertDialog c;

    public bp()
    {
    }

    public static bp a()
    {
        if (d != null)
        {
            return d;
        } else
        {
            bp bp1 = new bp();
            d = bp1;
            return bp1;
        }
    }

    static void a(bp bp1)
    {
        bp1 = (ViewGroup)((ViewGroup)((ViewGroup)((ViewGroup)((FrameLayout)bp1.a.getWindow().getDecorView()).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        if (!(bp1.getChildAt(0) instanceof LinearLayout)) goto _L2; else goto _L1
_L1:
        bp1 = (LinearLayout)bp1.getChildAt(0);
_L8:
        TextView textview;
        bp1.setOrientation(1);
        textview = new TextView(ci.b().v);
        if (!em.a().a) goto _L4; else goto _L3
_L3:
        Object obj = (new StringBuilder()).append("  Connectivity: ").append("connected.").toString();
_L6:
        TextView textview1 = new TextView(ci.b().v);
        textview1.setText("This pop-up will only appear on devices with debug builds, or on release build devices previously connected to Taplytics in debug. \n");
        textview1.setTextSize(9F);
        bp1.addView(textview1, 2);
        textview.setText(((CharSequence) (obj)));
        bp1.addView(textview, 3);
        if (cv.a().a)
        {
            obj = new TextView(ci.b().v);
            textview = new TextView(ci.b().v);
            if (cv.a().e != null && !cv.a().e.equals(""))
            {
                ((TextView) (obj)).setText((new StringBuilder("  Experiment: ")).append(cv.a().e).toString());
                bp1.addView(((View) (obj)), 4);
            }
            if (cv.a().f != null && !cv.a().f.equals(""))
            {
                textview.setText((new StringBuilder("  Variation: ")).append(cv.a().f).toString());
                bp1.addView(textview, 5);
                return;
            }
        }
          goto _L5
_L2:
        try
        {
            if (bp1.getChildAt(1) instanceof LinearLayout)
            {
                bp1 = (LinearLayout)bp1.getChildAt(1);
                continue; /* Loop/switch isn't completed */
            }
        }
        // Misplaced declaration of an exception variable
        catch (bp bp1)
        {
            gs.b("Error adding extra info to dialog", bp1);
        }
          goto _L5
_L4:
        obj = (new StringBuilder()).append("  Connectivity: ").append(" not connected to Taplytics.").toString();
        textview.setTextColor(gb.a(turkey.e));
          goto _L6
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(bp bp1, String s, Exception exception)
    {
        gs.b((new StringBuilder("dialog err ")).append(s).toString(), exception);
        if (!ci.b().l || ci.b().v == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s = Toast.makeText(ci.b().v, "There was an error creating your experiment list. Please contact taplytics for help.", 1);
        exception = (TextView)s.getView().findViewById(0x102000b);
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        exception.setGravity(17);
        s.show();
_L2:
        bp1.c();
        return;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b()
    {
        try
        {
            if (ci.b().v != null)
            {
                (new Handler(Looper.getMainLooper())).post(new bq(this));
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("dialog err", exception);
        }
    }

    public final void c()
    {
        try
        {
            if (a != null && a.isShowing())
            {
                a.dismiss();
            }
            if (b != null && a != null && a.isShowing())
            {
                b.dismiss();
            }
            if (c != null && c.isShowing())
            {
                c.dismiss();
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("problem killing dialogs", exception);
        }
    }

}
