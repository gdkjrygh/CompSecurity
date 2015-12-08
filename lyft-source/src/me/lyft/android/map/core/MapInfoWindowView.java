// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;

public class MapInfoWindowView extends FrameLayout
{

    TextView titleTextView;

    public MapInfoWindowView(Context context)
    {
        super(context);
        Scoop.a(this).a(getContext()).inflate(0x7f0300a1, this, true);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        ButterKnife.a(this);
    }

    public void setText(String s)
    {
        titleTextView.setText(s);
    }
}
