// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public final class jpf extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final ImageButton a;
    private final jpg b;

    public jpf(Context context, int i, jpg jpg1)
    {
        super(context);
        b = jpg1;
        setOnClickListener(this);
        a = new ImageButton(context);
        a.setImageResource(0x1080017);
        a.setBackgroundColor(0);
        a.setOnClickListener(this);
        a.setPadding(0, 0, 0, 0);
        a.setContentDescription("Interstitial close button");
        i = jof.a().a(context, i);
        addView(a, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (flag1)
        {
            if (flag)
            {
                a.setVisibility(4);
                return;
            } else
            {
                a.setVisibility(8);
                return;
            }
        } else
        {
            a.setVisibility(0);
            return;
        }
    }

    public final void onClick(View view)
    {
        if (b != null)
        {
            b.c();
        }
    }
}
