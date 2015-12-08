// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.moviemaker.ui.ProgressSpinner;

public final class cfl
    implements bqr, brg, brt
{

    private final am a;
    private final ProgressSpinner b;
    private final TextView c;
    private final ImageView d;
    private final View e;

    public cfl(am am1)
    {
        a = (am)b.a(am1, "fragment", null);
        b = (ProgressSpinner)a(b.gQ);
        c = (TextView)a(b.gD);
        d = (ImageView)a(b.gC);
        e = a(b.gF);
    }

    private View a(int i)
    {
        View view = a.R.findViewById(i);
        String s = String.valueOf(a.g().getResourceName(i));
        return (View)c.a(view, (new StringBuilder(String.valueOf(s).length() + 19)).append("View ").append(i).append(" / ").append(s).toString(), null);
    }

    public final void a()
    {
        c.setText("");
        c.setVisibility(8);
    }

    public final void a(int i, int j)
    {
        c.setVisibility(0);
        c.setText(a.g().getString(i, new Object[] {
            Integer.valueOf(j)
        }));
    }

    public final void a(Bitmap bitmap)
    {
        d.setImageBitmap(bitmap);
        ImageView imageview = d;
        byte byte0;
        if (bitmap == null)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    public final void a(boolean flag)
    {
        View view = e;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (!flag || b.getVisibility() == 0) goto _L2; else goto _L1
_L1:
        if (!flag1) goto _L4; else goto _L3
_L3:
        ProgressSpinner progressspinner = b;
        progressspinner.setVisibility(0);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(progressspinner, ProgressSpinner.a, new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(progressspinner.getResources().getInteger(b.ht));
        objectanimator.addListener(new dag(progressspinner));
        objectanimator.start();
_L6:
        return;
_L4:
        b.setVisibility(0);
        return;
_L2:
        if (!flag)
        {
            b.setVisibility(8);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
