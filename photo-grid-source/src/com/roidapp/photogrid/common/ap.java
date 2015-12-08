// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.photogrid.release.PhotoGridActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            aq, ar, as, at, 
//            au, av, aw, ax, 
//            ay

public final class ap
{

    private TextView a;
    private Drawable b;
    private Drawable c;
    private ImageView d;
    private Handler e;

    public ap()
    {
        e = new aq(this);
    }

    static TextView a(ap ap1)
    {
        return ap1.a;
    }

    static ImageView b(ap ap1)
    {
        return ap1.d;
    }

    static Drawable c(ap ap1)
    {
        return ap1.b;
    }

    static Drawable d(ap ap1)
    {
        return ap1.c;
    }

    static Handler e(ap ap1)
    {
        return ap1.e;
    }

    public final void a(Activity activity)
    {
        if (activity == null || activity.isFinishing())
        {
            return;
        }
        try
        {
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(activity)).create();
            alertdialog.setCanceledOnTouchOutside(false);
            alertdialog.setOnKeyListener(new ar(this, activity, alertdialog));
            alertdialog.show();
            alertdialog.setContentView(0x7f030108);
            ((Button)alertdialog.findViewById(0x7f0d0419)).setOnClickListener(new as(this, alertdialog, activity));
            ((Button)alertdialog.findViewById(0x7f0d0418)).setOnClickListener(new at(this, activity, alertdialog));
            ((ImageView)alertdialog.findViewById(0x7f0d0415)).setOnClickListener(new au(this, activity, alertdialog));
            return;
        }
        catch (android.view.WindowManager.BadTokenException badtokenexception)
        {
            ((PhotoGridActivity)activity).i = false;
            badtokenexception.printStackTrace();
            return;
        }
    }

    public final void b(Activity activity)
    {
        if (activity == null || activity.isFinishing())
        {
            return;
        }
        AlertDialog alertdialog;
        alertdialog = (new android.app.AlertDialog.Builder(activity)).create();
        alertdialog.setCanceledOnTouchOutside(false);
        alertdialog.setOnKeyListener(new av(this, activity, alertdialog));
        alertdialog.setOnDismissListener(new aw(this, activity));
        alertdialog.show();
        alertdialog.setContentView(0x7f030107);
        d = (ImageView)alertdialog.findViewById(0x7f0d0410);
        a = (TextView)alertdialog.findViewById(0x7f0d0411);
        b = activity.getResources().getDrawable(0x7f0205e7);
        c = activity.getResources().getDrawable(0x7f0205e8);
_L1:
        android.view.WindowManager.BadTokenException badtokenexception;
        d.setImageDrawable(b);
        ((Button)alertdialog.findViewById(0x7f0d0413)).setOnClickListener(new ax(this, activity, alertdialog));
        ((Button)alertdialog.findViewById(0x7f0d0414)).setOnClickListener(new ay(this, activity, alertdialog));
        e.sendEmptyMessageDelayed(1, 300L);
        return;
        Object obj;
        obj;
        try
        {
            ((OutOfMemoryError) (obj)).printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (android.view.WindowManager.BadTokenException badtokenexception)
        {
            ((PhotoGridActivity)activity).i = false;
            badtokenexception.printStackTrace();
            return;
        }
          goto _L1
        obj;
        ((Exception) (obj)).printStackTrace();
          goto _L1
    }
}
