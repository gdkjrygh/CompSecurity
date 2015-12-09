// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class asg extends FrameLayout
{

    private ImageView a;
    private ImageView b;
    private View c;
    private ImageView d;

    public asg(Context context)
    {
        super(context);
        LayoutInflater.from(getContext()).inflate(0x7f03005e, this);
        a = (ImageView)findViewById(0x7f11030d);
        b = (ImageView)findViewById(0x7f110310);
        c = findViewById(0x7f11030c);
        d = (ImageView)findViewById(0x7f11030e);
    }

    public static View a(asg asg1)
    {
        return asg1.c;
    }

    public static ImageView b(asg asg1)
    {
        return asg1.b;
    }

    public static ImageView c(asg asg1)
    {
        return asg1.a;
    }

    public static ImageView d(asg asg1)
    {
        return asg1.d;
    }

    public final void a()
    {
        a.setVisibility(0);
        b.setVisibility(4);
    }

    public final void b()
    {
        a.setVisibility(4);
        b.setVisibility(0);
    }

    public final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
    }
}
