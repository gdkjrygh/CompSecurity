// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.widget.Button;

public final class aqz extends Button
{

    private boolean a;

    public aqz(Context context, boolean flag)
    {
        super(context);
        a = flag;
        setGravity(16);
        setTextColor(getResources().getColor(0x7f0f00c6));
        setTextSize(0, getResources().getDimension(0x7f0c00ae));
        setTypeface(Typeface.DEFAULT_BOLD);
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(0x7f0c00a9));
        setPadding(getResources().getDimensionPixelSize(0x7f0c00ab), getResources().getDimensionPixelSize(0x7f0c00ad), getResources().getDimensionPixelSize(0x7f0c00ac), getResources().getDimensionPixelSize(0x7f0c00aa));
        a();
    }

    private void a()
    {
        if (a)
        {
            setBackgroundResource(0x7f020126);
            setCompoundDrawablesWithIntrinsicBounds(0x7f020124, 0, 0, 0);
            setText(getResources().getString(0x7f080628));
            return;
        } else
        {
            setBackgroundResource(0x7f020120);
            setCompoundDrawablesWithIntrinsicBounds(0x7f020123, 0, 0, 0);
            setText(getResources().getString(0x7f080629));
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (flag != a)
        {
            a = flag;
            a();
        }
    }
}
