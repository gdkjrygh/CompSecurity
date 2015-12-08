// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import wa;
import zp;

public class AppCompatSeekBar extends SeekBar
{

    private zp a;

    public AppCompatSeekBar(Context context)
    {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f01013f);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        wa.a(context);
        a = new zp(this);
        a.a(attributeset, i);
    }
}
